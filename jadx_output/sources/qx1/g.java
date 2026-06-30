package qx1;

/* loaded from: classes12.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f367285d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f367286e;

    public g(qx1.q qVar, android.view.View view, boolean z17) {
        this.f367285d = view;
        this.f367286e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f367285d.setPressed(this.f367286e);
    }
}
