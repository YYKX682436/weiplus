package fo5;

/* loaded from: classes14.dex */
public final class f0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f264980d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fo5.r0 f264981e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(boolean z17, fo5.r0 r0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f264980d = z17;
        this.f264981e = r0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new fo5.f0(this.f264980d, this.f264981e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((fo5.f0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        jz5.f0 f0Var = jz5.f0.f302826a;
        boolean z17 = this.f264980d;
        fo5.r0 r0Var = this.f264981e;
        if (z17) {
            lo5.h hVar = r0Var.f265095n;
            hVar.getClass();
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(com.tencent.mm.sdk.platformtools.x2.f193071a);
            u1Var.u(i65.a.r(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.k_t));
            u1Var.j(i65.a.r(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.f490347sg));
            u1Var.i(lo5.e.f320211a);
            u1Var.m(com.tencent.mm.R.string.k_s);
            u1Var.k(i65.a.d(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.color.f479308vo));
            u1Var.l(new lo5.g(hVar));
            hVar.f320215b = u1Var.s();
            return f0Var;
        }
        android.app.Activity o17 = r0Var.o();
        if (o17 != null && o17.isFinishing()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMP.CoreV2", "block click accept, because last activity is finishing");
            return f0Var;
        }
        lo5.h.b(r0Var.f265095n, false, 1, null);
        if (r0Var.r() || z17) {
            i95.m c17 = i95.n0.c(jp5.o.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            jp5.o.R3((jp5.o) c17, context, false, 2, null);
            com.tencent.mm.plugin.voipmp.platform.v0.f177287b.d(z17, true, fo5.e0.f264972a);
        }
        return f0Var;
    }
}
