package com.tencent.mm.plugin.scanner.view;

/* loaded from: classes3.dex */
public class RectView extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Rect f159871d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Bitmap f159872e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Bitmap f159873f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Bitmap f159874g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Bitmap f159875h;

    /* renamed from: i, reason: collision with root package name */
    public int f159876i;

    /* renamed from: m, reason: collision with root package name */
    public int f159877m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.Paint f159878n;

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.Paint f159879o;

    public RectView(android.content.Context context) {
        super(context);
        this.f159872e = null;
        this.f159873f = null;
        this.f159874g = null;
        this.f159875h = null;
        this.f159876i = 0;
        this.f159877m = 0;
        this.f159878n = new android.graphics.Paint();
        this.f159879o = new android.graphics.Paint();
        a();
    }

    public final void a() {
        android.content.res.Resources resources = getResources();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.ceu));
        arrayList.add(resources);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/scanner/view/RectView", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.e(obj, decodeResource, "com/tencent/mm/plugin/scanner/view/RectView", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        this.f159872e = decodeResource;
        android.content.res.Resources resources2 = getResources();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.cev));
        arrayList2.add(resources2);
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/plugin/scanner/view/RectView", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeResource2 = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList2.get(0), ((java.lang.Integer) arrayList2.get(1)).intValue());
        yj0.a.e(obj2, decodeResource2, "com/tencent/mm/plugin/scanner/view/RectView", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        this.f159873f = decodeResource2;
        android.content.res.Resources resources3 = getResources();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.cew));
        arrayList3.add(resources3);
        java.lang.Object obj3 = new java.lang.Object();
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(obj3, arrayList3.toArray(), "com/tencent/mm/plugin/scanner/view/RectView", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeResource3 = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList3.get(0), ((java.lang.Integer) arrayList3.get(1)).intValue());
        yj0.a.e(obj3, decodeResource3, "com/tencent/mm/plugin/scanner/view/RectView", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        this.f159874g = decodeResource3;
        android.content.res.Resources resources4 = getResources();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.cex));
        arrayList4.add(resources4);
        java.lang.Object obj4 = new java.lang.Object();
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(obj4, arrayList4.toArray(), "com/tencent/mm/plugin/scanner/view/RectView", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeResource4 = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList4.get(0), ((java.lang.Integer) arrayList4.get(1)).intValue());
        yj0.a.e(obj4, decodeResource4, "com/tencent/mm/plugin/scanner/view/RectView", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        this.f159875h = decodeResource4;
        this.f159876i = this.f159872e.getWidth();
        this.f159877m = this.f159872e.getHeight();
        this.f159878n.setAntiAlias(true);
        this.f159879o.setAntiAlias(true);
    }

    public android.graphics.Rect getRect() {
        return new android.graphics.Rect(this.f159871d);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.clipRect(this.f159871d, android.graphics.Region.Op.DIFFERENCE);
        canvas.drawRect(this.f159871d, this.f159878n);
        canvas.restore();
        android.graphics.Bitmap bitmap = this.f159872e;
        android.graphics.Rect rect = this.f159871d;
        float f17 = rect.left;
        float f18 = rect.top;
        android.graphics.Paint paint = this.f159879o;
        canvas.drawBitmap(bitmap, f17, f18, paint);
        android.graphics.Bitmap bitmap2 = this.f159873f;
        android.graphics.Rect rect2 = this.f159871d;
        canvas.drawBitmap(bitmap2, rect2.right - this.f159876i, rect2.top, paint);
        android.graphics.Bitmap bitmap3 = this.f159874g;
        android.graphics.Rect rect3 = this.f159871d;
        canvas.drawBitmap(bitmap3, rect3.left, rect3.bottom - this.f159877m, paint);
        android.graphics.Bitmap bitmap4 = this.f159875h;
        android.graphics.Rect rect4 = this.f159871d;
        canvas.drawBitmap(bitmap4, rect4.right - this.f159876i, rect4.bottom - this.f159877m, paint);
    }

    public void setRect(android.graphics.Rect rect) {
        this.f159871d = rect;
    }

    public RectView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f159872e = null;
        this.f159873f = null;
        this.f159874g = null;
        this.f159875h = null;
        this.f159876i = 0;
        this.f159877m = 0;
        this.f159878n = new android.graphics.Paint();
        this.f159879o = new android.graphics.Paint();
        a();
    }

    public RectView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f159872e = null;
        this.f159873f = null;
        this.f159874g = null;
        this.f159875h = null;
        this.f159876i = 0;
        this.f159877m = 0;
        this.f159878n = new android.graphics.Paint();
        this.f159879o = new android.graphics.Paint();
        a();
    }
}
