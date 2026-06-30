package i33;

/* loaded from: classes10.dex */
public final class t1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i33.u1 f288265d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem f288266e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i33.o1 f288267f;

    public t1(i33.u1 u1Var, com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem galleryItem$LivePhotoMediaItem, i33.o1 o1Var) {
        this.f288265d = u1Var;
        this.f288266e = galleryItem$LivePhotoMediaItem;
        this.f288267f = o1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        i33.u1 u1Var = this.f288265d;
        u1Var.f288274d = true;
        com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem galleryItem$LivePhotoMediaItem = this.f288266e;
        u1Var.f288275e = galleryItem$LivePhotoMediaItem;
        e33.n3$$c n3__c = (e33.n3$$c) this.f288267f;
        n3__c.getClass();
        int i18 = com.tencent.mm.plugin.gallery.ui.ImagePreviewUI.f138572k2;
        n3__c.f247386a.j7(true);
        fe0.m4 m4Var = (fe0.m4) i95.n0.c(fe0.m4.class);
        java.lang.String livePhotoVideo = galleryItem$LivePhotoMediaItem.f138427y;
        kotlin.jvm.internal.o.f(livePhotoVideo, "livePhotoVideo");
        byte[] bytes = livePhotoVideo.getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        java.lang.String g17 = kk.k.g(bytes);
        java.lang.String Bi = ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).Bi();
        ((ee0.r4) m4Var).getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportLivePhotoClose", "com.tencent.mm.feature.sns.SnsReportHelperService");
        ke4.a.f307025a.a(g17, Bi);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportLivePhotoClose", "com.tencent.mm.feature.sns.SnsReportHelperService");
    }
}
