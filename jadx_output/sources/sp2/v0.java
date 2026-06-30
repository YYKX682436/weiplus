package sp2;

/* loaded from: classes2.dex */
public final class v0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vp2.h0 f411238d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sp2.o2 f411239e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f411240f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(vp2.h0 h0Var, sp2.o2 o2Var, int i17) {
        super(2);
        this.f411238d = h0Var;
        this.f411239e = o2Var;
        this.f411240f = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        dk2.hc questions = (dk2.hc) obj;
        java.lang.Iterable options = (java.lang.Iterable) obj2;
        sp2.o2 o2Var = this.f411239e;
        vp2.h0 h0Var = this.f411238d;
        kotlin.jvm.internal.o.g(questions, "questions");
        kotlin.jvm.internal.o.g(options, "options");
        com.tencent.mars.xlog.Log.i("Finder.LiveEntranceFragmentViewCallback", "onResponseOptionsEntered: ".concat(kz5.n0.g0(options, null, null, null, 0, null, null, 63, null)));
        try {
            dk2.dc dcVar = h0Var.f438926f;
            if (dcVar != null) {
                dcVar.b(questions, options);
            }
            h0Var.a(o2Var.f411121a, this.f411240f);
            h0Var.b(o2Var.f411121a, options);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("Finder.LiveEntranceFragmentViewCallback", "onResponseOptionsEntered: " + e17);
        }
        return jz5.f0.f302826a;
    }
}
