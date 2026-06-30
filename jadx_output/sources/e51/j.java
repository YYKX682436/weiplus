package e51;

/* loaded from: classes11.dex */
public class j implements e51.l {
    public float A;
    public java.lang.Float B;
    public java.lang.Float C;
    public long D;
    public float E;
    public float F;
    public long G;
    public e51.i H;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Random f249580a;

    /* renamed from: b, reason: collision with root package name */
    public e51.f f249581b;

    /* renamed from: c, reason: collision with root package name */
    public e51.k f249582c;

    /* renamed from: d, reason: collision with root package name */
    public g51.a f249583d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.particles.ConfettiView f249584e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Queue f249585f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f249586g;

    /* renamed from: h, reason: collision with root package name */
    public android.animation.ValueAnimator f249587h;

    /* renamed from: i, reason: collision with root package name */
    public long f249588i;

    /* renamed from: j, reason: collision with root package name */
    public int f249589j;

    /* renamed from: k, reason: collision with root package name */
    public long f249590k;

    /* renamed from: l, reason: collision with root package name */
    public float f249591l;

    /* renamed from: m, reason: collision with root package name */
    public float f249592m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.animation.Interpolator f249593n;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.Rect f249594o;

    /* renamed from: p, reason: collision with root package name */
    public float f249595p;

    /* renamed from: q, reason: collision with root package name */
    public float f249596q;

    /* renamed from: r, reason: collision with root package name */
    public float f249597r;

    /* renamed from: s, reason: collision with root package name */
    public float f249598s;

    /* renamed from: t, reason: collision with root package name */
    public float f249599t;

    /* renamed from: u, reason: collision with root package name */
    public float f249600u;

    /* renamed from: v, reason: collision with root package name */
    public float f249601v;

    /* renamed from: w, reason: collision with root package name */
    public float f249602w;

    /* renamed from: x, reason: collision with root package name */
    public int f249603x;

    /* renamed from: y, reason: collision with root package name */
    public int f249604y;

    /* renamed from: z, reason: collision with root package name */
    public float f249605z;

    public j(android.content.Context context, e51.f fVar, e51.k kVar, g51.a aVar) {
        com.tencent.mm.particles.ConfettiView a17 = com.tencent.mm.particles.ConfettiView.a(context);
        this.f249580a = new java.util.Random();
        this.f249585f = new java.util.LinkedList();
        this.f249586g = new java.util.ArrayList(300);
        this.G = 0L;
        this.H = null;
        c(fVar, kVar, aVar, a17);
    }

    public final void a(int i17, long j17) {
        for (int i18 = 0; i18 < i17; i18++) {
            f51.b bVar = (f51.b) ((java.util.LinkedList) this.f249585f).poll();
            java.util.Random random = this.f249580a;
            if (bVar == null) {
                bVar = this.f249581b.a(random);
            }
            e51.k kVar = this.f249582c;
            bVar.i();
            bVar.f259600d = j17;
            float nextFloat = random.nextFloat();
            bVar.f259601e = kVar.f249606a + ((kVar.f249608c - r5) * nextFloat);
            float nextFloat2 = random.nextFloat();
            bVar.f259602f = kVar.f249607b + ((kVar.f249609d - r5) * nextFloat2);
            bVar.f259603g = b(this.f249595p, this.f249596q, random);
            bVar.f259604h = b(this.f249597r, this.f249598s, random);
            bVar.f259605i = b(this.f249599t, this.f249600u, random);
            bVar.f259606j = b(this.f249601v, this.f249602w, random);
            java.lang.Float f17 = null;
            bVar.f259607k = null;
            bVar.f259608l = null;
            bVar.f259611o = b(this.f249603x, this.f249604y, random);
            bVar.f259612p = b(0.0f, 0.0f, random);
            bVar.f259613q = b(this.f249605z, this.A, random);
            java.lang.Float f18 = this.B;
            if (f18 != null) {
                f17 = java.lang.Float.valueOf(b(f18.floatValue(), this.C.floatValue(), random));
            }
            bVar.f259614r = f17;
            bVar.f259616t = this.D;
            bVar.f259617u = this.f249593n;
            bVar.f259618v = b(this.E, this.F, random);
            bVar.h(this.f249594o);
            ((java.util.ArrayList) this.f249586g).add(bVar);
        }
    }

    public final float b(float f17, float f18, java.util.Random random) {
        return f17 + (f18 * ((random.nextFloat() * 2.0f) - 1.0f));
    }

