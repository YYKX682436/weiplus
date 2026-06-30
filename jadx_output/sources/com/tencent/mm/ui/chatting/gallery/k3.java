package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes12.dex */
public class k3 implements androidx.viewpager.widget.ViewPager.OnPageChangeListener {
    public static long A;

    /* renamed from: y, reason: collision with root package name */
    public static int f201121y;

    /* renamed from: z, reason: collision with root package name */
    public static int f201122z;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.gallery.g1 f201129m;

    /* renamed from: v, reason: collision with root package name */
    public android.graphics.Bitmap f201138v;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.i6 f201123d = new com.tencent.mm.sdk.platformtools.i6(1, "chatting-image-gallery-lazy-loader", 1);

    /* renamed from: e, reason: collision with root package name */
    public final android.util.SparseArray f201124e = new android.util.SparseArray();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f201125f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final android.util.SparseArray f201126g = new android.util.SparseArray();

    /* renamed from: h, reason: collision with root package name */
    public final android.util.SparseArray f201127h = new android.util.SparseArray();

    /* renamed from: i, reason: collision with root package name */
    public final android.util.SparseArray f201128i = new android.util.SparseArray();

    /* renamed from: n, reason: collision with root package name */
    public int f201130n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f201131o = -1;

    /* renamed from: p, reason: collision with root package name */
    public final kk.j f201132p = new jt0.i(400, new com.tencent.mm.ui.chatting.gallery.c3(this), com.tencent.mm.ui.chatting.gallery.k3.class);

    /* renamed from: q, reason: collision with root package name */
    public final kk.j f201133q = new jt0.i(5, new com.tencent.mm.ui.chatting.gallery.d3(this), com.tencent.mm.ui.chatting.gallery.k3.class);

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f201134r = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public final android.util.SparseIntArray f201135s = new android.util.SparseIntArray();

    /* renamed from: t, reason: collision with root package name */
    public final java.util.LinkedList f201136t = new java.util.LinkedList();

    /* renamed from: u, reason: collision with root package name */
    public final java.util.LinkedList f201137u = new java.util.LinkedList();

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f201139w = new com.tencent.mm.sdk.platformtools.n3();

    /* renamed from: x, reason: collision with root package name */
    public boolean f201140x = false;

    public k3(com.tencent.mm.ui.chatting.gallery.g1 g1Var) {
        this.f201129m = g1Var;
    }

    public final void a(int i17, android.graphics.Bitmap bitmap) {
        android.util.SparseArray sparseArray = this.f201124e;
        if (sparseArray.get(i17) == null) {
            return;
        }
        ((com.tencent.mm.ui.chatting.gallery.t2) this.f201129m).E(0L, "", (android.view.View) ((java.lang.ref.WeakReference) sparseArray.get(i17)).get(), (java.lang.String) this.f201126g.get(i17), bitmap);
        f(i17);
    }

    public void b(android.widget.ImageView imageView, java.lang.String str, int i17) {
        java.util.LinkedList linkedList = this.f201136t;
        if (linkedList.contains(str)) {
            return;
        }
        int hashCode = imageView.hashCode();
        f(hashCode);
        this.f201125f.put(str, java.lang.Integer.valueOf(hashCode));
        this.f201126g.put(hashCode, str);
        this.f201124e.put(hashCode, new java.lang.ref.WeakReference(imageView));
        linkedList.add(str);
        this.f201137u.add(java.lang.Integer.valueOf(i17));
        g();
    }

