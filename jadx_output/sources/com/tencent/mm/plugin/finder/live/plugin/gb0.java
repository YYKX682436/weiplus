package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class gb0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f112674d;

    /* renamed from: e, reason: collision with root package name */
    public int f112675e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ob0 f112676f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb0(com.tencent.mm.plugin.finder.live.plugin.ob0 ob0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f112676f = ob0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.gb0(this.f112676f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.gb0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.graphics.Bitmap bitmap;
        android.graphics.Bitmap bitmap2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f112675e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.finder.live.plugin.ob0 ob0Var = this.f112676f;
            android.view.SurfaceView f68622g = ob0Var.f113734r.getF68622g();
            if (f68622g != null) {
                android.graphics.Point b17 = com.tencent.mm.ui.bl.b(f68622g.getContext());
                boolean z17 = b17.x > b17.y;
                com.tencent.mars.xlog.Log.w(ob0Var.f113733q, "isHorizontal= " + z17 + " surfaceView.isValid=" + f68622g.getHolder().getSurface().isValid());
                if (z17 || !f68622g.getHolder().getSurface().isValid()) {
                    mn0.b0 B1 = ob0Var.B1();
                    nn0.c cVar = B1 instanceof nn0.c ? (nn0.c) B1 : null;
                    android.graphics.Bitmap i18 = cVar != null ? cVar.i(android.graphics.Bitmap.Config.ARGB_8888, false, 1.0d) : null;
                    this.f112674d = i18;
                    this.f112675e = 2;
                    if (kotlinx.coroutines.k1.b(500L, this) == aVar) {
                        return aVar;
                    }
                    bitmap2 = i18;
                    bitmap = bitmap2;
                } else {
                    this.f112675e = 1;
                    obj = com.tencent.mm.plugin.finder.live.plugin.ob0.t1(ob0Var, f68622g, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    bitmap = (android.graphics.Bitmap) obj;
                }
            } else {
                android.view.TextureView videoView = ob0Var.f113734r.getVideoView();
                bitmap = videoView != null ? videoView.getBitmap() : null;
            }
        } else if (i17 == 1) {
            kotlin.ResultKt.throwOnFailure(obj);
            bitmap = (android.graphics.Bitmap) obj;
        } else {
            if (i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bitmap2 = (android.graphics.Bitmap) this.f112674d;
            kotlin.ResultKt.throwOnFailure(obj);
            bitmap = bitmap2;
        }
        if (bitmap == null) {
            return null;
        }
        if (sn0.b.f409964e2 == null) {
            com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.LiveCoreSecondaryDevice", "createInstance", new java.lang.Object[0]);
            sn0.b.f409964e2 = new sn0.b();
        }
        sn0.b bVar = sn0.b.f409964e2;
        kotlin.jvm.internal.o.d(bVar);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i19 = bVar.U1;
        int i27 = bVar.V1;
        if (width == 0 || height == 0 || i19 == 0 || i27 == 0) {
            return null;
        }
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
        yj0.a.d(obj2, aVar2.b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTXLivePlayerPlugin$getFrameShotSecondary$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar2.a(0), ((java.lang.Integer) aVar2.a(1)).intValue(), ((java.lang.Integer) aVar2.a(2)).intValue(), ((java.lang.Integer) aVar2.a(3)).intValue(), ((java.lang.Integer) aVar2.a(4)).intValue(), (android.graphics.Matrix) aVar2.a(5), ((java.lang.Boolean) aVar2.a(6)).booleanValue());
        yj0.a.e(obj2, createBitmap, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTXLivePlayerPlugin$getFrameShotSecondary$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
        return createBitmap;
    }
}
