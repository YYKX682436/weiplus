package com.tencent.mm.ui.mmfb.sdk;

/* loaded from: classes13.dex */
public class q implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.mmfb.sdk.r f209221d;

    public q(com.tencent.mm.ui.mmfb.sdk.r rVar) {
        this.f209221d = rVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.ui.mmfb.sdk.s sVar;
        com.tencent.mm.ui.mmfb.sdk.r rVar = this.f209221d;
        if (!rVar.f209222a || (sVar = rVar.f209223b) == null) {
            return;
        }
        sVar.f209226e.onCancel();
        rVar.f209223b.dismiss();
    }
}
