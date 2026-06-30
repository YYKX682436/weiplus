package qe;

/* loaded from: classes7.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f362005d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qe.z f362006e;

    public y(qe.z zVar, java.lang.String str, long j17) {
        this.f362006e = zVar;
        this.f362005d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f362006e.f362009b.f361945a.updateNativeInterface(this.f362005d);
    }
}
