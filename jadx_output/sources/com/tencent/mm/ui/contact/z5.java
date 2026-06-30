package com.tencent.mm.ui.contact;

/* loaded from: classes.dex */
public class z5 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.ModRemarkNameUI f207272d;

    public z5(com.tencent.mm.ui.contact.ModRemarkNameUI modRemarkNameUI) {
        this.f207272d = modRemarkNameUI;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.ui.contact.ModRemarkNameUI modRemarkNameUI = this.f207272d;
        g4Var.f(1, modRemarkNameUI.getString(com.tencent.mm.R.string.jo8));
        g4Var.f(2, modRemarkNameUI.getString(com.tencent.mm.R.string.igh));
    }
}
