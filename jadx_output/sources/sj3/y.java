package sj3;

/* loaded from: classes4.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.a1 f408807d;

    public y(sj3.a1 a1Var) {
        this.f408807d = a1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sj3.a1 a1Var = this.f408807d;
        a1Var.f408412z = false;
        android.view.View findViewById = a1Var.f408393d.findViewById(com.tencent.mm.R.id.i2s);
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic$handleBadNetworkLogic$4", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic$handleBadNetworkLogic$4", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView = (android.widget.TextView) a1Var.f408393d.findViewById(com.tencent.mm.R.id.f487622p80);
        if (textView == null) {
            return;
        }
        textView.setVisibility(8);
    }
}
