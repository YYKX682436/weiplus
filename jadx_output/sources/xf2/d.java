package xf2;

/* loaded from: classes9.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ScreenShotView f454256d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.du1 f454257e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ScreenShotView screenShotView, r45.du1 du1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f454256d = screenShotView;
        this.f454257e = du1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xf2.d(this.f454256d, this.f454257e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((xf2.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        try {
            return ((jd0.w1) ((kd0.k2) i95.n0.c(kd0.k2.class))).Bi(this.f454256d.getContext(), this.f454257e.getString(10), 12, 0);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("FinderLiveScreenShotView", "create qr error:" + e17);
            return null;
        }
    }
}
