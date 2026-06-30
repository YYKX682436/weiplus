package com.tencent.mm.wallet_core.model;

/* loaded from: classes9.dex */
public class x implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f214014d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.e30 f214015e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f214016f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.model.e0 f214017g;

    public x(android.content.Context context, r45.e30 e30Var, java.lang.Object obj, com.tencent.mm.wallet_core.model.e0 e0Var) {
        this.f214014d = context;
        this.f214015e = e30Var;
        this.f214016f = obj;
        this.f214017g = e0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JumpItemUtil", "showCheckWin() right_button click!");
        com.tencent.mm.wallet_core.model.f0.c(this.f214014d, this.f214015e.f372967h, this.f214016f, this.f214017g);
    }
}
