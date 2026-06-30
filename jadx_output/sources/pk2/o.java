package pk2;

/* loaded from: classes3.dex */
public final class o extends qk2.d {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f356047i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f356048j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f356047i = "AnchorAskProductionOption";
        this.f356048j = "anchorlive.more.commentmanage.askproduction";
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f356048j;
    }

    @Override // qk2.d, qk2.f
    public boolean o() {
        zl2.r4 r4Var = zl2.r4.f473950a;
        gk2.e buContext = this.f364427a.f356074b;
        kotlin.jvm.internal.o.g(buContext, "buContext");
        return ((mm2.c1) buContext.a(mm2.c1.class)).P;
    }

    @Override // qk2.d
    public void t(pk2.o9 o9Var, com.tencent.mm.plugin.finder.view.e3 bottomSheet, java.lang.Integer num) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        kotlin.jvm.internal.o.g(bottomSheet, "bottomSheet");
        android.view.View view = bottomSheet.f131959f;
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.rtb);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorAskProductionOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/moreaction/AnchorAskProductionOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.rca);
        kotlin.jvm.internal.o.d(textView);
        com.tencent.mm.ui.MMActivity mMActivity = o9Var.f356078d;
        java.lang.String string = mMActivity.getString(com.tencent.mm.R.string.f490678m71);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.String string2 = mMActivity.getString(com.tencent.mm.R.string.f490677m70, string);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        android.text.SpannableString spannableString = new android.text.SpannableString(string2);
        int L = r26.n0.L(string2, string, 0, false, 6, null);
        if (L >= 0 && string.length() + L <= string2.length()) {
            spannableString.setSpan(new pk2.n(this, mMActivity), L, string.length() + L, 33);
        }
        textView.setText(spannableString);
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        com.tencent.mm.plugin.finder.view.LoadingSwitchBtn g17 = o9Var.g(view, com.tencent.mm.R.id.s7k, zl2.r4.f473950a.A1(o9Var.f356074b));
        kotlinx.coroutines.y0 j17 = j();
        if (j17 != null) {
            g17.g(j17, new pk2.k(o9Var), new pk2.m(o9Var, this, null));
        }
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_ANCHOR_HAS_SHOW_ASK_PRODUCTION_SETTING_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
    }
}
