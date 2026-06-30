package h94;

/* loaded from: classes4.dex */
public final class c extends xc4.p {

    /* renamed from: a2, reason: collision with root package name */
    public static final /* synthetic */ int f279746a2 = 0;
    public h94.a X1;
    public int Y1;
    public final jz5.g Z1 = jz5.h.b(new h94.b(this));

    @Override // xc4.p
    public long U0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLocalIDNumber", "com.tencent.mm.plugin.sns.ad.wsfold.data.adinfo.ImproveWsFoldAdInfo");
        long longValue = ((java.lang.Number) ((jz5.n) this.Z1).getValue()).longValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLocalIDNumber", "com.tencent.mm.plugin.sns.ad.wsfold.data.adinfo.ImproveWsFoldAdInfo");
        return longValue;
    }

    @Override // xc4.p
    public boolean isAd() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAd", "com.tencent.mm.plugin.sns.ad.wsfold.data.adinfo.ImproveWsFoldAdInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAd", "com.tencent.mm.plugin.sns.ad.wsfold.data.adinfo.ImproveWsFoldAdInfo");
        return true;
    }

    public final h94.a r1() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFoldAdInfo", "com.tencent.mm.plugin.sns.ad.wsfold.data.adinfo.ImproveWsFoldAdInfo");
        h94.a aVar = this.X1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFoldAdInfo", "com.tencent.mm.plugin.sns.ad.wsfold.data.adinfo.ImproveWsFoldAdInfo");
        return aVar;
    }
}
