package gx0;

/* loaded from: classes5.dex */
public final class t8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f276983d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t8(gx0.w8 w8Var) {
        super(0);
        this.f276983d = w8Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        gx0.w8 w8Var = this.f276983d;
        yy0.m7 m7Var = (yy0.m7) w8Var.R6().O6();
        kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.e5(m7Var, null), 3, null);
        gx0.u2 u2Var = (gx0.u2) ((jz5.n) w8Var.K).getValue();
        sw0.f fVar = sw0.f.f413429d;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("KEY_PANEL_ARGS", new ow0.a(fVar, false));
        yt0.c.Q5(w8Var, u2Var, hashMap, false, null, 12, null);
        return jz5.f0.f302826a;
    }
}
