package k84;

/* loaded from: classes3.dex */
public final class e1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f305014d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k84.q1 f305015e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.y f305016f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(android.view.View view, k84.q1 q1Var, androidx.lifecycle.y yVar) {
        super(0);
        this.f305014d = view;
        this.f305015e = q1Var;
        this.f305016f = yVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$tagContainer$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$tagContainer$2");
        android.view.View view = this.f305014d;
        android.view.ViewStub viewStub = view != null ? (android.view.ViewStub) view.findViewById(com.tencent.mm.R.id.qac) : null;
        android.view.ViewGroup viewGroup = viewStub != null ? (android.view.ViewGroup) a84.y0.h(viewStub) : null;
        if (viewGroup == null) {
            com.tencent.mars.xlog.Log.e(this.f305015e.j(), "weird tagContainer inflate!");
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$tagContainer$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$tagContainer$2");
        return viewGroup;
    }
}
