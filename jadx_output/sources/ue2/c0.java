package ue2;

/* loaded from: classes3.dex */
public final class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ue2.e0 f426799d;

    public c0(ue2.e0 e0Var) {
        this.f426799d = e0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("FinderLiveChatInternalDialog", "show: 弹窗动画开始");
        ue2.i0 i0Var = this.f426799d.f426807g;
        if (i0Var != null) {
            com.tencent.mars.xlog.Log.i(ue2.o.f426827y, "onShow: 内部弹窗已显示");
            ue2.h0 h0Var = ((ue2.g) i0Var).f426813a.f426838q;
            if (h0Var != null) {
                h0Var.a();
            }
        }
    }
}
