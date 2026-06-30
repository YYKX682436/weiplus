package og4;

/* loaded from: classes7.dex */
public final class a extends lc3.b0 {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f345168f = "MBJsApiHideDefaultLoading";

    @Override // lc3.c0
    public java.lang.String f() {
        return "hideDefaultLoading";
    }

    @Override // lc3.c0
    public boolean n() {
        return true;
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        oe0.q qVar;
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i(this.f345168f, "[gameload] hideDefaultLoading");
        pg4.e eVar = (pg4.e) this.f317890a;
        if (eVar != null && (qVar = eVar.B) != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicGameLoadingImpl", "[gameload] hideDefaultLoading");
            ((ku5.t0) ku5.t0.f312615d).D(new n91.w(((n91.y) qVar).f335901a));
        }
        s().invoke(k());
    }
}
