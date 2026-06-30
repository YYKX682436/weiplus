package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public final class p7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.c8 f190563d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.k6 f190564e;

    public p7(com.tencent.mm.pluginsdk.ui.chat.c8 c8Var, com.tencent.mm.pluginsdk.ui.chat.k6 k6Var) {
        this.f190563d = c8Var;
        this.f190564e = k6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int[] iArr = new int[2];
        com.tencent.mm.pluginsdk.ui.chat.c8 c8Var = this.f190563d;
        c8Var.f190221c.l().getLocationOnScreen(iArr);
        int left = c8Var.g().getLeft();
        int top = c8Var.g().getTop();
        com.tencent.mm.pluginsdk.ui.chat.k6 k6Var = this.f190564e;
        int i17 = k6Var.f190446a + left;
        int i18 = k6Var.f190447b + top;
        int[] iArr2 = k6Var.f190448c;
        int i19 = iArr2[0] - iArr[0];
        int i27 = iArr2[1] - iArr[1];
        int intValue = ((java.lang.Number) ((jz5.n) c8Var.f190243y).getValue()).intValue();
        int h17 = i65.a.h(c8Var.f(), com.tencent.mm.R.dimen.f479672c9);
        c8Var.h().setTranslationX(i19);
        c8Var.h().setTranslationY(i27);
        android.view.ViewPropertyAnimator translationY = c8Var.h().animate().translationX(0.0f).translationY(0.0f);
        translationY.setInterpolator(ta5.h.f416879a.a());
        translationY.setDuration(300L);
        translationY.start();
        android.view.View i28 = c8Var.i();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(i28, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper", "animOpen", "(Lcom/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper$AnimViewParam;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        i28.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(i28, "com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper", "animOpen", "(Lcom/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper$AnimViewParam;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c8Var.t();
        translationY.setUpdateListener(new com.tencent.mm.pluginsdk.ui.chat.r6(c8Var, left, top, i17, i18, intValue, h17, 0.0f, 0.5f));
        translationY.setListener(new com.tencent.mm.pluginsdk.ui.chat.s6(translationY, c8Var));
    }
}
