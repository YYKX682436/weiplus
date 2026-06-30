package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes4.dex */
public final class b9 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.mmdata.rpt.TPVideoPlayReportStruct f200818d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t21.v2 f200819e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b9(com.tencent.mm.autogen.mmdata.rpt.TPVideoPlayReportStruct tPVideoPlayReportStruct, t21.v2 v2Var) {
        super(1);
        this.f200818d = tPVideoPlayReportStruct;
        this.f200819e = v2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        dn.o it = (dn.o) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.String str = it.field_fileId;
        com.tencent.mm.autogen.mmdata.rpt.TPVideoPlayReportStruct tPVideoPlayReportStruct = this.f200818d;
        tPVideoPlayReportStruct.f61051f = tPVideoPlayReportStruct.b("FileId", str, true);
        tPVideoPlayReportStruct.f61053g = tPVideoPlayReportStruct.b("MediaId", it.field_mediaId, true);
        tPVideoPlayReportStruct.f61067u = it.f241803v;
        int i17 = this.f200819e.I;
        tPVideoPlayReportStruct.f61068v = i17;
        int i18 = it.V1;
        tPVideoPlayReportStruct.f61069w = i18 <= 0 ? 1L : ((float) i17) < (((float) i18) / 100.0f) * ((float) it.G1) ? 2L : 3L;
        tPVideoPlayReportStruct.f61054h = it.field_totalLen;
        return jz5.f0.f302826a;
    }
}
