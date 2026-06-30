package df2;

/* loaded from: classes3.dex */
public final class lk implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.pk f230671d;

    public lk(df2.pk pkVar) {
        this.f230671d = pkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        df2.pk pkVar = this.f230671d;
        if (pkVar.E == null) {
            pkVar.E = new com.tencent.mm.ui.tools.f5(pkVar.N6());
            df2.pk pkVar2 = this.f230671d;
            com.tencent.mm.ui.tools.f5 f5Var = pkVar2.E;
            if (f5Var != null) {
                f5Var.f210400e = new df2.kk(pkVar2);
            }
        }
        com.tencent.mm.ui.tools.f5 f5Var2 = this.f230671d.E;
        if (f5Var2 != null) {
            f5Var2.f();
        }
    }
}
