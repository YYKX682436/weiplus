package com.tencent.mm.ui.chatting.component;

/* loaded from: classes13.dex */
public class gd implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k91.v5 f199099d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.hd f199100e;

    public gd(com.tencent.mm.ui.chatting.component.hd hdVar, k91.v5 v5Var) {
        this.f199100e = hdVar;
        this.f199099d = v5Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        n11.a b17 = n11.a.b();
        k91.v5 v5Var = this.f199099d;
        java.lang.String str = v5Var != null ? v5Var.field_smallHeadURL : "";
        com.tencent.mm.ui.chatting.component.hd hdVar = this.f199100e;
        b17.h(str, hdVar.f199161a.f199045f, com.tencent.mm.ui.chatting.component.fd.f199042n);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(hdVar.f199162b.field_title) || v5Var == null) {
            return;
        }
        hdVar.f199161a.f199046g.setText(v5Var.field_nickname);
    }
}
