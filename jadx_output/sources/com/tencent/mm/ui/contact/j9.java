package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class j9 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f206970d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f206971e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.SelectContactUI f206972f;

    public j9(com.tencent.mm.ui.contact.SelectContactUI selectContactUI, java.util.List list, boolean z17) {
        this.f206972f = selectContactUI;
        this.f206970d = list;
        this.f206971e = z17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        int i18 = com.tencent.mm.ui.contact.SelectContactUI.f206536m2;
        com.tencent.mm.ui.contact.SelectContactUI selectContactUI = this.f206972f;
        selectContactUI.P1 = selectContactUI.A7(this.f206970d, this.f206971e);
    }
}
