package com.tencent.mm.wallet_core.model;

/* loaded from: classes9.dex */
public class z implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f214036d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.oo5 f214037e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f214038f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.model.e0 f214039g;

    public z(android.content.Context context, r45.oo5 oo5Var, java.lang.Object obj, com.tencent.mm.wallet_core.model.e0 e0Var) {
        this.f214036d = context;
        this.f214037e = oo5Var;
        this.f214038f = obj;
        this.f214039g = e0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JumpItemUtil", "showRemindWin3() right_button click!");
        com.tencent.mm.wallet_core.model.f0.c(this.f214036d, this.f214037e.f382400f, this.f214038f, this.f214039g);
    }
}
