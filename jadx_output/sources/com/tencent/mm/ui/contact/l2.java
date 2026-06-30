package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class l2 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.ContactRemarkInfoModUI f207005d;

    public l2(com.tencent.mm.ui.contact.ContactRemarkInfoModUI contactRemarkInfoModUI) {
        this.f207005d = contactRemarkInfoModUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.ui.contact.ContactRemarkInfoModUI contactRemarkInfoModUI = this.f207005d;
        contactRemarkInfoModUI.c7(2L);
        contactRemarkInfoModUI.b7();
        contactRemarkInfoModUI.finish();
    }
}
