package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class f1 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f203938d;

    public f1(com.tencent.mm.ui.chatting.viewitems.g1 g1Var, com.tencent.mm.modelbase.m1 m1Var) {
        this.f203938d = m1Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        c01.d9.e().d(this.f203938d);
    }
}
