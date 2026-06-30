package f0;

/* loaded from: classes5.dex */
public final class s implements f0.q {

    /* renamed from: a, reason: collision with root package name */
    public final n0.e5 f258226a;

    public s(n0.e5 itemsSnapshot) {
        kotlin.jvm.internal.o.g(itemsSnapshot, "itemsSnapshot");
        this.f258226a = itemsSnapshot;
    }

    @Override // androidx.compose.foundation.lazy.layout.l
    public java.lang.Object a(int i17) {
        androidx.compose.foundation.lazy.layout.c b17 = ((f0.b0) this.f258226a.getValue()).b(i17);
        return ((f0.j) b17.f10396c).f258121c.invoke(java.lang.Integer.valueOf(i17 - b17.f10394a));
    }

    @Override // androidx.compose.foundation.lazy.layout.l
    public java.util.Map b() {
        return ((f0.b0) this.f258226a.getValue()).f258010d;
    }

    @Override // androidx.compose.foundation.lazy.layout.l
    public java.lang.Object c(int i17) {
        androidx.compose.foundation.lazy.layout.c b17 = ((f0.b0) this.f258226a.getValue()).b(i17);
        int i18 = i17 - b17.f10394a;
        yz5.l lVar = ((f0.j) b17.f10396c).f258119a;
        java.lang.Object invoke = lVar != null ? lVar.invoke(java.lang.Integer.valueOf(i18)) : null;
        return invoke == null ? androidx.compose.foundation.lazy.layout.a0.a(i17) : invoke;
    }

    @Override // androidx.compose.foundation.lazy.layout.l
    public void d(int i17, n0.o oVar, int i18) {
        int i19;
        java.lang.Object obj = n0.e1.f333492a;
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(1959480708);
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
            ((f0.b0) this.f258226a.getValue()).a(i17, y0Var, (i19 & 14) | 64);
        }
        n0.f4 q17 = y0Var.q();
        if (q17 == null) {
            return;
        }
        ((n0.l3) q17).f333608d = new f0.r(this, i17, i18);
    }

    @Override // androidx.compose.foundation.lazy.layout.l
    public int e() {
        return ((androidx.compose.foundation.lazy.layout.b0) ((f0.b0) this.f258226a.getValue()).f258007a).f10393c;
    }
}
