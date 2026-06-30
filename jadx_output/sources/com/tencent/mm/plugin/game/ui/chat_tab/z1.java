package com.tencent.mm.plugin.game.ui.chat_tab;

/* loaded from: classes8.dex */
public class z1 implements android.view.ViewGroup.OnHierarchyChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f141349d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.chat_tab.MMGameWebTabUI f141350e;

    public z1(com.tencent.mm.plugin.game.ui.chat_tab.MMGameWebTabUI mMGameWebTabUI, android.view.ViewGroup viewGroup) {
        this.f141350e = mMGameWebTabUI;
        this.f141349d = viewGroup;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewAdded(android.view.View view, android.view.View view2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(view2);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/chat_tab/MMGameWebTabUI$8", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewAdded", "(Landroid/view/View;Landroid/view/View;)V", this, array);
        if ((view2.getTag() instanceof java.lang.String) && "game_float_view_tag".equalsIgnoreCase((java.lang.String) view2.getTag())) {
            android.view.ViewGroup viewGroup = this.f141349d;
            int indexOfChild = viewGroup.indexOfChild(view2);
            com.tencent.mars.xlog.Log.i("MicroMsg.MMGameWebTabUI", "float page index2:%d", java.lang.Integer.valueOf(indexOfChild));
            if (indexOfChild >= 0) {
                com.tencent.mm.plugin.game.ui.chat_tab.MMGameWebTabUI mMGameWebTabUI = this.f141350e;
                viewGroup.removeView(mMGameWebTabUI.f141216h);
                viewGroup.addView(mMGameWebTabUI.f141216h, indexOfChild - 1);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/chat_tab/MMGameWebTabUI$8", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewAdded", "(Landroid/view/View;Landroid/view/View;)V");
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewRemoved(android.view.View view, android.view.View view2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(view2);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/chat_tab/MMGameWebTabUI$8", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewRemoved", "(Landroid/view/View;Landroid/view/View;)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/chat_tab/MMGameWebTabUI$8", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewRemoved", "(Landroid/view/View;Landroid/view/View;)V");
    }
}
