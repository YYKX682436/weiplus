package sj3;

/* loaded from: classes5.dex */
public final class r1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.u1 f408725d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f408726e;

    public r1(sj3.u1 u1Var, java.lang.String str) {
        this.f408725d = u1Var;
        this.f408726e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sj3.u1 u1Var = this.f408725d;
        android.view.View view = u1Var.f408759g;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkMiniVideoView$changeRenderUser$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkMiniVideoView$changeRenderUser$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView = u1Var.f408754b;
        if (textView != null) {
            textView.setVisibility(0);
        }
        if (textView != null) {
            textView.setTextSize(1, 10.0f);
        }
        java.lang.String str = this.f408726e;
        if (textView != null) {
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
            textView.setText(n17 != null ? n17.P0() : null);
        }
        if (kotlin.jvm.internal.o.b(u1Var.f408768p, str)) {
            return;
        }
        u1Var.g(str);
        u1Var.f408768p = str;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        u1Var.f408769q = java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime());
    }
}
