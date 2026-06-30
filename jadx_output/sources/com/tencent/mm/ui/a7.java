package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class a7 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f197124d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.d7 f197125e;

    public a7(com.tencent.mm.ui.d7 d7Var, java.lang.String str) {
        this.f197125e = d7Var;
        this.f197124d = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.ui.d7 d7Var = this.f197125e;
        intent.setClass(d7Var.f208330d.f209450a, com.tencent.mm.plugin.account.bind.ui.BindMobileUI.class);
        intent.putExtra("kstyle_bind_wording", new com.tencent.mm.modelsimple.BindWordingContent(this.f197124d, ""));
        com.tencent.mm.ui.MMWizardActivity.X6(d7Var.f208330d.f209450a, intent);
        dialogInterface.dismiss();
    }
}
