package xt2;

/* loaded from: classes2.dex */
public final class l3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xt2.r3 f456867d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f456868e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f456869f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ org.libpag.PAGFile f456870g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f456871h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(xt2.r3 r3Var, android.view.View view, com.tencent.mm.view.MMPAGView mMPAGView, org.libpag.PAGFile pAGFile, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f456867d = r3Var;
        this.f456868e = view;
        this.f456869f = mMPAGView;
        this.f456870g = pAGFile;
        this.f456871h = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xt2.l3(this.f456867d, this.f456868e, this.f456869f, this.f456870g, this.f456871h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((xt2.l3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        xt2.r3 r3Var = this.f456867d;
        android.view.View view = r3Var.f456986i;
        kotlin.jvm.internal.o.f(view, "access$getCartIv$p(...)");
        int[] t17 = pm0.v.t(view);
        int[] t18 = pm0.v.t(this.f456868e);
        java.lang.Integer S = kz5.z.S(t17, 0);
        int intValue = S != null ? S.intValue() : 0;
        java.lang.Integer S2 = kz5.z.S(t17, 1);
        int intValue2 = S2 != null ? S2.intValue() : 0;
        java.lang.Integer S3 = kz5.z.S(t18, 0);
        int intValue3 = S3 != null ? S3.intValue() : 0;
        java.lang.Integer S4 = kz5.z.S(t18, 1);
        float intValue4 = intValue2 - (S4 != null ? S4.intValue() : 0);
        com.tencent.mm.view.MMPAGView mMPAGView = this.f456869f;
        mMPAGView.setTranslationX(((intValue - intValue3) + (r3Var.f456986i.getWidth() / 2.0f)) - (mMPAGView.getLayoutParams().width / 2.0f));
        mMPAGView.setTranslationY(intValue4 - ym5.x.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 16.0f));
        mMPAGView.setComposition(this.f456870g);
        mMPAGView.d();
        mMPAGView.setRepeatCount(0);
        mMPAGView.setProgress(0.0d);
        mMPAGView.g();
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveShoppingCartAnimWidget", "playPromotePag: playing, url=" + this.f456871h + ", tx=" + mMPAGView.getTranslationX() + ", ty=" + mMPAGView.getTranslationY());
        xt2.k3 k3Var = new xt2.k3(mMPAGView);
        r3Var.f456981d = k3Var;
        return java.lang.Boolean.valueOf(r3Var.f456980c.postDelayed(k3Var, androidx.camera.core.RetryPolicy.DEFAULT_RETRY_TIMEOUT_IN_MILLIS));
    }
}
