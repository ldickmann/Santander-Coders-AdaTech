--
-- PostgreSQL database dump
--

-- Dumped from database version 15.7
-- Dumped by pg_dump version 16.3

-- Started on 2024-06-15 11:55:16

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
-- TOC entry 217 (class 1259 OID 16415)
-- Name: livros; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.livros (
    id_livro integer NOT NULL,
    nome character varying(15),
    autor character varying(40),
    sinopse character varying(500)
);


ALTER TABLE public.livros OWNER TO postgres;

--
-- TOC entry 3329 (class 0 OID 16415)
-- Dependencies: 217
-- Data for Name: livros; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.livros (id_livro, nome, autor, sinopse) FROM stdin;
\.


--
-- TOC entry 3185 (class 2606 OID 16421)
-- Name: livros livros_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.livros
    ADD CONSTRAINT livros_pkey PRIMARY KEY (id_livro);


-- Completed on 2024-06-15 11:55:16

--
-- PostgreSQL database dump complete
--

