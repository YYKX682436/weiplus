package jm3;

/* loaded from: classes10.dex */
public final class h0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.MusicMvMakerUI f300321d;

    public h0(com.tencent.mm.plugin.mv.ui.MusicMvMakerUI musicMvMakerUI) {
        this.f300321d = musicMvMakerUI;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        int i17 = com.tencent.mm.plugin.mv.ui.MusicMvMakerUI.f150868u;
        com.tencent.mm.plugin.mv.ui.MusicMvMakerUI activity = this.f300321d;
        activity.Z6().animate().setListener(null);
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.mv.ui.uic.h4 h4Var = (com.tencent.mm.plugin.mv.ui.uic.h4) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.mv.ui.uic.h4.class);
        if (h4Var.f151169p + 1 < h4Var.R6().getItemCount()) {
            com.tencent.mm.view.recyclerview.WxRecyclerView S6 = h4Var.S6();
            int i18 = h4Var.f151169p + 1;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(S6, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvMakerFixEditUIC", "moveToNextItem", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
            S6.c1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(S6, "com/tencent/mm/plugin/mv/ui/uic/MusicMvMakerFixEditUIC", "moveToNextItem", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        }
    }
}
