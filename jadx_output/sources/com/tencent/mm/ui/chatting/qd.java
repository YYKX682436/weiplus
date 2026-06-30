package com.tencent.mm.ui.chatting;

/* loaded from: classes5.dex */
public class qd implements com.tencent.mm.plugin.newtips.model.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f202625d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.LinearLayout f202626e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.pd f202627f;

    public qd(android.content.Context context, java.lang.String str, com.tencent.mm.ui.chatting.pd pdVar) {
        this.f202625d = str;
        this.f202627f = pdVar;
        this.f202626e = new android.widget.LinearLayout(context);
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean T1(boolean z17, r45.pm6 pm6Var) {
        return false;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean W5() {
        return true;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean Y3(boolean z17) {
        return false;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean Z3(boolean z17, r45.pm6 pm6Var) {
        return false;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public void c1(boolean z17, com.tencent.mm.plugin.newtips.model.r rVar) {
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public void e5(com.tencent.mm.plugin.newtips.model.r rVar, boolean z17) {
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public java.lang.String getPath() {
        return this.f202625d;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public android.view.View h() {
        return this.f202626e;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean o0(boolean z17) {
        return false;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean q3(boolean z17, r45.pm6 pm6Var) {
        return false;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean u6(boolean z17, r45.pm6 pm6Var) {
        return false;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean y(boolean z17) {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        java.lang.String str = this.f202625d;
        com.tencent.mars.xlog.Log.i("MicroMsg.ShowRedDotCompoent", "menuKey:%s，show：%s", str, valueOf);
        this.f202627f.a(z17, str);
        return true;
    }
}
