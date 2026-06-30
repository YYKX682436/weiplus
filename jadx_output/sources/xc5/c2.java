package xc5;

/* loaded from: classes12.dex */
public final class c2 extends of3.b {

    /* renamed from: f, reason: collision with root package name */
    public static final xc5.b2 f453406f = new xc5.b2(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // of3.b, lf3.m
    public void W6() {
        super.W6();
        com.tencent.mars.xlog.Log.i("LegoBaseUI", "Importing implementation: " + xc5.d.class.getSimpleName() + " for interface: " + xc5.a.class.getSimpleName());
        if (!xc5.a.class.isAssignableFrom(xc5.d.class)) {
            throw new java.lang.IllegalArgumentException((xc5.d.class.getSimpleName() + " does not implement " + xc5.a.class.getSimpleName()).toString());
        }
        V6(xc5.d.class);
        pf5.a0.b(xc5.d.class, xc5.a.class);
        com.tencent.mars.xlog.Log.i("LegoBaseUI", "Importing implementation: " + xc5.p1.class.getSimpleName() + " for interface: " + dg3.m.class.getSimpleName());
        if (!dg3.m.class.isAssignableFrom(xc5.p1.class)) {
            throw new java.lang.IllegalArgumentException((xc5.p1.class.getSimpleName() + " does not implement " + dg3.m.class.getSimpleName()).toString());
        }
        V6(xc5.p1.class);
        pf5.a0.b(xc5.p1.class, dg3.m.class);
        com.tencent.mars.xlog.Log.i("LegoBaseUI", "Importing implementation: " + xc5.f2.class.getSimpleName() + " for interface: " + bg3.f.class.getSimpleName());
        if (!bg3.f.class.isAssignableFrom(xc5.f2.class)) {
            throw new java.lang.IllegalArgumentException((xc5.f2.class.getSimpleName() + " does not implement " + bg3.f.class.getSimpleName()).toString());
        }
        V6(xc5.f2.class);
        pf5.a0.b(xc5.f2.class, bg3.f.class);
        com.tencent.mars.xlog.Log.i("LegoBaseUI", "Importing implementation: " + xc5.l1.class.getSimpleName() + " for interface: " + ag3.a.class.getSimpleName());
        if (!ag3.a.class.isAssignableFrom(xc5.l1.class)) {
            throw new java.lang.IllegalArgumentException((xc5.l1.class.getSimpleName() + " does not implement " + ag3.a.class.getSimpleName()).toString());
        }
        V6(xc5.l1.class);
        pf5.a0.b(xc5.l1.class, ag3.a.class);
        com.tencent.mars.xlog.Log.i("LegoBaseUI", "Importing implementation: " + xc5.o.class.getSimpleName() + " for interface: " + zf3.a.class.getSimpleName());
        if (!zf3.a.class.isAssignableFrom(xc5.o.class)) {
            throw new java.lang.IllegalArgumentException((xc5.o.class.getSimpleName() + " does not implement " + zf3.a.class.getSimpleName()).toString());
        }
        V6(xc5.o.class);
        pf5.a0.b(xc5.o.class, zf3.a.class);
        com.tencent.mars.xlog.Log.i("LegoBaseUI", "Importing implementation: " + xc5.m.class.getSimpleName() + " for interface: " + yf3.a.class.getSimpleName());
        if (!yf3.a.class.isAssignableFrom(xc5.m.class)) {
            throw new java.lang.IllegalArgumentException((xc5.m.class.getSimpleName() + " does not implement " + yf3.a.class.getSimpleName()).toString());
        }
        V6(xc5.m.class);
        pf5.a0.b(xc5.m.class, yf3.a.class);
        com.tencent.mars.xlog.Log.i("LegoBaseUI", "Importing implementation: " + rh5.b.class.getSimpleName() + " for interface: " + xf3.a.class.getSimpleName());
        if (!xf3.a.class.isAssignableFrom(rh5.b.class)) {
            throw new java.lang.IllegalArgumentException((rh5.b.class.getSimpleName() + " does not implement " + xf3.a.class.getSimpleName()).toString());
        }
        V6(rh5.b.class);
        pf5.a0.b(rh5.b.class, xf3.a.class);
        com.tencent.mars.xlog.Log.i("LegoBaseUI", "Importing implementation: " + xc5.k1.class.getSimpleName() + " for interface: " + vf3.a.class.getSimpleName());
        if (!vf3.a.class.isAssignableFrom(xc5.k1.class)) {
            throw new java.lang.IllegalArgumentException((xc5.k1.class.getSimpleName() + " does not implement " + vf3.a.class.getSimpleName()).toString());
        }
        V6(xc5.k1.class);
        pf5.a0.b(xc5.k1.class, vf3.a.class);
        com.tencent.mars.xlog.Log.i("LegoBaseUI", "Importing implementation: " + uh5.a.class.getSimpleName() + " for interface: " + sf3.e.class.getSimpleName());
        if (sf3.e.class.isAssignableFrom(uh5.a.class)) {
            V6(uh5.a.class);
            pf5.a0.b(uh5.a.class, sf3.e.class);
        } else {
            throw new java.lang.IllegalArgumentException((uh5.a.class.getSimpleName() + " does not implement " + sf3.e.class.getSimpleName()).toString());
        }
    }

    @Override // of3.b
    public of3.c Y6() {
        return new of3.c(new of3.a(kotlin.jvm.internal.i0.a(zh5.a0.class)), new of3.a(kotlin.jvm.internal.i0.a(xc5.l0.class)));
    }

    @Override // of3.b
    public of3.a Z6() {
        return new of3.a(kotlin.jvm.internal.i0.a(xc5.m1.class));
    }

    @Override // of3.b
    public of3.f a7() {
        return new of3.f(new of3.a(kotlin.jvm.internal.i0.a(sh5.c.class)), new of3.a(kotlin.jvm.internal.i0.a(xc5.e3.class)));
    }

    @Override // of3.b
    public of3.a b7() {
        return new of3.a(kotlin.jvm.internal.i0.a(xc5.l.class));
    }

    @Override // of3.b
    public of3.e c7() {
        return new of3.e(com.tencent.mm.R.id.l3x, kotlin.jvm.internal.i0.a(xc5.z1.class));
    }

    @Override // of3.b
    public of3.d d7() {
        return new of3.d(com.tencent.mm.R.id.t4x, kotlin.jvm.internal.i0.a(xc5.x1.class));
    }
}
