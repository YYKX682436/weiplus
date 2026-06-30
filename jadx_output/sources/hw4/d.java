package hw4;

/* loaded from: classes7.dex */
public abstract class d {
    public static final void a(java.lang.String url, java.lang.String savedPath, hw4.a listener) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(savedPath, "savedPath");
        kotlin.jvm.internal.o.g(listener, "listener");
        com.tencent.mm.network.b3.a(new com.tencent.mm.network.j2(url, 0), null, new hw4.c(savedPath, listener));
    }
}
