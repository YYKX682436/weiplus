package gf2;

/* loaded from: classes5.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.anchormilestoneshare.view.AnchorMilestoneShareView f271286d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f271287e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f271288f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.tencent.mm.plugin.finder.live.controller.anchormilestoneshare.view.AnchorMilestoneShareView anchorMilestoneShareView, android.view.View view, android.view.View view2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f271286d = anchorMilestoneShareView;
        this.f271287e = view;
        this.f271288f = view2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gf2.j(this.f271286d, this.f271287e, this.f271288f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gf2.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.graphics.Bitmap createBitmap;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        android.view.View view = this.f271287e;
        int width = view.getWidth();
        int height = view.getHeight();
        com.tencent.mm.plugin.finder.live.controller.anchormilestoneshare.view.AnchorMilestoneShareView anchorMilestoneShareView = this.f271286d;
        if (anchorMilestoneShareView.f111584s == 0) {
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(height));
            arrayList.add(java.lang.Integer.valueOf(width));
            java.lang.Object obj2 = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/anchormilestoneshare/view/AnchorMilestoneShareView", "getBgBitmap", "(II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj2, createBitmap, "com/tencent/mm/plugin/finder/live/controller/anchormilestoneshare/view/AnchorMilestoneShareView", "getBgBitmap", "(II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
            new android.graphics.Canvas(createBitmap).drawColor(anchorMilestoneShareView.getResources().getColor(com.tencent.mm.R.color.f478513v, null));
        } else {
            int i17 = width + (((int) (anchorMilestoneShareView.getResources().getDisplayMetrics().density * 28.0f)) * 2);
            int i18 = height + (((int) (anchorMilestoneShareView.getResources().getDisplayMetrics().density * 24.0f)) * 2);
            android.graphics.Bitmap.Config config2 = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(config2);
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Integer.valueOf(i18));
            arrayList2.add(java.lang.Integer.valueOf(i17));
            java.lang.Object obj3 = new java.lang.Object();
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(obj3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/controller/anchormilestoneshare/view/AnchorMilestoneShareView", "getBgBitmap", "(II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList2.get(0)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList2.get(2));
            yj0.a.e(obj3, createBitmap, "com/tencent/mm/plugin/finder/live/controller/anchormilestoneshare/view/AnchorMilestoneShareView", "getBgBitmap", "(II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
            new android.graphics.Canvas(createBitmap).drawColor(-16777216);
        }
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        android.graphics.Bitmap b07 = com.tencent.mm.sdk.platformtools.x.b0(view);
        if (b07 != null) {
            canvas.drawBitmap(b07, (canvas.getWidth() - b07.getWidth()) / 2.0f, (canvas.getHeight() - b07.getHeight()) / 2.0f, paint);
        }
        gf2.z zVar = (gf2.z) ((java.util.LinkedHashMap) anchorMilestoneShareView.f111583r).getOrDefault(this.f271288f, null);
        android.graphics.Bitmap bitmap = zVar != null ? zVar.f271327b : null;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, (canvas.getWidth() - bitmap.getWidth()) / 2.0f, (canvas.getHeight() - bitmap.getHeight()) / 2.0f, paint);
        }
        return createBitmap;
    }
}
