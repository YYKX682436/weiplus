package df2;

/* loaded from: classes3.dex */
public final class ol implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.pl f230987d;

    public ol(df2.pl plVar) {
        this.f230987d = plVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        df2.pl plVar = this.f230987d;
        if (plVar.F == null) {
            plVar.F = new com.tencent.mm.ui.tools.f5(plVar.N6());
            df2.pl plVar2 = this.f230987d;
            com.tencent.mm.ui.tools.f5 f5Var = plVar2.F;
            if (f5Var != null) {
                f5Var.f210400e = new df2.nl(plVar2);
            }
        }
        com.tencent.mm.ui.tools.f5 f5Var2 = this.f230987d.F;
        if (f5Var2 != null) {
            f5Var2.f();
        }
    }
}
