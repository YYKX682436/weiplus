package com.tencent.mm.ui.conversation.banner;

/* loaded from: classes11.dex */
public class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f207570d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f207571e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.banner.a0 f207572f;

    public s(com.tencent.mm.ui.conversation.banner.a0 a0Var, int i17, int i18) {
        this.f207572f = a0Var;
        this.f207570d = i17;
        this.f207571e = i18;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/conversation/banner/MainFrameBanner$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        c01.t9.e().b(this.f207570d, this.f207571e);
        android.content.Context context = (android.content.Context) this.f207572f.f402842g.get();
        if (context != null) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11002, 5, 1);
            boolean n17 = com.tencent.mm.sdk.platformtools.t8.n1((java.lang.Boolean) c01.d9.b().p().l(4103, null));
            new android.content.Intent().putExtra("KEnterFromBanner", true);
            if (n17) {
                c01.fb b17 = c01.fb.b();
                if (b17 == null) {
                    j45.l.h(context, "nearby", ".ui.NearbyPersonalInfoUI");
                } else {
                    java.lang.String d17 = b17.d();
                    if (d17 == null) {
                        d17 = "";
                    }
                    int j17 = com.tencent.mm.sdk.platformtools.t8.j1(java.lang.Integer.valueOf(b17.f37188b), 0);
                    if (com.tencent.mm.sdk.platformtools.t8.K0(d17) || j17 == 0) {
                        j45.l.h(context, "nearby", ".ui.NearbyPersonalInfoUI");
                    } else {
                        com.tencent.mm.ui.LauncherUI launcherUI = com.tencent.mm.ui.LauncherUI.getInstance();
                        if (launcherUI != null) {
                            launcherUI.f7().o("tab_find_friend");
                        }
                        m25.a.a(context, new android.content.Intent());
                    }
                }
            } else {
                j45.l.h(context, "nearby", ".ui.NearbyFriendsIntroUI");
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/conversation/banner/MainFrameBanner$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
