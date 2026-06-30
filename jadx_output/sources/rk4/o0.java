package rk4;

/* loaded from: classes11.dex */
public final class o0 implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lm4.i0 f396870d;

    public o0(lm4.i0 i0Var) {
        this.f396870d = i0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        lm4.b0 b0Var = this.f396870d.f319570f;
        if ((b0Var != null ? b0Var.isDrawerOpen : false) && b0Var != null) {
            int i17 = com.tencent.mm.plugin.ting.view.TingPlayerDraggableLayout.f174821u;
            b0Var.j(b0Var.edgeAttached, true);
        }
        return jz5.f0.f302826a;
    }
}
