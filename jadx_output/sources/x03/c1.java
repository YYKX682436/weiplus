package x03;

/* loaded from: classes15.dex */
public class c1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f450994d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x03.p1 f450995e;

    public c1(x03.p1 p1Var, java.util.Map map) {
        this.f450995e = p1Var;
        this.f450994d = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f450995e.f451096i.success(this.f450994d);
    }
}
