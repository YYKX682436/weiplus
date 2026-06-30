package com.tencent.mm.plugin.finder.ui.fav;

/* loaded from: classes2.dex */
public abstract class a implements fs2.a {

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.ui.fav.x f129149e;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f129148d = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f129150f = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) kotlinx.coroutines.t3.a(null, 1, null)).plus(kotlinx.coroutines.q1.f310570c));

    public java.util.ArrayList c() {
        return this.f129148d;
    }

    public final com.tencent.mm.plugin.finder.ui.fav.x f() {
        com.tencent.mm.plugin.finder.ui.fav.x xVar = this.f129149e;
        if (xVar != null) {
            return xVar;
        }
        kotlin.jvm.internal.o.o("viewCallback");
        throw null;
    }

    public abstract boolean g();

    public void h(com.tencent.mm.plugin.finder.ui.fav.x callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f129149e = callback;
        f().g();
        f().j();
        m();
        q();
    }

    public abstract void i(androidx.recyclerview.widget.f2 f2Var, android.view.View view, int i17, in5.s0 s0Var);

    public abstract void m();

    @Override // fs2.a
    public void onDetach() {
        kotlinx.coroutines.z0.d(this.f129150f, this + " onDetach", null, 2, null);
    }

    public abstract void p();

    public abstract void q();

    public void s() {
    }
}
