package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class i3 implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.h3 f199209d;

    public i3(com.tencent.mm.ui.chatting.component.h3 h3Var) {
        this.f199209d = h3Var;
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        java.lang.String str2 = w0Var.f316973a;
        com.tencent.mm.ui.chatting.component.h3 h3Var = this.f199209d;
        if (str2.equals(h3Var.f198580d.u().d1())) {
            h3Var.n0();
        }
    }
}
