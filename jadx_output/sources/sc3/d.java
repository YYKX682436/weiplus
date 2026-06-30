package sc3;

/* loaded from: classes7.dex */
public final class d implements android.os.IBinder.DeathRecipient {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc3.k1 f406435d;

    public d(sc3.k1 k1Var) {
        this.f406435d = k1Var;
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        sc3.k1 k1Var = this.f406435d;
        com.tencent.mars.xlog.Log.w(k1Var.Q, "binder died, need to exit service");
        tc3.m0 m0Var = k1Var.W;
        if (m0Var == null) {
            return;
        }
        if (m0Var != null) {
            m0Var.f417236f = false;
        }
        k1Var.W = null;
        k1Var.Oc(2);
    }
}
