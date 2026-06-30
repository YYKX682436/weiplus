package ju5;

/* loaded from: classes15.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f302146d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f302147e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ju5.y f302148f;

    public s(ju5.y yVar, int i17, java.lang.CharSequence charSequence) {
        this.f302148f = yVar;
        this.f302146d = i17;
        this.f302147e = charSequence;
    }

    @Override // java.lang.Runnable
    public void run() {
        gu5.d dVar = this.f302148f.f302167c.f302173h;
        if (dVar != null) {
            ((pe4.g) dVar).getClass();
            com.tencent.mars.xlog.Log.e("MicroMsg.SoterControllerFingerprint", "hy: on mp authen error errCode: %d, errMsg: %s", java.lang.Integer.valueOf(this.f302146d), this.f302147e);
        }
    }
}
