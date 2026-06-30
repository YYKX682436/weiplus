package x36;

/* loaded from: classes14.dex */
public final class n {
    public n(kotlin.jvm.internal.i iVar) {
    }

    public final x36.o a(java.lang.String encodeUtf8) {
        kotlin.jvm.internal.o.g(encodeUtf8, "$this$encodeUtf8");
        byte[] bytes = encodeUtf8.getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "(this as java.lang.String).getBytes(charset)");
        x36.o oVar = new x36.o(bytes);
        oVar.f451698e = encodeUtf8;
        return oVar;
    }
}
