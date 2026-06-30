package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class gf implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.pe f199102d;

    public gf(com.tencent.mm.ui.chatting.component.pe peVar) {
        this.f199102d = peVar;
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        com.tencent.mm.ui.chatting.component.pe peVar = this.f199102d;
        if (peVar.f198580d.D() && !com.tencent.mm.sdk.platformtools.t8.K0(str) && str.equals(peVar.f198580d.x())) {
            peVar.C();
            peVar.E0();
            peVar.getClass();
        }
    }
}
