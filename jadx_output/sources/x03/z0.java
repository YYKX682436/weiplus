package x03;

/* loaded from: classes15.dex */
public class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f451176d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x03.p1 f451177e;

    public z0(x03.p1 p1Var, java.util.Map map) {
        this.f451177e = p1Var;
        this.f451176d = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f451177e.f451096i.success(this.f451176d);
    }
}
