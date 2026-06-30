package fg;

/* loaded from: classes7.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fg.b0 f261811d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fg.g f261812e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(fg.b0 b0Var, fg.g gVar) {
        super(1);
        this.f261811d = b0Var;
        this.f261812e = gVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        fg.b0 b0Var = this.f261811d;
        com.tencent.mars.xlog.Log.i(b0Var.f261724a, "onInputDone#onShowKeyboard, fromDoneButton: %b, confirmHold: %b", java.lang.Boolean.valueOf(booleanValue), java.lang.Boolean.valueOf(b0Var.f261739p));
        b0Var.a(false, this.f261812e);
        sf.c cVar = sf.c.f406939a;
        com.tencent.mm.plugin.appbrand.page.oa oaVar = b0Var.f261727d;
        kotlin.jvm.internal.o.d(oaVar);
        com.tencent.mm.plugin.appbrand.jsapi.t a17 = oaVar.a();
        com.tencent.mm.plugin.appbrand.page.oa oaVar2 = b0Var.f261727d;
        kotlin.jvm.internal.o.d(oaVar2);
        cVar.a(a17, oaVar2.b(), new sf.b(0, 0, b0Var.f261735l, new fg.u(b0Var)));
        return jz5.f0.f302826a;
    }
}
