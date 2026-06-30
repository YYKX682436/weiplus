package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = com.tencent.mm.ui.chatting.component.jg.class)
/* loaded from: classes9.dex */
public final class w7 extends com.tencent.mm.ui.chatting.component.a implements com.tencent.mm.ui.chatting.component.jg {

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.component.v7 f200157e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f200158f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f200159g;

    @Override // com.tencent.mm.ui.chatting.component.a, com.tencent.mm.ui.chatting.component.hg
    public void I() {
        m0("onComponentUnInstall");
        super.I();
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void J() {
        m0("onChattingExitAnimEnd");
    }

    public final void m0(java.lang.String str) {
        com.tencent.mm.ui.chatting.component.v7 v7Var = this.f200157e;
        java.lang.String str2 = this.f200158f;
        if (v7Var != null) {
            if (!(str2 == null || str2.length() == 0)) {
                ej4.c0.f253335a.a(str2, this);
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingTextStatusHeaderComponent", "unregister listener username=" + str2 + " reason=" + str);
            }
        }
        this.f200157e = null;
        this.f200158f = null;
        this.f200159g = false;
    }
}
