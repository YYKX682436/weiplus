package com.tencent.mm.wallet_core.model;

/* loaded from: classes9.dex */
public class v0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f214003d;

    public v0(com.tencent.mm.wallet_core.model.y0 y0Var, com.tencent.mm.ui.MMActivity mMActivity) {
        this.f214003d = mMActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f214003d.finish();
    }
}
