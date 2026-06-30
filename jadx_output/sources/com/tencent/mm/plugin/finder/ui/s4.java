package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class s4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderCropAvatarUI f129792d;

    public s4(com.tencent.mm.plugin.finder.ui.FinderCropAvatarUI finderCropAvatarUI) {
        this.f129792d = finderCropAvatarUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderCropAvatarUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.gallery.picker.view.WxMediaCropLayout wxMediaCropLayout = this.f129792d.f128558w;
        if (wxMediaCropLayout == null) {
            kotlin.jvm.internal.o.o("roundCropLayout");
            throw null;
        }
        wxMediaCropLayout.i();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderCropAvatarUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
