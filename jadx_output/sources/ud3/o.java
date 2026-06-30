package ud3;

/* loaded from: classes7.dex */
public final class o extends lc3.b0 {

    /* renamed from: f, reason: collision with root package name */
    public final ud3.r f426676f = new ud3.r();

    @Override // lc3.c0
    public java.lang.String f() {
        return "setLocalData";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        kotlin.jvm.internal.o.g(data, "data");
        lc3.z a17 = this.f426676f.a(data, e().f344331a);
        if (kotlin.jvm.internal.o.b(a17, lc3.x.f317934a)) {
            s().invoke(k());
        } else {
            s().invoke(h(a17.f317944a, a17.f317945b));
        }
    }
}
