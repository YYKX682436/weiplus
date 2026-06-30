package com.tencent.mm.plugin.game.ui;

/* loaded from: classes5.dex */
public class i3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.GameDropdownView f141420d;

    public i3(com.tencent.mm.plugin.game.ui.GameDropdownView gameDropdownView) {
        this.f141420d = gameDropdownView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameDropdownView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.game.ui.GameDropdownView gameDropdownView = this.f141420d;
        if (gameDropdownView.f140768e.getContentView() == null || !(gameDropdownView.f140768e.getContentView() instanceof android.view.ViewGroup)) {
            gameDropdownView.f140768e.dismiss();
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameDropdownView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            gameDropdownView.setCurrentSelection(((android.view.ViewGroup) gameDropdownView.f140768e.getContentView()).indexOfChild(view));
            gameDropdownView.f140768e.dismiss();
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameDropdownView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
