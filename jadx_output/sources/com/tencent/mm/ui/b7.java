package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class b7 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f197217d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.d7 f197218e;

    public b7(com.tencent.mm.ui.d7 d7Var, java.lang.String str) {
        this.f197218e = d7Var;
        this.f197217d = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.ui.d7 d7Var = this.f197218e;
        intent.setClass(d7Var.f208330d.f209450a, com.tencent.mm.plugin.account.bind.ui.BindMobileUI.class);
        intent.putExtra("kstyle_bind_wording", new com.tencent.mm.modelsimple.BindWordingContent(this.f197217d, ""));
        com.tencent.mm.ui.MMWizardActivity.X6(d7Var.f208330d.f209450a, intent);
        dialogInterface.dismiss();
    }
}
