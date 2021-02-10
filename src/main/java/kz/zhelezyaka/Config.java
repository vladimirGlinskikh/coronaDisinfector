package kz.zhelezyaka;

public interface Config {
    <T> Class<? extends T> getImplClass(Class<T> ifc);
}
