package r34;

/* loaded from: classes4.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f368997d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(long j17) {
        super(1);
        this.f368997d = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$deleteRecord$delRet$1");
        r34.b it = (r34.b) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$deleteRecord$delRet$1");
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(this.f368997d == it.e());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$deleteRecord$delRet$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$deleteRecord$delRet$1");
        return valueOf;
    }
}
