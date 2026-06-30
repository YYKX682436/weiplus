package df2;

/* loaded from: classes10.dex */
public final class kt implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.lt f230599d;

    public kt(df2.lt ltVar) {
        this.f230599d = ltVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        df2.lt ltVar = this.f230599d;
        com.tencent.mm.ui.widget.RoundCornerConstraintLayout roundCornerConstraintLayout = ltVar.G;
        if (roundCornerConstraintLayout != null) {
            roundCornerConstraintLayout.setVisibility(8);
        }
        com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout = ltVar.H;
        boolean z17 = false;
        if (roundedCornerFrameLayout != null) {
            roundedCornerFrameLayout.setVisibility(0);
        }
        android.widget.FrameLayout frameLayout = ltVar.F;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        r45.q12 q12Var = ((mm2.e1) ltVar.business(mm2.e1.class)).f328989s;
        if (q12Var != null && q12Var.getInteger(1) == 8) {
            z17 = true;
        }
        if (!z17 || ltVar.L) {
            return;
        }
        ltVar.L = true;
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0.dk((ml2.r0) c17, 1, null, 2, null);
    }
}
