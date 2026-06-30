package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes8.dex */
public class n1 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f204895d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f204896e;

    public n1(com.tencent.mm.ui.widget.dialog.k0 k0Var, android.view.View view) {
        this.f204895d = k0Var;
        this.f204896e = view;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.clear();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f204895d;
        k0Var.o(null);
        k0Var.o(this.f204896e);
    }
}
