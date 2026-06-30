package gu3;

/* loaded from: classes3.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.improve_photo.finder_cover.FinderLiveAvatarEditPluginLayout f275940d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.tencent.mm.plugin.recordvideo.plugin.improve_photo.finder_cover.FinderLiveAvatarEditPluginLayout finderLiveAvatarEditPluginLayout) {
        super(1);
        this.f275940d = finderLiveAvatarEditPluginLayout;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String path = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(path, "path");
        int i17 = com.tencent.mm.plugin.recordvideo.plugin.improve_photo.finder_cover.FinderLiveAvatarEditPluginLayout.f155768w;
        du3.t3 previewPlugin = this.f275940d.getPreviewPlugin();
        previewPlugin.getClass();
        if (com.tencent.mm.vfs.w6.j(path)) {
            l45.q qVar = previewPlugin.f243726p;
            l45.n nVar = qVar instanceof l45.n ? (l45.n) qVar : null;
            if (nVar == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ImproveEditPhotoPreviewPlugin", "replaceBaseImage: presenter unavailable");
            } else {
                android.graphics.Bitmap bitmap = nVar.f316465f;
                if (bitmap == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ImproveEditPhotoPreviewPlugin", "replaceBaseImage: current bitmap is null");
                } else {
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    android.graphics.BitmapFactory.Options n07 = com.tencent.mm.sdk.platformtools.x.n0(path);
                    if (n07 == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.ImproveEditPhotoPreviewPlugin", "replaceBaseImage: cannot read image options");
                    } else {
                        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                        int i18 = n07.outWidth;
                        int i19 = n07.outHeight;
                        int i27 = 1;
                        while (true) {
                            int i28 = i27 * 2;
                            if (i18 / i28 < width || i19 / i28 < height) {
                                break;
                            }
                            i27 = i28;
                        }
                        options.inSampleSize = i27;
                        options.inPreferredConfig = android.graphics.Bitmap.Config.ARGB_8888;
                        android.graphics.Bitmap J2 = com.tencent.mm.sdk.platformtools.x.J(path, options);
                        if (J2 == null) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.ImproveEditPhotoPreviewPlugin", "replaceBaseImage: decode failed, path=".concat(path));
                        } else {
                            if (J2.getWidth() != width || J2.getHeight() != height) {
                                android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(J2, width, height, true);
                                kotlin.jvm.internal.o.f(createScaledBitmap, "createScaledBitmap(...)");
                                if (createScaledBitmap != J2) {
                                    J2.recycle();
                                }
                                J2 = createScaledBitmap;
                            }
                            if (J2.isRecycled()) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.DrawingPresenter", "replaceBaseImage: invalid bitmap");
                            } else {
                                nVar.f316465f = J2;
                                ym5.h hVar = nVar.f316460a;
                                if (hVar != null) {
                                    hVar.invalidate();
                                    bn5.f baseBoardView = nVar.f316460a.getBaseBoardView();
                                    if (baseBoardView != null) {
                                        baseBoardView.invalidate();
                                    }
                                }
                            }
                            com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoPreviewPlugin", "replaceBaseImage: done, path=" + path + ", raw=" + n07.outWidth + 'x' + n07.outHeight + ", final=" + J2.getWidth() + 'x' + J2.getHeight());
                        }
                    }
                }
            }
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.ImproveEditPhotoPreviewPlugin", "replaceBaseImage: file not found, path=".concat(path));
        }
        return jz5.f0.f302826a;
    }
}
