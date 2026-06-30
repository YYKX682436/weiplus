package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class q2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.v3 f113951d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f113952e;

    public q2(com.tencent.mm.plugin.finder.live.plugin.v3 v3Var, r45.h32 h32Var) {
        this.f113951d = v3Var;
        this.f113952e = h32Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$prepareNoticePanel$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.assist.a4.f102002a.b("", "", "notice_show", "");
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.finder.live.plugin.v3 v3Var = this.f113951d;
        android.content.Context context = v3Var.f113324f.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        intent.putExtra("KEY_FINDER_LIVE_NOTICE_QR_CONTACT", xy2.c.e(context));
        intent.putExtra("KEY_FINDER_LIVE_NOTICE_QR_INFO", this.f113952e.toByteArray());
        intent.putExtra("KEY_FINDER_LIVE_NOTICE_QR_IS_VISITOR", false);
        i95.m c17 = i95.n0.c(c61.ub.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        android.content.Context context2 = v3Var.f113324f.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        c61.ub.o6((c61.ub) c17, context2, intent, 0, 4, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$prepareNoticePanel$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
