package z34;

/* loaded from: classes13.dex */
public class b extends z34.l {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f469979c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f469980d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z34.c f469981e;

    public b(z34.c cVar, z34.e eVar, int i17, int i18) {
        this.f469981e = cVar;
        this.f469979c = i17;
        this.f469980d = i18;
    }

    @Override // z34.l
    public java.lang.Object a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("computeValue", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl$ELFHeaderImpl$ELFSectionHeaderImpl$1");
        z34.d dVar = new z34.d(this.f469981e.f469986e, this.f469979c, this.f469980d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("computeValue", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl$ELFHeaderImpl$ELFSectionHeaderImpl$1");
        return dVar;
    }
}
