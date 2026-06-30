package eg4;

/* loaded from: classes11.dex */
public class r1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f252787d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ eg4.t1 f252788e;

    public r1(eg4.t1 t1Var, java.lang.String str) {
        this.f252788e = t1Var;
        this.f252787d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        eg4.g1.a(this.f252788e.f252811o, null, this.f252787d, false);
    }
}
