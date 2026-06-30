package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public final class o implements db5.x4 {

    /* renamed from: a, reason: collision with root package name */
    public final db5.y4 f171235a;

    /* renamed from: b, reason: collision with root package name */
    public int f171236b;

    /* renamed from: c, reason: collision with root package name */
    public yz5.l f171237c;

    public o(db5.y4 provider) {
        kotlin.jvm.internal.o.g(provider, "provider");
        this.f171235a = provider;
        this.f171236b = 800;
    }

    @Override // db5.x4
    public boolean a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(if1.o.NAME, "com.tencent.mm.plugin.sns.ui.widget.OpenScroller");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(if1.o.NAME, "com.tencent.mm.plugin.sns.ui.widget.OpenScroller");
        return true;
    }

    @Override // db5.x4
    public void c(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrolled", "com.tencent.mm.plugin.sns.ui.widget.OpenScroller");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrolled", "com.tencent.mm.plugin.sns.ui.widget.OpenScroller");
    }

    @Override // db5.x4
    public boolean d(boolean z17, boolean z18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(if1.q.NAME, "com.tencent.mm.plugin.sns.ui.widget.OpenScroller");
        if (!z18) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(if1.q.NAME, "com.tencent.mm.plugin.sns.ui.widget.OpenScroller");
            return false;
        }
        if (z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(if1.q.NAME, "com.tencent.mm.plugin.sns.ui.widget.OpenScroller");
            return true;
        }
        db5.y4 y4Var = this.f171235a;
        int c17 = ((db5.b5) y4Var).c();
        int i17 = this.f171236b;
        if (c17 < (-i17) / 2) {
            db5.y4.a(y4Var, (-i17) - ((db5.b5) y4Var).c(), 0, 2, null);
            yz5.l lVar = this.f171237c;
            if (lVar != null) {
                lVar.invoke(java.lang.Boolean.TRUE);
            }
        } else {
            db5.y4.a(y4Var, -((db5.b5) y4Var).c(), 0, 2, null);
            yz5.l lVar2 = this.f171237c;
            if (lVar2 != null) {
                lVar2.invoke(java.lang.Boolean.FALSE);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(if1.q.NAME, "com.tencent.mm.plugin.sns.ui.widget.OpenScroller");
        return true;
    }

    @Override // db5.x4
    public boolean e(float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFling", "com.tencent.mm.plugin.sns.ui.widget.OpenScroller");
        db5.y4 y4Var = this.f171235a;
        ((db5.b5) y4Var).f228294a.f197500g.fling(0, ((db5.b5) y4Var).c(), 0, -((int) f17), 0, 0, -this.f171236b, 0);
        int finalY = ((db5.b5) y4Var).f228294a.f197500g.getFinalY();
        int i17 = this.f171236b;
        if (finalY < (-i17) / 2) {
            db5.y4.a(y4Var, (-i17) - ((db5.b5) y4Var).c(), 0, 2, null);
            yz5.l lVar = this.f171237c;
            if (lVar != null) {
                lVar.invoke(java.lang.Boolean.TRUE);
            }
        } else {
            db5.y4.a(y4Var, -((db5.b5) y4Var).c(), 0, 2, null);
            yz5.l lVar2 = this.f171237c;
            if (lVar2 != null) {
                lVar2.invoke(java.lang.Boolean.FALSE);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFling", "com.tencent.mm.plugin.sns.ui.widget.OpenScroller");
        return true;
    }

    @Override // db5.x4
    public boolean f(float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScroll", "com.tencent.mm.plugin.sns.ui.widget.OpenScroller");
        int i17 = (int) (f17 / 2);
        db5.b5 b5Var = (db5.b5) this.f171235a;
        int c17 = b5Var.c() + i17;
        b5Var.c();
        if (c17 <= 0 && c17 >= (-this.f171236b)) {
            b5Var.d(i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScroll", "com.tencent.mm.plugin.sns.ui.widget.OpenScroller");
            return true;
        }
        if (b5Var.c() >= 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScroll", "com.tencent.mm.plugin.sns.ui.widget.OpenScroller");
            return false;
        }
        int i18 = -this.f171236b;
        if (c17 < i18) {
            b5Var.f228294a.scrollTo(0, i18);
        } else {
            b5Var.d(java.lang.Math.min(i17, -b5Var.c()));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScroll", "com.tencent.mm.plugin.sns.ui.widget.OpenScroller");
        return true;
    }
}
