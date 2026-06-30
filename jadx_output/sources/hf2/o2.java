package hf2;

/* loaded from: classes10.dex */
public final class o2 implements mo0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hf2.q2 f281132a;

    public o2(hf2.q2 q2Var) {
        this.f281132a = q2Var;
    }

    @Override // mo0.b
    public void a() {
    }

    @Override // mo0.b
    public void b() {
    }

    @Override // mo0.b
    public boolean c(float f17, float f18, int i17, int i18, long j17) {
        android.view.ViewGroup rootView;
        com.tencent.mm.plugin.finder.live.plugin.o9 o9Var;
        hf2.q2 q2Var = this.f281132a;
        com.tencent.mm.plugin.finder.live.view.ub ubVar = q2Var.f281148a.f291099e;
        android.view.TextureView textureView = null;
        com.tencent.mm.plugin.finder.live.plugin.o9 o9Var2 = ubVar != null ? (com.tencent.mm.plugin.finder.live.plugin.o9) ubVar.getPlugin(com.tencent.mm.plugin.finder.live.plugin.o9.class) : null;
        com.tencent.mm.plugin.finder.live.view.ub ubVar2 = q2Var.f281148a.f291099e;
        if (ubVar2 != null && (o9Var = (com.tencent.mm.plugin.finder.live.plugin.o9) ubVar2.getPlugin(com.tencent.mm.plugin.finder.live.plugin.o9.class)) != null) {
            textureView = o9Var.z1();
        }
        hf2.x xVar = q2Var.f281148a;
        if (xVar.f281188t) {
            db5.t7.m(xVar.O6(), xVar.O6().getResources().getString(com.tencent.mm.R.string.lju));
            return false;
        }
        if (xVar.F || !((je2.g) xVar.business(je2.g.class)).T6()) {
            return false;
        }
        if (!(o9Var2 != null && o9Var2.w0() == 0) || !o9Var2.f365323d.isShown()) {
            return false;
        }
        if (!(textureView != null && textureView.isShown())) {
            return false;
        }
        java.util.LinkedList<hf2.m2> b17 = q2Var.b(textureView);
        android.graphics.Point point = xVar.f281189u.f281160a;
        float f19 = point.x + f17;
        float f27 = point.y + f18;
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        for (hf2.m2 m2Var : b17) {
            if (q2Var.e(f19, f27, m2Var)) {
                java.lang.String str2 = "preview onTouchEvent touchX:" + f17 + ",touchY:" + f18 + ",match stickerType:" + m2Var.f281116a;
                java.lang.String str3 = q2Var.f281149b;
                com.tencent.mars.xlog.Log.i(str3, str2);
                hf2.n2 n2Var = new hf2.n2(str3, new java.lang.ref.WeakReference(xVar), new java.lang.ref.WeakReference(m2Var));
                q2Var.f281151d = n2Var;
                com.tencent.mm.plugin.finder.live.view.ub ubVar3 = xVar.f291099e;
                if (ubVar3 != null && (rootView = ubVar3.rootView()) != null) {
                    rootView.postDelayed(n2Var, android.view.ViewConfiguration.getDoubleTapTimeout());
                }
                return true;
            }
        }
        return false;
    }

    @Override // mo0.b
    public boolean e(float f17, float f18) {
        android.view.ViewGroup rootView;
        com.tencent.mm.plugin.finder.live.plugin.o9 o9Var;
        hf2.q2 q2Var = this.f281132a;
        com.tencent.mm.plugin.finder.live.view.ub ubVar = q2Var.f281148a.f291099e;
        android.view.TextureView textureView = null;
        com.tencent.mm.plugin.finder.live.plugin.o9 o9Var2 = ubVar != null ? (com.tencent.mm.plugin.finder.live.plugin.o9) ubVar.getPlugin(com.tencent.mm.plugin.finder.live.plugin.o9.class) : null;
        com.tencent.mm.plugin.finder.live.view.ub ubVar2 = q2Var.f281148a.f291099e;
        if (ubVar2 != null && (o9Var = (com.tencent.mm.plugin.finder.live.plugin.o9) ubVar2.getPlugin(com.tencent.mm.plugin.finder.live.plugin.o9.class)) != null) {
            textureView = o9Var.z1();
        }
        hf2.x xVar = q2Var.f281148a;
        if (xVar.f281188t) {
            db5.t7.m(xVar.O6(), xVar.O6().getResources().getString(com.tencent.mm.R.string.lju));
            return false;
        }
        if (xVar.F || !((je2.g) xVar.business(je2.g.class)).T6()) {
            return false;
        }
        if (!(o9Var2 != null && o9Var2.w0() == 0) || !o9Var2.f365323d.isShown()) {
            return false;
        }
        if (!(textureView != null && textureView.isShown())) {
            return false;
        }
        java.util.LinkedList<hf2.m2> b17 = q2Var.b(textureView);
        android.graphics.Point point = xVar.f281189u.f281160a;
        float f19 = point.x + f17;
        float f27 = point.y + f18;
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        for (hf2.m2 m2Var : b17) {
            if (q2Var.e(f19, f27, m2Var)) {
                hf2.n2 n2Var = q2Var.f281151d;
                java.lang.String str2 = q2Var.f281149b;
                if (n2Var != null) {
                    com.tencent.mars.xlog.Log.i(str2, "single click task remove,controller:" + xVar.hashCode() + '!');
                    com.tencent.mm.plugin.finder.live.view.ub ubVar3 = xVar.f291099e;
                    if (ubVar3 != null && (rootView = ubVar3.rootView()) != null) {
                        rootView.removeCallbacks(n2Var);
                    }
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDoubleClickEvent touchX:");
                sb6.append(f17);
                sb6.append(",touchY:");
                sb6.append(f18);
                sb6.append(",match stickerType:");
                int i17 = m2Var.f281116a;
                sb6.append(i17);
                com.tencent.mars.xlog.Log.i(str2, sb6.toString());
                xVar.w7(i17, "");
                return true;
            }
        }
        return false;
    }
}
