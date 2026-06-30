package com.tencent.mm.ui.contact;

/* loaded from: classes9.dex */
public class f9 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.g9 f206708d;

    public f9(com.tencent.mm.ui.contact.g9 g9Var) {
        this.f206708d = g9Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.ui.contact.g9 g9Var = this.f206708d;
        intent.putExtra("Select_Contact", g9Var.f206731f);
        intent.putExtra("App_MsgId", "fromSns");
        g9Var.f206732g.setResult(-1, intent);
        g9Var.f206732g.finish();
    }
}
