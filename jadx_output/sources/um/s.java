package um;

/* loaded from: classes10.dex */
public class s implements um.m {

    /* renamed from: d, reason: collision with root package name */
    public java.util.Stack f428693d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.Stack f428694e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.HashMap f428695f;

    /* renamed from: g, reason: collision with root package name */
    public int f428696g;

    /* renamed from: h, reason: collision with root package name */
    public int f428697h;

    /* renamed from: i, reason: collision with root package name */
    public int f428698i;

    @Override // um.m
    public int A3(boolean z17) {
        if (z17) {
            java.util.Stack stack = this.f428693d;
            if (stack != null) {
                return stack.size();
            }
            return 0;
        }
        java.util.Stack stack2 = this.f428694e;
        if (stack2 != null) {
            return stack2.size();
        }
        return 0;
    }

    @Override // um.m
    public void M(android.graphics.Canvas canvas, boolean z17) {
        if (z17) {
            canvas.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
            java.util.Iterator it = this.f428693d.iterator();
            while (it.hasNext()) {
                xk0.k kVar = (xk0.k) it.next();
                kVar.a(canvas, true, false, (android.graphics.Bitmap) this.f428695f.get(java.lang.Long.valueOf(kVar.f454989g)));
            }
            return;
        }
        java.util.Stack stack = this.f428693d;
        xk0.k kVar2 = (stack == null || stack.size() <= 0) ? null : (xk0.k) this.f428693d.peek();
        if (kVar2 != null) {
            xk0.i iVar = xk0.i.ONE;
            xk0.i iVar2 = kVar2.f454986d;
            if (iVar2 == iVar) {
                kVar2.a(canvas, true, false, (android.graphics.Bitmap) this.f428695f.get(java.lang.Long.valueOf(kVar2.f454989g)));
                return;
            }
            if (iVar2 == xk0.i.TWO) {
                if (!this.f428695f.containsKey(java.lang.Long.valueOf(kVar2.f454989g))) {
                    int i17 = this.f428697h;
                    int i18 = this.f428698i;
                    android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_4444;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(config);
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Integer.valueOf(i18));
                    arrayList.add(java.lang.Integer.valueOf(i17));
                    java.lang.Object obj = new java.lang.Object();
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/cache/MosaicCache", "onDrawCache", "(Landroid/graphics/Canvas;Z)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                    android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
                    yj0.a.e(obj, createBitmap, "com/tencent/mm/cache/MosaicCache", "onDrawCache", "(Landroid/graphics/Canvas;Z)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                    android.graphics.Canvas canvas2 = new android.graphics.Canvas(createBitmap);
                    canvas2.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
                    kVar2.a(canvas2, true, true, (android.graphics.Bitmap) this.f428695f.get(java.lang.Long.valueOf(kVar2.f454989g)));
                    this.f428695f.put(java.lang.Long.valueOf(kVar2.f454989g), createBitmap);
                    com.tencent.mars.xlog.Log.i("MicroMsg.MosaicCache", "draw cache in two mosaic");
                }
                if (kVar2.f454991i) {
                    kVar2.a(canvas, true, false, (android.graphics.Bitmap) this.f428695f.get(java.lang.Long.valueOf(kVar2.f454989g)));
                    kVar2.f454991i = false;
                }
            }
        }
    }

    @Override // um.m
    public void O3(android.graphics.Canvas canvas) {
        java.util.Iterator it = this.f428693d.iterator();
        while (it.hasNext()) {
            xk0.k kVar = (xk0.k) it.next();
            kVar.a(canvas, true, false, (android.graphics.Bitmap) this.f428695f.get(java.lang.Long.valueOf(kVar.f454989g)));
        }
    }

    @Override // um.m
    public void R2(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MosaicCache", "[onSave] size:%s", java.lang.Integer.valueOf(this.f428693d.size()));
        java.util.Stack stack = this.f428694e;
        if (stack != null) {
            stack.clear();
        }
        this.f428694e = (java.util.Stack) this.f428693d.clone();
        if (z17) {
            this.f428693d.clear();
        }
    }

    @Override // um.m
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void add(xk0.k kVar) {
        java.util.Stack stack = this.f428693d;
        if (stack != null) {
            stack.push(kVar);
        }
    }

    public void b(xk0.k kVar) {
        java.util.Iterator it = this.f428693d.iterator();
        while (it.hasNext()) {
            if (((xk0.k) it.next()).f454989g == kVar.f454989g) {
                it.remove();
            }
        }
    }

    @Override // um.m
    public void clear() {
        java.util.Stack stack = this.f428693d;
        if (stack != null) {
            stack.clear();
        }
    }

    @Override // um.m
    public void f3(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MosaicCache", "[onRestore] size:%s", java.lang.Integer.valueOf(this.f428693d.size()));
        this.f428693d.clear();
        java.util.Stack stack = this.f428694e;
        if (stack != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MosaicCache", "[onRestore] %s", java.lang.Integer.valueOf(stack.size()));
            this.f428693d.addAll(this.f428694e);
            if (z17) {
                this.f428694e.clear();
            }
        }
    }

    @Override // um.m
    public void o5() {
        this.f428696g++;
    }

    @Override // um.m
    public void onCreate() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MosaicCache", "[onCreate]");
        this.f428693d = new java.util.Stack();
        this.f428695f = new java.util.HashMap();
    }

    @Override // um.m
    public void onDestroy() {
        java.util.Stack stack = this.f428693d;
        if (stack != null) {
            java.util.Iterator it = stack.iterator();
            while (it.hasNext()) {
                ((xk0.k) it.next()).getClass();
            }
            this.f428693d.clear();
        }
        java.util.Stack stack2 = this.f428694e;
        if (stack2 != null) {
            java.util.Iterator it6 = stack2.iterator();
            while (it6.hasNext()) {
                ((xk0.k) it6.next()).getClass();
            }
            this.f428694e.clear();
        }
        java.util.Iterator it7 = this.f428695f.entrySet().iterator();
        while (it7.hasNext()) {
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) ((java.util.Map.Entry) it7.next()).getValue();
            if (bitmap != null && !bitmap.isRecycled()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MosaicCache", "bitmap recycle %s", bitmap.toString());
                bitmap.recycle();
            }
        }
        this.f428695f.clear();
    }

    @Override // um.m
    public java.lang.Object pop() {
        if (this.f428693d.size() > 0) {
            return (xk0.k) this.f428693d.pop();
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.MosaicCache", "[pop]");
        return null;
    }
}
