package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class fb0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f112534d;

    /* renamed from: e, reason: collision with root package name */
    public int f112535e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ob0 f112536f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb0(com.tencent.mm.plugin.finder.live.plugin.ob0 ob0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f112536f = ob0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.fb0(this.f112536f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.fb0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.view.SurfaceHolder holder;
        android.view.Surface surface;
        android.graphics.Bitmap bitmap;
        android.graphics.Bitmap bitmap2;
        co0.b c17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f112535e;
        com.tencent.mm.plugin.finder.live.plugin.ob0 ob0Var = this.f112536f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            int ordinal = ob0Var.u1().ordinal();
            if (ordinal == 0) {
                android.view.SurfaceView f68622g = ob0Var.f113734r.getF68622g();
                java.lang.String str = ob0Var.f113733q;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getFrameShot from SURFACE_VIEW, surfaceView.isValid=");
                sb6.append((f68622g == null || (holder = f68622g.getHolder()) == null || (surface = holder.getSurface()) == null) ? null : java.lang.Boolean.valueOf(surface.isValid()));
                com.tencent.mars.xlog.Log.w(str, sb6.toString());
                if (f68622g != null) {
                    this.f112535e = 1;
                    obj = com.tencent.mm.plugin.finder.live.plugin.ob0.t1(ob0Var, f68622g, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    bitmap = (android.graphics.Bitmap) obj;
                }
            } else if (ordinal == 1) {
                com.tencent.mars.xlog.Log.w(ob0Var.f113733q, "getFrameShot from LIVE_PLAYER");
                mn0.b0 B1 = ob0Var.B1();
                nn0.c cVar = B1 instanceof nn0.c ? (nn0.c) B1 : null;
                android.graphics.Bitmap i18 = cVar != null ? cVar.i(android.graphics.Bitmap.Config.ARGB_8888, false, 1.0d) : null;
                this.f112534d = i18;
                this.f112535e = 2;
                if (kotlinx.coroutines.k1.b(500L, this) == aVar) {
                    return aVar;
                }
                bitmap2 = i18;
                bitmap = bitmap2;
            } else {
                if (ordinal != 2) {
                    throw new jz5.j();
                }
                com.tencent.mars.xlog.Log.w(ob0Var.f113733q, "getFrameShot from VIDEO_VIEW");
                android.view.TextureView videoView = ob0Var.f113734r.getVideoView();
                if (videoView != null) {
                    bitmap = videoView.getBitmap();
                }
            }
            bitmap = null;
        } else if (i17 == 1) {
            kotlin.ResultKt.throwOnFailure(obj);
            bitmap = (android.graphics.Bitmap) obj;
        } else {
            if (i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bitmap2 = (android.graphics.Bitmap) this.f112534d;
            kotlin.ResultKt.throwOnFailure(obj);
            bitmap = bitmap2;
        }
        if (ob0Var.D1()) {
            return bitmap;
        }
        if (bitmap != null && (c17 = co0.b.f43709e2.c(ob0Var.V0().f309129d.f68537e)) != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i19 = c17.U1;
            int i27 = c17.V1;
            if (width != 0 && height != 0 && i19 != 0 && i27 != 0) {
                android.graphics.Matrix matrix = new android.graphics.Matrix();
                matrix.postScale(i19 / width, i27 / height);
                zj0.a aVar2 = new zj0.a();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                aVar2.c(java.lang.Boolean.FALSE);
                aVar2.c(matrix);
                aVar2.c(java.lang.Integer.valueOf(height));
                aVar2.c(java.lang.Integer.valueOf(width));
                aVar2.c(0);
                aVar2.c(0);
                aVar2.c(bitmap);
                java.lang.Object obj2 = new java.lang.Object();
                yj0.a.d(obj2, aVar2.b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTXLivePlayerPlugin$getFrameShot$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar2.a(0), ((java.lang.Integer) aVar2.a(1)).intValue(), ((java.lang.Integer) aVar2.a(2)).intValue(), ((java.lang.Integer) aVar2.a(3)).intValue(), ((java.lang.Integer) aVar2.a(4)).intValue(), (android.graphics.Matrix) aVar2.a(5), ((java.lang.Boolean) aVar2.a(6)).booleanValue());
                yj0.a.e(obj2, createBitmap, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTXLivePlayerPlugin$getFrameShot$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
                return createBitmap;
            }
        }
        return null;
    }
}
