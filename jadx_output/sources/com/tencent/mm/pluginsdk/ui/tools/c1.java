package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes10.dex */
public final class c1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.DropdownListView f191536d;

    public c1(com.tencent.mm.pluginsdk.ui.tools.DropdownListView dropdownListView) {
        this.f191536d = dropdownListView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/tools/DropdownListView$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.pluginsdk.ui.tools.DropdownListView dropdownListView = this.f191536d;
        boolean z18 = dropdownListView.f191359g;
        if (!z18 || (z17 = dropdownListView.f191360h)) {
            yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/DropdownListView$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (z18 != (!z18) && !z17) {
            if (z18) {
                dropdownListView.f191360h = true;
                android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(dropdownListView.getContext(), com.tencent.mm.R.anim.f477858dg);
                loadAnimation.setAnimationListener(new com.tencent.mm.pluginsdk.ui.tools.e1(dropdownListView));
                android.widget.ListView listView = dropdownListView.f191357e;
                kotlin.jvm.internal.o.d(listView);
                listView.startAnimation(loadAnimation);
            } else {
                dropdownListView.f191360h = true;
                android.widget.FrameLayout frameLayout = dropdownListView.f191356d;
                kotlin.jvm.internal.o.d(frameLayout);
                frameLayout.setVisibility(0);
                android.view.animation.Animation loadAnimation2 = android.view.animation.AnimationUtils.loadAnimation(dropdownListView.getContext(), com.tencent.mm.R.anim.f477854dc);
                loadAnimation2.setAnimationListener(new com.tencent.mm.pluginsdk.ui.tools.d1(dropdownListView));
                android.widget.ListView listView2 = dropdownListView.f191357e;
                kotlin.jvm.internal.o.d(listView2);
                listView2.startAnimation(loadAnimation2);
            }
        }
        dropdownListView.getMOnFolderAlbumDialogDismiss();
        kotlin.jvm.internal.o.d(null);
        throw null;
    }
}
