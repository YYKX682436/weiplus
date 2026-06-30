package yy0;

@j95.b
/* loaded from: classes5.dex */
public final class m0 extends i95.w implements pp0.h0 {

    /* renamed from: d, reason: collision with root package name */
    public volatile yy0.i0 f468207d = yy0.i0.f468137d;

    public java.lang.String Ai(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (!((java.lang.Boolean) kotlinx.coroutines.l.f(null, new yy0.k0(null), 1, null)).booleanValue()) {
            com.tencent.mars.xlog.Log.e("MJPublisher", "calcFileCheckSum error: load so failed");
            return null;
        }
        kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        try {
            java.lang.String i17 = com.tencent.mm.vfs.w6.i(path, false);
            if (i17 != null) {
                return com.tencent.maas.utils.MJChecksumUtils.a(i17);
            }
            com.tencent.mars.xlog.Log.e("MJPublisher", "calcVideoCheckSum error: exportPath is null");
            return null;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MJPublisher", "calcVideoCheckSum error: " + e17.getMessage());
            return null;
        }
    }

    public java.util.Map Bi() {
        java.lang.Object m521constructorimpl;
        java.util.List f07;
        java.lang.String uj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).uj(new com.tencent.mm.repairer.config.mjpublisher.movie_composing.RepairerConfigMovieComposingCaptionSentenceLengthList());
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
        kotlin.jvm.internal.o.d(uj6);
        for (java.lang.String str : r26.n0.e0(uj6, new char[]{','}, false, 0, 6, null)) {
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                f07 = r26.n0.f0(str, new java.lang.String[]{"__"}, false, 0, 6, null);
            } catch (java.lang.Throwable th6) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
            }
            if (f07.size() >= 2) {
                java.lang.String str2 = (java.lang.String) f07.get(0);
                java.lang.Integer h17 = r26.h0.h((java.lang.String) f07.get(1));
                if ((str2.length() > 0) && h17 != null && h17.intValue() > 0) {
                    concurrentHashMap.put(str2, h17);
                }
                m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
                java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
                if (m524exceptionOrNullimpl != null) {
                    com.tencent.mars.xlog.Log.e("getCaptionLanguageSentenceLengthList", "sentenceLength: " + m524exceptionOrNullimpl + ", error: " + m524exceptionOrNullimpl.getMessage());
                }
            }
        }
        return concurrentHashMap;
    }

    public final int Di(e42.c0 c0Var, int i17) {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(c0Var, i17);
    }

    public float Ni() {
        if (!pp0.h0.Q2(this, false, 1, null)) {
            return 0.0f;
        }
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).hj(new com.tencent.mm.repairer.config.mjpublisher.movie_composing.RepairerConfigMovieComposingAspectRatioMaxValue());
    }

    public float Ri() {
        if (!pp0.h0.Q2(this, false, 1, null)) {
            return 0.0f;
        }
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).hj(new com.tencent.mm.repairer.config.mjpublisher.movie_composing.RepairerConfigMovieComposingMovieTitleDuration());
    }

    public boolean Ui() {
        if (pp0.h0.Q2(this, false, 1, null)) {
            return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.mjpublisher.movie_composing.RepairerConfigMovieComposingCaptionPanelEnable()) == 1;
        }
        return false;
    }

    public boolean Vi() {
        if (!Zi(true)) {
            return false;
        }
        int Di = Di(e42.c0.clicfg_finder_maas_mj_publisher_entry_type, 0);
        if (Di == 0) {
            if (bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.mjpublisher.RepairerConfigMJPublisherEntryType()) == 1) {
                return true;
            }
        } else if (Di == 1) {
            return true;
        }
        return false;
    }

    public boolean Zi(boolean z17) {
        if (z17) {
            mj();
        }
        if (!((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).Ni(false)) {
            return false;
        }
        ((yy0.q7) ((pp0.n0) i95.n0.c(pp0.n0.class))).getClass();
        if (!py0.b.f358971a.a()) {
            return false;
        }
        int h17 = bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.mjpublisher.RepairerConfigMJPublisherEnable());
        if (h17 != 1) {
            return h17 != 2 && Di(e42.c0.clicfg_finder_maas_mj_publisher_enable, 0) == 1;
        }
        return true;
    }

    public boolean aj() {
        if (!pp0.h0.Q2(this, false, 1, null)) {
            return false;
        }
        int h17 = bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.mjpublisher.RepairerConfigMovieComposingEnable());
        if (h17 != 1) {
            return h17 != 2 && Di(e42.c0.clicfg_finder_maas_mj_publisher_movie_composing_enable, 0) == 1;
        }
        return true;
    }

    public boolean bj() {
        if (pp0.h0.Q2(this, false, 1, null)) {
            return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.mjpublisher.movie_composing.RepairerConfigMovieComposingNarrationLoudnessEQEnable()) == 1;
        }
        return false;
    }

    public boolean cj() {
        if (pp0.h0.Q2(this, false, 1, null)) {
            return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.mjpublisher.movie_composing.RepairerConfigMovieComposingRecommendTitleEnable()) == 1;
        }
        return false;
    }

    public boolean fj() {
        if (pp0.h0.Q2(this, false, 1, null) && Ui()) {
            return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.mjpublisher.movie_composing.RepairerConfigMovieComposingSubtitleRecommendEnable()) == 1;
        }
        return false;
    }

    public boolean hj() {
        if (pp0.h0.Q2(this, false, 1, null)) {
            return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.mjpublisher.movie_composing.RepairerConfigMovieComposingCaptionUseCgi()) == 1;
        }
        return false;
    }

    public void ij() {
        if (pp0.h0.Q2(this, false, 1, null) && this.f468207d == yy0.i0.f468137d) {
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_finder_maas_so_preload_in_feed, 1) == 1) {
                this.f468207d = yy0.i0.f468138e;
                kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, kotlinx.coroutines.q1.f310570c, null, new yy0.l0(this, null), 2, null);
            }
        }
    }

    public void mj() {
        h62.d dVar = (h62.d) ((e42.e0) i95.n0.c(e42.e0.class));
        dVar.Ni(e42.c0.clicfg_finder_maas_mj_publisher_enable, 0);
        dVar.Ni(e42.c0.clicfg_finder_maas_mj_publisher_entry_type, 0);
        dVar.Ni(e42.c0.clicfg_finder_maas_mj_publisher_movie_composing_enable, 0);
    }

    public void wi(java.util.List waitSaveToAlbumList) {
        kotlin.jvm.internal.o.g(waitSaveToAlbumList, "waitSaveToAlbumList");
        if (waitSaveToAlbumList.isEmpty()) {
            return;
        }
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.mjpublisher.shoot_composing.RepairerConfigShootComposingSaveAigcToAlbumEnable()) != 1) {
            return;
        }
        java.util.Iterator it = waitSaveToAlbumList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.maas_api.MJMediaItem mJMediaItem = (com.tencent.mm.maas_api.MJMediaItem) it.next();
            if (yy0.j0.f468158a[mJMediaItem.f68638d.ordinal()] == 1) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.String str = mJMediaItem.f68639e;
                arrayList.add(str);
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/mj_template/feature_service/MJPublisherFeatureServiceImpl", "addFinderWaterMarkThenSaveToAlbum", "(Ljava/util/List;)V", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap decodeFile = android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList.get(0));
                yj0.a.e(obj, decodeFile, "com/tencent/mm/mj_template/feature_service/MJPublisherFeatureServiceImpl", "addFinderWaterMarkThenSaveToAlbum", "(Ljava/util/List;)V", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;)Landroid/graphics/Bitmap;");
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                kotlin.jvm.internal.o.d(decodeFile);
                int width = decodeFile.getWidth();
                int height = decodeFile.getHeight();
                android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(config);
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList2.add(java.lang.Integer.valueOf(height));
                arrayList2.add(java.lang.Integer.valueOf(width));
                java.lang.Object obj2 = new java.lang.Object();
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/mj_template/feature_service/MJPublisherFeatureServiceImpl", "addFinderWaterMark", "(Landroid/content/Context;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList2.get(0)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList2.get(2));
                yj0.a.e(obj2, createBitmap, "com/tencent/mm/mj_template/feature_service/MJPublisherFeatureServiceImpl", "addFinderWaterMark", "(Landroid/content/Context;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
                android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
                canvas.drawBitmap(decodeFile, 0.0f, 0.0f, (android.graphics.Paint) null);
                android.graphics.drawable.Drawable drawable = context.getDrawable(com.tencent.mm.R.drawable.d4j);
                if (drawable != null) {
                    float width2 = decodeFile.getWidth() / 1080.0f;
                    int width3 = (decodeFile.getWidth() - ((int) (146 * width2))) / 2;
                    int height2 = decodeFile.getHeight() - ((int) (37 * width2));
                    drawable.setBounds(width3, height2 - ((int) (34 * width2)), decodeFile.getWidth() - width3, height2);
                    drawable.draw(canvas);
                }
                com.tencent.mm.sdk.platformtools.x.D0(createBitmap, 100, android.graphics.Bitmap.CompressFormat.JPEG, str, true);
                java.lang.String g17 = ai3.d.g("jpg");
                zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
                android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                ((yb0.g) b0Var).getClass();
                com.tencent.mm.platformtools.ExportFileUtil.b(context2, str, g17);
                q75.c.f(g17, com.tencent.mm.sdk.platformtools.x2.f193071a);
            }
        }
    }
}
