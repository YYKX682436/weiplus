package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes2.dex */
public final class sc implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f116682d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f116683e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f116684f;

    public sc(java.lang.String str, java.lang.Object obj, com.tencent.mm.plugin.finder.storage.FinderItem finderItem) {
        this.f116682d = str;
        this.f116683e = obj;
        this.f116684f = finderItem;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/SimpleLivingCardView$bindLive$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.assist.a4 a4Var = com.tencent.mm.plugin.finder.assist.a4.f102002a;
        ml2.q1 q1Var = ml2.q1.f327812e;
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String b17 = b52.b.b();
        ml2.t1 t1Var = ml2.t1.f327942e;
        a4Var.b("temp_30", b17, "square_card_friend_like_word", this.f116682d);
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        ((c61.p2) ybVar).Aj(this.f116683e, this.f116684f);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/SimpleLivingCardView$bindLive$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
