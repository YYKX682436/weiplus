package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.t0.class)
/* loaded from: classes11.dex */
public class gc extends com.tencent.mm.ui.chatting.component.a implements sb5.t0, l75.z0 {

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.component.fc f199095e;

    /* renamed from: g, reason: collision with root package name */
    public volatile com.tencent.mm.storage.f9 f199097g;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashSet f199096f = new java.util.HashSet();

    /* renamed from: h, reason: collision with root package name */
    public final android.os.Handler f199098h = new com.tencent.mm.ui.chatting.component.ec(this, android.os.Looper.getMainLooper());

    @Override // com.tencent.mm.ui.chatting.component.a, com.tencent.mm.ui.chatting.component.hg
    public void I() {
        super.I();
        ((l75.a1) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).wi()).e(this);
        com.tencent.mm.modelgetchatroommsg.f.d().a();
        this.f199098h.removeCallbacksAndMessages(null);
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void K() {
        com.tencent.mars.xlog.Log.i("MicroMsg.GetChatroomComponent", "[onChattingExitAnimStart] talker:%s, talker_name:%s", this.f198580d.u(), this.f198580d.x());
        if (this.f198580d.D()) {
            this.f199095e.b();
            ((l75.a1) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).wi()).e(this);
            if (!this.f199096f.contains(this.f198580d.x())) {
                if (com.tencent.mm.modelgetchatroommsg.b.f71235a == null) {
                    synchronized (com.tencent.mm.modelgetchatroommsg.b.class) {
                        if (com.tencent.mm.modelgetchatroommsg.b.f71235a == null) {
                            com.tencent.mm.modelgetchatroommsg.b.f71235a = new com.tencent.mm.modelgetchatroommsg.b();
                        }
                    }
                }
                com.tencent.mm.modelgetchatroommsg.b bVar = com.tencent.mm.modelgetchatroommsg.b.f71235a;
                java.lang.String x17 = this.f198580d.x();
                bVar.getClass();
                s75.d.b(new com.tencent.mm.modelgetchatroommsg.a(bVar, x17), "checkDirtyBlock");
                this.f199096f.add(this.f198580d.x());
            }
            com.tencent.mm.modelgetchatroommsg.f.d().a();
            this.f199098h.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void a() {
        if (this.f198580d.D()) {
            gm0.j1.e().j(new com.tencent.mm.ui.chatting.component.cc(this, this.f198580d.x()));
        }
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        xg3.v vVar = (xg3.v) obj;
        java.lang.String str = vVar.f454435b;
        boolean z17 = vVar.f454436c;
        if (str.equals(this.f198580d.x())) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GetChatroomComponent", "[onNotifyChange] talker:%s id:%s isInsertForWrap:%s", this.f198580d.x(), java.lang.Integer.valueOf(vVar.f454434a), java.lang.Boolean.valueOf(vVar.f454436c));
            if (i17 == 4 && !z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.GetChatroomComponent", "[onNotifyChange] resetDataPresenter! username:".concat(str));
                this.f199098h.sendEmptyMessage(8);
            }
            if (z17) {
                return;
            }
            if (i17 == 2 || i17 == 4) {
                com.tencent.mm.storage.c3 i18 = ((com.tencent.mm.storage.d3) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).wi()).i(this.f198580d.x());
                com.tencent.mm.modelgetchatroommsg.f.d().c(this.f198580d.x(), 1 + i18.field_lastLocalSeq, i18.field_lastPushSeq, 0, null);
            }
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void z() {
        com.tencent.mars.xlog.Log.i("MicroMsg.GetChatroomComponent", "[onChattingEnterAnimStart] talker:%s, talker_name:%s", this.f198580d.u(), this.f198580d.x());
        if (this.f198580d.D()) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.lang.Object wi6 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).wi();
            ((l75.a1) wi6).f316939c.a(this, gm0.j1.e().a());
            this.f199095e = new com.tencent.mm.ui.chatting.component.fc(this, this.f198580d.x(), null);
            ((ku5.t0) ku5.t0.f312615d).g(this.f199095e);
            com.tencent.mars.xlog.Log.i("MicroMsg.GetChatroomComponent", "[onChattingEnterAnimStart] cost:%sms talker:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), this.f198580d.x());
        }
    }
}
