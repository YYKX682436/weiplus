package com.tencent.mm.plugin.game.luggage.page;

/* loaded from: classes.dex */
public class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.page.x0 f139941d;

    public u0(com.tencent.mm.plugin.game.luggage.page.x0 x0Var) {
        this.f139941d = x0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View view = this.f139941d.E1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/luggage/page/GameWebPage$8", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/game/luggage/page/GameWebPage$8", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
