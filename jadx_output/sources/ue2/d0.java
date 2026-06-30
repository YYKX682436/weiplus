package ue2;

/* loaded from: classes3.dex */
public final class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ue2.e0 f426801d;

    public d0(ue2.e0 e0Var) {
        this.f426801d = e0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ue2.e0 e0Var = this.f426801d;
        e0Var.f426808h = true;
        e0Var.f426809i = false;
        com.tencent.mars.xlog.Log.i("FinderLiveChatInternalDialog", "show: 弹窗动画完成");
    }
}
