package ni2;

/* loaded from: classes3.dex */
public final class t1 implements com.tencent.mm.ui.tools.c5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ni2.z1 f337470d;

    public t1(ni2.z1 z1Var) {
        this.f337470d = z1Var;
    }

    @Override // com.tencent.mm.ui.tools.c5
    public final void w2(int i17, boolean z17) {
        ni2.z1 z1Var = this.f337470d;
        if (i17 > 0) {
            fg2.p1 p1Var = z1Var.K;
            if (p1Var != null) {
                p1Var.f262243w.animate().translationY(-i65.a.b(z1Var.f118183e, 64)).setDuration(240L).start();
                return;
            } else {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
        }
        fg2.p1 p1Var2 = z1Var.K;
        if (p1Var2 != null) {
            p1Var2.f262243w.animate().translationY(0.0f).setDuration(240L).start();
        } else {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
    }
}
