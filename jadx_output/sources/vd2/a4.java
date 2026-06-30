package vd2;

/* loaded from: classes3.dex */
public final class a4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.FinderLiveViewCallback f435652d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(com.tencent.mm.plugin.finder.live.FinderLiveViewCallback finderLiveViewCallback) {
        super(0);
        this.f435652d = finderLiveViewCallback;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        en2.a aVar = new en2.a();
        androidx.appcompat.app.AppCompatActivity context = this.f435652d.f111484f.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.util.ArrayList arrayList = aVar.f255278a;
        int size = arrayList.size();
        java.lang.Integer valueOf = java.lang.Integer.valueOf(com.tencent.mm.R.drawable.br7);
        if (size == 0) {
            android.content.res.Resources resources = context.getResources();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.f481924br3));
            arrayList2.add(resources);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(obj, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/manager/ConfettiBitmapManager", "initBitmapList", "(Landroid/content/Context;)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList2.get(0), ((java.lang.Integer) arrayList2.get(1)).intValue());
            yj0.a.e(obj, decodeResource, "com/tencent/mm/plugin/finder/live/widget/manager/ConfettiBitmapManager", "initBitmapList", "(Landroid/content/Context;)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            int i17 = no0.i.f338727a;
            android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(decodeResource, i17, i17, true);
            kotlin.jvm.internal.o.f(createScaledBitmap, "createScaledBitmap(...)");
            android.content.res.Resources resources2 = context.getResources();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.f481925br4));
            arrayList3.add(resources2);
            java.lang.Object obj2 = new java.lang.Object();
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(obj2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/manager/ConfettiBitmapManager", "initBitmapList", "(Landroid/content/Context;)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeResource2 = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList3.get(0), ((java.lang.Integer) arrayList3.get(1)).intValue());
            yj0.a.e(obj2, decodeResource2, "com/tencent/mm/plugin/finder/live/widget/manager/ConfettiBitmapManager", "initBitmapList", "(Landroid/content/Context;)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createScaledBitmap2 = android.graphics.Bitmap.createScaledBitmap(decodeResource2, i17, i17, true);
            kotlin.jvm.internal.o.f(createScaledBitmap2, "createScaledBitmap(...)");
            android.content.res.Resources resources3 = context.getResources();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.f481926br5));
            arrayList4.add(resources3);
            java.lang.Object obj3 = new java.lang.Object();
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(obj3, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/widget/manager/ConfettiBitmapManager", "initBitmapList", "(Landroid/content/Context;)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeResource3 = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList4.get(0), ((java.lang.Integer) arrayList4.get(1)).intValue());
            yj0.a.e(obj3, decodeResource3, "com/tencent/mm/plugin/finder/live/widget/manager/ConfettiBitmapManager", "initBitmapList", "(Landroid/content/Context;)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createScaledBitmap3 = android.graphics.Bitmap.createScaledBitmap(decodeResource3, i17, i17, true);
            kotlin.jvm.internal.o.f(createScaledBitmap3, "createScaledBitmap(...)");
            android.content.res.Resources resources4 = context.getResources();
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.br6));
            arrayList5.add(resources4);
            java.lang.Object obj4 = new java.lang.Object();
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(obj4, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/widget/manager/ConfettiBitmapManager", "initBitmapList", "(Landroid/content/Context;)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeResource4 = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList5.get(0), ((java.lang.Integer) arrayList5.get(1)).intValue());
            yj0.a.e(obj4, decodeResource4, "com/tencent/mm/plugin/finder/live/widget/manager/ConfettiBitmapManager", "initBitmapList", "(Landroid/content/Context;)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createScaledBitmap4 = android.graphics.Bitmap.createScaledBitmap(decodeResource4, i17, i17, true);
            kotlin.jvm.internal.o.f(createScaledBitmap4, "createScaledBitmap(...)");
            android.content.res.Resources resources5 = context.getResources();
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(valueOf);
            arrayList6.add(resources5);
            java.lang.Object obj5 = new java.lang.Object();
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(obj5, arrayList6.toArray(), "com/tencent/mm/plugin/finder/live/widget/manager/ConfettiBitmapManager", "initBitmapList", "(Landroid/content/Context;)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeResource5 = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList6.get(0), ((java.lang.Integer) arrayList6.get(1)).intValue());
            yj0.a.e(obj5, decodeResource5, "com/tencent/mm/plugin/finder/live/widget/manager/ConfettiBitmapManager", "initBitmapList", "(Landroid/content/Context;)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createScaledBitmap5 = android.graphics.Bitmap.createScaledBitmap(decodeResource5, i17, i17, true);
            kotlin.jvm.internal.o.f(createScaledBitmap5, "createScaledBitmap(...)");
            android.content.res.Resources resources6 = context.getResources();
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.br8));
            arrayList7.add(resources6);
            java.lang.Object obj6 = new java.lang.Object();
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(obj6, arrayList7.toArray(), "com/tencent/mm/plugin/finder/live/widget/manager/ConfettiBitmapManager", "initBitmapList", "(Landroid/content/Context;)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeResource6 = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList7.get(0), ((java.lang.Integer) arrayList7.get(1)).intValue());
            yj0.a.e(obj6, decodeResource6, "com/tencent/mm/plugin/finder/live/widget/manager/ConfettiBitmapManager", "initBitmapList", "(Landroid/content/Context;)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createScaledBitmap6 = android.graphics.Bitmap.createScaledBitmap(decodeResource6, i17, i17, true);
            kotlin.jvm.internal.o.f(createScaledBitmap6, "createScaledBitmap(...)");
            arrayList.add(createScaledBitmap);
            arrayList.add(createScaledBitmap2);
            arrayList.add(createScaledBitmap3);
            arrayList.add(createScaledBitmap4);
            arrayList.add(createScaledBitmap5);
            arrayList.add(createScaledBitmap6);
        }
        java.util.ArrayList arrayList8 = aVar.f255279b;
        if (arrayList8.size() == 0) {
            android.content.res.Resources resources7 = context.getResources();
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList9.add(valueOf);
            arrayList9.add(resources7);
            java.lang.Object obj7 = new java.lang.Object();
            java.util.Collections.reverse(arrayList9);
            yj0.a.d(obj7, arrayList9.toArray(), "com/tencent/mm/plugin/finder/live/widget/manager/ConfettiBitmapManager", "initBitmapList", "(Landroid/content/Context;)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeResource7 = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList9.get(0), ((java.lang.Integer) arrayList9.get(1)).intValue());
            yj0.a.e(obj7, decodeResource7, "com/tencent/mm/plugin/finder/live/widget/manager/ConfettiBitmapManager", "initBitmapList", "(Landroid/content/Context;)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            int i18 = no0.i.f338727a;
            android.graphics.Bitmap createScaledBitmap7 = android.graphics.Bitmap.createScaledBitmap(decodeResource7, i18, i18, true);
            kotlin.jvm.internal.o.f(createScaledBitmap7, "createScaledBitmap(...)");
            android.content.res.Resources resources8 = context.getResources();
            java.util.ArrayList arrayList10 = new java.util.ArrayList();
            arrayList10.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.br9));
            arrayList10.add(resources8);
            java.lang.Object obj8 = new java.lang.Object();
            java.util.Collections.reverse(arrayList10);
            yj0.a.d(obj8, arrayList10.toArray(), "com/tencent/mm/plugin/finder/live/widget/manager/ConfettiBitmapManager", "initBitmapList", "(Landroid/content/Context;)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeResource8 = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList10.get(0), ((java.lang.Integer) arrayList10.get(1)).intValue());
            yj0.a.e(obj8, decodeResource8, "com/tencent/mm/plugin/finder/live/widget/manager/ConfettiBitmapManager", "initBitmapList", "(Landroid/content/Context;)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createScaledBitmap8 = android.graphics.Bitmap.createScaledBitmap(decodeResource8, i18, i18, true);
            kotlin.jvm.internal.o.f(createScaledBitmap8, "createScaledBitmap(...)");
            arrayList8.add(createScaledBitmap7);
            arrayList8.add(createScaledBitmap8);
        }
        return aVar;
    }
}
