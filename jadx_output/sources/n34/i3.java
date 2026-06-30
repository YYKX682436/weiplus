package n34;

/* loaded from: classes4.dex */
public final class i3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n34.m3 f334630d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f334631e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f334632f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f334633g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(n34.m3 m3Var, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17, android.content.Context context) {
        super(0);
        this.f334630d = m3Var;
        this.f334631e = snsInfo;
        this.f334632f = i17;
        this.f334633g = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.SnsGalleryStarHelper$doChangeStar$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.SnsGalleryStarHelper$doChangeStar$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$doChangeStarInternal", "com.tencent.mm.plugin.sns.SnsGalleryStarHelper");
        this.f334630d.b(this.f334631e, this.f334632f, this.f334633g);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$doChangeStarInternal", "com.tencent.mm.plugin.sns.SnsGalleryStarHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.SnsGalleryStarHelper$doChangeStar$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.SnsGalleryStarHelper$doChangeStar$1");
        return f0Var;
    }
}
