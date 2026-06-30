package m90;

/* loaded from: classes8.dex */
public class q1 extends tg3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f324906e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f324907f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f324908g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f324909h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(m90.r1 r1Var, int i17, r35.m3 m3Var, java.lang.ref.WeakReference weakReference, java.lang.String str, java.lang.String str2, long j17) {
        super(i17, m3Var);
        this.f324906e = weakReference;
        this.f324907f = str;
        this.f324908g = str2;
        this.f324909h = j17;
    }

    @Override // tg3.a
    public void a(android.view.View view) {
        try {
            if (this.f324906e.get() != null) {
                en0.g gVar = new en0.g();
                gVar.f255246a = 2;
                gVar.f255247b = this.f324907f;
                gVar.f255251f = this.f324908g;
                gVar.f255248c = this.f324909h;
                gVar.f255252g = 1;
                gVar.a();
            }
        } catch (java.lang.Throwable unused) {
        }
    }
}
