package com.tencent.mm.ui.conversation.banner;

/* loaded from: classes5.dex */
public class i0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.banner.k0 f207523d;

    public i0(com.tencent.mm.ui.conversation.banner.k0 k0Var) {
        this.f207523d = k0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/conversation/banner/NetWarnBanner$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.conversation.banner.k0 k0Var = this.f207523d;
        com.tencent.mm.ui.conversation.banner.k0.l(k0Var, k0Var.f207537x);
        k0Var.f207537x = 1;
        if (k0Var.E == null) {
            k0Var.getClass();
            com.tencent.mm.ui.conversation.banner.NetWarnBanner$1 netWarnBanner$1 = new com.tencent.mm.ui.conversation.banner.NetWarnBanner$1(k0Var, com.tencent.mm.app.a0.f53288d);
            k0Var.E = netWarnBanner$1;
            netWarnBanner$1.alive();
        }
        if (k0Var.D == null) {
            k0Var.getClass();
            com.tencent.mm.sdk.platformtools.b4 b4Var = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.ui.conversation.banner.g0(k0Var), true);
            k0Var.D = b4Var;
            b4Var.c(1000L, 1000L);
        }
        yj0.a.h(this, "com/tencent/mm/ui/conversation/banner/NetWarnBanner$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
