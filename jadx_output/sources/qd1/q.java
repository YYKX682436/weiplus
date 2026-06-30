package qd1;

/* loaded from: classes7.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f361672d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qd1.w f361673e;

    public q(qd1.w wVar, android.view.View view) {
        this.f361673e = wVar;
        this.f361672d = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f361672d.announceForAccessibility(this.f361673e.f361685i);
    }
}
