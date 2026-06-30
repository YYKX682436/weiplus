package x03;

/* loaded from: classes15.dex */
public class a1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f450985d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x03.p1 f450986e;

    public a1(x03.p1 p1Var, java.util.Map map) {
        this.f450986e = p1Var;
        this.f450985d = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f450986e.f451096i.success(this.f450985d);
    }
}
