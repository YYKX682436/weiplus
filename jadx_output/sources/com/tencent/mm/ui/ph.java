package com.tencent.mm.ui;

/* loaded from: classes9.dex */
public class ph implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.ServiceNotifySettingsUI f209511d;

    public ph(com.tencent.mm.ui.ServiceNotifySettingsUI serviceNotifySettingsUI) {
        this.f209511d = serviceNotifySettingsUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f209511d.finish();
    }
}
