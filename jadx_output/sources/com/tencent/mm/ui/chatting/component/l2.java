package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public class l2 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.q2 f199392d;

    public l2(com.tencent.mm.ui.chatting.component.q2 q2Var) {
        this.f199392d = q2Var;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.ui.chatting.component.q2 q2Var = this.f199392d;
        g4Var.f(0, q2Var.f198580d.g().getString(com.tencent.mm.R.string.i2b));
        g4Var.f(1, q2Var.f198580d.g().getString(com.tencent.mm.R.string.i2c));
    }
}
