package z73;

/* loaded from: classes11.dex */
public class b extends z73.a {

    /* renamed from: p, reason: collision with root package name */
    public final oq1.p f470576p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f470577q;

    public b(oq1.r rVar, oq1.p pVar) {
        this.f470577q = rVar.f347368a;
        this.f470576p = pVar;
        this.f470572i = "liteappconfig_" + rVar.f347368a;
        this.f470569f = rVar.f347369b;
        this.f470570g = rVar.f347370c;
        this.f470575o = rVar.f347371d;
        this.f470571h.addAll(z73.h.c());
        java.util.LinkedList linkedList = this.f470571h;
        r45.e35 e35Var = new r45.e35();
        e35Var.f372968d = "package_id";
        e35Var.f372969e = "wechat-android";
        linkedList.add(e35Var);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.d(24470, this.f470572i, rVar.f347368a, java.lang.Integer.valueOf(this.f470575o), java.lang.Boolean.FALSE);
        g0Var.A(1821, 2);
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        oq1.q qVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.NetSceneCheckLiteAppUpdate", "errType:%d errCode:%d errMsg:%s ", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            r45.g35 g35Var = (r45.g35) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
            r45.j35 j35Var = g35Var.f374853d;
            com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.NetSceneCheckLiteAppUpdate", "node is no empty. try to process");
            qVar = new oq1.q();
            if (j35Var != null) {
                r45.bs5 bs5Var = j35Var.f377538i;
                if (bs5Var != null) {
                    qVar.f347350e = bs5Var.f371025d;
                    qVar.f347349d = bs5Var.f371027f;
                    qVar.f347353h = bs5Var.f371032n;
                }
                qVar.f347347b = java.lang.Integer.valueOf(j35Var.f377534e);
                qVar.f347348c = java.lang.Integer.valueOf(j35Var.f377536g);
                qVar.f347351f = j35Var.f377533d;
                qVar.f347346a = this.f470577q;
                java.util.LinkedList linkedList = j35Var.f377540n;
                if (linkedList != null) {
                    java.util.Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        r45.h35 h35Var = (r45.h35) it.next();
                        if ("signature_key".equals(h35Var.f375806d)) {
                            qVar.f347352g = h35Var.f375807e;
                        }
                    }
                }
            }
            int i27 = g35Var.f374858i;
            qVar.f347354i = i27;
            com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.NetSceneCheckLiteAppUpdate", "process end, TinkerNode: {appId: %s, errorCode: %d, fileMd5: %s, fileSize: %d, cdnUrl: %s, patchId: %s}", qVar.f347346a, java.lang.Integer.valueOf(i27), qVar.f347350e, java.lang.Integer.valueOf(qVar.f347353h), qVar.f347349d, qVar.f347351f);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.NetSceneCheckLiteAppUpdate", "check tinker update failed.");
            qVar = new oq1.q();
            qVar.f347354i = -1;
        }
        this.f470576p.b(qVar);
        this.f470568e.onSceneEnd(i18, i19, str, this);
    }
}
