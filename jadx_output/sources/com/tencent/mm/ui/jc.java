package com.tencent.mm.ui;

/* loaded from: classes5.dex */
public class jc implements android.content.DialogInterface.OnDismissListener {
    public jc(com.tencent.mm.ui.kc kcVar) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1429L, 36L, 1L, false);
        com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).putBoolean("update_has_new_package", false);
    }
}
