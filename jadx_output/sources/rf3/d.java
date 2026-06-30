package rf3;

/* loaded from: classes12.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rf3.e f394985d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sf3.g f394986e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sf3.j f394987f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(rf3.e eVar, sf3.g gVar, sf3.j jVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f394985d = eVar;
        this.f394986e = gVar;
        this.f394987f = jVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rf3.d(this.f394985d, this.f394986e, this.f394987f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        rf3.d dVar = (rf3.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        dVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.graphics.Bitmap bitmap;
        int i17;
        int i18;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        rf3.e eVar = this.f394985d;
        eVar.getClass();
        sf3.g loadParam = this.f394986e;
        kotlin.jvm.internal.o.g(loadParam, "loadParam");
        boolean b17 = fp.i.b();
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (b17) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.lang.String c17 = loadParam.c();
            if (com.tencent.mm.sdk.platformtools.t8.K0(c17) || !com.tencent.mm.vfs.w6.j(c17)) {
                com.tencent.mars.xlog.Log.e("MediaGallery.DiskImageLoader", "getBitmap file not exist, path" + c17);
            } else {
                sf3.c cVar = eVar.f394988a;
                android.graphics.Bitmap a17 = cVar.a(loadParam);
                if (a17 != null) {
                    com.tencent.mars.xlog.Log.i("MediaGallery.DiskImageLoader", "get from cache success, path:" + c17);
                    bitmap = a17;
                } else {
                    com.tencent.mm.graphics.MMBitmapFactory$Options mMBitmapFactory$Options = new com.tencent.mm.graphics.MMBitmapFactory$Options();
                    ((android.graphics.BitmapFactory.Options) mMBitmapFactory$Options).inJustDecodeBounds = true;
                    android.graphics.Bitmap d17 = com.tencent.mm.graphics.e.d(c17, mMBitmapFactory$Options);
                    if (d17 != null) {
                        com.tencent.mars.xlog.Log.i("MediaGallery.DiskImageLoader", "bitmap recycled %s", d17);
                        d17.recycle();
                    }
                    this.f394987f.b(loadParam, mMBitmapFactory$Options);
                    boolean z17 = com.tencent.mm.sdk.platformtools.q2.c(((android.graphics.BitmapFactory.Options) mMBitmapFactory$Options).outWidth, ((android.graphics.BitmapFactory.Options) mMBitmapFactory$Options).outHeight) && ((android.graphics.BitmapFactory.Options) mMBitmapFactory$Options).outWidth > 480;
                    boolean z18 = com.tencent.mm.sdk.platformtools.q2.e(((android.graphics.BitmapFactory.Options) mMBitmapFactory$Options).outWidth, ((android.graphics.BitmapFactory.Options) mMBitmapFactory$Options).outHeight) && ((android.graphics.BitmapFactory.Options) mMBitmapFactory$Options).outHeight > 480;
                    if (z17 || z18) {
                        int i19 = ((android.graphics.BitmapFactory.Options) mMBitmapFactory$Options).outHeight;
                        int i27 = ((android.graphics.BitmapFactory.Options) mMBitmapFactory$Options).outWidth;
                        i17 = i19;
                        i18 = i27;
                    } else {
                        i18 = com.tencent.tavkit.component.TAVPlayer.VIDEO_PLAYER_HEIGHT;
                        i17 = 960;
                    }
                    int a18 = com.tencent.mm.sdk.platformtools.l.a(c17);
                    if (a18 != 90 && a18 != 270) {
                        int i28 = i17;
                        i17 = i18;
                        i18 = i28;
                    }
                    android.graphics.Bitmap T = com.tencent.mm.sdk.platformtools.x.T(c17, i18, i17, false);
                    if (T == null) {
                        com.tencent.mars.xlog.Log.e("MediaGallery.DiskImageLoader", "extractThumbNail fail, temBmp is null, filePath = " + c17);
                    } else {
                        android.graphics.Bitmap w07 = com.tencent.mm.sdk.platformtools.x.w0(T, a18);
                        cVar.b(loadParam, w07);
                        com.tencent.mars.xlog.Log.i("MediaGallery.DiskImageLoader", "put bitmap to lruCache,ret: " + f0Var + ", path: " + c17 + " , cost: " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + ", length: " + com.tencent.mm.vfs.w6.k(c17));
                        bitmap = w07;
                    }
                }
            }
            bitmap = null;
        } else {
            bitmap = com.tencent.mm.graphics.e.e(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources(), com.tencent.mm.R.drawable.bkr);
        }
        sf3.g gVar = this.f394986e;
        v65.i.c(eVar.f394990c, null, new rf3.c(bitmap != null, gVar, this.f394987f, new sf3.i(bitmap, null, gVar, 2, null), null), 1, null);
        return f0Var;
    }
}
