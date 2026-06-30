package i33;

/* loaded from: classes10.dex */
public final class b1 extends i33.c {

    /* renamed from: f, reason: collision with root package name */
    public boolean f288161f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.autogen.mmdata.rpt.GalleryTecReportStruct f288162g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f288163h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f288164i;

    /* renamed from: m, reason: collision with root package name */
    public long f288165m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f288162g = new com.tencent.mm.autogen.mmdata.rpt.GalleryTecReportStruct();
        this.f288163h = new java.util.ArrayList();
        this.f288164i = new java.util.LinkedHashMap();
    }

    public final void W6(java.lang.String ticket, java.lang.String str) {
        kotlin.jvm.internal.o.g(ticket, "ticket");
        this.f288164i.put(ticket, new i33.v(ticket, java.lang.System.currentTimeMillis(), str, 0L, 0, 24, null));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateBefore(android.os.Bundle bundle) {
        super.onCreateBefore(bundle);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.autogen.mmdata.rpt.GalleryTecReportStruct galleryTecReportStruct = this.f288162g;
        galleryTecReportStruct.f58298i = currentTimeMillis;
        ((java.util.ArrayList) this.f288163h).clear();
        galleryTecReportStruct.f58304o = j62.e.g().c(new com.tencent.mm.repairer.config.albumpicker.RepairerConfigAlbumThumbnailResolver());
        galleryTecReportStruct.f58303n = j62.e.g().c(new com.tencent.mm.repairer.config.albumpicker.RepairerConfigAlbumDiskCache());
        galleryTecReportStruct.f58310u = -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0083  */
    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDestroy() {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i33.b1.onDestroy():void");
    }
}
