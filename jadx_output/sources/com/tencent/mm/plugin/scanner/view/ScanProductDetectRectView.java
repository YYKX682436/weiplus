package com.tencent.mm.plugin.scanner.view;

/* loaded from: classes3.dex */
public class ScanProductDetectRectView extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Rect f159901d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Bitmap f159902e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Bitmap f159903f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Bitmap f159904g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Bitmap f159905h;

    /* renamed from: i, reason: collision with root package name */
    public int f159906i;

    /* renamed from: m, reason: collision with root package name */
    public int f159907m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.Paint f159908n;

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.Paint f159909o;

    public ScanProductDetectRectView(android.content.Context context) {
        super(context);
        this.f159902e = null;
        this.f159903f = null;
        this.f159904g = null;
        this.f159905h = null;
        this.f159906i = 0;
        this.f159907m = 0;
        this.f159908n = new android.graphics.Paint();
        this.f159909o = new android.graphics.Paint();
        a();
    }

    public final void a() {
        android.content.res.Resources resources = getResources();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.cel));
        arrayList.add(resources);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/scanner/view/ScanProductDetectRectView", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.e(obj, decodeResource, "com/tencent/mm/plugin/scanner/view/ScanProductDetectRectView", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        this.f159902e = decodeResource;
        android.content.res.Resources resources2 = getResources();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.cen));
        arrayList2.add(resources2);
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/plugin/scanner/view/ScanProductDetectRectView", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeResource2 = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList2.get(0), ((java.lang.Integer) arrayList2.get(1)).intValue());
        yj0.a.e(obj2, decodeResource2, "com/tencent/mm/plugin/scanner/view/ScanProductDetectRectView", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        this.f159903f = decodeResource2;
        android.content.res.Resources resources3 = getResources();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.cek));
        arrayList3.add(resources3);
        java.lang.Object obj3 = new java.lang.Object();
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(obj3, arrayList3.toArray(), "com/tencent/mm/plugin/scanner/view/ScanProductDetectRectView", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeResource3 = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList3.get(0), ((java.lang.Integer) arrayList3.get(1)).intValue());
        yj0.a.e(obj3, decodeResource3, "com/tencent/mm/plugin/scanner/view/ScanProductDetectRectView", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        this.f159904g = decodeResource3;
        android.content.res.Resources resources4 = getResources();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.cem));
        arrayList4.add(resources4);
        java.lang.Object obj4 = new java.lang.Object();
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(obj4, arrayList4.toArray(), "com/tencent/mm/plugin/scanner/view/ScanProductDetectRectView", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeResource4 = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList4.get(0), ((java.lang.Integer) arrayList4.get(1)).intValue());
        yj0.a.e(obj4, decodeResource4, "com/tencent/mm/plugin/scanner/view/ScanProductDetectRectView", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        this.f159905h = decodeResource4;
        this.f159906i = this.f159902e.getWidth();
        this.f159907m = this.f159902e.getHeight();
        this.f159908n.setAntiAlias(true);
        this.f159909o.setAntiAlias(true);
    }

    public android.graphics.Rect getRect() {
        return new android.graphics.Rect(this.f159901d);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.clipRect(this.f159901d, android.graphics.Region.Op.DIFFERENCE);
        canvas.drawRect(this.f159901d, this.f159908n);
        canvas.restore();
        android.graphics.Bitmap bitmap = this.f159902e;
        android.graphics.Rect rect = this.f159901d;
        float f17 = rect.left;
        float f18 = rect.top;
        android.graphics.Paint paint = this.f159909o;
        canvas.drawBitmap(bitmap, f17, f18, paint);
        android.graphics.Bitmap bitmap2 = this.f159903f;
        android.graphics.Rect rect2 = this.f159901d;
        canvas.drawBitmap(bitmap2, rect2.right - this.f159906i, rect2.top, paint);
        android.graphics.Bitmap bitmap3 = this.f159904g;
        android.graphics.Rect rect3 = this.f159901d;
        canvas.drawBitmap(bitmap3, rect3.left, rect3.bottom - this.f159907m, paint);
        android.graphics.Bitmap bitmap4 = this.f159905h;
        android.graphics.Rect rect4 = this.f159901d;
        canvas.drawBitmap(bitmap4, rect4.right - this.f159906i, rect4.bottom - this.f159907m, paint);
    }

    public void setRect(android.graphics.Rect rect) {
        this.f159901d = rect;
    }

    public ScanProductDetectRectView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f159902e = null;
        this.f159903f = null;
        this.f159904g = null;
        this.f159905h = null;
        this.f159906i = 0;
        this.f159907m = 0;
        this.f159908n = new android.graphics.Paint();
        this.f159909o = new android.graphics.Paint();
        a();
    }

    public ScanProductDetectRectView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f159902e = null;
        this.f159903f = null;
        this.f159904g = null;
        this.f159905h = null;
        this.f159906i = 0;
        this.f159907m = 0;
        this.f159908n = new android.graphics.Paint();
        this.f159909o = new android.graphics.Paint();
        a();
    }
}
