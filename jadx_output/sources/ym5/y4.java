package ym5;

/* loaded from: classes2.dex */
public final class y4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.RefreshLoadMoreLayout f463578d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f463579e;

    public y4(com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout, yz5.a aVar) {
        this.f463578d = refreshLoadMoreLayout;
        this.f463579e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.f463578d;
        refreshLoadMoreLayout.s(new ym5.x4(refreshLoadMoreLayout));
        this.f463579e.invoke();
    }
}
