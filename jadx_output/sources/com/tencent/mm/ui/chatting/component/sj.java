package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.r1.class)
/* loaded from: classes9.dex */
public class sj extends com.tencent.mm.ui.chatting.component.a implements sb5.r1 {

    /* renamed from: e, reason: collision with root package name */
    public long f199941e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f199942f = new com.tencent.mm.ui.chatting.component.RemittanceSearchComponent$1(this, com.tencent.mm.app.a0.f53288d);

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void E() {
        this.f199942f.alive();
    }

    @Override // com.tencent.mm.ui.chatting.component.a, com.tencent.mm.ui.chatting.component.hg
    public void I() {
        super.I();
        this.f199942f.dead();
        this.f198580d.f460721p = false;
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void K() {
        this.f199942f.dead();
        this.f198580d.f460721p = false;
    }

    @Override // yn.d
    public void N(int i17, int i18, android.content.Intent intent) {
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void a() {
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void y() {
    }
}
