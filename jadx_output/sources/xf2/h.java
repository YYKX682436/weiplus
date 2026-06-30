package xf2;

/* loaded from: classes2.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f454277d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int[] f454278e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.graphics.Bitmap bitmap, int[] iArr, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f454277d = bitmap;
        this.f454278e = iArr;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xf2.h(this.f454277d, this.f454278e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((xf2.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        int[] iArr = this.f454278e;
        int i17 = iArr[0];
        int i18 = iArr[2];
        int i19 = iArr[1];
        int i27 = iArr[3];
        zj0.a aVar2 = new zj0.a();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        aVar2.c(java.lang.Boolean.FALSE);
        aVar2.c(null);
        aVar2.c(java.lang.Integer.valueOf(i27));
        aVar2.c(java.lang.Integer.valueOf(i19));
        aVar2.c(java.lang.Integer.valueOf(i18));
        aVar2.c(java.lang.Integer.valueOf(i17));
        aVar2.c(this.f454277d);
        java.lang.Object obj2 = new java.lang.Object();
        yj0.a.d(obj2, aVar2.b(), "com/tencent/mm/plugin/finder/live/controller/screenshotshare/view/ScreenShotView$render$afterCropBitmap$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar2.a(0), ((java.lang.Integer) aVar2.a(1)).intValue(), ((java.lang.Integer) aVar2.a(2)).intValue(), ((java.lang.Integer) aVar2.a(3)).intValue(), ((java.lang.Integer) aVar2.a(4)).intValue(), (android.graphics.Matrix) aVar2.a(5), ((java.lang.Boolean) aVar2.a(6)).booleanValue());
        yj0.a.e(obj2, createBitmap, "com/tencent/mm/plugin/finder/live/controller/screenshotshare/view/ScreenShotView$render$afterCropBitmap$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
        return createBitmap;
    }
}
