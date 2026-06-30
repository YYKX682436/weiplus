package dl4;

/* loaded from: classes3.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final kk.j f235424a = new jt0.i(10, dl4.k.class);

    public static final java.lang.String a(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        byte[] bytes = url.concat("_ting_blur_image").getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        java.lang.String g17 = kk.k.g(bytes);
        kotlin.jvm.internal.o.f(g17, "getMessageDigest(...)");
        return g17;
    }
}
