package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class ol implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.sl f129609d;

    public ol(com.tencent.mm.plugin.finder.ui.sl slVar) {
        this.f129609d = slVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/MaasAlbumTemplateHelper$refreshMaasPermissionTips$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.ui.sl.b(this.f129609d);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/MaasAlbumTemplateHelper$refreshMaasPermissionTips$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
