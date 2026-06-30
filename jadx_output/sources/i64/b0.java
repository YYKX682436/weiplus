package i64;

/* loaded from: classes4.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f289080a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f289081b;

    /* renamed from: c, reason: collision with root package name */
    public final int f289082c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f289083d;

    /* renamed from: e, reason: collision with root package name */
    public final w64.n f289084e;

    public b0(android.app.Activity activity, android.view.View view, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17, boolean z17, i64.b1 b1Var, w64.n nVar) {
        this.f289080a = activity;
        this.f289081b = view;
        this.f289082c = i17;
        this.f289083d = z17;
        this.f289084e = nVar;
    }

    public final w64.n a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMAdClickActionHandler", "com.tencent.mm.plugin.sns.ad.model.AdViewComponentData");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMAdClickActionHandler", "com.tencent.mm.plugin.sns.ad.model.AdViewComponentData");
        return this.f289084e;
    }

    public final int b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMSource", "com.tencent.mm.plugin.sns.ad.model.AdViewComponentData");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMSource", "com.tencent.mm.plugin.sns.ad.model.AdViewComponentData");
        return this.f289082c;
    }
}
