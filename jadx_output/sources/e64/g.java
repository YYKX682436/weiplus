package e64;

/* loaded from: classes7.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fq0.x f249825d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(fq0.x xVar) {
        super(0);
        this.f249825d = xVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz$onInit$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz$onInit$1");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("the layout callback, width is ");
        fq0.x xVar = this.f249825d;
        sb6.append(xVar.f265482f);
        sb6.append(", and height is ");
        sb6.append(xVar.f265483g);
        com.tencent.mars.xlog.Log.i("SnsAdMB", sb6.toString());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz$onInit$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz$onInit$1");
        return f0Var;
    }
}
