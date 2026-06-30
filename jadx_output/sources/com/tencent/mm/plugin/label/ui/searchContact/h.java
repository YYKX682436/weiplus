package com.tencent.mm.plugin.label.ui.searchContact;

/* loaded from: classes.dex */
public final class h implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.searchContact.ContactManagerUI f143369d;

    public h(com.tencent.mm.plugin.label.ui.searchContact.ContactManagerUI contactManagerUI) {
        this.f143369d = contactManagerUI;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.label.ui.searchContact.ContactManagerUI contactManagerUI = this.f143369d;
        g4Var.d(0, contactManagerUI.getResources().getColor(com.tencent.mm.R.color.f479291v7), contactManagerUI.getString(com.tencent.mm.R.string.bok));
    }
}
