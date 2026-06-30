package jy;

/* loaded from: classes14.dex */
public abstract class d extends androidx.lifecycle.c1 implements jy.l {

    /* renamed from: d, reason: collision with root package name */
    public final u26.w f302456d;

    /* renamed from: e, reason: collision with root package name */
    public final n0.v2 f302457e;

    public d(jy.s viewState) {
        kotlin.jvm.internal.o.g(viewState, "viewState");
        this.f302456d = u26.z.a(Integer.MAX_VALUE, null, null, 6, null);
        this.f302457e = n0.s4.c(viewState, null, 2, null);
        kotlinx.coroutines.l.d(androidx.lifecycle.d1.a(this), kotlinx.coroutines.q1.f310570c, null, new jy.b(this, null), 2, null);
    }

    public final jy.s N6() {
        return (jy.s) this.f302457e.getValue();
    }

    public final void O6(jy.r viewIntent) {
        kotlin.jvm.internal.o.g(viewIntent, "viewIntent");
        kotlinx.coroutines.l.d(androidx.lifecycle.d1.a(this), kotlinx.coroutines.q1.f310570c, null, new jy.c(this, viewIntent, null), 2, null);
    }

    public final void P6(jy.s sVar) {
        kotlin.jvm.internal.o.g(sVar, "<set-?>");
        this.f302457e.setValue(sVar);
    }
}
