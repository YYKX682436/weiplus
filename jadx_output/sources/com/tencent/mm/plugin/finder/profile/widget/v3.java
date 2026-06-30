package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes3.dex */
public final class v3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.s4 f124801d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.e4 f124802e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.m3 f124803f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.n3 f124804g;

    public v3(com.tencent.mm.plugin.finder.profile.widget.s4 s4Var, com.tencent.mm.plugin.finder.profile.widget.e4 e4Var, com.tencent.mm.plugin.finder.profile.widget.m3 m3Var, com.tencent.mm.plugin.finder.profile.widget.n3 n3Var) {
        this.f124801d = s4Var;
        this.f124802e = e4Var;
        this.f124803f = m3Var;
        this.f124804g = n3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/widget/MoreLiveNoticeListWidget$RecyclerAdapter$onBindViewHolder$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.profile.widget.s4 s4Var = this.f124801d;
        boolean z17 = s4Var.f124752f;
        com.tencent.mm.plugin.finder.profile.widget.m3 m3Var = this.f124803f;
        com.tencent.mm.plugin.finder.profile.widget.e4 e4Var = this.f124802e;
        if (z17) {
            com.tencent.mm.ui.widget.dialog.z2 z2Var = s4Var.f124757k;
            if (z2Var != null) {
                z2Var.B();
            }
            android.content.Context context = e4Var.f124530f;
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((com.tencent.mm.plugin.finder.member.preview.c0) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.member.preview.c0.class)).X6(e4Var.f124528d, m3Var.f124624a, this.f124804g.f124638p);
            yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/widget/MoreLiveNoticeListWidget$RecyclerAdapter$onBindViewHolder$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KEY_FINDER_LIVE_NOTICE_QR_CONTACT", e4Var.f124528d);
        intent.putExtra("KEY_FINDER_LIVE_NOTICE_QR_INFO", m3Var.f124624a.toByteArray());
        intent.putExtra("KEY_FINDER_LIVE_NOTICE_QR_IS_VISITOR", true);
        intent.putExtra("KEY_FINDER_LIVE_NOTICE_QR_IS_VIP", m3Var.f124624a.getInteger(14) == 1);
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).Hj(e4Var.f124530f, intent, 10011);
        zy2.zb zbVar = (zy2.zb) i95.n0.c(zy2.zb.class);
        ml2.y2 y2Var = ml2.y2.f328266v;
        cl0.g gVar = new cl0.g();
        gVar.o("type", 2);
        gVar.h("noticeid", m3Var.f124624a.getString(4));
        ((ml2.j0) zbVar).Ij(y2Var, gVar.toString(), "", s4Var.E);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/widget/MoreLiveNoticeListWidget$RecyclerAdapter$onBindViewHolder$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
