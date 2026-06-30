package xs2;

/* loaded from: classes10.dex */
public abstract class e implements xs2.o {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f456314a;

    /* renamed from: b, reason: collision with root package name */
    public final gk2.e f456315b;

    /* renamed from: c, reason: collision with root package name */
    public xs2.f0 f456316c;

    /* renamed from: d, reason: collision with root package name */
    public vp.x f456317d;

    /* renamed from: e, reason: collision with root package name */
    public long f456318e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f456319f;

    /* renamed from: g, reason: collision with root package name */
    public vp.w f456320g;

    public e(android.view.View bullet, gk2.e business, xs2.f0 config) {
        int i17;
        kotlin.jvm.internal.o.g(bullet, "bullet");
        kotlin.jvm.internal.o.g(business, "business");
        kotlin.jvm.internal.o.g(config, "config");
        this.f456314a = bullet;
        this.f456315b = business;
        this.f456316c = config;
        this.f456318e = -1L;
        xp.i f17 = xp.d.f();
        f17.f455851h = true;
        xp.a aVar = this.f456316c.f456328c;
        f17.f455845b = aVar != null ? aVar.f455812j : 0;
        f17.f455857n = xp.i.a(0.0f);
        f17.f455858o = xp.i.a(0.0f);
        xp.a aVar2 = this.f456316c.f456328c;
        if ((aVar2 != null ? aVar2.f455813k : 0) != 0) {
            f17.f455847d = aVar2 != null ? aVar2.f455813k : ym5.x.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 6.0f);
        } else {
            f17.f455847d = xp.i.a(6.0f);
        }
        f17.f455848e = xp.i.a(24);
        f17.b(bullet.getContext().getResources().getConfiguration().orientation == 1);
        xs2.f0 f0Var = this.f456316c;
        boolean z17 = f17.f455859p;
        boolean z18 = !z17;
        xp.a aVar3 = f0Var.f456328c;
        if (z18) {
            if (aVar3 != null) {
                i17 = aVar3.f455804b;
            }
            i17 = 2;
        } else {
            if (aVar3 != null) {
                i17 = aVar3.f455803a;
            }
            i17 = 2;
        }
        f17.f455846c = i17;
        f17.f455861r = i17;
        f17.f455844a = f0Var.a(z17, f17.f455860q);
        xp.c cVar = new xp.c(null);
        cVar.f455823a = new xs2.a(this);
        xs2.f0 f0Var2 = this.f456316c;
        cVar.f455826d = f0Var2.f456326a;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ((java.util.ArrayList) cVar.f455825c).add(f0Var2.f456327b.a(context, business));
        cVar.f455824b = xs2.b.f456307a;
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        cVar.f455828f = this.f456316c.f456328c;
        this.f456317d = new vp.x(bullet, new xp.d(cVar, null), false);
    }

    @Override // xs2.o
    public void a(int i17) {
    }

    @Override // xs2.o
    public vp.x b() {
        return i();
    }

    @Override // xs2.o
    public void d(java.util.List list) {
        java.lang.String j17 = j();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAttach: ");
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = ((mm2.c1) this.f456315b.a(mm2.c1.class)).f328846n;
        sb6.append(finderObject != null ? cm2.a.f43328a.x(finderObject, -1) : null);
        sb6.append("， this=");
        sb6.append(hashCode());
        com.tencent.mars.xlog.Log.i(j17, sb6.toString());
        onDetach();
        boolean z17 = true;
        l(true);
        vp.w wVar = this.f456320g;
        if (wVar != null) {
            i().f438852d.i6(wVar);
        }
        i().f438852d.f0(false);
        if (list != null && !list.isEmpty()) {
            z17 = false;
        }
        if (z17) {
            return;
        }
        i().f438852d.clear();
        c(list, "onAttach");
    }

    @Override // xs2.o
    public void e(float f17, boolean z17) {
    }

    @Override // xs2.o
    public void f(long j17, long j18) {
    }

    @Override // xs2.o
    public void g(java.util.List list, long j17, boolean z17) {
    }

    public long h() {
        return this.f456318e;
    }

    public final vp.x i() {
        vp.x xVar = this.f456317d;
        if (xVar != null) {
            return xVar;
        }
        kotlin.jvm.internal.o.o("danmakuManager");
        throw null;
    }

    public abstract java.lang.String j();

    public void k(boolean z17) {
        int i17;
        com.tencent.mars.xlog.Log.i(j(), "onConfigurationChange: isLandscape=" + z17);
        xp.i f17 = xp.d.f();
        xp.a aVar = this.f456316c.f456328c;
        if (z17) {
            if (aVar != null) {
                i17 = aVar.f455804b;
            }
            i17 = 2;
        } else {
            if (aVar != null) {
                i17 = aVar.f455803a;
            }
            i17 = 2;
        }
        f17.f455846c = i17;
        f17.f455861r = i17;
        f17.b(!z17);
        f17.f455844a = this.f456316c.a(f17.f455859p, f17.f455860q);
        com.tencent.mars.xlog.Log.i(j(), "setDanmakuRow: rowCount=" + f17.f455846c + ", isVertical=" + f17.f455859p + ", duration=" + f17.f455844a + ", playSpeedRatio=" + f17.f455860q);
        xp.c cVar = new xp.c(null);
        cVar.f455823a = new xs2.c(this);
        xs2.f0 f0Var = this.f456316c;
        cVar.f455828f = f0Var.f456328c;
        cVar.f455826d = f0Var.f456326a;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ((java.util.ArrayList) cVar.f455825c).add(f0Var.f456327b.a(context, this.f456315b));
        cVar.f455824b = xs2.d.f456312a;
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        i().f438852d.Z4(new xp.d(cVar, null));
    }

    public final void l(boolean z17) {
        if (z17 != this.f456319f) {
            com.tencent.mars.xlog.Log.i(j(), hashCode() + " isAttached from " + this.f456319f + " to " + z17);
        }
        this.f456319f = z17;
    }

    public void m(long j17) {
        if (j17 >= 0) {
            j17 += this.f456316c.f456328c != null ? r0.f455808f : 0;
        }
        this.f456318e = j17;
    }

    public void n() {
        if (this.f456319f) {
            java.lang.String j17 = j();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stop: ");
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = ((mm2.c1) this.f456315b.a(mm2.c1.class)).f328846n;
            sb6.append(finderObject != null ? cm2.a.f43328a.x(finderObject, -1) : null);
            com.tencent.mars.xlog.Log.i(j17, sb6.toString());
            i().f438852d.h5();
            i().f438852d.clear();
            i().f438852d.quit();
        }
    }

    @Override // xs2.o
    public void onDetach() {
        if (this.f456319f) {
            l(false);
            m(-1L);
            java.lang.String j17 = j();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDetach: ");
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = ((mm2.c1) this.f456315b.a(mm2.c1.class)).f328846n;
            sb6.append(finderObject != null ? cm2.a.f43328a.x(finderObject, -1) : null);
            sb6.append("， this=");
            sb6.append(hashCode());
            com.tencent.mars.xlog.Log.i(j17, sb6.toString());
            i().f438852d.release();
        }
    }
}
