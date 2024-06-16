--
-- PostgreSQL database dump
--

-- Dumped from database version 15.7
-- Dumped by pg_dump version 16.3

-- Started on 2024-06-15 11:57:39

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
-- TOC entry 218 (class 1259 OID 16422)
-- Name: matriculas; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.matriculas (
    id_matricula integer NOT NULL,
    id_aluno integer,
    preco_da_mensalidade real,
    validade date,
    cpf_do_responsavel character varying(14)
);


ALTER TABLE public.matriculas OWNER TO postgres;

--
-- TOC entry 3329 (class 0 OID 16422)
-- Dependencies: 218
-- Data for Name: matriculas; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.matriculas (id_matricula, id_aluno, preco_da_mensalidade, validade, cpf_do_responsavel) FROM stdin;
1	1	1000	2024-06-13	256.656.987-21
2	2	1050	2024-06-09	256.785.658-95
3	3	1100	2024-05-10	065.218.369-54
4	4	950	2024-03-03	091.847.678-95
\.


--
-- TOC entry 3185 (class 2606 OID 16426)
-- Name: matriculas matriculas_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.matriculas
    ADD CONSTRAINT matriculas_pkey PRIMARY KEY (id_matricula);


-- Completed on 2024-06-15 11:57:40

--
-- PostgreSQL database dump complete
--

