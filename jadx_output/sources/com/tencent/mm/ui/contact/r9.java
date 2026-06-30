package com.tencent.mm.ui.contact;

/* loaded from: classes5.dex */
public class r9 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f207159d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.SelectContactUI f207160e;

    public r9(com.tencent.mm.ui.contact.SelectContactUI selectContactUI, java.lang.String str) {
        this.f207160e = selectContactUI;
        this.f207159d = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactUI", "return the result");
        android.content.Intent intent = new android.content.Intent();
        java.lang.String str = this.f207159d;
        intent.putExtra("Select_Contact", str);
        intent.putExtra("Select_Conv_User", str);
        intent.putExtra("Select_Contact", str);
        com.tencent.mm.ui.contact.SelectContactUI selectContactUI = this.f207160e;
        selectContactUI.setResult(-1, intent);
        selectContactUI.finish();
    }
}
