package rh;

/* loaded from: classes12.dex */
public class g3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f395400d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f395401e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f395402f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f395403g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ rh.j3 f395404h;

    public g3(rh.j3 j3Var, java.lang.String str, java.lang.String str2, java.lang.String str3, long j17) {
        this.f395404h = j3Var;
        this.f395400d = str;
        this.f395401e = str2;
        this.f395402f = str3;
        this.f395403g = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        rh.h3 h3Var = new rh.h3();
        h3Var.f395410a = this.f395400d;
        h3Var.f395411b = this.f395401e;
        h3Var.f395412c = this.f395402f;
        h3Var.f395413d = this.f395403g;
        this.f395404h.f395294a.a(h3Var);
    }
}
