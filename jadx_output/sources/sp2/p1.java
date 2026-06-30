package sp2;

/* loaded from: classes2.dex */
public final class p1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f411178d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sp2.o2 f411179e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(sp2.o2 o2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f411179e = o2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sp2.p1(this.f411179e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((sp2.p1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f411178d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f411178d = 1;
            if (kotlinx.coroutines.k1.b(300L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.ui.MMActivity activity = this.f411179e.f411121a;
        kotlin.jvm.internal.o.g(activity, "activity");
        android.view.View decorView = activity.getWindow().getDecorView();
        kotlin.jvm.internal.o.f(decorView, "getDecorView(...)");
        int width = decorView.getWidth();
        int height = decorView.getHeight();
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(height));
        arrayList.add(java.lang.Integer.valueOf(width));
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj2, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/FinderLiveScreenShotOperations", "takeScreenShot", "(Landroid/app/Activity;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj2, createBitmap, "com/tencent/mm/plugin/finder/assist/FinderLiveScreenShotOperations", "takeScreenShot", "(Landroid/app/Activity;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
        decorView.draw(new android.graphics.Canvas(createBitmap));
        com.tencent.mars.xlog.Log.i("Finder.LiveEntranceFragmentViewCallback", "take screenshot successfully");
        com.tencent.mm.autogen.events.FinderLiveSquareRefreshedEvent finderLiveSquareRefreshedEvent = new com.tencent.mm.autogen.events.FinderLiveSquareRefreshedEvent();
        finderLiveSquareRefreshedEvent.f54293g.f8371a = createBitmap;
        finderLiveSquareRefreshedEvent.e();
        return jz5.f0.f302826a;
    }
}
