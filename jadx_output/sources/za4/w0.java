package za4;

/* loaded from: classes4.dex */
public class w0 implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f471210d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f471211e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f471212f;

    public w0(java.lang.String str, android.content.Context context, int i17) {
        this.f471210d = str;
        this.f471211e = context;
        this.f471212f = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper$3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper$3");
        com.tencent.mars.xlog.Log.i("AdLandingPagesParseHelper", "jumpNative() use old xml");
        za4.z0.y(this.f471210d, dm.n.COL_ADXML, this.f471211e, false, this.f471212f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper$3");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper$3");
        return f0Var;
    }
}