    public boolean c(android.widget.ImageView imageView, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryLazyLoader", "loadThumb position %s", java.lang.Integer.valueOf(i17));
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) ((jt0.i) this.f201132p).i(i17 + "");
        if (bitmap == null || bitmap.isRecycled()) {
            return false;
        }
        ((com.tencent.mm.ui.chatting.gallery.t2) this.f201129m).E(0L, "", imageView, null, bitmap);
        return true;
    }

    public void d(int i17, android.graphics.Bitmap bitmap) {
        int i18 = this.f201131o;
        if (i17 == i18 || i18 == -1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryLazyLoader", "notifyBitmapLoaded cache bitmap, position: %d", java.lang.Integer.valueOf(i17));
            this.f201138v = bitmap;
        }
    }

    public final void e(int i17) {
        if (((lt0.f) this.f201132p).k(i17 + "")) {
            return;
        }
        gm0.j1.e().k(new com.tencent.mm.ui.chatting.gallery.h3(this, i17), 300L);
    }

    public final void f(int i17) {
        android.util.SparseArray sparseArray = this.f201126g;
        if (sparseArray.get(i17) != null) {
            java.lang.String str = (java.lang.String) sparseArray.get(i17);
            this.f201124e.remove(i17);
            sparseArray.remove(i17);
            this.f201125f.remove(str);
            this.f201127h.remove(i17);
        }
    }

    public final void g() {
        if (this.f201140x) {
            return;
        }
        java.util.LinkedList linkedList = this.f201136t;
        if (linkedList.size() == 0) {
            return;
        }
        java.lang.String str = (java.lang.String) linkedList.removeLast();
        int intValue = ((java.lang.Integer) this.f201137u.removeLast()).intValue();
        if (this.f201125f.containsKey(str)) {
            this.f201140x = true;
            this.f201123d.a(new com.tencent.mm.ui.chatting.gallery.j3(this, str, intValue));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(java.lang.String r8, android.graphics.Bitmap r9) {
        /*
            r7 = this;
            r0 = 0
            if (r9 != 0) goto L5
        L3:
            r1 = r0
            goto L46
        L5:
            int r1 = r9.getWidth()
            long r1 = (long) r1
            int r3 = r9.getHeight()
            long r3 = (long) r3
            long r1 = r1 * r3
            int r3 = com.tencent.mm.ui.chatting.gallery.k3.f201122z
            if (r3 == 0) goto L18
            int r3 = com.tencent.mm.ui.chatting.gallery.k3.f201121y
            if (r3 != 0) goto L3c
        L18:
            android.content.Context r3 = com.tencent.mm.sdk.platformtools.x2.f193071a
            android.content.res.Resources r3 = r3.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            int r3 = r3.widthPixels
            com.tencent.mm.ui.chatting.gallery.k3.f201121y = r3
            android.content.Context r3 = com.tencent.mm.sdk.platformtools.x2.f193071a
            android.content.res.Resources r3 = r3.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            int r3 = r3.heightPixels
            com.tencent.mm.ui.chatting.gallery.k3.f201122z = r3
            int r3 = com.tencent.mm.ui.chatting.gallery.k3.f201121y
            long r3 = (long) r3
            long r5 = com.tencent.mm.ui.chatting.gallery.k3.A
            long r3 = r3 * r5
            com.tencent.mm.ui.chatting.gallery.k3.A = r3
        L3c:
            long r3 = com.tencent.mm.ui.chatting.gallery.k3.A
            r5 = 2
            long r3 = r3 * r5
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L3
            r1 = 1
        L46:
            java.lang.String r2 = "MicroMsg.ImageGalleryLazyLoader"
            if (r1 == 0) goto L50
            java.lang.String r8 = "file %s too big to cache"
            com.tencent.mars.xlog.Log.i(r2, r8)
            return
        L50:
            kk.j r1 = r7.f201133q
            jt0.i r1 = (jt0.i) r1
            r1.j(r8, r9)
            com.tencent.mm.ui.chatting.gallery.k4 r1 = com.tencent.mm.ui.chatting.gallery.j4.f201061a
            kk.j r3 = r1.f201141a
            lt0.f r3 = (lt0.f) r3
            boolean r3 = r3.k(r8)
            if (r3 == 0) goto L7a
            java.lang.String r3 = "update origCache and preload cache"
            com.tencent.mars.xlog.Log.i(r2, r3)
            kk.j r1 = r1.f201141a     // Catch: java.lang.Exception -> L71
            jt0.i r1 = (jt0.i) r1     // Catch: java.lang.Exception -> L71
            r1.j(r8, r9)     // Catch: java.lang.Exception -> L71
            goto L7a
        L71:
            r8 = move-exception
            java.lang.String r9 = "update preload cache failed"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.tencent.mars.xlog.Log.printErrStackTrace(r2, r8, r9, r0)
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.gallery.k3.h(java.lang.String, android.graphics.Bitmap):void");
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i17) {
        this.f201130n = i17;
        boolean z17 = true;
        if (this.f201129m == null && i17 != 0) {
            z17 = false;
        }
        if (z17) {
            android.util.SparseArray sparseArray = this.f201127h;
            int size = sparseArray.size();
            int[] iArr = new int[size];
            for (int i18 = 0; i18 < size; i18++) {
                iArr[i18] = sparseArray.keyAt(i18);
            }
            for (int i19 = 0; i19 < size; i19++) {
                int i27 = iArr[i19];
                a(i27, (android.graphics.Bitmap) sparseArray.get(i27));
            }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i17, float f17, int i18) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i17) {
        if (((com.tencent.mm.ui.chatting.gallery.t2) this.f201129m).f200886d.f201093h.f200855f) {
            int i18 = this.f201131o;
            if (i18 == -1) {
                int i19 = 0;
                while (true) {
                    if (i19 != 0) {
                        int i27 = i17 + i19;
                        int i28 = i17 + 3;
                        if (i27 > i28 && i17 - i19 < java.lang.Math.max(i17 - 3, 0)) {
                            break;
                        }
                        if (i27 <= i28) {
                            e(i27);
                        }
                        int i29 = i17 - i19;
                        if (i29 >= java.lang.Math.max(i17 - 3, 0)) {
                            e(i29);
                        }
                    } else {
                        e(i17);
                    }
                    i19++;
                }
            } else if (i18 > i17) {
                e(java.lang.Math.max(i17 - 3, 0));
            } else if (i18 < i17) {
                e(i17 + 3);
            }
            this.f201131o = i17;
            com.tencent.mm.ui.chatting.gallery.t2 t2Var = (com.tencent.mm.ui.chatting.gallery.t2) this.f201129m;
            if (t2Var != null) {
                if (t2Var.f200886d.c(i17, true) != null) {
                    this.f201138v = null;
                    return;
                }
                com.tencent.mm.ui.base.WxImageView f17 = t2Var.f200886d.f(this.f201131o, true);
                if (f17 != null) {
                    this.f201138v = f17.getFullImageBitmap();
                }
            }
        }
    }
}
