package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes8.dex */
public class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.FTSAddFriendUI f138164d;

    public r(com.tencent.mm.plugin.fts.ui.FTSAddFriendUI fTSAddFriendUI) {
        this.f138164d = fTSAddFriendUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/FTSAddFriendUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.fts.ui.c3.f138030a.a(view, this.f138164d.Q);
        yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
