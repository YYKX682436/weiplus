package x03;

/* loaded from: classes15.dex */
public class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f451001d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x03.p1 f451002e;

    public d1(x03.p1 p1Var, java.util.Map map) {
        this.f451002e = p1Var;
        this.f451001d = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f451002e.f451096i.success(this.f451001d);
    }
}
