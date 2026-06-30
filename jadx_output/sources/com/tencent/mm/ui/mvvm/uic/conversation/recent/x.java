package com.tencent.mm.ui.mvvm.uic.conversation.recent;

/* loaded from: classes.dex */
public final class x implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.mvvm.uic.conversation.recent.e0 f209382d;

    public x(com.tencent.mm.ui.mvvm.uic.conversation.recent.e0 e0Var) {
        this.f209382d = e0Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.ui.mvvm.uic.conversation.recent.e0 e0Var = this.f209382d;
        g4Var.f(1, e0Var.getString(com.tencent.mm.R.string.iez));
        g4Var.f(2, e0Var.getString(com.tencent.mm.R.string.f492953if0));
    }
}
