package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class n3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.q3 f121827d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f121828e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f121829f;

    public n3(com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.q3 q3Var, in5.s0 s0Var, java.lang.String str) {
        this.f121827d = q3Var;
        this.f121828e = s0Var;
        this.f121829f = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/NoticeSmallConvert$onBindViewHolder$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f121828e.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.lang.String name = this.f121829f;
        kotlin.jvm.internal.o.f(name, "$name");
        this.f121827d.getClass();
        android.content.Intent intent = new android.content.Intent();
        ((wo2.k) ((ws5.g) i95.n0.c(ws5.g.class))).getClass();
        intent.putExtra("key_click_tab_context_id", rq2.x.f398919f);
        intent.putExtra("finder_username", name);
        intent.putExtra("key_from_comment_scene", 0);
        zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
        ((wo2.k) ((ws5.g) i95.n0.c(ws5.g.class))).getClass();
        ((c61.l7) b6Var).Cj(rq2.x.f398915b, intent);
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).mk(context, intent);
        com.tencent.mars.xlog.Log.i("FinderLiveSquareTabLifeCycleReport", "enterProfile");
        ip2.a.f293615d = "page_profile";
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/NoticeSmallConvert$onBindViewHolder$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
