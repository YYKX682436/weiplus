package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes8.dex */
public class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.di6 f138183d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.FTSAddFriendUI f138184e;

    public t(com.tencent.mm.plugin.fts.ui.FTSAddFriendUI fTSAddFriendUI, r45.di6 di6Var) {
        this.f138184e = fTSAddFriendUI;
        this.f138183d = di6Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/FTSAddFriendUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String f17 = su4.r2.f(16);
        su4.a1 a1Var = (su4.a1) i95.n0.c(su4.a1.class);
        ((com.tencent.mm.plugin.websearch.h2) a1Var).Ri(this.f138184e.getContext(), 16, this.f138183d.f372512d, f17, true, null, false, Integer.MAX_VALUE, "", 0);
        yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
