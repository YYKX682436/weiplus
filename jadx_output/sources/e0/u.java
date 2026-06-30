package e0;

/* loaded from: classes5.dex */
public final class u implements e0.s {

    /* renamed from: a, reason: collision with root package name */
    public final n0.e5 f245704a;

    /* renamed from: b, reason: collision with root package name */
    public final e0.h f245705b;

    public u(n0.e5 itemsSnapshot) {
        kotlin.jvm.internal.o.g(itemsSnapshot, "itemsSnapshot");
        this.f245704a = itemsSnapshot;
        this.f245705b = new e0.h();
    }

    @Override // androidx.compose.foundation.lazy.layout.l
    public java.lang.Object a(int i17) {
        androidx.compose.foundation.lazy.layout.c b17 = ((e0.a0) this.f245704a.getValue()).b(i17);
        return ((e0.m) b17.f10396c).f245645b.invoke(java.lang.Integer.valueOf(i17 - b17.f10394a));
    }

    @Override // androidx.compose.foundation.lazy.layout.l
    public java.util.Map b() {
        return ((e0.a0) this.f245704a.getValue()).f245493d;
    }

    @Override // androidx.compose.foundation.lazy.layout.l
    public java.lang.Object c(int i17) {
        androidx.compose.foundation.lazy.layout.c b17 = ((e0.a0) this.f245704a.getValue()).b(i17);
        int i18 = i17 - b17.f10394a;
        yz5.l lVar = ((e0.m) b17.f10396c).f245644a;
        java.lang.Object invoke = lVar != null ? lVar.invoke(java.lang.Integer.valueOf(i18)) : null;
        return invoke == null ? androidx.compose.foundation.lazy.layout.a0.a(i17) : invoke;
    }

    @Override // androidx.compose.foundation.lazy.layout.l
    public void d(int i17, n0.o oVar, int i18) {
        int i19;
        java.lang.Object obj = n0.e1.f333492a;
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(1704733014);
        if ((i18 & 14) == 0) {
            i19 = (y0Var.c(i17) ? 4 : 2) | i18;
        } else {
            i19 = i18;
        }
        if ((i18 & 112) == 0) {
            i19 |= y0Var.e(this) ? 32 : 16;
        }
        if ((i19 & 91) == 18 && y0Var.v()) {
            y0Var.O();
        } else {
            ((e0.a0) this.f245704a.getValue()).a(this.f245705b, i17, y0Var, ((i19 << 3) & 112) | 512);
        }
        n0.f4 q17 = y0Var.q();
        if (q17 == null) {
            return;
        }
        ((n0.l3) q17).f333608d = new e0.t(this, i17, i18);
    }

    @Override // androidx.compose.foundation.lazy.layout.l
    public int e() {
        return ((androidx.compose.foundation.lazy.layout.b0) ((e0.a0) this.f245704a.getValue()).f245490a).f10393c;
    }
}
