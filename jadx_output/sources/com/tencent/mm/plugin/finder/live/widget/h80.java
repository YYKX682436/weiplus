package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class h80 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.k80 f118553d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.px1 f118554e;

    public h80(com.tencent.mm.plugin.finder.live.widget.k80 k80Var, r45.px1 px1Var) {
        this.f118553d = k80Var;
        this.f118554e = px1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/SingerListAdapter$SingerViewHolder$onBind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        ml2.b4 b4Var = ml2.b4.O2;
        cl0.g gVar = new cl0.g();
        gVar.h("type", "2");
        r45.px1 px1Var = this.f118554e;
        r45.xn1 xn1Var = px1Var.f383452d;
        if (xn1Var == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null || (str = finderContact.getUsername()) == null) {
            str = "";
        }
        gVar.h("rank_username", str);
        ml2.r0.hj(r0Var, b4Var, gVar.toString(), 0L, null, null, null, null, null, 252, null);
        yz5.l lVar = this.f118553d.f118825g;
        if (lVar != null) {
            r45.xn1 live_contact = px1Var.f383452d;
            kotlin.jvm.internal.o.f(live_contact, "live_contact");
            lVar.invoke(live_contact);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/SingerListAdapter$SingerViewHolder$onBind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
