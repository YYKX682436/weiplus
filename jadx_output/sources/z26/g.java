package z26;

/* loaded from: classes15.dex */
public class g extends z26.k {

    /* renamed from: a, reason: collision with root package name */
    public boolean f469831a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ me.imid.swipebacklayout.lib.SwipeBackLayout f469832b;

    public g(me.imid.swipebacklayout.lib.SwipeBackLayout swipeBackLayout, z26.a aVar) {
        this.f469832b = swipeBackLayout;
    }

    @Override // z26.k
    public void a(android.view.View view, int i17, int i18, int i19, int i27) {
        me.imid.swipebacklayout.lib.SwipeBackLayout swipeBackLayout = this.f469832b;
        int i28 = swipeBackLayout.f325902x;
        if ((i28 & 1) != 0) {
            swipeBackLayout.f325890i = java.lang.Math.abs(i17 / (swipeBackLayout.f325888g.getWidth() + swipeBackLayout.f325895q.getIntrinsicWidth()));
        } else if ((i28 & 2) != 0) {
            swipeBackLayout.f325890i = java.lang.Math.abs(i17 / (swipeBackLayout.f325888g.getWidth() + swipeBackLayout.f325896r.getIntrinsicWidth()));
        } else if ((i28 & 8) != 0) {
            swipeBackLayout.f325890i = java.lang.Math.abs(i18 / (swipeBackLayout.f325888g.getHeight() + swipeBackLayout.f325897s.getIntrinsicHeight()));
        }
        swipeBackLayout.f325891m = i17;
        swipeBackLayout.f325892n = i18;
        swipeBackLayout.invalidate();
        if (swipeBackLayout.f325890i < swipeBackLayout.f325886e && !this.f469831a) {
            this.f469831a = true;
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = swipeBackLayout.f325893o;
        if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
            java.util.Iterator it = swipeBackLayout.f325893o.iterator();
            while (it.hasNext()) {
                ((z26.e) it.next()).d(swipeBackLayout.f325889h.f469835a, swipeBackLayout.f325890i);
            }
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2 = swipeBackLayout.f325893o;
        if (copyOnWriteArrayList2 != null && !copyOnWriteArrayList2.isEmpty() && swipeBackLayout.f325889h.f469835a == 1 && swipeBackLayout.f325890i >= swipeBackLayout.f325886e && this.f469831a) {
            this.f469831a = false;
            java.util.Iterator it6 = swipeBackLayout.f325893o.iterator();
            while (it6.hasNext()) {
                ((z26.e) it6.next()).f();
            }
        }
        if (swipeBackLayout.f325890i >= 1.0f) {
            if (swipeBackLayout.f325903y == 1) {
                swipeBackLayout.f325888g.setTranslationX(0.0f);
                swipeBackLayout.f325888g.setTranslationY(0.0f);
            }
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList3 = swipeBackLayout.f325893o;
            if (copyOnWriteArrayList3 != null && !copyOnWriteArrayList3.isEmpty()) {
                java.util.Iterator it7 = swipeBackLayout.f325893o.iterator();
                while (it7.hasNext()) {
                    z26.e eVar = (z26.e) it7.next();
                    if (eVar instanceof z26.f) {
                        com.tencent.mm.plugin.appbrand.page.x1 x1Var = ((com.tencent.mm.plugin.appbrand.page.q1) ((z26.f) eVar)).f87021a;
                        x1Var.setVisibility(8);
                        x1Var.post(new com.tencent.mm.plugin.appbrand.page.p1(x1Var));
                    }
                }
            }
        }
        if (swipeBackLayout.f325903y == 1) {
            swipeBackLayout.C = -i17;
            swipeBackLayout.D = (i17 * swipeBackLayout.getHeight()) / swipeBackLayout.getWidth();
        } else {
            swipeBackLayout.C = 0.0f;
            swipeBackLayout.D = 0.0f;
        }
        boolean z17 = android.os.SystemClock.uptimeMillis() < swipeBackLayout.f325904z;
        if (z17) {
            swipeBackLayout.f325888g.setTranslationX(-i17);
            swipeBackLayout.f325888g.setTranslationY(-i18);
        } else {
            if (swipeBackLayout.B != null) {
                com.tencent.mars.xlog.Log.i("SwipeBackLayout", "startFreezeResetAnim|onViewPositionChanged");
                me.imid.swipebacklayout.lib.SwipeBackLayout.b(swipeBackLayout);
                swipeBackLayout.h();
            }
            swipeBackLayout.f325888g.setTranslationX(swipeBackLayout.C);
            swipeBackLayout.f325888g.setTranslationY(swipeBackLayout.D);
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList4 = swipeBackLayout.f325893o;
        if (copyOnWriteArrayList4 == null || copyOnWriteArrayList4.isEmpty()) {
            return;
        }
        java.util.Iterator it8 = swipeBackLayout.f325893o.iterator();
        while (it8.hasNext()) {
            z26.e eVar2 = (z26.e) it8.next();
            if (z17) {
                eVar2.c(swipeBackLayout.f325888g, 0, 0);
            } else {
                eVar2.c(swipeBackLayout.f325888g, swipeBackLayout.f325891m + ((int) swipeBackLayout.C), swipeBackLayout.f325892n + ((int) swipeBackLayout.D));
            }
        }
    }
}
