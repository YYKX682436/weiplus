package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class e1 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.i1 f203839d;

    public e1(com.tencent.mm.ui.chatting.viewitems.i1 i1Var) {
        this.f203839d = i1Var;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.ui.chatting.viewitems.i1 i1Var = this.f203839d;
        g4Var.d(0, i1Var.f204150t.s().getColor(com.tencent.mm.R.color.f479482a31), i1Var.f204150t.s().getString(com.tencent.mm.R.string.b0x));
    }
}
