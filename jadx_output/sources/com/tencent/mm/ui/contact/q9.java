package com.tencent.mm.ui.contact;

/* loaded from: classes5.dex */
public class q9 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f207142d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.SelectContactUI f207143e;

    public q9(com.tencent.mm.ui.contact.SelectContactUI selectContactUI, java.lang.String str) {
        this.f207143e = selectContactUI;
        this.f207142d = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactUI", "return the result,and create new label");
        android.content.Intent intent = new android.content.Intent();
        java.lang.String str = this.f207142d;
        intent.putExtra("Select_Contact", str);
        intent.putExtra("Select_Conv_User", str);
        intent.putExtra("Select_Contact", str);
        intent.putExtra("Select_Contacts_To_Create_New_Label", str);
        com.tencent.mm.ui.contact.SelectContactUI selectContactUI = this.f207143e;
        selectContactUI.setResult(-1, intent);
        selectContactUI.finish();
    }
}
