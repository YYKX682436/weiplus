package qe;

/* loaded from: classes7.dex */
public class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f361994d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f361995e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qe.v0 f361996f;

    public u0(qe.v0 v0Var, java.lang.String str, long j17, int i17) {
        this.f361996f = v0Var;
        this.f361994d = j17;
        this.f361995e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f361996f.f361999c.f361935h.updateInterface(this.f361994d, this.f361995e);
    }
}
