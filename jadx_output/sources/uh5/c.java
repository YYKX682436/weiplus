package uh5;

/* loaded from: classes12.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uh5.d f428001d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sf3.g f428002e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sf3.j f428003f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(uh5.d dVar, sf3.g gVar, sf3.j jVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f428001d = dVar;
        this.f428002e = gVar;
        this.f428003f = jVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new uh5.c(this.f428001d, this.f428002e, this.f428003f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        uh5.c cVar = (uh5.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        cVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.graphics.Bitmap bitmap;
        int i17;
        int i18;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        uh5.d dVar = this.f428001d;
        dVar.getClass();
        sf3.g loadParam = this.f428002e;
        kotlin.jvm.internal.o.g(loadParam, "loadParam");
        if (fp.i.b()) {
            java.lang.System.currentTimeMillis();
            java.lang.String c17 = loadParam.c();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(c17) && com.tencent.mm.vfs.w6.j(c17)) {
                sf3.c cVar = dVar.f428004a;
                android.graphics.Bitmap a17 = cVar.a(loadParam);
                if (a17 == null) {
                    com.tencent.mm.graphics.MMBitmapFactory$Options mMBitmapFactory$Options = new com.tencent.mm.graphics.MMBitmapFactory$Options();
                    ((android.graphics.BitmapFactory.Options) mMBitmapFactory$Options).inJustDecodeBounds = true;
                    android.graphics.Bitmap d17 = com.tencent.mm.graphics.e.d(c17, mMBitmapFactory$Options);
                    if (d17 != null) {
                        com.tencent.mars.xlog.Log.i("ChatImageLoaderImpl", "bitmap recycled %s", d17);
                        d17.recycle();
                    }
                    this.f428003f.b(loadParam, mMBitmapFactory$Options);
                    boolean z17 = com.tencent.mm.sdk.platformtools.q2.c(((android.graphics.BitmapFactory.Options) mMBitmapFactory$Options).outWidth, ((android.graphics.BitmapFactory.Options) mMBitmapFactory$Options).outHeight) && ((android.graphics.BitmapFactory.Options) mMBitmapFactory$Options).outWidth > 480;
                    boolean z18 = com.tencent.mm.sdk.platformtools.q2.e(((android.graphics.BitmapFactory.Options) mMBitmapFactory$Options).outWidth, ((android.graphics.BitmapFactory.Options) mMBitmapFactory$Options).outHeight) && ((android.graphics.BitmapFactory.Options) mMBitmapFactory$Options).outHeight > 480;
                    if (z17 || z18) {
                        i17 = ((android.graphics.BitmapFactory.Options) mMBitmapFactory$Options).outHeight;
                        i18 = ((android.graphics.BitmapFactory.Options) mMBitmapFactory$Options).outWidth;
                    } else {
                        i18 = com.tencent.tavkit.component.TAVPlayer.VIDEO_PLAYER_HEIGHT;
                        i17 = 960;
                    }
                    int a18 = com.tencent.mm.sdk.platformtools.l.a(c17);
                    if (a18 != 90 && a18 != 270) {
                        int i19 = i17;
                        i17 = i18;
                        i18 = i19;
                    }
                    android.graphics.Bitmap T = com.tencent.mm.sdk.platformtools.x.T(c17, i18, i17, false);
                    if (T == null) {
                        com.tencent.mars.xlog.Log.e("ChatImageLoaderImpl", "extractThumbNail fail, temBmp is null, filePath = " + c17);
                    } else {
                        a17 = com.tencent.mm.sdk.platformtools.x.w0(T, a18);
                        cVar.b(loadParam, a17);
                        java.lang.System.currentTimeMillis();
                        com.tencent.mm.vfs.w6.k(c17);
                    }
                }
                bitmap = a17;
            }
            bitmap = null;
        } else {
            bitmap = com.tencent.mm.graphics.e.e(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources(), com.tencent.mm.R.drawable.bkr);
        }
        sf3.g gVar = this.f428002e;
        v65.i.c(dVar.f428006c, null, new uh5.b(bitmap != null, gVar, this.f428003f, new sf3.i(bitmap, null, gVar, 2, null), null), 1, null);
        return jz5.f0.f302826a;
    }
}
