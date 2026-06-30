package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class w6 implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.x6 f161689d;

    public w6(com.tencent.mm.plugin.setting.ui.setting.x6 x6Var) {
        this.f161689d = x6Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        java.lang.String c17 = c01.z1.c();
        if (com.tencent.mm.sdk.platformtools.t8.K0(c17)) {
            c17 = c01.z1.r();
        }
        com.tencent.mm.plugin.setting.ui.setting.x6 x6Var = this.f161689d;
        x6Var.f161729d.f160317e.setText(x6Var.f161729d.getString(com.tencent.mm.R.string.f490420uh) + c17);
    }
}
