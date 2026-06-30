package og4;

/* loaded from: classes7.dex */
public final class b extends lc3.b0 {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f345169f = "MBJsApiHideLoadingAll";

    @Override // lc3.c0
    public java.lang.String f() {
        return "hideLoadingAll";
    }

    @Override // lc3.c0
    public boolean n() {
        return true;
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        oe0.q qVar;
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i(this.f345169f, "[gameload] hideLoadingAll");
        pg4.e eVar = (pg4.e) this.f317890a;
        if (eVar != null && (qVar = eVar.B) != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicGameLoadingImpl", "[gameload] hideLoading");
            ((ku5.t0) ku5.t0.f312615d).D(new n91.x(((n91.y) qVar).f335902b));
            com.tencent.mm.autogen.events.CustomLoadingStateEvent customLoadingStateEvent = new com.tencent.mm.autogen.events.CustomLoadingStateEvent();
            customLoadingStateEvent.f54078g.f7690a = 1;
            customLoadingStateEvent.e();
        }
        s().invoke(k());
    }
}
