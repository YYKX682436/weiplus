package s1;

/* loaded from: classes14.dex */
public final class o0 implements s1.g2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s1.q0 f402048a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f402049b;

    public o0(s1.q0 q0Var, java.lang.Object obj) {
        this.f402048a = q0Var;
        this.f402049b = obj;
    }

    public void a(int i17, long j17) {
        s1.q0 q0Var = this.f402048a;
        u1.w wVar = (u1.w) ((java.util.LinkedHashMap) q0Var.f402068h).get(this.f402049b);
        if (wVar == null || !wVar.x()) {
            return;
        }
        int i18 = wVar.r().f341852f;
        if (i17 < 0 || i17 >= i18) {
            throw new java.lang.IndexOutOfBoundsException("Index (" + i17 + ") is out of bound of [0, " + i18 + ')');
        }
        if (!(!wVar.A)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        u1.w wVar2 = q0Var.f402061a;
        wVar2.f423693q = true;
        u1.r1 a17 = u1.q0.a(wVar);
        u1.w layoutNode = (u1.w) wVar.r().f341850d[i17];
        kotlin.jvm.internal.o.g(layoutNode, "layoutNode");
        u1.d1 d1Var = ((androidx.compose.ui.platform.AndroidComposeView) a17).f10456J;
        d1Var.f(layoutNode, j17);
        d1Var.b(false);
        wVar2.f423693q = false;
    }
}
