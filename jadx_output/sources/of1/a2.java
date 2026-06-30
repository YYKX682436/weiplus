package of1;

/* loaded from: classes8.dex */
public class a2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f344887d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ of1.m2 f344888e;

    public a2(of1.m2 m2Var, java.util.Map map) {
        this.f344888e = m2Var;
        this.f344887d = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar = this.f344888e.f344975e;
        if (nVar != null) {
            nVar.r0(this.f344887d);
        }
    }
}
