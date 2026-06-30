package ro2;

/* loaded from: classes2.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qe f398087d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f398088e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.constraintlayout.widget.ConstraintLayout f398089f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f398090g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f398091h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f398092i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f398093m;

    public q(com.tencent.mm.plugin.finder.convert.qe qeVar, in5.s0 s0Var, androidx.constraintlayout.widget.ConstraintLayout constraintLayout, int i17, int i18, android.content.Context context, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        this.f398087d = qeVar;
        this.f398088e = s0Var;
        this.f398089f = constraintLayout;
        this.f398090g = i17;
        this.f398091h = i18;
        this.f398092i = context;
        this.f398093m = baseFinderFeed;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/milestone/FinderFeedFullConvert_FinderMileStoneKt$showMileStoneCard$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.convert.qe qeVar = this.f398087d;
        int i17 = this.f398090g;
        int i18 = this.f398091h;
        in5.s0 s0Var = this.f398088e;
        android.content.Context context = s0Var.f293121e;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) s0Var.f293125i;
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = this.f398089f;
        int width = constraintLayout.getWidth();
        int height = constraintLayout.getHeight();
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(java.lang.Integer.valueOf(height));
        arrayList2.add(java.lang.Integer.valueOf(width));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj, arrayList2.toArray(), "com/tencent/mm/plugin/finder/milestone/FinderFeedFullConvert_FinderMileStoneKt", "saveMileStoneBitmap", "(Lcom/tencent/mm/plugin/finder/convert/FinderFeedFullConvert;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;II)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList2.get(0)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList2.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/finder/milestone/FinderFeedFullConvert_FinderMileStoneKt", "saveMileStoneBitmap", "(Lcom/tencent/mm/plugin/finder/convert/FinderFeedFullConvert;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;II)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        android.graphics.drawable.Drawable drawable = context.getResources().getDrawable(com.tencent.mm.R.drawable.d1d);
        drawable.setBounds(0, 0, width, height);
        drawable.draw(canvas);
        constraintLayout.draw(canvas);
        kotlinx.coroutines.y0 y0Var = s0Var.f293120d;
        if (y0Var != null) {
            kotlinx.coroutines.l.d(y0Var, null, null, new ro2.o(createBitmap, context, i17, i18, baseFinderFeed, qeVar, s0Var, null), 3, null);
        }
        ro2.t tVar = ro2.t.f398095f;
        android.content.Context context2 = this.f398092i;
        kotlin.jvm.internal.o.f(context2, "$context");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed item = this.f398093m;
        kotlin.jvm.internal.o.f(item, "$item");
        com.tencent.mm.plugin.finder.convert.qe qeVar2 = this.f398087d;
        ro2.r.h(qeVar2, tVar, context2, item);
        ro2.r.c(qeVar2, s0Var);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/milestone/FinderFeedFullConvert_FinderMileStoneKt$showMileStoneCard$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
