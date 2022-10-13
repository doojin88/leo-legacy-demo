cmake_minimum_required(VERSION 3.23)
project(legacy_c C)

set(CMAKE_C_STANDARD 99)

add_executable(legacy_c main.c ch19/easy_time.c)
