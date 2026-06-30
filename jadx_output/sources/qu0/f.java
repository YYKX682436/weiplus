package qu0;

/* loaded from: classes5.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qu0.g f366723d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f366724e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f366725f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f366726g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Boolean f366727h;

    public f(qu0.g gVar, int i17, java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
        this.f366723d = gVar;
        this.f366724e = i17;
        this.f366725f = str;
        this.f366726g = str2;
        this.f366727h = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f366723d.c(this.f366724e, this.f366725f, this.f366726g, this.f366727h);
    }
}
