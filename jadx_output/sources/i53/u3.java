package i53;

/* loaded from: classes12.dex */
public class u3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f288745d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f288746e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i53.v3 f288747f;

    public u3(i53.v3 v3Var, long j17, long j18) {
        this.f288747f = v3Var;
        this.f288745d = j17;
        this.f288746e = j18;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f288747f.f288765g.f140080p.setProgress((int) ((this.f288745d * 100) / this.f288746e));
    }
}
