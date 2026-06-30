package ym5;

/* loaded from: classes10.dex */
public final class n4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.RefreshLoadMoreLayout f463443d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f463444e;

    public n4(com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout, int i17) {
        this.f463443d = refreshLoadMoreLayout;
        this.f463444e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ym5.q3 actionCallback = this.f463443d.getActionCallback();
        if (actionCallback != null) {
            actionCallback.a(this.f463444e);
        }
    }
}
