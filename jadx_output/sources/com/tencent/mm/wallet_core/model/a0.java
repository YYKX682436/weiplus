package com.tencent.mm.wallet_core.model;

/* loaded from: classes9.dex */
public class a0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f213849d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.oo5 f213850e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f213851f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.model.e0 f213852g;

    public a0(android.content.Context context, r45.oo5 oo5Var, java.lang.Object obj, com.tencent.mm.wallet_core.model.e0 e0Var) {
        this.f213849d = context;
        this.f213850e = oo5Var;
        this.f213851f = obj;
        this.f213852g = e0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JumpItemUtil", "showRemindWin3() left_button click!");
        com.tencent.mm.wallet_core.model.f0.c(this.f213849d, this.f213850e.f382399e, this.f213851f, this.f213852g);
    }
}
