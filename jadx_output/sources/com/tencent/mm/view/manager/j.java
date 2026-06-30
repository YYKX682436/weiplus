package com.tencent.mm.view.manager;

/* loaded from: classes8.dex */
public class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.manager.d f213663d;

    public j(com.tencent.mm.view.manager.d dVar) {
        this.f213663d = dVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/view/manager/SmileyPanelManager$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.pluginsdk.ui.chat.v9 v9Var = this.f213663d.C;
        if (v9Var != null) {
            v9Var.c();
        }
        yj0.a.h(this, "com/tencent/mm/view/manager/SmileyPanelManager$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
