package z5;

/* loaded from: classes6.dex */
public final class e implements z5.b {
    @Override // z5.b
    public boolean a(java.lang.Object obj) {
        java.lang.String data = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(data, "data");
        return true;
    }

    @Override // z5.b
    public java.lang.Object d(java.lang.Object obj) {
        java.lang.String data = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(data, "data");
        android.net.Uri parse = android.net.Uri.parse(data);
        kotlin.jvm.internal.o.f(parse, "parse(this)");
        return parse;
    }
}
