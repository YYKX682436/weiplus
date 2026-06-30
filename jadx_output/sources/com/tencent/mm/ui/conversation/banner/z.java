package com.tencent.mm.ui.conversation.banner;

/* loaded from: classes11.dex */
public class z implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f207591d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f207592e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.banner.a0 f207593f;

    public z(com.tencent.mm.ui.conversation.banner.a0 a0Var, int i17, int i18) {
        this.f207593f = a0Var;
        this.f207591d = i17;
        this.f207592e = i18;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/conversation/banner/MainFrameBanner$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        c01.t9.e().b(this.f207591d, this.f207592e);
        com.tencent.mm.ui.conversation.banner.a0 a0Var = this.f207593f;
        android.content.Context context = (android.content.Context) a0Var.f402842g.get();
        a0Var.getClass();
        java.lang.String str = (java.lang.String) c01.d9.b().p().l(68377, null);
        c01.d9.b().p().w(68377, "");
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        if (p94.w0.a() != null && ((com.tencent.mm.plugin.sns.storage.w1) p94.w0.a()).f() > 0) {
            K0 = false;
        }
        fe0.j4 j4Var = new fe0.j4();
        j4Var.f261410g = K0;
        ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).Ui(context, null, 6, j4Var);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11002, 8, 1);
        yj0.a.h(this, "com/tencent/mm/ui/conversation/banner/MainFrameBanner$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
