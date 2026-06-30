package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class qg implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusTransparentActivity f174232d;

    public qg(com.tencent.mm.plugin.textstatus.ui.TextStatusTransparentActivity textStatusTransparentActivity) {
        this.f174232d = textStatusTransparentActivity;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        this.f174232d.finish();
    }
}
