package xk0;

/* loaded from: classes10.dex */
public class f implements java.lang.Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f454949d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f454950e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.api.IEmojiInfo f454951f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Bitmap f454952g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Rect f454953h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Rect f454954i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.PointF f454955m;

    /* renamed from: q, reason: collision with root package name */
    public boolean f454959q;

    /* renamed from: s, reason: collision with root package name */
    public final android.graphics.PointF f454961s;

    /* renamed from: t, reason: collision with root package name */
    public float f454962t;

    /* renamed from: u, reason: collision with root package name */
    public float f454963u;

    /* renamed from: y, reason: collision with root package name */
    public android.graphics.PointF f454967y;

    /* renamed from: z, reason: collision with root package name */
    public float f454968z;

    /* renamed from: n, reason: collision with root package name */
    public int f454956n = 0;

    /* renamed from: o, reason: collision with root package name */
    public float f454957o = 1.0f;

    /* renamed from: p, reason: collision with root package name */
    public float f454958p = 1.0f;

    /* renamed from: r, reason: collision with root package name */
    public boolean f454960r = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f454964v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f454965w = true;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f454966x = null;

    public f(android.content.Context context, android.graphics.Matrix matrix, java.lang.String str, com.tencent.mm.api.IEmojiInfo iEmojiInfo, android.graphics.Rect rect, android.graphics.Rect rect2) {
        new java.util.ArrayList();
        this.f454950e = str;
        this.f454951f = iEmojiInfo;
        this.f454949d = context;
        this.f454953h = rect;
        this.f454954i = rect2;
        this.f454955m = new android.graphics.PointF();
        this.f454961s = new android.graphics.PointF();
    }

    public void clear() {
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiItem", "[clear]");
        android.graphics.Bitmap bitmap = this.f454952g;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiItem", "bitmap recycle %s", this.f454952g.toString());
        this.f454952g.recycle();
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public xk0.f clone() {
        xk0.f fVar;
        java.lang.CloneNotSupportedException e17;
        try {
            fVar = (xk0.f) super.clone();
            try {
                android.graphics.PointF pointF = this.f454955m;
                fVar.f454955m = new android.graphics.PointF(pointF.x, pointF.y);
                fVar.f454951f = this.f454951f;
            } catch (java.lang.CloneNotSupportedException e18) {
                e17 = e18;
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.EmojiItem", e17, "", new java.lang.Object[0]);
                return fVar;
            }
        } catch (java.lang.CloneNotSupportedException e19) {
            fVar = null;
            e17 = e19;
        }
        return fVar;
    }

    public void g(float f17, float f18, float f19, int i17) {
        this.f454952g = j(p());
        android.graphics.Rect rect = this.f454953h;
        this.f454962t = (rect.width() * 1.2f) / this.f454952g.getWidth();
        float f27 = this.f454962t * f19;
        this.f454962t = f27;
        float width = ((rect.width() * 0.1f) / this.f454952g.getWidth()) * f19;
        this.f454963u = width;
        if (this.f454965w) {
            this.f454958p = (float) (width + ((f27 - width) * 0.28d));
        } else {
            this.f454958p = 1.0f;
        }
        this.f454956n = i17;
        this.f454957o *= this.f454958p;
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiItem", "MAX_SCALE:%s MIN_SCALE:%s mInitScale:%s, mScale:%s", java.lang.Float.valueOf(f27), java.lang.Float.valueOf(this.f454963u), java.lang.Float.valueOf(this.f454958p), java.lang.Float.valueOf(this.f454957o));
        v(f17, f18);
    }

    public void h(float f17, float f18, int i17, float f19, int i18) {
        this.f454952g = j(p());
        float f27 = i18;
        this.f454962t = (1.2f * f27) / r0.getWidth();
        this.f454963u = (f27 * 0.1f) / this.f454952g.getWidth();
        this.f454958p = 1.0f;
        this.f454956n = i17;
        this.f454957o = f19;
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiItem", "MAX_SCALE:%s MIN_SCALE:%s mInitScale:%s, mScale:%s, mRotation:%s", java.lang.Float.valueOf(this.f454962t), java.lang.Float.valueOf(this.f454963u), java.lang.Float.valueOf(this.f454958p), java.lang.Float.valueOf(this.f454957o), java.lang.Integer.valueOf(this.f454956n));
        v(f17, f18);
    }

    public void i(android.graphics.Canvas canvas) {
        android.graphics.Bitmap bitmap = this.f454952g;
        if (bitmap == null || bitmap.isRecycled()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.EmojiItem", "[draw] null == bitmap || bitmap isRecycled");
            return;
        }
        canvas.setDrawFilter(new android.graphics.PaintFlagsDrawFilter(0, 3));
        float f17 = this.f454962t;
        float f18 = this.f454957o;
        if (f17 < f18) {
            this.f454957o = f17;
        } else {
            float f19 = this.f454963u;
            if (f19 > f18) {
                this.f454957o = f19;
            }
        }
        canvas.save();
        android.graphics.PointF pointF = this.f454955m;
        canvas.translate(pointF.x, pointF.y);
        canvas.rotate(this.f454956n);
        float f27 = this.f454957o;
        canvas.scale(f27, f27);
        canvas.setDensity(this.f454952g.getDensity());
        if (s()) {
            canvas.drawBitmap(this.f454952g, (-o()) / 2, (-n()) / 2, (android.graphics.Paint) null);
        } else {
            canvas.clipRect(((-o()) / 2) + 40.0f, ((-n()) / 2) + 40.0f, (this.f454952g.getWidth() / 2) - 40.0f, (this.f454952g.getHeight() / 2) - 40.0f);
            canvas.drawBitmap(this.f454952g, (-o()) / 2, (-n()) / 2, (android.graphics.Paint) null);
        }
        this.f454952g.getDensity();
        m();
        o();
        m();
        canvas.restore();
        canvas.setDrawFilter(null);
    }

    public android.graphics.Bitmap j(android.graphics.Bitmap bitmap) {
        int width = (int) (bitmap.getWidth() + (m() * 2.0f));
        int height = (int) (bitmap.getHeight() + (m() * 2.0f));
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(height));
        arrayList.add(java.lang.Integer.valueOf(width));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/items/EmojiItem", "drawBox", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/items/EmojiItem", "drawBox", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        createBitmap.setDensity(bitmap.getDensity());
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        canvas.drawBitmap(bitmap, m(), m(), (android.graphics.Paint) null);
        android.content.Context context = this.f454949d;
        android.content.res.Resources resources = context.getResources();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.emoji_box));
        arrayList2.add(resources);
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/items/EmojiItem", "drawBox", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList2.get(0), ((java.lang.Integer) arrayList2.get(1)).intValue());
        yj0.a.e(obj2, decodeResource, "com/tencent/mm/items/EmojiItem", "drawBox", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        byte[] ninePatchChunk = decodeResource.getNinePatchChunk();
        android.content.res.Resources resources2 = context.getResources();
        android.content.res.Resources resources3 = context.getResources();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.emoji_box));
        arrayList3.add(resources3);
        java.lang.Object obj3 = new java.lang.Object();
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(obj3, arrayList3.toArray(), "com/tencent/mm/items/EmojiItem", "drawBox", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeResource2 = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList3.get(0), ((java.lang.Integer) arrayList3.get(1)).intValue());
        yj0.a.e(obj3, decodeResource2, "com/tencent/mm/items/EmojiItem", "drawBox", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        android.graphics.drawable.NinePatchDrawable ninePatchDrawable = new android.graphics.drawable.NinePatchDrawable(resources2, decodeResource2, ninePatchChunk, new android.graphics.Rect(), null);
        ninePatchDrawable.setBounds(0, 0, width, height);
        ninePatchDrawable.draw(canvas);
        return createBitmap;
    }

    public boolean k() {
        return true;
    }

    public boolean l() {
        return true;
    }

    public float m() {
        return 40.0f;
    }

    public int n() {
        android.graphics.Bitmap bitmap = this.f454952g;
        if (bitmap != null) {
            return bitmap.getHeight();
        }
        return 0;
    }

    public int o() {
        android.graphics.Bitmap bitmap = this.f454952g;
        if (bitmap != null) {
            return bitmap.getWidth();
        }
        return 0;
    }

    public android.graphics.Bitmap p() {
        android.graphics.Bitmap bitmap = this.f454952g;
        if (bitmap == null || bitmap.isRecycled()) {
            this.f454952g = this.f454951f.a0(this.f454949d, 480);
        }
        if (this.f454952g == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.EmojiItem", "[getEmojiBitmap] NULL!");
            this.f454952g = com.tencent.mm.sdk.platformtools.x.m(120, 120, android.graphics.Bitmap.Config.ARGB_4444, false);
            new android.graphics.Canvas(this.f454952g).drawColor(-7829368);
        }
        return this.f454952g;
    }

    public java.lang.String q() {
        return this.f454950e;
    }

    public void r(android.graphics.Rect rect, boolean z17) {
        float f17 = this.f454957o;
        float m17 = m();
        if (z17) {
            m17 = 0.0f;
        }
        double o17 = ((o() / 2) - m17) * 1.0f * f17;
        double n17 = ((n() / 2) - m17) * 1.0f * f17;
        double d17 = (((this.f454956n + this.f454968z) - 180.0f) * 3.141592653589793d) / 180.0d;
        double sqrt = (float) java.lang.Math.sqrt((o17 * o17) + (n17 * n17));
        int cos = (int) (this.f454955m.x + ((float) (java.lang.Math.cos(d17) * sqrt)));
        int sin = (int) (this.f454955m.y + ((float) (java.lang.Math.sin(d17) * sqrt)));
        double d18 = ((this.f454956n - this.f454968z) * 3.141592653589793d) / 180.0d;
        int cos2 = (int) (this.f454955m.x + ((float) (java.lang.Math.cos(d18) * sqrt)));
        int sin2 = (int) (this.f454955m.y + ((float) (java.lang.Math.sin(d18) * sqrt)));
        double d19 = (((this.f454956n - this.f454968z) + 180.0f) * 3.141592653589793d) / 180.0d;
        double d27 = ((this.f454956n + this.f454968z) * 3.141592653589793d) / 180.0d;
        rect.set(java.lang.Math.min(cos, (int) (this.f454955m.x + ((float) (sqrt * java.lang.Math.cos(d19))))), java.lang.Math.min(sin, sin2), java.lang.Math.max(cos2, (int) (this.f454955m.x + ((float) (java.lang.Math.cos(d27) * sqrt)))), java.lang.Math.max((int) (this.f454955m.y + ((float) (java.lang.Math.sin(d19) * sqrt))), (int) (this.f454955m.y + ((float) (sqrt * java.lang.Math.sin(d27))))));
    }

    public boolean s() {
        if (this.f454960r) {
            return this.f454959q;
        }
        return false;
    }

    public boolean t() {
        android.graphics.Bitmap bitmap = this.f454952g;
        if (bitmap == null || bitmap.isRecycled()) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiItem", "bitmap recycle %s", this.f454952g.toString());
        this.f454952g.recycle();
        return true;
    }

    public void u() {
        float f17 = this.f454958p;
        double o17 = ((o() * 1.0f) / 2.0f) * f17;
        double n17 = ((n() * 1.0f) / 2.0f) * f17;
        java.lang.Math.sqrt((o17 * o17) + (n17 * n17));
        this.f454968z = (float) java.lang.Math.toDegrees(java.lang.Math.atan(n17 / o17));
    }

    public void v(float f17, float f18) {
        this.f454955m.set(f17, f18);
        u();
    }

    public void w(boolean z17) {
        this.f454959q = z17;
        if (this.f454960r) {
            return;
        }
        this.f454959q = false;
    }

    public void x(float f17, float f18) {
        this.f454967y = new android.graphics.PointF(f17, f18);
    }

    public void y(float f17, float f18, float f19, int i17) {
        this.f454955m.offset(f17, f18);
        if (0.0f != f19) {
            this.f454957o = f19;
        }
        this.f454956n = i17;
    }

    public f(android.content.Context context, android.graphics.Matrix matrix, java.lang.String str, android.graphics.Rect rect, android.graphics.Rect rect2) {
        new java.util.ArrayList();
        this.f454950e = str;
        this.f454949d = context;
        this.f454953h = rect;
        this.f454954i = rect2;
        this.f454955m = new android.graphics.PointF();
        this.f454961s = new android.graphics.PointF();
    }
}
