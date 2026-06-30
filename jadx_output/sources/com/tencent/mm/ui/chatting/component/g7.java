package com.tencent.mm.ui.chatting.component;

/* loaded from: classes11.dex */
public class g7 extends yn.d implements yn.k {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f199082d = new java.util.concurrent.CopyOnWriteArraySet();

    @Override // yn.d
    public boolean M() {
        java.util.Iterator it = this.f199082d.iterator();
        while (it.hasNext()) {
            yn.d dVar = (yn.d) it.next();
            if (dVar.M()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingResponseObserver", "canInterceptClick consumed by %s", dVar);
                return true;
            }
        }
        return false;
    }

    @Override // yn.d
    public void N(int i17, int i18, android.content.Intent intent) {
        java.util.Iterator it = this.f199082d.iterator();
        while (it.hasNext()) {
            ((yn.d) it.next()).N(i17, i18, intent);
        }
    }

    @Override // yn.d
    public void O() {
        java.util.Iterator it = this.f199082d.iterator();
        while (it.hasNext()) {
            ((yn.d) it.next()).O();
        }
    }

    @Override // yn.d
    public void P() {
        java.util.Iterator it = this.f199082d.iterator();
        while (it.hasNext()) {
            ((yn.d) it.next()).P();
        }
    }

    @Override // yn.d
    public void Q() {
        java.util.Iterator it = this.f199082d.iterator();
        while (it.hasNext()) {
            ((yn.d) it.next()).Q();
        }
    }

    @Override // yn.d
    public void R(android.content.res.Configuration configuration) {
        java.util.Iterator it = this.f199082d.iterator();
        while (it.hasNext()) {
            ((yn.d) it.next()).R(configuration);
        }
    }

    @Override // yn.d
    public void S(xm3.o0 o0Var) {
        java.util.Iterator it = this.f199082d.iterator();
        while (it.hasNext()) {
            ((yn.d) it.next()).S(o0Var);
        }
    }

    @Override // yn.d
    public void T() {
        java.util.Iterator it = this.f199082d.iterator();
        while (it.hasNext()) {
            ((yn.d) it.next()).T();
        }
    }

    @Override // yn.d
    public void U(long j17, java.lang.String str) {
        java.util.Iterator it = this.f199082d.iterator();
        while (it.hasNext()) {
            ((yn.d) it.next()).U(j17, str);
        }
    }

    @Override // yn.d
    public void V(long j17, java.lang.String str) {
        java.util.Iterator it = this.f199082d.iterator();
        while (it.hasNext()) {
            ((yn.d) it.next()).V(j17, str);
        }
    }

    @Override // yn.d
    public void W() {
        java.util.Iterator it = this.f199082d.iterator();
        while (it.hasNext()) {
            ((yn.d) it.next()).W();
        }
    }

    @Override // yn.d
    public void X() {
        java.util.Iterator it = this.f199082d.iterator();
        while (it.hasNext()) {
            ((yn.d) it.next()).X();
        }
    }

    @Override // yn.d
    public void Y(androidx.recyclerview.widget.RecyclerView recyclerView, in5.w0 w0Var) {
        java.util.Iterator it = this.f199082d.iterator();
        while (it.hasNext()) {
            ((yn.d) it.next()).Y(recyclerView, w0Var);
        }
    }

    @Override // yn.d
    public void Z() {
        java.util.Iterator it = this.f199082d.iterator();
        while (it.hasNext()) {
            ((yn.d) it.next()).Z();
        }
    }

    @Override // yn.d
    public void a0() {
        java.util.Iterator it = this.f199082d.iterator();
        while (it.hasNext()) {
            ((yn.d) it.next()).a0();
        }
    }

    @Override // yn.d
    public boolean b0() {
        java.util.Iterator it = this.f199082d.iterator();
        while (it.hasNext()) {
            yn.d dVar = (yn.d) it.next();
            if (dVar.b0()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingResponseObserver", "interceptClick consumed by %s", dVar);
                return true;
            }
        }
        return false;
    }

    @Override // yn.d
    public boolean d0(int i17, android.view.KeyEvent keyEvent) {
        java.util.Iterator it = this.f199082d.iterator();
        while (it.hasNext()) {
            yn.d dVar = (yn.d) it.next();
            if (dVar.d0(i17, keyEvent)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingResponseObserver", "keyCode(%s) consumed by %s", java.lang.Integer.valueOf(i17), dVar);
                return true;
            }
        }
        return false;
    }

    @Override // yn.d
    public void e0() {
        java.util.Iterator it = this.f199082d.iterator();
        while (it.hasNext()) {
            ((yn.d) it.next()).e0();
        }
    }

    @Override // yn.d
    public void f0(java.lang.String str, java.lang.String str2) {
        java.util.Iterator it = this.f199082d.iterator();
        while (it.hasNext()) {
            ((yn.d) it.next()).f0(str, str2);
        }
    }

    @Override // yn.d
    public void g0() {
        java.util.Iterator it = this.f199082d.iterator();
        while (it.hasNext()) {
            ((yn.d) it.next()).g0();
        }
    }

    @Override // yn.d
    public void h0(int i17, java.lang.String[] strArr, int[] iArr) {
        java.util.Iterator it = this.f199082d.iterator();
        while (it.hasNext()) {
            ((yn.d) it.next()).h0(i17, strArr, iArr);
        }
    }

    @Override // yn.d
    public void i0(android.view.View view, int i17, int i18, int i19, int i27) {
        java.util.Iterator it = this.f199082d.iterator();
        while (it.hasNext()) {
            ((yn.d) it.next()).i0(view, i17, i18, i19, i27);
        }
    }

    @Override // yn.d
    public void j0(android.view.View view, int i17) {
        java.util.Iterator it = this.f199082d.iterator();
        while (it.hasNext()) {
            ((yn.d) it.next()).j0(view, i17);
        }
    }

    @Override // yn.d
    public void k0(java.lang.String str, long j17, java.lang.CharSequence charSequence) {
        java.util.Iterator it = this.f199082d.iterator();
        while (it.hasNext()) {
            ((yn.d) it.next()).k0(str, j17, charSequence);
        }
    }

    @Override // yn.d
    public void l0() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingResponseObserver", "onTrulyEnterAnimEnd");
        java.util.Iterator it = this.f199082d.iterator();
        while (it.hasNext()) {
            ((yn.d) it.next()).l0();
        }
    }
}
