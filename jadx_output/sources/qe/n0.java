package qe;

/* loaded from: classes7.dex */
public class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f361978d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qe.o0 f361979e;

    public n0(qe.o0 o0Var, java.lang.String str, long j17) {
        this.f361979e = o0Var;
        this.f361978d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f361979e.f361982b.f361990a.update(this.f361978d);
    }
}
