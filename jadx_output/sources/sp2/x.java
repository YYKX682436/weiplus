package sp2;

/* loaded from: classes2.dex */
public final class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sp2.b0 f411262d;

    public x(sp2.b0 b0Var) {
        this.f411262d = b0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentUICMoreIcon$onViewCreated$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("jumpToLivePersonalPage preloadPrepareStamp: ");
        sp2.b0 b0Var = this.f411262d;
        sb6.append(b0Var.f410981g);
        com.tencent.mars.xlog.Log.i("LiveEntranceFragmentUICMoreIcon", sb6.toString());
        b0Var.O6(ll2.a.f319125f);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().N("LiveMentionEntrance");
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().N("LivePersonalCenter");
        uc.n nVar = (uc.n) i95.n0.c(uc.n.class);
        android.app.Activity context = b0Var.getContext();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KEY_ENTER_LIVE_SCENE_STAMP", b0Var.f410981g);
        ((v40.s) nVar).getClass();
        kotlin.jvm.internal.o.g(context, "context");
        if (((com.tencent.mm.plugin.finder.service.l3) ((zy2.c9) i95.n0.c(zy2.c9.class))).Zi(context) || ((com.tencent.mm.plugin.finder.service.l3) ((zy2.c9) i95.n0.c(zy2.c9.class))).Di(context)) {
            intent.setClass(context, com.tencent.mm.plugin.finder.feed.ui.FinderLivePersonalCenterWithAffinityUI.class);
        } else {
            intent.setClass(context, com.tencent.mm.plugin.finder.feed.ui.FinderLivePersonalCenterUI.class);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/finder/nearby/FinderNearByActivityRouter", "enterLivePersonalCenterPageUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/nearby/FinderNearByActivityRouter", "enterLivePersonalCenterPageUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        b0Var.S6("main_page_person_button", false);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentUICMoreIcon$onViewCreated$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
