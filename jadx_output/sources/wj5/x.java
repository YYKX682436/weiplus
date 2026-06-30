package wj5;

/* loaded from: classes8.dex */
public final class x implements db5.i9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wj5.y f446847a;

    public x(wj5.y yVar) {
        this.f446847a = yVar;
    }

    @Override // db5.i9
    public void a(java.lang.String fromWhere) {
        kotlin.jvm.internal.o.g(fromWhere, "fromWhere");
        wj5.y yVar = this.f446847a;
        ((com.tencent.mm.ui.chatting.component.sm) ((sb5.j2) yVar.f446848e.f460708c.a(sb5.j2.class))).n0(fromWhere);
        yVar.f446850g.m0();
    }

    @Override // db5.i9
    public void b() {
        boolean z17;
        wj5.y yVar = this.f446847a;
        if (iq.b.C(yVar.f446848e.g()) || iq.b.v(yVar.f446848e.g()) || iq.b.e(yVar.f446848e.g())) {
            return;
        }
        java.util.LinkedList b17 = ((va3.z0) q21.d.a()).b(yVar.f446848e.u().d1());
        kotlin.jvm.internal.o.f(b17, "getTrackRoomInfo(...)");
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.TrackRoomComponent", "Click banner : %d", java.lang.Integer.valueOf(b17.size()));
        if (((va3.z0) q21.d.a()).f(yVar.f446848e.u().d1())) {
            yb5.d dVar = yVar.f446848e;
            z17 = ((com.tencent.mm.ui.chatting.component.q2) ((sb5.n) dVar.f460708c.a(sb5.n.class))).u0() || ((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) dVar.f460708c.a(sb5.f.class))).P;
            if (com.tencent.mm.storage.z3.R4(dVar.x()) && !z17) {
                db5.e1.s(dVar.g(), dVar.s().getString(com.tencent.mm.R.string.k1l), null);
                return;
            }
            com.tencent.mm.autogen.events.TalkRoomServerEvent talkRoomServerEvent = new com.tencent.mm.autogen.events.TalkRoomServerEvent();
            talkRoomServerEvent.f54883g.f7583a = true;
            talkRoomServerEvent.e();
            am.py pyVar = talkRoomServerEvent.f54884h;
            if (com.tencent.mm.sdk.platformtools.t8.K0(pyVar.f7671a) || kotlin.jvm.internal.o.b(dVar.x(), pyVar.f7671a)) {
                yVar.q(dVar.x());
                return;
            }
            com.tencent.mm.autogen.events.TalkRoomServerEvent talkRoomServerEvent2 = new com.tencent.mm.autogen.events.TalkRoomServerEvent();
            talkRoomServerEvent2.f54883g.f7584b = true;
            talkRoomServerEvent2.e();
            yVar.q(dVar.x());
            return;
        }
        yb5.d dVar2 = yVar.f446848e;
        z17 = ((com.tencent.mm.ui.chatting.component.q2) ((sb5.n) dVar2.f460708c.a(sb5.n.class))).u0() || ((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) dVar2.f460708c.a(sb5.f.class))).P;
        if (com.tencent.mm.storage.z3.R4(dVar2.x()) && !z17) {
            db5.e1.s(dVar2.g(), dVar2.s().getString(com.tencent.mm.R.string.joi), null);
            return;
        }
        com.tencent.mm.autogen.events.TalkRoomServerEvent talkRoomServerEvent3 = new com.tencent.mm.autogen.events.TalkRoomServerEvent();
        talkRoomServerEvent3.f54883g.f7583a = true;
        talkRoomServerEvent3.e();
        am.py pyVar2 = talkRoomServerEvent3.f54884h;
        if (com.tencent.mm.sdk.platformtools.t8.K0(pyVar2.f7671a) || kotlin.jvm.internal.o.b(dVar2.x(), pyVar2.f7671a)) {
            yVar.p(dVar2.x());
            return;
        }
        com.tencent.mm.ui.base.TalkRoomPopupNav talkRoomPopupNav = yVar.f446850g.f462731f;
        if (talkRoomPopupNav == null || talkRoomPopupNav.getVisibility() != 0) {
            db5.e1.u(dVar2.g(), dVar2.s().getString(com.tencent.mm.R.string.jo_), null, new wj5.v(yVar), wj5.w.f446846d);
        }
    }
}
