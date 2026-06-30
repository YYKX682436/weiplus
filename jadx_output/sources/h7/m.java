package h7;

/* loaded from: classes13.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public final s6.b f279349a;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Handler f279350b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f279351c;

    /* renamed from: d, reason: collision with root package name */
    public final com.bumptech.glide.r f279352d;

    /* renamed from: e, reason: collision with root package name */
    public final x6.d f279353e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f279354f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f279355g;

    /* renamed from: h, reason: collision with root package name */
    public com.bumptech.glide.o f279356h;

    /* renamed from: i, reason: collision with root package name */
    public h7.j f279357i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f279358j;

    /* renamed from: k, reason: collision with root package name */
    public h7.j f279359k;

    /* renamed from: l, reason: collision with root package name */
    public android.graphics.Bitmap f279360l;

    /* renamed from: m, reason: collision with root package name */
    public h7.j f279361m;

    /* renamed from: n, reason: collision with root package name */
    public int f279362n;

    /* renamed from: o, reason: collision with root package name */
    public int f279363o;

    /* renamed from: p, reason: collision with root package name */
    public int f279364p;

    public m(com.bumptech.glide.c cVar, s6.b bVar, int i17, int i18, t6.p pVar, android.graphics.Bitmap bitmap) {
        x6.d dVar = cVar.f43922d;
        com.bumptech.glide.f fVar = cVar.f43924f;
        com.bumptech.glide.r d17 = com.bumptech.glide.c.d(fVar.getBaseContext());
        com.bumptech.glide.r d18 = com.bumptech.glide.c.d(fVar.getBaseContext());
        d18.getClass();
        com.bumptech.glide.o p17 = new com.bumptech.glide.o(d18.f43982d, d18, android.graphics.Bitmap.class, d18.f43983e).p(com.bumptech.glide.r.f43981r).p(((m7.e) ((m7.e) ((m7.e) new m7.e().d(w6.z.f443251a)).o(true)).l(true)).g(i17, i18));
        this.f279351c = new java.util.ArrayList();
        this.f279352d = d17;
        android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper(), new h7.l(this));
        this.f279353e = dVar;
        this.f279350b = handler;
        this.f279356h = p17;
        this.f279349a = bVar;
        c(pVar, bitmap);
    }

    public final void a() {
        int i17;
        if (!this.f279354f || this.f279355g) {
            return;
        }
        h7.j jVar = this.f279361m;
        if (jVar != null) {
            this.f279361m = null;
            b(jVar);
            return;
        }
        this.f279355g = true;
        s6.b bVar = this.f279349a;
        s6.f fVar = (s6.f) bVar;
        int i18 = fVar.f403304l.f403280c;
        long uptimeMillis = android.os.SystemClock.uptimeMillis() + ((i18 <= 0 || (i17 = fVar.f403303k) < 0) ? 0 : (i17 < 0 || i17 >= i18) ? -1 : ((s6.c) ((java.util.ArrayList) r4.f403282e).get(i17)).f403275i);
        int i19 = (fVar.f403303k + 1) % fVar.f403304l.f403280c;
        fVar.f403303k = i19;
        this.f279359k = new h7.j(this.f279350b, i19, uptimeMillis);
        com.bumptech.glide.o p17 = this.f279356h.p((m7.e) new m7.e().k(new p7.b(java.lang.Double.valueOf(java.lang.Math.random()))));
        p17.L = bVar;
        p17.M = true;
        p17.r(this.f279359k, null, p17, q7.i.f360298a);
    }

    public void b(h7.j jVar) {
        this.f279355g = false;
        boolean z17 = this.f279358j;
        android.os.Handler handler = this.f279350b;
        if (z17) {
            handler.obtainMessage(2, jVar).sendToTarget();
            return;
        }
        if (!this.f279354f) {
            this.f279361m = jVar;
            return;
        }
        if (jVar.f279347m != null) {
            android.graphics.Bitmap bitmap = this.f279360l;
            if (bitmap != null) {
                this.f279353e.b(bitmap);
                this.f279360l = null;
            }
            h7.j jVar2 = this.f279357i;
            this.f279357i = jVar;
            java.util.ArrayList arrayList = (java.util.ArrayList) this.f279351c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                h7.f fVar = (h7.f) ((h7.k) arrayList.get(size));
                java.lang.Object callback = fVar.getCallback();
                while (callback instanceof android.graphics.drawable.Drawable) {
                    callback = ((android.graphics.drawable.Drawable) callback).getCallback();
                }
                if (callback == null) {
                    fVar.stop();
                    fVar.invalidateSelf();
                } else {
                    fVar.invalidateSelf();
                    h7.j jVar3 = fVar.f279333d.f279332a.f279357i;
                    if ((jVar3 != null ? jVar3.f279345h : -1) == ((s6.f) r6.f279349a).f403304l.f403280c - 1) {
                        fVar.f279338i++;
                    }
                    int i17 = fVar.f279339m;
                    if (i17 != -1 && fVar.f279338i >= i17) {
                        fVar.stop();
                    }
                }
            }
            if (jVar2 != null) {
                handler.obtainMessage(2, jVar2).sendToTarget();
            }
        }
        a();
    }

    public void c(t6.p pVar, android.graphics.Bitmap bitmap) {
        q7.n.b(pVar);
        q7.n.b(bitmap);
        this.f279360l = bitmap;
        this.f279356h = this.f279356h.p(new m7.e().n(pVar, true));
        this.f279362n = q7.p.c(bitmap);
        this.f279363o = bitmap.getWidth();
        this.f279364p = bitmap.getHeight();
    }
}
