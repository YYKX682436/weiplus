package kx5;

/* loaded from: classes15.dex */
public class c implements kx5.m {

    /* renamed from: a, reason: collision with root package name */
    public boolean f313285a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f313286b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ io.flutter.embedding.engine.FlutterEngine f313287c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kx5.n f313288d;

    public c(kx5.n nVar, int i17, io.flutter.embedding.engine.FlutterEngine flutterEngine) {
        this.f313288d = nVar;
        this.f313286b = i17;
        this.f313287c = flutterEngine;
    }

    public void a() {
        nx5.c.c("WxaRouter.WxaRouter", "destroy engine: %d", java.lang.Integer.valueOf(this.f313286b));
        if (this.f313285a) {
            return;
        }
        kx5.n.a(this.f313288d, this.f313287c);
        this.f313285a = true;
    }
}
