package os3;

/* loaded from: classes8.dex */
public class y3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f348257d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ os3.z3 f348258e;

    public y3(os3.z3 z3Var, android.os.Bundle bundle) {
        this.f348258e = z3Var;
        this.f348257d = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        os3.z3 z3Var = this.f348258e;
        android.os.Bundle bundle = this.f348257d;
        if (bundle != null) {
            z3Var.f348264d.F = bundle.getInt("download_status");
            z3Var.f348264d.G = bundle.getString("download_apk_path", "");
        }
        com.tencent.mm.plugin.qqmail.ui.ReadMailUI readMailUI = z3Var.f348264d;
        if (readMailUI.F == 3 && com.tencent.mm.vfs.w6.j(readMailUI.G)) {
            com.tencent.mm.plugin.qqmail.ui.ReadMailUI readMailUI2 = z3Var.f348264d;
            readMailUI2.I = 2;
            readMailUI2.W6();
        }
    }
}
