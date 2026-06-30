package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public final class m0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.RealnameVerifySelectGuardianUI f179416d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.gq f179417e;

    public m0(com.tencent.mm.plugin.wallet_core.id_verify.RealnameVerifySelectGuardianUI realnameVerifySelectGuardianUI, r45.gq gqVar) {
        this.f179416d = realnameVerifySelectGuardianUI;
        this.f179417e = gqVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        com.tencent.mm.plugin.wallet_core.id_verify.RealnameVerifySelectGuardianUI.w7(this.f179416d, this.f179417e.f375463e);
    }
}
