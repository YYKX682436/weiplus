package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes3.dex */
public class b0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f152585d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f152586e;

    public b0(android.app.Activity activity, java.lang.String str) {
        this.f152585d = activity;
        this.f152586e = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.wallet_core.ui.r1.V(this.f152585d, this.f152586e, true);
        com.tencent.mm.wallet_core.ui.r1.q0(3, 1);
        dialogInterface.dismiss();
    }
}
