package ud3;

/* loaded from: classes7.dex */
public final class m extends lc3.b0 {

    /* renamed from: f, reason: collision with root package name */
    public final ud3.q f426674f = new ud3.q();

    @Override // lc3.c0
    public java.lang.String f() {
        return "removeLocalData";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        kotlin.jvm.internal.o.g(data, "data");
        lc3.z a17 = this.f426674f.a(data, e().f344331a);
        if (kotlin.jvm.internal.o.b(a17, lc3.x.f317934a)) {
            s().invoke(k());
        } else {
            s().invoke(h(a17.f317944a, a17.f317945b));
        }
    }
}
