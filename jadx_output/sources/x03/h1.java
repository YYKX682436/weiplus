package x03;

/* loaded from: classes15.dex */
public class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f451034d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f451035e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f451036f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x03.i1 f451037g;

    public h1(x03.i1 i1Var, int i17, java.lang.String str, java.util.Map map) {
        this.f451037g = i1Var;
        this.f451034d = i17;
        this.f451035e = str;
        this.f451036f = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f451037g.f451059a.f451062d.f451096i.error(java.lang.String.valueOf(this.f451034d), this.f451035e, this.f451036f);
    }
}
