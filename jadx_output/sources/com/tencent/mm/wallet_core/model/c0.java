package com.tencent.mm.wallet_core.model;

/* loaded from: classes9.dex */
public class c0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f213869d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.m7 f213870e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f213871f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.model.e0 f213872g;

    public c0(android.content.Context context, r45.m7 m7Var, double d17, com.tencent.mm.wallet_core.model.e0 e0Var) {
        this.f213869d = context;
        this.f213870e = m7Var;
        this.f213871f = d17;
        this.f213872g = e0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JumpItemUtil", "showAmountRemindWin() right_button click!");
        com.tencent.mm.wallet_core.model.f0.c(this.f213869d, this.f213870e.f380177f, java.lang.Double.valueOf(this.f213871f), this.f213872g);
    }
}
