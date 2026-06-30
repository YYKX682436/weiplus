package hr3;

/* loaded from: classes9.dex */
public class k8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f283716d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f283717e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hr3.l8 f283718f;

    public k8(hr3.l8 l8Var, boolean z17, android.app.ProgressDialog progressDialog) {
        this.f283718f = l8Var;
        this.f283716d = z17;
        this.f283717e = progressDialog;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f283718f.getClass();
        boolean z17 = this.f283716d;
        c01.sc.b(6, z17 ? "3" : "4");
        int n17 = c01.z1.n();
        int i17 = z17 ? n17 & (-129) : n17 | 128;
        c01.d9.b().p().w(34, java.lang.Integer.valueOf(i17));
        ((e21.z0) c01.d9.b().w()).c(new e21.t(2048, "", "", 0, "", "", "", 0, 0, 0, "", "", "", i17, "", 0, "", 0));
        if (!z17) {
            c01.w9.k("qqsync");
            ((com.tencent.mm.storage.m4) c01.d9.b().r()).k("qqsync");
        }
        com.tencent.mm.sdk.platformtools.u3.h(new hr3.j8(this));
    }
}
