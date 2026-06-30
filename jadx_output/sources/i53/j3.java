package i53;

/* loaded from: classes12.dex */
public class j3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f288618d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f288619e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i53.k3 f288620f;

    public j3(i53.k3 k3Var, long j17, long j18) {
        this.f288620f = k3Var;
        this.f288618d = j17;
        this.f288619e = j18;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f288620f.f288636f.f288661d.setProgress((int) ((this.f288618d * 100) / this.f288619e));
    }
}
