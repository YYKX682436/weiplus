package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class a1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.i1 f203250d;

    public a1(com.tencent.mm.ui.chatting.viewitems.i1 i1Var) {
        this.f203250d = i1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.viewitems.i1 i1Var = this.f203250d;
        if (i1Var.C == null) {
            i1Var.C = db5.e1.P(i1Var.f204150t.g(), i1Var.f204150t.g().getString(com.tencent.mm.R.string.f490573yv), 3, i1Var.f204150t.g().getString(com.tencent.mm.R.string.f492653hd1), true, false, new com.tencent.mm.ui.chatting.viewitems.z0(this));
        }
        i1Var.C.show();
    }
}
