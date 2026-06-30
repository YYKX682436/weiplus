package com.tencent.mm.wallet_core.model;

/* loaded from: classes9.dex */
public class v implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f213999d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.po5 f214000e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f214001f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.model.e0 f214002g;

    public v(android.content.Context context, r45.po5 po5Var, java.lang.Object obj, com.tencent.mm.wallet_core.model.e0 e0Var) {
        this.f213999d = context;
        this.f214000e = po5Var;
        this.f214001f = obj;
        this.f214002g = e0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JumpItemUtil", "showRemindWin() ok click!");
        com.tencent.mm.wallet_core.model.f0.c(this.f213999d, this.f214000e.f383255e, this.f214001f, this.f214002g);
    }
}
