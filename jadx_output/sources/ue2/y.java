package ue2;

/* loaded from: classes3.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ue2.e0 f426868d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f426869e;

    public y(ue2.e0 e0Var, boolean z17) {
        this.f426868d = e0Var;
        this.f426869e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ue2.e0 e0Var = this.f426868d;
        e0Var.setVisibility(8);
        android.view.View view = e0Var.f426806f;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/component/livechat/FinderLiveChatInternalDialog$dismiss$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/component/livechat/FinderLiveChatInternalDialog$dismiss$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.ViewGroup viewGroup = e0Var.f426805e;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        e0Var.f426808h = false;
        e0Var.f426809i = false;
        ue2.i0 i0Var = e0Var.f426807g;
        if (i0Var != null) {
            ue2.g gVar = (ue2.g) i0Var;
            com.tencent.mars.xlog.Log.i(ue2.o.f426827y, "onDismiss: 内部弹窗已取消");
            if (this.f426869e) {
                ue2.o.r(gVar.f426813a);
            }
        }
        com.tencent.mars.xlog.Log.i("FinderLiveChatInternalDialog", "dismiss: 弹窗隐藏完成");
    }
}
