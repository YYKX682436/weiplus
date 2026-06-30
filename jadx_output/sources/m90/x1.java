package m90;

/* loaded from: classes4.dex */
public class x1 extends tg3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f324930e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f324931f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f324932g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f324933h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f324934i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f324935m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(m90.y1 y1Var, int i17, r35.m3 m3Var, java.util.Map map, java.lang.String str, android.os.Bundle bundle, java.lang.ref.WeakReference weakReference, java.lang.String str2, java.lang.ref.WeakReference weakReference2) {
        super(i17, m3Var);
        this.f324930e = map;
        this.f324931f = str;
        this.f324932g = bundle;
        this.f324933h = weakReference;
        this.f324934i = str2;
        this.f324935m = weakReference2;
    }

    @Override // tg3.a
    public void a(android.view.View view) {
        ((sg3.r) i95.n0.c(sg3.r.class)).hj(this.f324930e, this.f324931f, this.f324932g, this.f324933h, this.f324934i, true);
        ((ih3.e) ((tg3.k1) i95.n0.c(tg3.k1.class))).Di("link_succeed_contact", this.f324930e, this.f324932g, this.f324933h, this.f324935m);
    }
}
