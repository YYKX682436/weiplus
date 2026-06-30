package qe;

/* loaded from: classes7.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f361956d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qe.i0 f361957e;

    public h0(qe.i0 i0Var, java.lang.String str, long j17) {
        this.f361957e = i0Var;
        this.f361956d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f361957e.f361962b.f361975a.update(this.f361956d);
    }
}
