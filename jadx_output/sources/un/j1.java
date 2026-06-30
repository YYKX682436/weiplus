package un;

/* loaded from: classes11.dex */
public final class j1 extends un.h {

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f429293n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f429294o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f429293n = jz5.h.b(new un.i1(this));
        this.f429294o = jz5.h.b(new un.h1(this));
    }

    @Override // un.h
    public void O6(boolean z17) {
        if (this.f429273d != null) {
            if (!com.tencent.mm.storage.z3.V3(c7())) {
                super.O6(z17);
                return;
            }
            zy2.g6 g6Var = (zy2.g6) i95.n0.c(zy2.g6.class);
            kotlin.jvm.internal.o.d(this.f429273d);
            ((com.tencent.mm.plugin.finder.service.v1) ((zy2.g6) i95.n0.c(zy2.g6.class))).Ai(c7());
            g6Var.getClass();
        }
    }

    @Override // un.h
    public void Q6(java.lang.Boolean bool, boolean z17) {
        if (((java.lang.Boolean) ((jz5.n) this.f429294o).getValue()).booleanValue()) {
            super.Q6(bool, z17);
        }
    }

    @Override // un.h
    public boolean S6() {
        com.tencent.mm.storage.z3 z3Var = this.f429273d;
        if (z3Var != null) {
            return z3Var.v2();
        }
        return false;
    }

    @Override // un.h
    public boolean T6() {
        if (com.tencent.mm.storage.z3.V3(c7())) {
            return ((com.tencent.mm.plugin.finder.service.v1) ((zy2.g6) i95.n0.c(zy2.g6.class))).Ai(c7());
        }
        com.tencent.mm.storage.m4 Di = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
        com.tencent.mm.storage.z3 z3Var = this.f429273d;
        return Di.K(z3Var != null ? z3Var.d1() : null);
    }

    @Override // un.h
    public java.lang.String U6() {
        return c7();
    }

    @Override // un.h
    public java.lang.String X6() {
        return "MicroMsg.SingleRoomOperationUIC";
    }

    @Override // un.h
    public void Y6(boolean z17) {
        if (((java.lang.Boolean) ((jz5.n) this.f429294o).getValue()).booleanValue()) {
            super.Y6(z17);
        } else {
            super.Y6(true);
        }
    }

    public final java.lang.String c7() {
        return (java.lang.String) ((jz5.n) this.f429293n).getValue();
    }
}
