package e20;

/* loaded from: classes9.dex */
public final class e implements l81.v0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t10.d f246477a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f246478b;

    public e(t10.d dVar, boolean z17) {
        this.f246477a = dVar;
        this.f246478b = z17;
    }

    @Override // l81.v0
    public void a(int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("ECS_O.Router.Wxa", "silent launch failed(" + i17 + "): " + str);
        this.f246477a.c(str);
    }

    @Override // l81.v0
    public void onSuccess() {
        this.f246477a.d(new e20.d(this.f246478b));
    }
}
