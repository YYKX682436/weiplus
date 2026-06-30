package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes3.dex */
public final class t3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.s4 f124782d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.m3 f124783e;

    public t3(com.tencent.mm.plugin.finder.profile.widget.s4 s4Var, com.tencent.mm.plugin.finder.profile.widget.m3 m3Var) {
        this.f124782d = s4Var;
        this.f124783e = m3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/widget/MoreLiveNoticeListWidget$RecyclerAdapter$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.profile.widget.s4 s4Var = this.f124782d;
        if (s4Var.f124752f) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/widget/MoreLiveNoticeListWidget$RecyclerAdapter$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        s4Var.f124769w.d();
        android.content.Context context = s4Var.f124748b;
        com.tencent.mm.ui.widget.dialog.u3 f17 = com.tencent.mm.ui.widget.dialog.u3.f(context, context.getString(com.tencent.mm.R.string.f9y), false, 2, null);
        c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
        java.lang.String userName = xy2.c.e(context);
        com.tencent.mm.plugin.finder.profile.widget.m3 m3Var = this.f124783e;
        r45.h32 noticeInfo = m3Var.f124624a;
        zy2.ra Sj = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Sj(context);
        r45.qt2 V6 = Sj != null ? ((com.tencent.mm.plugin.finder.viewmodel.component.ny) Sj).V6() : null;
        ((b92.d1) zbVar).getClass();
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(noticeInfo, "noticeInfo");
        pq5.g l17 = new db2.a0(userName, noticeInfo, 1, V6).l();
        l17.f((com.tencent.mm.ui.MMActivity) context);
        l17.K(new com.tencent.mm.plugin.finder.profile.widget.g4(f17, s4Var, m3Var));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/widget/MoreLiveNoticeListWidget$RecyclerAdapter$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
