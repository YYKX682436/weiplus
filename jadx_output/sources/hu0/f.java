package hu0;

/* loaded from: classes5.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gu0.k2 f285025d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hu0.o f285026e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hu0.l f285027f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(gu0.k2 k2Var, hu0.o oVar, hu0.l lVar) {
        super(2);
        this.f285025d = k2Var;
        this.f285026e = oVar;
        this.f285027f = lVar;
    }

    public static final void a(hu0.o oVar, hu0.l lVar, gu0.k2 k2Var, java.lang.String str) {
        com.tencent.mars.xlog.Log.e("MJCC.ControlUIC", "exportVideoForReedit failed, " + str);
        hu0.o.P6(oVar, null, new hu0.e(lVar, k2Var), 1, null);
    }

    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17, types: [yz5.a, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v32 */
    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.mj_publisher.finder.composing_creation.preview.ComposingCreationPreviewUI composingCreationPreviewUI;
        hu0.d dVar;
        ?? r96;
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider a17;
        com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem galleryItem$VideoMediaItem;
        jz5.f0 f0Var;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String str = (java.lang.String) obj2;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        gu0.k2 k2Var = this.f285025d;
        hu0.l lVar = this.f285027f;
        hu0.o oVar = this.f285026e;
        if (booleanValue) {
            if (str == null || str.length() == 0) {
                java.lang.String videoPath = k2Var.f275746v;
                if (videoPath == null || videoPath.length() == 0) {
                    a(oVar, lVar, k2Var, "videoPath is null or empty");
                } else {
                    java.lang.String videoCheckSum = k2Var.f275747w;
                    if (videoCheckSum == null || videoCheckSum.length() == 0) {
                        a(oVar, lVar, k2Var, "checksum is null or empty");
                    } else {
                        eu0.q newReeditParams = k2Var.C;
                        if (newReeditParams == null) {
                            a(oVar, lVar, k2Var, "reeditQueryParams is null");
                        } else {
                            r45.mi0 effectEditInfo = k2Var.D;
                            if (effectEditInfo == null) {
                                a(oVar, lVar, k2Var, "reeditEffectEditInfo is null");
                            } else {
                                r45.ab4 localCreateTemplateInfo = k2Var.E;
                                if (localCreateTemplateInfo == null) {
                                    a(oVar, lVar, k2Var, "reeditLocalCreateTemplateInfo is null");
                                } else {
                                    com.tencent.mars.xlog.Log.i("MJCC.ControlUIC", "exportVideoForReedit success");
                                    oVar.O6();
                                    androidx.appcompat.app.AppCompatActivity activity = lVar.getActivity();
                                    com.tencent.mm.mj_publisher.finder.composing_creation.preview.ComposingCreationPreviewUI composingCreationPreviewUI2 = activity instanceof com.tencent.mm.mj_publisher.finder.composing_creation.preview.ComposingCreationPreviewUI ? (com.tencent.mm.mj_publisher.finder.composing_creation.preview.ComposingCreationPreviewUI) activity : null;
                                    if (composingCreationPreviewUI2 != null) {
                                        hu0.d dVar2 = new hu0.d(oVar, lVar, k2Var);
                                        kotlin.jvm.internal.o.g(videoPath, "videoPath");
                                        kotlin.jvm.internal.o.g(videoCheckSum, "videoCheckSum");
                                        kotlin.jvm.internal.o.g(newReeditParams, "newReeditParams");
                                        kotlin.jvm.internal.o.g(effectEditInfo, "effectEditInfo");
                                        kotlin.jvm.internal.o.g(localCreateTemplateInfo, "localCreateTemplateInfo");
                                        try {
                                            ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).getClass();
                                            a17 = uu2.b.f431269a.a();
                                            composingCreationPreviewUI = composingCreationPreviewUI2;
                                            dVar = dVar2;
                                            try {
                                                com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem b17 = com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem.b(2, 0L, videoPath, "", "");
                                                galleryItem$VideoMediaItem = b17 instanceof com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem ? (com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem) b17 : null;
                                                if (galleryItem$VideoMediaItem != null) {
                                                    galleryItem$VideoMediaItem.f138448z = 1080;
                                                    r96 = 1920;
                                                    galleryItem$VideoMediaItem.f138447y = 1920;
                                                } else {
                                                    galleryItem$VideoMediaItem = null;
                                                    r96 = b17;
                                                }
                                            } catch (java.lang.Exception e17) {
                                                e = e17;
                                                r96 = 0;
                                            }
                                        } catch (java.lang.Exception e18) {
                                            e = e18;
                                            composingCreationPreviewUI = composingCreationPreviewUI2;
                                            dVar = dVar2;
                                            r96 = 0;
                                        }
                                        try {
                                            if (galleryItem$VideoMediaItem == null) {
                                                com.tencent.mars.xlog.Log.e("MJCC.PreviewUI", "jumpToNewMovieComposingForReedit: create media item failed!");
                                                hu0.o.P6((hu0.o) composingCreationPreviewUI.U6(hu0.o.class), null, null, 3, null);
                                                dVar.invoke();
                                            } else {
                                                android.os.Bundle bundle = a17.M;
                                                if (bundle == null) {
                                                    bundle = new android.os.Bundle();
                                                }
                                                bundle.putParcelableArrayList("media_list", kz5.c0.d(galleryItem$VideoMediaItem));
                                                a17.M = bundle;
                                                java.lang.String jSONObject = newReeditParams.b().toString();
                                                kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
                                                byte[] byteArray = localCreateTemplateInfo.toByteArray();
                                                byte[] byteArray2 = effectEditInfo.toByteArray();
                                                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("jumpToNewMovieComposingForReedit: reeditParamsJson:");
                                                sb6.append(jSONObject);
                                                sb6.append(", videoPath=");
                                                sb6.append(videoPath);
                                                sb6.append(", effectEditInfoBytes=");
                                                sb6.append(byteArray2 != null ? byteArray2.length : 0);
                                                com.tencent.mars.xlog.Log.i("MJCC.PreviewUI", sb6.toString());
                                                r45.q23 q23Var = new r45.q23();
                                                r45.ko6 ko6Var = new r45.ko6();
                                                ko6Var.f378884i = videoCheckSum;
                                                q23Var.f383601w = ko6Var;
                                                if (ut3.m.f431182a.i(composingCreationPreviewUI, 292, 0, 0, a17, 4, 0, false, q23Var, false, false, true, jSONObject, byteArray, byteArray2)) {
                                                    com.tencent.mars.xlog.Log.i("MJCC.PreviewUI", "jumpToNewMovieComposingForReedit: finish self after jump");
                                                    gu0.k2 k2Var2 = composingCreationPreviewUI.f69177d;
                                                    if (k2Var2 != null) {
                                                        k2Var2.p(true, new gu0.a(composingCreationPreviewUI));
                                                        f0Var = f0Var2;
                                                    } else {
                                                        f0Var = null;
                                                    }
                                                    if (f0Var == null) {
                                                        composingCreationPreviewUI.finish();
                                                    }
                                                } else {
                                                    com.tencent.mars.xlog.Log.e("MJCC.PreviewUI", "jumpToNewMovieComposingForReedit: jump failed");
                                                    hu0.o.P6((hu0.o) composingCreationPreviewUI.U6(hu0.o.class), null, null, 3, null);
                                                    dVar.invoke();
                                                }
                                            }
                                        } catch (java.lang.Exception e19) {
                                            e = e19;
                                            com.tencent.mars.xlog.Log.e("MJCC.PreviewUI", "jumpToNewMovieComposingForReedit: exception: " + e.getMessage());
                                            hu0.o.P6((hu0.o) composingCreationPreviewUI.U6(hu0.o.class), r96, r96, 3, r96);
                                            dVar.invoke();
                                            return f0Var2;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return f0Var2;
            }
        }
        a(oVar, lVar, k2Var, "export error: " + str);
        return f0Var2;
    }
}
