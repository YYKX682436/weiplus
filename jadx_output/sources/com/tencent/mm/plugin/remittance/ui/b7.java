package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes12.dex */
public class b7 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceMsgAlertActivity f157650d;

    public b7(com.tencent.mm.plugin.remittance.ui.RemittanceMsgAlertActivity remittanceMsgAlertActivity) {
        this.f157650d = remittanceMsgAlertActivity;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        this.f157650d.finish();
    }
}
