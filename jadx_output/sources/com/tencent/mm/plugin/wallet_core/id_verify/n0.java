package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public final class n0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.RealnameVerifySelectGuardianUI f179443d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.gq f179444e;

    public n0(com.tencent.mm.plugin.wallet_core.id_verify.RealnameVerifySelectGuardianUI realnameVerifySelectGuardianUI, r45.gq gqVar) {
        this.f179443d = realnameVerifySelectGuardianUI;
        this.f179444e = gqVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        com.tencent.mm.plugin.wallet_core.id_verify.RealnameVerifySelectGuardianUI.w7(this.f179443d, this.f179444e.f375463e);
    }
}
