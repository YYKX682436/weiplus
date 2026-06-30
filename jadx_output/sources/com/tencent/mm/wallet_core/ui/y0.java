package com.tencent.mm.wallet_core.ui;

/* loaded from: classes3.dex */
public class y0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f214270d;

    public y0(android.content.Context context) {
        this.f214270d = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.Context context = this.f214270d;
        if (context instanceof android.app.Activity) {
            ((android.app.Activity) context).finish();
        }
    }
}
