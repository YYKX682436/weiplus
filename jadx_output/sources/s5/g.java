package s5;

/* loaded from: classes13.dex */
public final class g implements s5.c {

    /* renamed from: e, reason: collision with root package name */
    public static final android.os.Handler f403017e = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: a, reason: collision with root package name */
    public final a6.d0 f403018a;

    /* renamed from: b, reason: collision with root package name */
    public final s5.a f403019b;

    /* renamed from: c, reason: collision with root package name */
    public final x.o f403020c;

    /* renamed from: d, reason: collision with root package name */
    public int f403021d;

    public g(a6.d0 weakMemoryCache, s5.a bitmapPool, h6.k kVar) {
        kotlin.jvm.internal.o.g(weakMemoryCache, "weakMemoryCache");
        kotlin.jvm.internal.o.g(bitmapPool, "bitmapPool");
        this.f403018a = weakMemoryCache;
        this.f403019b = bitmapPool;
        this.f403020c = new x.o();
    }

    @Override // s5.c
    public synchronized void a(android.graphics.Bitmap bitmap, boolean z17) {
        kotlin.jvm.internal.o.g(bitmap, "bitmap");
        int identityHashCode = java.lang.System.identityHashCode(bitmap);
        if (!z17) {
            s5.h e17 = e(identityHashCode, bitmap);
            if (e17 == null) {
                e17 = new s5.h(new java.lang.ref.WeakReference(bitmap), 0, false);
                this.f403020c.g(identityHashCode, e17);
            }
            e17.f403026c = false;
        } else if (e(identityHashCode, bitmap) == null) {
            this.f403020c.g(identityHashCode, new s5.h(new java.lang.ref.WeakReference(bitmap), 0, true));
        }
        d();
    }

    @Override // s5.c
    public synchronized boolean b(final android.graphics.Bitmap bitmap) {
        kotlin.jvm.internal.o.g(bitmap, "bitmap");
        int identityHashCode = java.lang.System.identityHashCode(bitmap);
        s5.h e17 = e(identityHashCode, bitmap);
        boolean z17 = false;
        if (e17 == null) {
            return false;
        }
        int i17 = e17.f403025b - 1;
        e17.f403025b = i17;
        if (i17 <= 0 && e17.f403026c) {
            z17 = true;
        }
        if (z17) {
            x.o oVar = this.f403020c;
            int a17 = x.e.a(oVar.f450849e, oVar.f450851g, identityHashCode);
            if (a17 >= 0) {
                java.lang.Object[] objArr = oVar.f450850f;
                java.lang.Object obj = objArr[a17];
                java.lang.Object obj2 = x.o.f450847h;
                if (obj != obj2) {
                    objArr[a17] = obj2;
                    oVar.f450848d = true;
                }
            }
            this.f403018a.d(bitmap);
            f403017e.post(new java.lang.Runnable() { // from class: s5.g$$a
                @Override // java.lang.Runnable
                public final void run() {
                    s5.g this$0 = s5.g.this;
                    kotlin.jvm.internal.o.g(this$0, "this$0");
                    android.graphics.Bitmap bitmap2 = bitmap;
                    kotlin.jvm.internal.o.g(bitmap2, "$bitmap");
                    this$0.f403019b.b(bitmap2);
                }
            });
        }
        d();
        return z17;
    }

    @Override // s5.c
    public synchronized void c(android.graphics.Bitmap bitmap) {
        kotlin.jvm.internal.o.g(bitmap, "bitmap");
        int identityHashCode = java.lang.System.identityHashCode(bitmap);
        s5.h e17 = e(identityHashCode, bitmap);
        if (e17 == null) {
            e17 = new s5.h(new java.lang.ref.WeakReference(bitmap), 0, false);
            this.f403020c.g(identityHashCode, e17);
        }
        e17.f403025b++;
        d();
    }

    public final void d() {
        int i17 = this.f403021d;
        this.f403021d = i17 + 1;
        if (i17 < 50) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        x.o oVar = this.f403020c;
        int h17 = oVar.h();
        int i18 = 0;
        if (h17 > 0) {
            int i19 = 0;
            while (true) {
                int i27 = i19 + 1;
                if (((s5.h) oVar.i(i19)).f403024a.get() == null) {
                    arrayList.add(java.lang.Integer.valueOf(i19));
                }
                if (i27 >= h17) {
                    break;
                } else {
                    i19 = i27;
                }
            }
        }
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i28 = i18 + 1;
            int intValue = ((java.lang.Number) arrayList.get(i18)).intValue();
            java.lang.Object[] objArr = oVar.f450850f;
            java.lang.Object obj = objArr[intValue];
            java.lang.Object obj2 = x.o.f450847h;
            if (obj != obj2) {
                objArr[intValue] = obj2;
                oVar.f450848d = true;
            }
            if (i28 > size) {
                return;
            } else {
                i18 = i28;
            }
        }
    }

    public final s5.h e(int i17, android.graphics.Bitmap bitmap) {
        s5.h hVar = (s5.h) this.f403020c.e(i17, null);
        if (hVar == null) {
            return null;
        }
        if (hVar.f403024a.get() == bitmap) {
            return hVar;
        }
        return null;
    }
}
