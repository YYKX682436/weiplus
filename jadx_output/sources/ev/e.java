package ev;

/* loaded from: classes12.dex */
public class e extends com.tencent.mm.sdk.event.n {
    public e() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        w21.w0 j17;
        com.tencent.mm.storage.f9 f9Var = ((com.tencent.mm.autogen.events.ResendVoiceMsgEvent) iEvent).f54707g.f8318a;
        if (((ig0.o) ((dg0.f) i95.n0.c(dg0.f.class))).cj() || com.tencent.mm.storage.z3.J3(f9Var.Q0())) {
            cg0.d dVar = new cg0.d(f9Var.Q0(), ((bv.p0) ((cv.h1) i95.n0.c(cv.h1.class))).Ai(f9Var));
            dVar.f41056i = 0;
            p15.e eVar = new p15.e();
            eVar.fromXml(f9Var.G);
            dVar.f41050c = eVar;
            z15.b bVar = new z15.b();
            if (f9Var.U1() != null) {
                bVar.fromXml(f9Var.S1());
            }
            dVar.f41052e = bVar;
            dVar.f41051d = g45.b.f268846a.b(f9Var);
            dVar.f41053f = true;
            ((ig0.o) ((dg0.f) i95.n0.c(dg0.f.class))).getClass();
            ((ig0.o) ((dg0.f) i95.n0.c(dg0.f.class))).fj(new jg0.x(dVar));
        } else {
            int msgId = (int) f9Var.getMsgId();
            java.lang.String Q0 = f9Var.Q0();
            java.util.HashMap hashMap = w21.x0.f442511a;
            com.tencent.mm.storage.f9 Li = pt0.f0.Li(Q0, msgId);
            if (Li.getMsgId() != 0) {
                ((bv.p0) ((cv.h1) i95.n0.c(cv.h1.class))).Ai(Li);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(((bv.p0) ((cv.h1) i95.n0.c(cv.h1.class))).Ai(Li)) && (j17 = w21.x0.j(((bv.p0) ((cv.h1) i95.n0.c(cv.h1.class))).Ai(Li))) != null && !com.tencent.mm.sdk.platformtools.t8.K0(j17.f442485b)) {
                    j17.f442492i = 3;
                    j17.f442489f = 0;
                    j17.f442493j = java.lang.System.currentTimeMillis() / 1000;
                    j17.f442494k = java.lang.System.currentTimeMillis() / 1000;
                    j17.f442484a = 8648;
                    w21.x0.w(j17);
                    if (j17.f442496m == 0 || com.tencent.mm.sdk.platformtools.t8.K0(j17.f442486c)) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.VoiceLogic", " failed msg id:" + j17.f442496m + " user:" + j17.f442486c);
                    } else {
                        Li.r1(1);
                        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(Li.getMsgId(), Li, true);
                        w21.p0.Bi().e();
                    }
                }
            }
        }
        return false;
    }
}
