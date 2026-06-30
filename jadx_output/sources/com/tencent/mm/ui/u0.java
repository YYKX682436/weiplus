package com.tencent.mm.ui;

/* loaded from: classes9.dex */
public class u0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.AppBrandNotifySettingsUI f211061d;

    public u0(com.tencent.mm.ui.AppBrandNotifySettingsUI appBrandNotifySettingsUI) {
        this.f211061d = appBrandNotifySettingsUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f211061d.finish();
    }
}
