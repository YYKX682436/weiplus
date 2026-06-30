package xs2;

/* loaded from: classes3.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final xs2.p f456385a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.p f456386b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f456387c;

    /* renamed from: d, reason: collision with root package name */
    public xs2.o f456388d;

    public u(gk2.e liveBuContext, xs2.p liveDanmakuView, xs2.f0 config, yz5.p pVar) {
        kotlin.jvm.internal.o.g(liveBuContext, "liveBuContext");
        kotlin.jvm.internal.o.g(liveDanmakuView, "liveDanmakuView");
        kotlin.jvm.internal.o.g(config, "config");
        this.f456385a = liveDanmakuView;
        this.f456386b = pVar;
        this.f456387c = "LiveDanmakuAdapter";
        android.view.View view = liveDanmakuView.getView();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initManager,manager:");
        sb6.append(this.f456388d);
        sb6.append(",bulletView:");
        sb6.append(view.hashCode());
        sb6.append(",manager view:");
        xs2.o oVar = this.f456388d;
        android.view.View view2 = oVar != null ? ((xs2.e) oVar).f456314a : null;
        sb6.append(view2 != null ? view2.hashCode() : 0);
        com.tencent.mars.xlog.Log.w("LiveDanmakuAdapter", sb6.toString());
        xs2.o oVar2 = this.f456388d;
        if (oVar2 != null) {
            if (kotlin.jvm.internal.o.b(view, oVar2 != null ? ((xs2.e) oVar2).f456314a : null)) {
                return;
            }
        }
        xs2.i0 i0Var = new xs2.i0(view, liveBuContext, config);
        i0Var.f456320g = new xs2.r(this);
        this.f456388d = i0Var;
    }

    public final android.view.View a() {
        return this.f456385a.getF124909h();
    }

    public final void b(wp.i viewDanmaku) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(viewDanmaku, "viewDanmaku");
        xs2.o oVar = this.f456388d;
        if (oVar != null) {
            vp.x i17 = ((xs2.e) oVar).i();
            yp.o oVar2 = viewDanmaku.H;
            if (oVar2 != null) {
                vp.w0 w0Var = i17.f438852d;
                w0Var.N1(viewDanmaku, oVar2);
                w0Var.postInvalidate();
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.e(this.f456387c, "notifyItemChange viewDanmaku:" + viewDanmaku.hashCode() + " data:" + viewDanmaku.f448354y + " ,but it's viewHolder is null!");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0154 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x002f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xs2.u.c(java.lang.Object):void");
    }

    public final void d(wp.i viewDanmaku) {
        kotlin.jvm.internal.o.g(viewDanmaku, "viewDanmaku");
        xs2.o oVar = this.f456388d;
        if (oVar != null) {
            vp.x i17 = ((xs2.e) oVar).i();
            viewDanmaku.f448353x = true;
            i17.f438852d.postInvalidate();
        }
    }

    public final void e(wp.e eVar) {
        vp.x b17;
        zl2.r4.f473950a.M2(this.f456387c, "setMaskBitmap mask:" + eVar);
        xs2.o oVar = this.f456388d;
        if (oVar == null || (b17 = oVar.b()) == null) {
            return;
        }
        b17.f438852d.L4(eVar);
    }
}
