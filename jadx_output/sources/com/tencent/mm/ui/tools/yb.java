package com.tencent.mm.ui.tools;

/* loaded from: classes3.dex */
public class yb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.ShowVideoUI f210931d;

    public yb(com.tencent.mm.ui.tools.ShowVideoUI showVideoUI) {
        this.f210931d = showVideoUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tools/ShowVideoUI$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.tools.ShowVideoUI showVideoUI = this.f210931d;
        com.tencent.mm.plugin.fav.ui.widget.FavVideoView favVideoView = showVideoUI.f210226n;
        if (favVideoView != null && !showVideoUI.f210229q) {
            favVideoView.a();
        }
        yj0.a.h(this, "com/tencent/mm/ui/tools/ShowVideoUI$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
