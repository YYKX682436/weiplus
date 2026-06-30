package com.tencent.mm.wallet_core.model;

/* loaded from: classes9.dex */
public class y implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f214021d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.e30 f214022e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f214023f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.model.e0 f214024g;

    public y(android.content.Context context, r45.e30 e30Var, java.lang.Object obj, com.tencent.mm.wallet_core.model.e0 e0Var) {
        this.f214021d = context;
        this.f214022e = e30Var;
        this.f214023f = obj;
        this.f214024g = e0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JumpItemUtil", "showCheckWin() left_button click!");
        com.tencent.mm.wallet_core.model.f0.c(this.f214021d, this.f214022e.f372966g, this.f214023f, this.f214024g);
    }
}
