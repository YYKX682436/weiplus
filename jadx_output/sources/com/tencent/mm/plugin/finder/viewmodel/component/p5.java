package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes3.dex */
public final class p5 implements android.view.View.OnKeyListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f135516d;

    public p5(yz5.a aVar) {
        this.f135516d = aVar;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(android.view.View view, int i17, android.view.KeyEvent keyEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(keyEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC$refreshBulletLayout$1$2", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
        if (i17 == 66 && keyEvent.getAction() == 1) {
            this.f135516d.invoke();
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC$refreshBulletLayout$1$2", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
        return false;
    }
}
