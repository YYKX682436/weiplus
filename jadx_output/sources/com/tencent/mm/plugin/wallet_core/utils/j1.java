package com.tencent.mm.plugin.wallet_core.utils;

/* loaded from: classes8.dex */
public class j1 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f180910d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(android.app.Dialog dialog) {
        super(false);
        this.f180910d = dialog;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        android.app.Dialog dialog = this.f180910d;
        if (dialog.isShowing()) {
            dialog.dismiss();
        }
    }
}
