package w03;

/* loaded from: classes16.dex */
public final class d implements na5.b {

    /* renamed from: d, reason: collision with root package name */
    public final bj0.u f441878d;

    public d(bj0.u pageAnimObserver) {
        kotlin.jvm.internal.o.g(pageAnimObserver, "pageAnimObserver");
        this.f441878d = pageAnimObserver;
    }

    @Override // na5.b
    public void onPageEnterAnimBegin() {
        this.f441878d.b();
    }

    @Override // na5.b
    public void onPageEnterAnimEnd() {
        this.f441878d.e();
    }

    @Override // na5.b
    public void onPageExitAnimBegin() {
        this.f441878d.d();
    }

    @Override // na5.b
    public void onPageExitAnimEnd() {
        this.f441878d.a();
    }

    @Override // na5.b
    public void onPagePopEnterAnimBegin() {
        this.f441878d.h();
    }

    @Override // na5.b
    public void onPagePopEnterAnimEnd() {
        this.f441878d.c();
    }

    @Override // na5.b
    public void onPagePopExitAnimBegin() {
        this.f441878d.f();
    }

    @Override // na5.b
    public void onPagePopExitAnimEnd() {
        this.f441878d.g();
    }
}
