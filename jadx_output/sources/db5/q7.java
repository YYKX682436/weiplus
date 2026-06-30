package db5;

/* loaded from: classes3.dex */
public class q7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db5.d5 f228481d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f228482e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f228483f;

    public q7(db5.d5 d5Var, android.app.Activity activity, int i17) {
        this.f228481d = d5Var;
        this.f228482e = activity;
        this.f228483f = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f228481d.showAtLocation(this.f228482e.getWindow().getDecorView(), 48, 0, this.f228483f);
    }
}
