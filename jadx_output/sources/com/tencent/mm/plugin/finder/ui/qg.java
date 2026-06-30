package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class qg implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSettingDetailInfoUI f129740d;

    public qg(com.tencent.mm.plugin.finder.ui.FinderSettingDetailInfoUI finderSettingDetailInfoUI) {
        this.f129740d = finderSettingDetailInfoUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderSettingDetailInfoUI$updateView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.ui.FinderSettingDetailInfoUI finderSettingDetailInfoUI = this.f129740d;
        if (finderSettingDetailInfoUI.f128714i != null) {
            android.content.Intent intent = new android.content.Intent();
            ya2.b2 b2Var = finderSettingDetailInfoUI.f128715m;
            kotlin.jvm.internal.o.d(b2Var);
            intent.putStringArrayListExtra("key_url_list", kz5.c0.d(b2Var.getAvatarUrl()));
            intent.putExtra("key_preview_avatar", true);
            ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).Bj(finderSettingDetailInfoUI, intent);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderSettingDetailInfoUI$updateView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
