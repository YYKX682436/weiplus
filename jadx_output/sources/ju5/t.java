package ju5;

/* loaded from: classes15.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f302150d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f302151e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ju5.y f302152f;

    public t(ju5.y yVar, int i17, java.lang.CharSequence charSequence) {
        this.f302152f = yVar;
        this.f302150d = i17;
        this.f302151e = charSequence;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f302152f.f302167c.f302173h != null) {
            java.lang.CharSequence charSequence = this.f302151e;
            com.tencent.mars.xlog.Log.i("MicroMsg.SoterControllerFingerprint", "hy: mp on authen help errCode: %d, errMsg:%s", java.lang.Integer.valueOf(this.f302150d), charSequence == null ? "unknown error" : charSequence.toString());
        }
    }
}
