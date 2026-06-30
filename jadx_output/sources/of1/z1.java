package of1;

/* loaded from: classes8.dex */
public class z1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f345063d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ of1.m2 f345064e;

    public z1(of1.m2 m2Var, java.util.Map map) {
        this.f345064e = m2Var;
        this.f345063d = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar = this.f345064e.f344975e;
        if (nVar != null) {
            nVar.q0(this.f345063d);
        }
    }
}
