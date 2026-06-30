package com.tencent.mm.ui.contact;

/* loaded from: classes.dex */
public class d2 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.ContactRemarkInfoModUI f206658d;

    public d2(com.tencent.mm.ui.contact.ContactRemarkInfoModUI contactRemarkInfoModUI) {
        this.f206658d = contactRemarkInfoModUI;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.ui.contact.ContactRemarkInfoModUI contactRemarkInfoModUI = this.f206658d;
        g4Var.f(1, contactRemarkInfoModUI.getString(com.tencent.mm.R.string.jo8));
        g4Var.f(2, contactRemarkInfoModUI.getString(com.tencent.mm.R.string.igh));
    }
}
