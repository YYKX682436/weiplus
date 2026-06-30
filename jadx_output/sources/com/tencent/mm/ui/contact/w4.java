package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class w4 implements com.tencent.mm.ui.contact.m4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.MMBaseSelectContactUI f207228a;

    public w4(com.tencent.mm.ui.contact.MMBaseSelectContactUI mMBaseSelectContactUI) {
        this.f207228a = mMBaseSelectContactUI;
    }

    @Override // com.tencent.mm.ui.contact.m4
    public void a() {
        com.tencent.mm.ui.contact.MMBaseSelectContactUI mMBaseSelectContactUI = this.f207228a;
        com.tencent.mm.pluginsdk.ui.MultiSelectContactView multiSelectContactView = mMBaseSelectContactUI.f206450h;
        if (multiSelectContactView != null) {
            multiSelectContactView.clearFocus();
        }
        com.tencent.mm.ui.tools.c9 c9Var = mMBaseSelectContactUI.f206451i;
        if (c9Var != null) {
            c9Var.a();
            mMBaseSelectContactUI.f206451i.b();
        }
        mMBaseSelectContactUI.f206461v.requestFocus();
        mMBaseSelectContactUI.f206461v.setVisibility(8);
    }

    @Override // com.tencent.mm.ui.contact.m4
    public void b() {
        this.f207228a.hideVKB();
    }
}
