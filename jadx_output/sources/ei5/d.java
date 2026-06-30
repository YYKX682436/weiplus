package ei5;

/* loaded from: classes3.dex */
public final class d implements dg3.o {

    /* renamed from: a, reason: collision with root package name */
    public final mf3.k f253250a;

    /* renamed from: b, reason: collision with root package name */
    public final dg3.o f253251b;

    public d(mf3.k info, lf3.o legoUIC, dg3.o oVar) {
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(legoUIC, "legoUIC");
        this.f253250a = info;
        this.f253251b = oVar;
    }

    @Override // dg3.o
    public void a(dg3.q type) {
        kotlin.jvm.internal.o.g(type, "type");
        dg3.o oVar = this.f253251b;
        if (oVar != null) {
            oVar.a(type);
        }
        if (ei5.c.f253249a[type.ordinal()] == 1) {
            com.tencent.mm.autogen.mmdata.rpt.GalleryTranslateReportStruct galleryTranslateReportStruct = new com.tencent.mm.autogen.mmdata.rpt.GalleryTranslateReportStruct();
            galleryTranslateReportStruct.f58317e = 3L;
            galleryTranslateReportStruct.f58318f = 5L;
            eg3.i c17 = this.f253250a.c();
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
        dg3.o oVar = this.f253251b;
        if (oVar != null) {
            oVar.b(type, userName);
        }
    }
}
