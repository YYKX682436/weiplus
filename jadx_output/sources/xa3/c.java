package xa3;

/* loaded from: classes11.dex */
public class c extends com.tencent.mm.sdk.event.n {
    public c() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        ua3.a c17;
        com.tencent.mm.autogen.events.ExitTrackRoomEvent exitTrackRoomEvent = (com.tencent.mm.autogen.events.ExitTrackRoomEvent) iEvent;
        com.tencent.mars.xlog.Log.i("ExitTrackRoomListener", "exit track trackMgr:%s event:%s", ((va3.v0) q21.d.b()).f434364v, exitTrackRoomEvent.f54187g.f8176a);
        va3.j0.Ri().h();
        ua3.b bVar = ((va3.z0) q21.d.a()).f434397b;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(bVar != null ? bVar.f425976e : "")) {
            va3.j0.Ri().b(1);
            com.tencent.mm.autogen.events.TalkRoomServerEvent talkRoomServerEvent = new com.tencent.mm.autogen.events.TalkRoomServerEvent();
            talkRoomServerEvent.f54883g.f7584b = true;
            talkRoomServerEvent.e();
        }
        am.v7 v7Var = exitTrackRoomEvent.f54187g;
        if (com.tencent.mm.sdk.platformtools.t8.K0(v7Var.f8176a) || (c17 = va3.j0.Ui().c(v7Var.f8176a)) == null) {
            return false;
        }
        c17.f425970e.remove(c01.z1.r());
        va3.j0.Ui().g(v7Var.f8176a, c17.f425970e, c17.f425972g, c17.f425971f, c17.f425973h, null, null);
        if (p21.l.a() == null) {
            return false;
        }
        ((dh4.t) p21.l.a()).g(v7Var.f8176a, null, null, null, 1);
        return false;
    }
}
