package com.tencent.mm.wallet_core.model;

/* loaded from: classes9.dex */
public class w0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f214010d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.model.y0 f214011e;

    public w0(com.tencent.mm.wallet_core.model.y0 y0Var, com.tencent.mm.ui.MMActivity mMActivity) {
        this.f214011e = y0Var;
        this.f214010d = mMActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        if (this.f214011e.L()) {
            this.f214010d.finish();
        }
    }
}
