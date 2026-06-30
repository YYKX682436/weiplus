package com.tencent.mm.ui.chatting.component;

/* loaded from: classes8.dex */
public class nm implements db5.i9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.sm f199597a;

    public nm(com.tencent.mm.ui.chatting.component.sm smVar) {
        this.f199597a = smVar;
    }

    @Override // db5.i9
    public void a(java.lang.String str) {
        this.f199597a.n0(str);
    }

    @Override // db5.i9
    public void b() {
        com.tencent.mm.ui.chatting.component.sm smVar = this.f199597a;
        if (iq.b.C(smVar.f198580d.g()) || iq.b.v(smVar.f198580d.g()) || iq.b.e(smVar.f198580d.g())) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.TrackRoomComponent", "Click banner : %d", java.lang.Integer.valueOf(((va3.z0) q21.d.a()).b(smVar.f198580d.u().d1()).size()));
        if (!((va3.z0) q21.d.a()).f(smVar.f198580d.u().d1())) {
            smVar.o0(true);
            return;
        }
        boolean z17 = ((com.tencent.mm.ui.chatting.component.q2) ((sb5.n) smVar.f198580d.f460708c.a(sb5.n.class))).u0() || ((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) smVar.f198580d.f460708c.a(sb5.f.class))).P;
        if (com.tencent.mm.storage.z3.R4(smVar.f198580d.x()) && !z17) {
            db5.e1.s(smVar.f198580d.g(), smVar.f198580d.s().getString(com.tencent.mm.R.string.k1l), null);
            return;
        }
        com.tencent.mm.autogen.events.TalkRoomServerEvent talkRoomServerEvent = new com.tencent.mm.autogen.events.TalkRoomServerEvent();
        talkRoomServerEvent.f54883g.f7583a = true;
        talkRoomServerEvent.e();
        am.py pyVar = talkRoomServerEvent.f54884h;
        if (com.tencent.mm.sdk.platformtools.t8.K0(pyVar.f7671a) || smVar.f198580d.x().equals(pyVar.f7671a)) {
            smVar.q0(smVar.f198580d.x(), "fromBanner", false);
            return;
        }
        com.tencent.mm.autogen.events.TalkRoomServerEvent talkRoomServerEvent2 = new com.tencent.mm.autogen.events.TalkRoomServerEvent();
        talkRoomServerEvent2.f54883g.f7584b = true;
        talkRoomServerEvent2.e();
        smVar.q0(smVar.f198580d.x(), "fromBanner", false);
    }
}
