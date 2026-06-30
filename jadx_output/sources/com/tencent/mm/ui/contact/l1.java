package com.tencent.mm.ui.contact;

/* loaded from: classes12.dex */
public class l1 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.n1 f207004d;

    public l1(com.tencent.mm.ui.contact.n1 n1Var) {
        this.f207004d = n1Var;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.ui.contact.n1 n1Var = this.f207004d;
        g4Var.f(0, n1Var.f207036d.getString(com.tencent.mm.R.string.i8c));
        j45.l.g("favorite");
        g4Var.f(1, n1Var.f207036d.getString(com.tencent.mm.R.string.hjg));
        com.tencent.mm.ui.contact.ContactRemarkImagePreviewUI contactRemarkImagePreviewUI = n1Var.f207036d;
        if (contactRemarkImagePreviewUI.f206364h) {
            return;
        }
        g4Var.f(2, contactRemarkImagePreviewUI.getString(com.tencent.mm.R.string.f490367t0));
    }
}
