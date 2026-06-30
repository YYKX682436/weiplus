package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes3.dex */
public final class u3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.s4 f124793d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.e4 f124794e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.m3 f124795f;

    public u3(com.tencent.mm.plugin.finder.profile.widget.s4 s4Var, com.tencent.mm.plugin.finder.profile.widget.e4 e4Var, com.tencent.mm.plugin.finder.profile.widget.m3 m3Var) {
        this.f124793d = s4Var;
        this.f124794e = e4Var;
        this.f124795f = m3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.ui.widget.dialog.z2 z2Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/widget/MoreLiveNoticeListWidget$RecyclerAdapter$onBindViewHolder$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.profile.widget.s4 s4Var = this.f124793d;
        boolean z17 = s4Var.f124752f;
        com.tencent.mm.plugin.finder.profile.widget.e4 e4Var = this.f124794e;
        if (z17) {
            android.content.Context context = e4Var.f124530f;
            db5.t7.m(context, context.getString(com.tencent.mm.R.string.dzx));
            yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/widget/MoreLiveNoticeListWidget$RecyclerAdapter$onBindViewHolder$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KEY_FINDER_LIVE_NOTICE_QR_CONTACT", e4Var.f124528d);
        com.tencent.mm.plugin.finder.profile.widget.m3 m3Var = this.f124795f;
        intent.putExtra("KEY_FINDER_LIVE_NOTICE_QR_INFO", m3Var.f124624a.toByteArray());
        r45.h32 h32Var = m3Var.f124624a;
        intent.putExtra("KEY_FINDER_LIVE_NOTICE_QR_IS_VIP", h32Var.getInteger(14) == 1);
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).Hj(e4Var.f124530f, intent, 10011);
        zy2.zb zbVar = (zy2.zb) i95.n0.c(zy2.zb.class);
        ml2.y2 y2Var = ml2.y2.f328266v;
        cl0.g gVar = new cl0.g();
        gVar.o("type", 2);
        gVar.h("noticeid", h32Var.getString(4));
        ((ml2.j0) zbVar).Ij(y2Var, gVar.toString(), "", s4Var.E);
        if (s4Var.F && (z2Var = s4Var.f124757k) != null) {
            z2Var.B();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/widget/MoreLiveNoticeListWidget$RecyclerAdapter$onBindViewHolder$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
