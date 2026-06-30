package x03;

/* loaded from: classes15.dex */
public class o1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f451084d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x03.p1 f451085e;

    public o1(x03.p1 p1Var, java.util.Map map) {
        this.f451085e = p1Var;
        this.f451084d = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f451085e.f451096i.success(this.f451084d);
    }
}
