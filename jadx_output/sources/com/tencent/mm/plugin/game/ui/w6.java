package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class w6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.LiteAppGameTabUI f141835d;

    public w6(com.tencent.mm.plugin.game.ui.LiteAppGameTabUI liteAppGameTabUI) {
        this.f141835d = liteAppGameTabUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/LiteAppGameTabUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f141835d.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/LiteAppGameTabUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
