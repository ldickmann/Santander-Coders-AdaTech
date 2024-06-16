--
-- PostgreSQL database dump
--

-- Dumped from database version 15.7
-- Dumped by pg_dump version 16.3

-- Started on 2024-06-15 11:30:05

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 215 (class 1259 OID 16398)
-- Name: disciplinas; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.disciplinas (
    id_disciplina integer NOT NULL,
    nome character varying(15) NOT NULL,
    ementa text NOT NULL
);


ALTER TABLE public.disciplinas OWNER TO postgres;

--
-- TOC entry 3329 (class 0 OID 16398)
-- Dependencies: 215
-- Data for Name: disciplinas; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.disciplinas (id_disciplina, nome, ementa) FROM stdin;
1	portugues	literatura e gramatica
2	matematica	algebra e geometria
3	fisica	cinematica e dinamica
4	quimica	transformacoes e processos quimicos
5	historia	acontecimentos do passado e do futuro
6	geografia	geopolitica e cartografia
7	biologia	corpo humano e taxonimia
\.


--
-- TOC entry 3185 (class 2606 OID 16404)
-- Name: disciplinas disciplinas_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.disciplinas
    ADD CONSTRAINT disciplinas_pkey PRIMARY KEY (id_disciplina);


-- Completed on 2024-06-15 11:30:05

--
-- PostgreSQL database dump complete
--

