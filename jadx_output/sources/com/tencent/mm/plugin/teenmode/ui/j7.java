package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public class j7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.TeenModeVerifyPwdUI f173043d;

    public j7(com.tencent.mm.plugin.teenmode.ui.TeenModeVerifyPwdUI teenModeVerifyPwdUI) {
        this.f173043d = teenModeVerifyPwdUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/teenmode/ui/TeenModeVerifyPwdUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.teenmode.ui.TeenModeVerifyPwdUI.f172911p;
        com.tencent.mm.plugin.teenmode.ui.TeenModeVerifyPwdUI teenModeVerifyPwdUI = this.f173043d;
        teenModeVerifyPwdUI.Z6("");
        teenModeVerifyPwdUI.hideVKB();
        gm0.j1.d().g(new com.tencent.mm.modelsimple.l1(1, teenModeVerifyPwdUI.f172915h.getText().toString(), "", "", "", false, teenModeVerifyPwdUI.f172919o));
        teenModeVerifyPwdUI.f172918n = db5.e1.Q(teenModeVerifyPwdUI, teenModeVerifyPwdUI.getString(com.tencent.mm.R.string.f490573yv), teenModeVerifyPwdUI.getString(com.tencent.mm.R.string.f490552yb), true, false, null);
        yj0.a.h(this, "com/tencent/mm/plugin/teenmode/ui/TeenModeVerifyPwdUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
