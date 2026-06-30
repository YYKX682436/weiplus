package com.tencent.mm.plugin.game.ui;

/* loaded from: classes3.dex */
public class h6 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.GameSearchUI f141413d;

    public h6(com.tencent.mm.plugin.game.ui.GameSearchUI gameSearchUI) {
        this.f141413d = gameSearchUI;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameSearchUI$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.tencent.mm.plugin.game.ui.GameSearchUI gameSearchUI = this.f141413d;
        gameSearchUI.f140972i.clearFocus();
        gameSearchUI.hideVKB();
        yj0.a.i(false, this, "com/tencent/mm/plugin/game/ui/GameSearchUI$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
