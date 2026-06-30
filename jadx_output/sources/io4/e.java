package io4;

/* loaded from: classes10.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ io4.f f293523d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(io4.f fVar) {
        super(1);
        this.f293523d = fVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        um5.x it = (um5.x) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.String str = this.f293523d.f293524d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("report : ");
        sb6.append(it.f429212a);
        sb6.append(", ");
        sb6.append(it.f429213b);
        sb6.append(", ");
        sb6.append(it.f429215d);
        sb6.append(", ");
        int i17 = it.f429218g;
        sb6.append(i17 <= 0 ? 0L : it.f429217f / i17);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        com.tencent.mm.autogen.mmdata.rpt.EffectRenderReportStruct effectRenderReportStruct = new com.tencent.mm.autogen.mmdata.rpt.EffectRenderReportStruct();
        effectRenderReportStruct.f55955d = it.f429213b;
        effectRenderReportStruct.f55956e = it.f429212a;
        effectRenderReportStruct.f55957f = it.f429215d;
        int i18 = it.f429218g;
        effectRenderReportStruct.f55958g = i18 > 0 ? it.f429217f / i18 : 0L;
        effectRenderReportStruct.f55959h = it.f429219h ? 1 : 0;
        effectRenderReportStruct.f55960i = it.f429220i ? 1 : 0;
        effectRenderReportStruct.f55961j = it.f429221j ? 1 : 0;
        effectRenderReportStruct.k();
        return jz5.f0.f302826a;
    }
}
