package com.tencent.mm.ui.conversation.banner;

/* loaded from: classes11.dex */
public class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f207573d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f207574e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.banner.a0 f207575f;

    public t(com.tencent.mm.ui.conversation.banner.a0 a0Var, int i17, int i18) {
        this.f207575f = a0Var;
        this.f207573d = i17;
        this.f207574e = i18;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/conversation/banner/MainFrameBanner$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        c01.t9.e().b(this.f207573d, this.f207574e);
        com.tencent.mm.ui.conversation.banner.a0 a0Var = this.f207575f;
        android.content.Context context = (android.content.Context) a0Var.f402842g.get();
        a0Var.getClass();
        if (context != null) {
            if (c01.d9.b().E()) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("intent_set_avatar", true);
                intent.putExtra("KEnterFromBanner", true);
                j45.l.j(context, "setting", ".ui.setting.SettingsPersonalInfoUI", intent, null);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11002, 4, 1);
            } else {
                db5.t7.k(context, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/conversation/banner/MainFrameBanner$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
