package x03;

/* loaded from: classes15.dex */
public class l1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f451070d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x03.p1 f451071e;

    public l1(x03.p1 p1Var, java.util.Map map) {
        this.f451071e = p1Var;
        this.f451070d = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f451071e.f451096i.success(this.f451070d);
    }
}
