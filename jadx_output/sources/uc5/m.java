package uc5;

/* loaded from: classes10.dex */
public final class m implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uc5.d f426523d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uc5.n f426524e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f426525f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rl5.r f426526g;

    public m(uc5.d dVar, uc5.n nVar, android.content.Context context, rl5.r rVar) {
        this.f426523d = dVar;
        this.f426524e = nVar;
        this.f426525f = context;
        this.f426526g = rVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.Object m521constructorimpl;
        jz5.f0 f0Var = null;
        ad5.t0 t0Var = new ad5.t0(null, 1, null);
        ad5.q0 q0Var = ad5.q0.f3300a;
        java.util.List c17 = kz5.b0.c(this.f426523d.p());
        java.util.Map map = t0Var.f3314a;
        map.put(q0Var, c17);
        map.put(ad5.r0.f3303a, ad5.p0.f3291d);
        uc5.n nVar = this.f426524e;
        uc5.r rVar = nVar.f426531g;
        android.content.Context context = this.f426525f;
        if (rVar == null) {
            rVar = context instanceof uc5.r ? (uc5.r) context : null;
        }
        if (rVar != null) {
            ad5.o0 o0Var = ad5.o0.f3290a;
            com.tencent.mm.sdk.coroutines.LifecycleScope k76 = ((com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) rVar).k7();
            kotlin.jvm.internal.o.e(k76, "null cannot be cast to non-null type kotlin.Any");
            map.put(o0Var, k76);
            map.put(ad5.n0.f3289a, new uc5.l(rVar));
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            ad5.l0 l0Var = (ad5.l0) kz5.z.U(nVar.f426529e, menuItem.getItemId());
            if (l0Var != null) {
                l0Var.d(context, t0Var);
                f0Var = jz5.f0.f302826a;
            }
            m521constructorimpl = kotlin.Result.m521constructorimpl(f0Var);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MsgHistoryGalleryBaseItemConvert", m524exceptionOrNullimpl, "showActionPopupMenu operate failed", new java.lang.Object[0]);
            this.f426526g.a();
        }
    }
}
