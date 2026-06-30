package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public final class c3 implements db5.x4 {

    /* renamed from: a, reason: collision with root package name */
    public final db5.y4 f171097a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f171098b;

    /* renamed from: c, reason: collision with root package name */
    public int f171099c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f171100d;

    /* renamed from: e, reason: collision with root package name */
    public int f171101e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.widget.y2 f171102f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f171103g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f171104h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.widget.o f171105i;

    /* renamed from: j, reason: collision with root package name */
    public final db5.z4 f171106j;

    /* renamed from: k, reason: collision with root package name */
    public db5.x4 f171107k;

    public c3(db5.y4 provider) {
        kotlin.jvm.internal.o.g(provider, "provider");
        this.f171097a = provider;
        this.f171098b = "MicroMsg.SnsOpenScroller";
        this.f171099c = 800;
        com.tencent.mm.plugin.sns.ui.widget.o oVar = new com.tencent.mm.plugin.sns.ui.widget.o(provider);
        this.f171105i = oVar;
        this.f171106j = new db5.z4(provider);
        this.f171107k = oVar;
        com.tencent.mm.plugin.sns.ui.widget.b3 b3Var = new com.tencent.mm.plugin.sns.ui.widget.b3(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnOpenChanged", "com.tencent.mm.plugin.sns.ui.widget.OpenScroller");
        oVar.f171237c = b3Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnOpenChanged", "com.tencent.mm.plugin.sns.ui.widget.OpenScroller");
    }

    @Override // db5.x4
    public boolean a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(if1.o.NAME, "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        com.tencent.mars.xlog.Log.i(this.f171098b, "onTouchStart: " + this.f171100d + ", " + k() + ", " + this.f171104h + ", " + this.f171107k);
        if ((this.f171100d || k()) && ((db5.b5) this.f171097a).f228294a.f197509s) {
            this.f171103g = false;
            this.f171107k = this.f171105i;
        } else {
            this.f171103g = true;
            this.f171107k = this.f171106j;
        }
        com.tencent.mm.plugin.sns.ui.widget.y2 y2Var = this.f171102f;
        if (y2Var != null) {
            y2Var.a();
        }
        boolean a17 = this.f171107k.a();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(if1.o.NAME, "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        return a17;
    }

    @Override // db5.x4
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrollEnd", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        com.tencent.mm.plugin.sns.ui.widget.y2 y2Var = this.f171102f;
        if (y2Var != null) {
            y2Var.e(this.f171103g);
        }
        g(true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrollEnd", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
    }

    @Override // db5.x4
    public void c(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrolled", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        com.tencent.mm.plugin.sns.ui.widget.y2 y2Var = this.f171102f;
        if (y2Var != null) {
            y2Var.b(this.f171103g, i17, ((db5.b5) this.f171097a).c());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrolled", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
    }

    @Override // db5.x4
    public boolean d(boolean z17, boolean z18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(if1.q.NAME, "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        boolean d17 = this.f171107k.d(z17, z18);
        if (!d17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getStateSettle", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
            int i17 = this.f171101e;
            boolean z19 = i17 == 1 || i17 == 0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStateSettle", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
            if (!z19) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("close$default", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
                i(true);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("close$default", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
            }
        }
        this.f171104h = false;
        if (d17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkState$default", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
            g(false);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkState$default", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        }
        com.tencent.mm.plugin.sns.ui.widget.y2 y2Var = this.f171102f;
        if (y2Var != null) {
            y2Var.d(this.f171103g);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(if1.q.NAME, "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        return d17;
    }

    @Override // db5.x4
    public boolean e(float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFling", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        boolean e17 = this.f171107k.e(f17);
        this.f171104h = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFling", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        return e17;
    }

    @Override // db5.x4
    public boolean f(float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScroll", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        com.tencent.mm.plugin.sns.ui.widget.y2 y2Var = this.f171102f;
        if (y2Var != null) {
            y2Var.b(this.f171103g, (int) f17, ((db5.b5) this.f171097a).c());
        }
        boolean f18 = this.f171107k.f(f17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScroll", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        return f18;
    }

    public final void g(boolean z17) {
        com.tencent.mm.plugin.sns.ui.widget.y2 y2Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkState", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        com.tencent.mars.xlog.Log.i(this.f171098b, "checkState: " + z17);
        db5.y4 y4Var = this.f171097a;
        int i17 = (((db5.b5) y4Var).f228294a.f197500g.isFinished() ? ((db5.b5) y4Var).c() : ((db5.b5) y4Var).f228294a.f197500g.getFinalY()) < 0 ? z17 ? 1 : 2 : z17 ? 0 : 3;
        int i18 = this.f171101e;
        if (i18 != i17) {
            if (i17 == 0 && i18 != 3) {
                com.tencent.mm.plugin.sns.ui.widget.y2 y2Var2 = this.f171102f;
                if (y2Var2 != null) {
                    y2Var2.c(3, false);
                }
            } else if (i17 == 1 && i18 != 2 && (y2Var = this.f171102f) != null) {
                y2Var.c(2, false);
            }
            this.f171101e = i17;
            com.tencent.mm.plugin.sns.ui.widget.y2 y2Var3 = this.f171102f;
            if (y2Var3 != null) {
                y2Var3.c(i17, false);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkState", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
    }

    public final void h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("close", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("close$default", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        i(true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("close$default", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("close", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
    }

    public final void i(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("close", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        this.f171103g = false;
        db5.y4 y4Var = this.f171097a;
        if (z17) {
            db5.y4.b(y4Var, 0, 0, 2, null);
            g(false);
        } else {
            ((db5.b5) y4Var).f228294a.scrollTo(0, 0);
            g(true);
        }
        this.f171104h = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("close", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
    }

    public final int j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOpenState", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        int i17 = this.f171101e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOpenState", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        return i17;
    }

    public final boolean k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isOpen", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        boolean z17 = ((db5.b5) this.f171097a).c() == (-this.f171099c) || this.f171104h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isOpen", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        return z17;
    }
}
