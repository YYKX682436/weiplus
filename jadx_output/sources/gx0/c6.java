package gx0;

/* loaded from: classes5.dex */
public final class c6 implements dy0.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f276282a;

    public c6(gx0.w8 w8Var) {
        this.f276282a = w8Var;
    }

    @Override // dy0.j
    public void a(android.view.View view, java.lang.Object obj) {
        dy0.a type = (dy0.a) obj;
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(type, "type");
        int ordinal = type.ordinal();
        gx0.w8 w8Var = this.f276282a;
        if (ordinal == 0) {
            zw0.b bVar = zw0.b.f476554h;
            w8Var.getClass();
            ((gx0.mc) ((jz5.n) w8Var.f348903q).getValue()).cancel();
            yt0.c.Q5(w8Var, (gx0.u2) ((jz5.n) w8Var.K).getValue(), null, false, bVar, 6, null);
            return;
        }
        if (ordinal == 1) {
            zw0.b bVar2 = zw0.b.f476555i;
            w8Var.getClass();
            yt0.c.Q5(w8Var, (gx0.ac) ((jz5.n) w8Var.N).getValue(), null, false, bVar2, 6, null);
        } else if (ordinal == 2) {
            zw0.b bVar3 = zw0.b.f476553g;
            w8Var.getClass();
            yt0.c.Q5(w8Var, (gx0.r1) ((jz5.n) w8Var.L).getValue(), null, false, bVar3, 6, null);
        } else if (ordinal != 3) {
            if (ordinal != 4) {
                return;
            }
            w8Var.Y1(w8Var.getActivity());
        } else {
            zw0.b bVar4 = zw0.b.f476556m;
            w8Var.getClass();
            yt0.c.Q5(w8Var, (rv0.n1) ((jz5.n) w8Var.M).getValue(), null, false, bVar4, 6, null);
        }
    }
}
