package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class pf implements com.tencent.mm.plugin.newtips.model.a {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f199705d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f199706e = false;

    /* renamed from: f, reason: collision with root package name */
    public final int f199707f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f199708g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.pe f199709h;

    public pf(com.tencent.mm.ui.chatting.component.pe peVar, int i17, java.lang.String str, com.tencent.mm.ui.eb ebVar) {
        this.f199709h = peVar;
        this.f199705d = new android.view.View(peVar.f198580d.g());
        this.f199707f = i17;
        this.f199708g = str;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean T1(boolean z17, r45.pm6 pm6Var) {
        return false;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean W5() {
        return false;
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
        com.tencent.mm.plugin.newtips.model.i.b(this, rVar, z17);
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public java.lang.String getPath() {
        return this.f199708g;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public android.view.View h() {
        return this.f199705d;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean o0(boolean z17) {
        return com.tencent.mm.plugin.newtips.model.i.l(z17, this);
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
        this.f199706e = z17;
        this.f199709h.f198580d.f460717l.updateOptionMenuRedDot(this.f199707f, z17);
        return true;
    }
}
