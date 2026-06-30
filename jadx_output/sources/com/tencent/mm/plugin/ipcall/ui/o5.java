package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes.dex */
public class o5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f142974d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallUserProfileUI f142975e;

    public o5(com.tencent.mm.plugin.ipcall.ui.IPCallUserProfileUI iPCallUserProfileUI, java.lang.String str) {
        this.f142975e = iPCallUserProfileUI;
        this.f142974d = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/IPCallUserProfileUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.ipcall.ui.IPCallUserProfileUI.T6(this.f142975e, this.f142974d);
        yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallUserProfileUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
