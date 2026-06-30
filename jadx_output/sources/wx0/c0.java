package wx0;

/* loaded from: classes5.dex */
public final class c0 extends mx0.a implements nx0.n {

    /* renamed from: g, reason: collision with root package name */
    public final yx0.b8 f450459g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f450460h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f450461i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f450462m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f450463n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f450464o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f450465p;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c0(android.view.ViewGroup r3, yx0.b8 r4, mx0.z r5) {
        /*
            r2 = this;
            java.lang.String r0 = "rootView"
            kotlin.jvm.internal.o.g(r3, r0)
            java.lang.String r0 = "templateCorePlugin"
            kotlin.jvm.internal.o.g(r4, r0)
            java.lang.String r0 = "controller"
            kotlin.jvm.internal.o.g(r5, r0)
            r0 = 2131299129(0x7f090b39, float:1.821625E38)
            android.view.View r0 = r3.findViewById(r0)
            java.lang.String r1 = "findViewById(...)"
            kotlin.jvm.internal.o.f(r0, r1)
            r2.<init>(r0)
            r2.f450459g = r4
            wx0.b0 r4 = wx0.b0.f450457d
            jz5.g r4 = jz5.h.b(r4)
            r2.f450460h = r4
            jz5.i r4 = jz5.i.f302831f
            wx0.j r0 = new wx0.j
            r0.<init>(r3)
            jz5.g r0 = jz5.h.a(r4, r0)
            r2.f450461i = r0
            wx0.m r0 = new wx0.m
            r0.<init>(r3)
            jz5.g r0 = jz5.h.a(r4, r0)
            r2.f450462m = r0
            wx0.l r0 = new wx0.l
            r0.<init>(r3)
            jz5.g r0 = jz5.h.a(r4, r0)
            r2.f450463n = r0
            wx0.k r0 = new wx0.k
            r0.<init>(r3)
            jz5.g r0 = jz5.h.a(r4, r0)
            r2.f450464o = r0
            wx0.i r0 = new wx0.i
            r0.<init>(r3)
            jz5.g r3 = jz5.h.a(r4, r0)
            r2.f450465p = r3
            com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.BeautifyPanel r3 = r2.b()
            r3.getClass()
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r4.<init>(r2)
            r3.f69568e = r4
            com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.BeautifyPanel r3 = r2.b()
            wx0.g r4 = new wx0.g
            r4.<init>(r5)
            r3.setOnDismissListener(r4)
            android.view.View r3 = r2.f331814d
            wx0.h r4 = new wx0.h
            r4.<init>(r2, r5)
            r3.setOnClickListener(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wx0.c0.<init>(android.view.ViewGroup, yx0.b8, mx0.z):void");
    }

    public final com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.BeautifyPanel b() {
        return (com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.BeautifyPanel) this.f450465p.getValue();
    }

    public final com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.BeautyView c() {
        return (com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.BeautyView) this.f450461i.getValue();
    }

    public final com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.FaceEffectView d() {
        return (com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.FaceEffectView) this.f450464o.getValue();
    }

    public final com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.FilterView e() {
        return (com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.FilterView) this.f450463n.getValue();
    }

    public final com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.MakeupView f() {
        return (com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.MakeupView) this.f450462m.getValue();
    }

    public final kotlinx.coroutines.y0 g() {
        return (kotlinx.coroutines.y0) ((jz5.n) this.f450460h).getValue();
    }

    @Override // yt3.r2
    public boolean onBackPress() {
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z27;
        boolean z28;
        com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.FaceEffectView d17 = d();
        if (d17.getVisibility() == 0) {
            d17.a();
            z17 = true;
        } else {
            z17 = false;
        }
        if (z17) {
            return true;
        }
        com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.FilterView e17 = e();
        if (e17.getVisibility() == 0) {
            e17.b();
            z18 = true;
        } else {
            z18 = false;
        }
        if (z18) {
            return true;
        }
        com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.MakeupView f17 = f();
        if (f17.getVisibility() == 0) {
            f17.a();
            z19 = true;
        } else {
            z19 = false;
        }
        if (z19) {
            return true;
        }
        com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.BeautyView c17 = c();
        if (c17.getVisibility() == 0) {
            c17.f69588t.invoke(java.lang.Boolean.valueOf(c17.f69590v));
            c17.d();
            z27 = true;
        } else {
            z27 = false;
        }
        if (z27) {
            return true;
        }
        com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.BeautifyPanel b17 = b();
        if (b17.getVisibility() == 0) {
            b17.f69573m = nx0.g.f341108d;
            com.tencent.mm.plugin.recordvideo.ui.drawer.MMCustomDraggableLayout.a(b17.f69569f, false, 1, null);
            z28 = true;
        } else {
            z28 = false;
        }
        return z28;
    }

    @Override // yt3.r2
    public void release() {
        kotlinx.coroutines.z0.d(g(), this + " release.", null, 2, null);
    }
}
