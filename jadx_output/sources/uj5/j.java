package uj5;

/* loaded from: classes5.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f428461d;

    /* renamed from: e, reason: collision with root package name */
    public int f428462e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.SurfaceView f428463f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(android.view.SurfaceView surfaceView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f428463f = surfaceView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new uj5.j(this.f428463f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((uj5.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f428462e;
        if (i17 != 0) {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        android.view.SurfaceView surfaceView = this.f428463f;
        this.f428461d = surfaceView;
        this.f428462e = 1;
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
        rVar.k();
        int width = surfaceView.getWidth();
        int height = surfaceView.getHeight();
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(height));
        arrayList.add(java.lang.Integer.valueOf(width));
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj2, arrayList.toArray(), "com/tencent/mm/ui/snapshot/SnapShotUtilKt$captureSurfaceView$2$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj2, createBitmap, "com/tencent/mm/ui/snapshot/SnapShotUtilKt$captureSurfaceView$2$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            android.view.PixelCopy.request(surfaceView, createBitmap, new uj5.i(rVar, createBitmap), com.tencent.mm.sdk.platformtools.n3.createFreeHandler(android.os.Looper.getMainLooper()));
        } else {
            rVar.resumeWith(kotlin.Result.m521constructorimpl(null));
        }
        java.lang.Object j17 = rVar.j();
        return j17 == aVar ? aVar : j17;
    }
}
