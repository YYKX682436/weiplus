package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class lb extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw5.h70 f123947d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f123948e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.ob f123949f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f123950g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f123951h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ bw5.o50 f123952i;

    public lb(bw5.h70 h70Var, int i17, com.tencent.mm.plugin.finder.profile.uic.ob obVar, android.widget.TextView textView, int i18, bw5.o50 o50Var) {
        this.f123947d = h70Var;
        this.f123948e = i17;
        this.f123949f = obVar;
        this.f123950g = textView;
        this.f123951h = i18;
        this.f123952i = o50Var;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$updateRadioRecommendDescTextView$clickableSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(widget, "widget");
        bw5.h70 showInfo = this.f123947d;
        java.util.LinkedList linkedList = showInfo.f28107e;
        kotlin.jvm.internal.o.f(linkedList, "getCategoryItems(...)");
        int i17 = this.f123948e;
        bw5.o50 o50Var = (bw5.o50) kz5.n0.a0(linkedList, i17);
        com.tencent.mm.plugin.finder.profile.uic.ob obVar = this.f123949f;
        android.app.Activity context = obVar.getContext();
        obVar.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        if (o50Var == null) {
            com.tencent.mars.xlog.Log.e("Finder.FinderProfileHeaderUIC", "handleClickRadioRecommendCategoryItem categoryItem null");
        } else {
            boolean[] zArr = o50Var.L1;
            if ((zArr[45] ? o50Var.Z : new bw5.p50()).f31470d == 2) {
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                ya2.e1 e1Var = ya2.e1.f460472a;
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("key_enter_profile_tab", 6);
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(37, 42, 1200001, intent);
                intent.putExtra("finder_username", (zArr[25] ? o50Var.E : new bw5.ob0()).b().getFinderUsername());
                intent.putExtra("key_enter_profile_type", 42);
                intent.putExtra("KEY_DO_NOT_CHECK_ENTER_BIZ_PROFILE", true);
                intent.putExtra("key_from_comment_scene", 1200001);
                e1Var.w(context, intent);
            } else {
                qk.f9.c(((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj(), context, o50Var, bw5.ar0.TingScene_FinderProfilePage, new il4.e(null, 0, 1616, false, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, null, false, 33554427, null), null, 16, null);
            }
        }
        obVar.getClass();
        android.widget.TextView radioRecommendDesc = this.f123950g;
        kotlin.jvm.internal.o.g(radioRecommendDesc, "radioRecommendDesc");
        bw5.o50 categoryItem = this.f123952i;
        kotlin.jvm.internal.o.g(categoryItem, "categoryItem");
        kotlin.jvm.internal.o.g(showInfo, "showInfo");
        java.lang.String k76 = obVar.k7(showInfo);
        java.util.LinkedList linkedList2 = showInfo.f28107e;
        kotlin.jvm.internal.o.f(linkedList2, "getCategoryItems(...)");
        bw5.o50 o50Var2 = (bw5.o50) kz5.n0.a0(linkedList2, i17);
        java.lang.String name = o50Var2 != null ? o50Var2.getName() : null;
        if (name == null) {
            name = "";
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("view_clk", null, kz5.c1.k(new jz5.l("view_id", "tyt_radio_v3_rec_bar"), new jz5.l("currscene", java.lang.Integer.valueOf(this.f123951h)), new jz5.l("actioncategoryid", categoryItem.c()), new jz5.l("actioncategorytype", java.lang.Integer.valueOf(categoryItem.f30964n)), new jz5.l("display_usernamelist", k76), new jz5.l("clk_username", name)), 5, false);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$updateRadioRecommendDescTextView$clickableSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        kotlin.jvm.internal.o.g(ds6, "ds");
        super.updateDrawState(ds6);
        ds6.setUnderlineText(false);
    }
}
