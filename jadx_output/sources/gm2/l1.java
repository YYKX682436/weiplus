package gm2;

/* loaded from: classes3.dex */
public final class l1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final gm2.l1 f273428d = new gm2.l1();

    public l1() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.res.Resources resources = com.tencent.mm.sdk.platformtools.x2.f193075e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.f481731c51));
        arrayList.add(resources);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/view/span/FinderLiveUserLevelConfig$Companion$level100AnimParam$2", "invoke", "()Lcom/tencent/mm/plugin/finder/live/view/span/FinderLiveUserLevelConfig$HightLevelAnimParam;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.e(obj, decodeResource, "com/tencent/mm/plugin/finder/live/view/span/FinderLiveUserLevelConfig$Companion$level100AnimParam$2", "invoke", "()Lcom/tencent/mm/plugin/finder/live/view/span/FinderLiveUserLevelConfig$HightLevelAnimParam;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        kotlin.jvm.internal.o.f(decodeResource, "decodeResource(...)");
        return new gm2.s1(decodeResource, com.tencent.mm.sdk.platformtools.x2.f193075e.getColor(com.tencent.mm.R.color.f479007nb), com.tencent.mm.sdk.platformtools.x2.f193075e.getColor(com.tencent.mm.R.color.f479018nm), com.tencent.mm.sdk.platformtools.x2.f193075e.getColor(com.tencent.mm.R.color.f479007nb), com.tencent.mm.sdk.platformtools.x2.f193075e.getColor(com.tencent.mm.R.color.f479018nm), com.tencent.mm.sdk.platformtools.x2.f193075e.getColor(com.tencent.mm.R.color.f479030ny), ((java.lang.Number) ((jz5.n) gm2.c1.f273330k).getValue()).intValue(), com.tencent.mm.sdk.platformtools.x2.f193075e.getColor(com.tencent.mm.R.color.BW_100_Alpha_0_1), com.tencent.mm.sdk.platformtools.x2.f193075e.getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_1));
    }
}
