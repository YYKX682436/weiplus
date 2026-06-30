package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class m80 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.x80 f113471d;

    public m80(com.tencent.mm.plugin.finder.live.plugin.x80 x80Var) {
        this.f113471d = x80Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveScreenClearPlugin$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        java.lang.Integer valueOf = motionEvent != null ? java.lang.Integer.valueOf(motionEvent.getAction()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            this.f113471d.B = (int) motionEvent.getX();
            this.f113471d.C = (int) motionEvent.getY();
            this.f113471d.f115052s = android.os.SystemClock.elapsedRealtime();
        } else if (valueOf != null && valueOf.intValue() == 1) {
            if (this.f113471d.f115052s > 0) {
                int x17 = (int) motionEvent.getX();
                int y17 = (int) motionEvent.getY();
                int scaledTouchSlop = android.view.ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
                if (java.lang.Math.abs(x17 - this.f113471d.B) > scaledTouchSlop || java.lang.Math.abs(y17 - this.f113471d.C) > scaledTouchSlop) {
                    kotlinx.coroutines.r2 r2Var = this.f113471d.E;
                    if (r2Var != null) {
                        kotlinx.coroutines.p2.a(r2Var, null, 1, null);
                    }
                } else {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[ACTION_UP] doubleClickJob = ");
                    sb6.append(this.f113471d.E);
                    sb6.append(", isActive = ");
                    kotlinx.coroutines.r2 r2Var2 = this.f113471d.E;
                    sb6.append(r2Var2 != null ? java.lang.Boolean.valueOf(r2Var2.a()) : null);
                    sb6.append(", screenClear = ");
                    sb6.append(((mm2.c1) this.f113471d.P0(mm2.c1.class)).N1);
                    com.tencent.mars.xlog.Log.i("Finder.LiveScreenClearPlugin", sb6.toString());
                    if (!((mm2.c1) this.f113471d.P0(mm2.c1.class)).N1 && !((mm2.c1) this.f113471d.P0(mm2.c1.class)).T) {
                        boolean z17 = false;
                        if (!(((mm2.n0) this.f113471d.P0(mm2.n0.class)).f329273r)) {
                            kotlinx.coroutines.r2 r2Var3 = this.f113471d.E;
                            if (r2Var3 != null && r2Var3.a()) {
                                z17 = true;
                            }
                            if (z17) {
                                kotlinx.coroutines.r2 r2Var4 = this.f113471d.E;
                                if (r2Var4 != null) {
                                    kotlinx.coroutines.p2.a(r2Var4, null, 1, null);
                                }
                                com.tencent.mm.plugin.finder.live.plugin.x80 x80Var = this.f113471d;
                                x80Var.getClass();
                                com.tencent.mars.xlog.Log.i("Finder.LiveScreenClearPlugin", "screenDoubleClickLogic");
                                df2.bh bhVar = (df2.bh) x80Var.U0(df2.bh.class);
                                if (bhVar != null) {
                                    bhVar.Z6(x17, y17);
                                }
                            } else {
                                kotlinx.coroutines.r2 r2Var5 = this.f113471d.E;
                                if (r2Var5 != null) {
                                    kotlinx.coroutines.p2.a(r2Var5, null, 1, null);
                                }
                                com.tencent.mm.plugin.finder.live.plugin.x80 x80Var2 = this.f113471d;
                                kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                                x80Var2.E = com.tencent.mm.plugin.finder.live.util.y.m(x80Var2, kotlinx.coroutines.internal.b0.f310484a, null, new com.tencent.mm.plugin.finder.live.plugin.l80(x80Var2, motionEvent, null), 2, null);
                            }
                        }
                    }
                    com.tencent.mm.plugin.finder.live.plugin.x80.A1(this.f113471d, null, motionEvent, 1, null);
                }
            }
            this.f113471d.f115052s = -1L;
        }
        com.tencent.mm.plugin.finder.live.plugin.x80.t1(this.f113471d, motionEvent);
        java.util.LinkedList linkedList = this.f113471d.f115053t;
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((android.view.View.OnTouchListener) it.next()).onTouch(view, motionEvent);
            }
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveScreenClearPlugin$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
