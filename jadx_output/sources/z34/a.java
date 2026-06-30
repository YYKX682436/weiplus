package z34;

/* loaded from: classes13.dex */
public class a extends z34.l {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f469977c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z34.e f469978d;

    public a(z34.e eVar, z34.f fVar, int i17) {
        this.f469978d = eVar;
        this.f469977c = i17;
    }

    @Override // z34.l
    public java.lang.Object a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("computeValue", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl$ELFHeaderImpl$1");
        z34.c cVar = new z34.c(this.f469978d, this.f469977c);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("computeValue", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl$ELFHeaderImpl$1");
        return cVar;
    }
}
