package com.tencent.mm.ui.conversation.banner;

/* loaded from: classes11.dex */
public class w implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f207582d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f207583e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.banner.a0 f207584f;

    public w(com.tencent.mm.ui.conversation.banner.a0 a0Var, int i17, int i18) {
        this.f207584f = a0Var;
        this.f207582d = i17;
        this.f207583e = i18;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/conversation/banner/MainFrameBanner$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        c01.t9.e().b(this.f207582d, this.f207583e);
        com.tencent.mm.ui.conversation.banner.a0 a0Var = this.f207584f;
        android.content.Context context = (android.content.Context) a0Var.f402842g.get();
        a0Var.getClass();
        qk.z zVar = new qk.z();
        zVar.f364155a = 17;
        com.tencent.mm.feature.emoji.api.p6 p6Var = (com.tencent.mm.feature.emoji.api.p6) i95.n0.c(com.tencent.mm.feature.emoji.api.p6.class);
        if (p6Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MainFrameBanner", "unable to get emoticon liteapp feature service");
        } else {
            ((com.tencent.mm.feature.emoji.f4) p6Var).wi(context, zVar);
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.d(11002, 10, 1);
        g0Var.d(12065, 2);
        yj0.a.h(this, "com/tencent/mm/ui/conversation/banner/MainFrameBanner$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
