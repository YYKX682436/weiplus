package gi5;

/* loaded from: classes3.dex */
public final class n implements dg3.o {

    /* renamed from: a, reason: collision with root package name */
    public final mf3.k f272322a;

    /* renamed from: b, reason: collision with root package name */
    public final dg3.o f272323b;

    public n(mf3.k info, lf3.o legoUIC, dg3.o oVar) {
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(legoUIC, "legoUIC");
        this.f272322a = info;
        this.f272323b = oVar;
    }

    @Override // dg3.o
    public void a(dg3.q type) {
        kotlin.jvm.internal.o.g(type, "type");
        dg3.o oVar = this.f272323b;
        if (oVar != null) {
            oVar.a(type);
        }
        if (gi5.m.f272321a[type.ordinal()] == 1) {
            com.tencent.mm.autogen.mmdata.rpt.GalleryTranslateReportStruct galleryTranslateReportStruct = new com.tencent.mm.autogen.mmdata.rpt.GalleryTranslateReportStruct();
            galleryTranslateReportStruct.f58317e = 3L;
            galleryTranslateReportStruct.f58318f = 5L;
            eg3.i c17 = this.f272322a.c();
            if (c17 != null) {
                galleryTranslateReportStruct.q(c17.f252664b);
                galleryTranslateReportStruct.p(c17.f252665c);
            }
            galleryTranslateReportStruct.k();
        }
    }

    @Override // dg3.o
    public void b(dg3.q type, java.lang.String userName) {
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(userName, "userName");
        dg3.o oVar = this.f272323b;
        if (oVar != null) {
            oVar.b(type, userName);
        }
    }
}
