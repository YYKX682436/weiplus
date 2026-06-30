package un;

/* loaded from: classes.dex */
public final class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ un.k0 f429249d;

    public e0(un.k0 k0Var) {
        this.f429249d = k0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = this.f429249d.P6();
        if (P6 != null) {
            P6.showVKB();
        }
    }
}
