package com.tencent.mm.ui.conversation.banner;

/* loaded from: classes11.dex */
public class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f207561d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f207562e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.banner.a0 f207563f;

    public q(com.tencent.mm.ui.conversation.banner.a0 a0Var, int i17, int i18) {
        this.f207563f = a0Var;
        this.f207561d = i17;
        this.f207562e = i18;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/conversation/banner/MainFrameBanner$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        c01.t9.e().b(this.f207561d, this.f207562e);
        com.tencent.mm.ui.conversation.banner.a0 a0Var = this.f207563f;
        android.content.Context context = (android.content.Context) a0Var.f402842g.get();
        a0Var.getClass();
        j45.l.j(context, "subapp", ".ui.autoadd.AutoAddFriendUI", new android.content.Intent(), null);
        yj0.a.h(this, "com/tencent/mm/ui/conversation/banner/MainFrameBanner$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
