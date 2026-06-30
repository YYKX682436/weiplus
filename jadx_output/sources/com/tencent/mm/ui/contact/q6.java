package com.tencent.mm.ui.contact;

/* loaded from: classes.dex */
public class q6 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.OnlyChatContactMgrUI f207137d;

    public q6(com.tencent.mm.ui.contact.OnlyChatContactMgrUI onlyChatContactMgrUI) {
        this.f207137d = onlyChatContactMgrUI;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.ui.contact.OnlyChatContactMgrUI onlyChatContactMgrUI = this.f207137d;
        g4Var.g(0, onlyChatContactMgrUI.getString(com.tencent.mm.R.string.f489878e9), com.tencent.mm.R.drawable.f481342c14);
        g4Var.g(1, onlyChatContactMgrUI.getString(com.tencent.mm.R.string.f489877e8), com.tencent.mm.R.drawable.f481342c14);
        g4Var.g(2, onlyChatContactMgrUI.getString(com.tencent.mm.R.string.f489876e7), com.tencent.mm.R.drawable.f481342c14);
        g4Var.g(3, onlyChatContactMgrUI.getString(com.tencent.mm.R.string.f489875e6), com.tencent.mm.R.drawable.f481342c14);
    }
}
