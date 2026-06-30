package com.tencent.mm.ui.conversation.banner;

/* loaded from: classes11.dex */
public class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f207585d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f207586e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.banner.a0 f207587f;

    public x(com.tencent.mm.ui.conversation.banner.a0 a0Var, int i17, int i18) {
        this.f207587f = a0Var;
        this.f207585d = i17;
        this.f207586e = i18;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/conversation/banner/MainFrameBanner$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        c01.t9.e().b(this.f207585d, this.f207586e);
        com.tencent.mm.ui.conversation.banner.a0 a0Var = this.f207587f;
        android.content.Context context = (android.content.Context) a0Var.f402842g.get();
        a0Var.getClass();
        j45.l.h(context, "game", ".ui.GameCenterUI");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11002, 9, 1);
        yj0.a.h(this, "com/tencent/mm/ui/conversation/banner/MainFrameBanner$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
