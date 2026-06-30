package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes12.dex */
public class r4 implements y60.h {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f191864a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f191865b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f191866c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f191867d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.HashMap f191868e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.HashMap f191869f;

    /* renamed from: g, reason: collision with root package name */
    public jt0.i f191870g;

    /* renamed from: h, reason: collision with root package name */
    public android.util.SparseArray f191871h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.tools.n4 f191872i;

    /* renamed from: j, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.tools.n4 f191873j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f191874k;

    /* renamed from: l, reason: collision with root package name */
    public final y60.g f191875l;

    /* renamed from: m, reason: collision with root package name */
    public final x51.r0 f191876m;

    public r4(int i17, y60.g gVar) {
        this(i17);
        this.f191875l = gVar;
    }

    public static java.lang.String c(java.lang.String str, java.lang.String str2, int i17, int i18) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "null";
        }
        sb6.append(str);
        sb6.append("_");
        if (str2 == null) {
            str2 = "null";
        }
        sb6.append(str2);
        sb6.append("_");
        sb6.append(i17);
        sb6.append("_");
        sb6.append(i18);
        return sb6.toString();
    }

    public void a(android.widget.ImageView imageView, java.lang.String[] strArr, java.lang.String str, int i17, int i18, int i19) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageEngine", "attach thumb image %s url %s", java.lang.Integer.valueOf(imageView.hashCode()), str);
        if (this.f191874k) {
            if (this.f191864a) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ImageEngine", "on attach, isQuit, return");
                return;
            }
            if ((strArr == null || strArr.length <= 0) && com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ImageEngine", "attach from file path fail, path and url are null or empty");
                e(imageView, i17);
                return;
            }
            boolean z17 = false;
            java.lang.String c17 = c((strArr == null || strArr.length <= 0) ? null : strArr[0], str, i18, i19);
            synchronized (this.f191865b) {
                java.lang.String str2 = (java.lang.String) this.f191869f.get(imageView);
                if (str2 != null) {
                    this.f191868e.remove(str2);
                }
                this.f191869f.put(imageView, c17);
            }
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) this.f191870g.get(c17);
            if (bitmap != null && !bitmap.isRecycled()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ImageEngine", "doRender from cache %s key %s, bmp width:%s, height:%s", java.lang.Integer.valueOf(imageView.hashCode()), c17, java.lang.Integer.valueOf(bitmap.getWidth()), java.lang.Integer.valueOf(bitmap.getHeight()));
                com.tencent.mm.pluginsdk.ui.tools.p4.a(imageView, bitmap);
                return;
            }
            if (strArr != null && strArr.length > 1) {
                int i27 = 1;
                while (true) {
                    if (i27 >= strArr.length) {
                        break;
                    }
                    android.graphics.Bitmap bitmap2 = (android.graphics.Bitmap) this.f191870g.get(c(strArr[i27], str, i18, i19));
                    if (bitmap2 != null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.ImageEngine", "get next render bmp, width:%s, height:%s", java.lang.Integer.valueOf(bitmap2.getWidth()), java.lang.Integer.valueOf(bitmap2.getHeight()));
                        com.tencent.mm.pluginsdk.ui.tools.p4.a(imageView, bitmap2);
                        z17 = true;
                        break;
                    }
                    i27++;
                }
            }
            if (!z17) {
                e(imageView, i17);
            }
            synchronized (this.f191865b) {
                this.f191868e.put(c17, imageView);
            }
            com.tencent.mm.pluginsdk.ui.tools.n4 n4Var = this.f191873j;
            java.util.LinkedList linkedList = n4Var.f191791b;
            com.tencent.mm.pluginsdk.ui.tools.o4 o4Var = (com.tencent.mm.pluginsdk.ui.tools.o4) (linkedList.isEmpty() ? n4Var.a() : linkedList.removeFirst());
            o4Var.f191804d = strArr;
            o4Var.f191805e = str;
            o4Var.f191806f = c17;
            o4Var.f191807g = i18;
            o4Var.f191808h = i19;
            this.f191866c.postAtFrontOfQueue(o4Var);
        }
    }

    public void b() {
        this.f191864a = true;
        this.f191866c.getSerial().f457303b.g();
        x51.w0.e(this.f191876m);
        android.util.SparseArray sparseArray = this.f191871h;
        jt0.i iVar = this.f191870g;
        this.f191871h = new android.util.SparseArray();
        this.f191870g = new jt0.i(1, getClass());
        s75.d.b(new com.tencent.mm.pluginsdk.ui.tools.j4(this, sparseArray, iVar), "ImageEngine_destroy_" + java.lang.System.currentTimeMillis());
    }

    public x51.o0 d(java.lang.String str, java.lang.String str2, int i17, int i18) {
        y60.g gVar = this.f191875l;
        if (gVar == null) {
            return null;
        }
        ((com.tencent.mm.plugin.fav.ui.sa) gVar).getClass();
        return new com.tencent.mm.plugin.fav.ui.j3(str, str2, i17, i18);
    }

    public final void e(android.widget.ImageView imageView, int i17) {
        if (i17 == 0) {
            com.tencent.mm.pluginsdk.ui.tools.p4.a(imageView, null);
            return;
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) this.f191871h.get(i17);
        if (bitmap == null) {
            bitmap = bp.b.decodeResource(imageView.getResources(), i17, null);
            this.f191871h.put(i17, bitmap);
        }
        com.tencent.mm.pluginsdk.ui.tools.p4.a(imageView, bitmap);
    }

    public r4(int i17) {
        this.f191864a = false;
        this.f191865b = new byte[0];
        this.f191874k = true;
        this.f191875l = null;
        com.tencent.mm.pluginsdk.ui.tools.l4 l4Var = new com.tencent.mm.pluginsdk.ui.tools.l4(this);
        this.f191876m = l4Var;
        this.f191868e = new java.util.HashMap();
        this.f191869f = new java.util.HashMap();
        xu5.b a17 = xu5.b.a("ImageEngine");
        this.f191866c = new com.tencent.mm.sdk.platformtools.n3(a17);
        this.f191867d = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.f191872i = new com.tencent.mm.pluginsdk.ui.tools.g4(this, 16, a17);
        this.f191873j = new com.tencent.mm.pluginsdk.ui.tools.h4(this, 16, xu5.b.b());
        this.f191871h = new android.util.SparseArray();
        this.f191870g = new jt0.i(i17, new com.tencent.mm.pluginsdk.ui.tools.i4(this), getClass());
        x51.w0.a(l4Var);
    }
}
