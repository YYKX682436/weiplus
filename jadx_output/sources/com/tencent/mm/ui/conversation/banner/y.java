package com.tencent.mm.ui.conversation.banner;

/* loaded from: classes11.dex */
public class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f207588d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f207589e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.banner.a0 f207590f;

    public y(com.tencent.mm.ui.conversation.banner.a0 a0Var, int i17, int i18) {
        this.f207590f = a0Var;
        this.f207588d = i17;
        this.f207589e = i18;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/conversation/banner/MainFrameBanner$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        c01.t9.e().b(this.f207588d, this.f207589e);
        com.tencent.mm.ui.conversation.banner.a0 a0Var = this.f207590f;
        android.content.Context context = (android.content.Context) a0Var.f402842g.get();
        a0Var.getClass();
        if ((c01.z1.n() & 65536) == 0) {
            j45.l.h(context, "masssend", ".ui.MassSendHistoryUI");
        } else {
            j45.l.j(context, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", new android.content.Intent().putExtra("Contact_User", "masssendapp"), null);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11002, 11, 1);
        yj0.a.h(this, "com/tencent/mm/ui/conversation/banner/MainFrameBanner$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