    public void c(e51.f fVar, e51.k kVar, g51.a aVar, com.tencent.mm.particles.ConfettiView confettiView) {
        this.f249581b = fVar;
        this.f249582c = kVar;
        this.f249583d = aVar;
        this.f249584e = confettiView;
        confettiView.f72363d = this.f249586g;
        confettiView.addOnAttachStateChangeListener(new e51.g(this));
        this.D = -1L;
        this.f249594o = new android.graphics.Rect(0, 0, aVar.getWidth(), aVar.getHeight());
    }

    public e51.j d() {
        android.animation.ValueAnimator valueAnimator = this.f249587h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f249588i = 0L;
        java.util.Iterator it = ((java.util.ArrayList) this.f249586g).iterator();
        while (it.hasNext()) {
            ((java.util.LinkedList) this.f249585f).add((f51.b) it.next());
            it.remove();
        }
        this.f249583d.c(this.f249584e);
        this.f249584e.f72364e = false;
        a(this.f249589j, 0L);
        return this;
    }

    public e51.j e(float f17) {
        this.B = java.lang.Float.valueOf(f17 / 1000.0f);
        this.C = java.lang.Float.valueOf(0.0f);
        return this;
    }

    public e51.j f(float f17, float f18) {
        this.f249597r = f17 / 1000.0f;
        this.f249598s = f18 / 1000.0f;
        return this;
    }

    public void g() {
        android.animation.ValueAnimator duration = android.animation.ValueAnimator.ofInt(0).setDuration(com.tencent.wcdb.core.Database.DictDefaultMatchValue);
        this.f249587h = duration;
        duration.addUpdateListener(new e51.h(this));
        this.f249587h.start();
    }

    public void h() {
        android.animation.ValueAnimator valueAnimator = this.f249587h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f249583d.b(this.f249584e);
        e51.i iVar = this.H;
        if (iVar != null) {
            zl2.b bVar = (zl2.b) iVar;
            if (bVar.f473662a == null) {
                bVar.f473662a = new java.util.concurrent.ConcurrentLinkedQueue();
            }
            java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = bVar.f473662a;
            if (concurrentLinkedQueue != null) {
                boolean z17 = concurrentLinkedQueue.size() <= 50 && !concurrentLinkedQueue.contains(this);
                concurrentLinkedQueue.size();
                if (z17) {
                    concurrentLinkedQueue.add(this);
                }
            }
            ((java.util.LinkedList) this.f249585f).clear();
        }
    }

    public final void i(long j17) {
        long j18;
        if (j17 < this.f249590k) {
            long j19 = this.f249588i;
            if (j19 == 0) {
                this.f249588i = j17;
            } else {
                int nextFloat = (int) (this.f249580a.nextFloat() * this.f249591l * ((float) (j17 - j19)));
                if (nextFloat > 0) {
                    this.f249588i = ((float) this.f249588i) + (this.f249592m * nextFloat);
                    a(nextFloat, j17);
                }
            }
        }
        java.util.Iterator it = ((java.util.ArrayList) this.f249586g).iterator();
        while (it.hasNext()) {
            f51.b bVar = (f51.b) it.next();
            if (bVar.f259600d == -1) {
                bVar.f259600d = j17;
            }
            long j27 = j17 - bVar.f259600d;
            boolean z17 = j27 >= 0;
            bVar.B = z17;
            if (z17 && !bVar.C) {
                bVar.f259620x = bVar.b(j27, bVar.f259601e, bVar.f259603g, bVar.f259605i, bVar.f259609m, bVar.f259607k);
                bVar.f259621y = bVar.b(j27, bVar.f259602f, bVar.f259604h, bVar.f259606j, bVar.f259610n, bVar.f259608l);
                bVar.f259622z = bVar.b(j27, bVar.f259611o, bVar.f259612p, bVar.f259613q, bVar.f259615s, bVar.f259614r);
                android.view.animation.Interpolator interpolator = bVar.f259617u;
                if (interpolator != null) {
                    j18 = j27;
                    bVar.A = (int) (interpolator.getInterpolation(((float) j18) / bVar.f259618v) * 255.0f);
                } else {
                    j18 = j27;
                    bVar.A = 255;
                }
                bVar.C = !bVar.D && ((float) j18) >= bVar.f259618v;
                bVar.f259619w = java.lang.Math.min(1.0f, ((float) j18) / bVar.f259618v);
            }
            if (!(!bVar.C)) {
                it.remove();
                ((java.util.LinkedList) this.f249585f).add(bVar);
            }
        }
    }
}
