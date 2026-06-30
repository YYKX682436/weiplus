package z73;

/* loaded from: classes11.dex */
public class c extends z73.a {

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f470578p;

    /* renamed from: q, reason: collision with root package name */
    public final oq1.p f470579q;

    public c(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, oq1.p pVar) {
        if (z17) {
            this.f470575o = 0;
        } else {
            this.f470575o = 1;
        }
        this.f470578p = str;
        this.f470569f = str2;
        this.f470570g = str3;
        this.f470572i = "mbconfig_" + str;
        this.f470579q = pVar;
        this.f470571h.addAll(z73.h.c());
        java.util.LinkedList linkedList = this.f470571h;
        r45.e35 e35Var = new r45.e35();
        e35Var.f372968d = "package_id";
        e35Var.f372969e = "wechat-android";
        linkedList.add(e35Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.NetSceneCheckMagicUpdate", "PackageId:%s BaseID:%s type:%s ", str, this.f470569f, this.f470572i);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.d(24470, this.f470572i, str, java.lang.Integer.valueOf(this.f470575o), java.lang.Boolean.FALSE);
        g0Var.A(1821, 3);
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        oq1.q qVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.NetSceneCheckMagicUpdate", "errType:%d errCode:%d errMsg:%s ", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            r45.g35 g35Var = (r45.g35) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
            r45.j35 j35Var = g35Var.f374853d;
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
                qVar.f347355j = this.f470578p;
                java.util.LinkedList linkedList = j35Var.f377540n;
                if (linkedList != null && !linkedList.isEmpty()) {
                    java.util.Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        r45.h35 h35Var = (r45.h35) it.next();
                        if (h35Var != null && !com.tencent.mm.sdk.platformtools.t8.K0(h35Var.f375806d)) {
                            if (h35Var.f375806d.equalsIgnoreCase("newApkMd5") || h35Var.f375806d.equalsIgnoreCase("mbMd5")) {
                                qVar.f347356k = h35Var.f375807e;
                            } else if (!h35Var.f375806d.equalsIgnoreCase("oldApkMd5")) {
                                if (h35Var.f375806d.equalsIgnoreCase("clientVersion") || h35Var.f375806d.equalsIgnoreCase(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.VERSIONCODE)) {
                                    qVar.f347357l = h35Var.f375807e;
                                } else if (h35Var.f375806d.equalsIgnoreCase("originalName")) {
                                    qVar.f347358m = h35Var.f375807e;
                                }
                            }
                        }
                    }
                }
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.NetSceneCheckMagicUpdate", "node is nil prerrcode:%d ", java.lang.Integer.valueOf(g35Var.f374858i));
            }
            qVar.f347354i = g35Var.f374858i;
        } else {
            qVar = new oq1.q();
            qVar.f347354i = -1;
        }
        this.f470579q.b(qVar);
        this.f470568e.onSceneEnd(i18, i19, str, this);
    }
}
