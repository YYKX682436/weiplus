package vd3;

/* loaded from: classes7.dex */
public class d extends lc3.b0 {

    /* renamed from: f, reason: collision with root package name */
    public final vd3.b f436058f = new vd3.b();

    @Override // lc3.c0
    public java.lang.String f() {
        return "getSystemInfoAsync";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        kotlin.jvm.internal.o.g(data, "data");
        java.util.HashMap a17 = this.f436058f.a();
        a17.putAll(u());
        s().invoke(l(a17));
    }

    public java.util.HashMap u() {
        return new java.util.HashMap();
    }
}
