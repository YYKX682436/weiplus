package nq3;

/* loaded from: classes12.dex */
public class c extends tq3.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nq3.d f338991d;

    public c(nq3.d dVar, nq3.a aVar) {
        this.f338991d = dVar;
    }

    @Override // tq3.a
    public java.lang.String a() {
        return "Priority.C2CFileAutoDownloadTask";
    }

    @Override // java.lang.Runnable
    public void run() {
        long j17;
        float f17;
        r45.qc qcVar;
        int i17;
        int i18;
        java.lang.Class cls;
        java.lang.String str;
        int i19;
        nq3.c cVar = this;
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_mmc2c_file_auto_download_flag, 0) == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Priority.C2CFileAutoDownloader", "not auto download expt flag");
            return;
        }
        if (!cVar.f338991d.a()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Priority.C2CFileAutoDownloader", "not auto download condition");
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(cVar.f338991d.f338992d)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Priority.C2CFileAutoDownloader", "Downloading %s", cVar.f338991d.f338992d);
            return;
        }
        ((fq3.n) i95.n0.c(fq3.n.class)).getClass();
        try {
            j17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_mmc2c_file_auto_download_bg_border_size, 10) * 1024 * 1024;
        } catch (java.lang.Exception unused) {
            j17 = 10485760;
        }
        ((fq3.n) i95.n0.c(fq3.n.class)).getClass();
        try {
            f17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_mmc2c_file_auto_download_bg_border_priority, 5) / 100.0f;
        } catch (java.lang.Exception unused2) {
            f17 = 0.05f;
        }
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_mmc2c_chat_file_auto_download_flag, false);
        fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
        nVar.requireAccountInitialized();
        nq3.f fVar = nVar.f265531p;
        fVar.getClass();
        android.database.Cursor h17 = fVar.f338994a.h(java.lang.String.format("SELECT * FROM %s WHERE status = %s AND (reason & %s) > 0 AND createtime > ? ORDER BY createtime DESC LIMIT 1;", "C2CMsgAutoDownloadFile", 1, 1), new java.lang.String[]{java.lang.String.valueOf(java.lang.System.currentTimeMillis() - 432000000)});
        try {
            if (h17.moveToNext()) {
                qcVar = fVar.a(h17);
            } else {
                h17.close();
                qcVar = null;
            }
            if (qcVar != null) {
                i17 = 1;
            } else if (fj6) {
                int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_mmc2c_chat_file_auto_download_bg_rank, 20);
                float Di = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Di(e42.d0.clicfg_mmc2c_chat_file_auto_download_bg_score, 10.0f);
                fq3.n nVar2 = (fq3.n) i95.n0.c(fq3.n.class);
                nVar2.requireAccountInitialized();
                nq3.f fVar2 = nVar2.f265531p;
                fVar2.getClass();
                h17 = fVar2.f338994a.h(java.lang.String.format("SELECT * FROM %s File, %s Chat WHERE Chat.rank <= ? AND Chat.totallsp > ? AND Chat.chat = File.fromuser AND createtime > ? AND File.status = ? ORDER BY File.createtime DESC LIMIT 1;", "C2CMsgAutoDownloadFile", "C2CChatUsageResult"), new java.lang.String[]{java.lang.String.valueOf(Ni), java.lang.String.valueOf(Di), java.lang.String.valueOf(java.lang.System.currentTimeMillis() - 432000000), java.lang.String.valueOf(1)});
                try {
                    if (h17.moveToNext()) {
                        r45.qc a17 = fVar2.a(h17);
                        h17.close();
                        qcVar = a17;
                    } else {
                        h17.close();
                        qcVar = null;
                    }
                    i17 = 3;
                } finally {
                }
            } else {
                fq3.n nVar3 = (fq3.n) i95.n0.c(fq3.n.class);
                nVar3.requireAccountInitialized();
                nq3.f fVar3 = nVar3.f265531p;
                fVar3.getClass();
                h17 = fVar3.f338994a.h(java.lang.String.format("SELECT * FROM %s WHERE status = %s AND priority >= ? AND createtime > ? AND filesize <= ? ORDER BY priority DESC, createtime DESC LIMIT 1;", "C2CMsgAutoDownloadFile", 1), new java.lang.String[]{java.lang.String.valueOf(f17), java.lang.String.valueOf(java.lang.System.currentTimeMillis() - 432000000), java.lang.String.valueOf(j17)});
                try {
                    if (h17.moveToNext()) {
                        r45.qc a18 = fVar3.a(h17);
                        h17.close();
                        qcVar = a18;
                    } else {
                        h17.close();
                        qcVar = null;
                    }
                    i17 = 2;
                } finally {
                }
            }
            if (qcVar == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Priority.C2CFileAutoDownloader", "autodownloadfile is null %d %.2f", java.lang.Long.valueOf(j17), java.lang.Float.valueOf(f17));
                return;
            }
            com.tencent.mm.storage.f9 o27 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(qcVar.f383819e, qcVar.f383826o);
            if (o27 == null) {
                fq3.n nVar4 = (fq3.n) i95.n0.c(fq3.n.class);
                nVar4.requireAccountInitialized();
                nVar4.f265531p.b(qcVar.f383818d, qcVar.f383826o);
                com.tencent.mars.xlog.Log.i("MicroMsg.Priority.C2CFileAutoDownloader", "invalid auto download file info");
                return;
            }
            ot0.q v17 = ot0.q.v((com.tencent.mm.storage.z3.R4(o27.Q0()) && o27.A0() == 0) ? c01.w9.u(o27.j()) : o27.j());
            if (v17 == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Priority.C2CFileAutoDownloader", "appMsgContent is null");
                fq3.n nVar5 = (fq3.n) i95.n0.c(fq3.n.class);
                nVar5.requireAccountInitialized();
                nVar5.f265531p.b(qcVar.f383818d, qcVar.f383826o);
                return;
            }
            if (qcVar.f383821g == 2) {
                com.tencent.mm.pluginsdk.model.app.d J0 = ((com.tencent.mm.pluginsdk.model.app.e) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi()).J0(java.lang.Long.valueOf(qcVar.f383818d).longValue(), o27.Q0());
                if (J0 == null) {
                    com.tencent.mm.pluginsdk.model.app.d dVar = new com.tencent.mm.pluginsdk.model.app.d();
                    java.lang.String t17 = lp0.b.t();
                    java.lang.String n17 = v17.n();
                    java.lang.String str2 = v17.f348690o;
                    com.tencent.mm.vfs.z7 a19 = com.tencent.mm.vfs.z7.a(t17);
                    java.lang.String str3 = a19.f213279f;
                    if (str3 != null) {
                        i18 = i17;
                        java.lang.String l17 = com.tencent.mm.vfs.e8.l(str3, false, false);
                        if (str3.equals(l17)) {
                            cls = fq3.n.class;
                        } else {
                            cls = fq3.n.class;
                            a19 = new com.tencent.mm.vfs.z7(a19.f213277d, a19.f213278e, l17, a19.f213280g, a19.f213281h);
                        }
                    } else {
                        cls = fq3.n.class;
                        i18 = i17;
                    }
                    com.tencent.mm.vfs.b3 b3Var = com.tencent.mm.vfs.a3.f212781a;
                    com.tencent.mm.vfs.z2 m17 = b3Var.m(a19, null);
                    if (!(!m17.a() ? false : m17.f213266a.F(m17.f213267b))) {
                        com.tencent.mm.vfs.z2 m18 = b3Var.m(a19, m17);
                        if (m18.a()) {
                            m18.f213266a.r(m18.f213267b);
                        }
                    }
                    if (com.tencent.mm.sdk.platformtools.t8.K0(n17)) {
                        str = t17 + "da_" + java.lang.System.currentTimeMillis();
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                            str = str + "." + str2;
                        }
                    } else {
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) && !n17.endsWith(str2)) {
                            n17 = n17 + "." + str2;
                        }
                        java.lang.String str4 = t17 + n17;
                        if (com.tencent.mm.vfs.w6.j(str4)) {
                            int i27 = 1;
                            while (true) {
                                if (i27 >= 20) {
                                    str = str4;
                                    i19 = 20;
                                    break;
                                }
                                if (!com.tencent.mm.vfs.w6.j(t17 + i27 + "_" + n17)) {
                                    str = t17 + i27 + "_" + n17;
                                    i19 = 20;
                                    break;
                                }
                                i27++;
                            }
                            if (i27 == i19) {
                                str = t17 + "da_" + java.lang.System.currentTimeMillis();
                                if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                                    str = str + "." + str2;
                                }
                            }
                        } else {
                            str = str4;
                        }
                    }
                    try {
                        if (!new com.tencent.mm.vfs.r6(str).s().o().equalsIgnoreCase(new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(t17)).o())) {
                            str = t17 + "da_" + java.lang.System.currentTimeMillis();
                            com.tencent.mars.xlog.Log.w("MicroMsg.Priority.PriorityUtil", "maybe DirTraversal attach. %s", str);
                        }
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Priority.PriorityUtil", e17, "", new java.lang.Object[0]);
                        str = t17 + "da_" + java.lang.System.currentTimeMillis();
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                            str = str + "." + str2;
                        }
                    }
                    dVar.field_fileFullPath = str;
                    dVar.field_appId = v17.f348646d;
                    dVar.field_sdkVer = v17.f348650e;
                    dVar.field_mediaSvrId = v17.f348694p;
                    dVar.field_totalLen = v17.f348682m;
                    ((com.tencent.mm.pluginsdk.model.app.d3) ((ct.w2) i95.n0.c(ct.w2.class))).wi(false);
                    dVar.field_status = 101;
                    dVar.field_isUpload = false;
                    dVar.field_createTime = c01.id.a();
                    dVar.field_lastModifyTime = c01.id.e();
                    dVar.field_msgInfoId = java.lang.Long.valueOf(qcVar.f383818d).longValue();
                    dVar.field_msgInfoTalker = o27.Q0();
                    dVar.field_netTimes = 0L;
                    dVar.field_type = v17.f348714u;
                    ((com.tencent.mm.pluginsdk.model.app.e) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi()).insert(dVar);
                    J0 = dVar;
                } else {
                    cls = fq3.n.class;
                    i18 = i17;
                }
                com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(J0.field_fileFullPath);
                if (r6Var.m() && r6Var.C() == J0.field_totalLen) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Priority.C2CFileAutoDownloader", "file already exist");
                    fq3.n nVar6 = (fq3.n) i95.n0.c(cls);
                    nVar6.requireAccountInitialized();
                    nVar6.f265531p.f(qcVar.f383818d, qcVar.f383826o, 5);
                    jx3.f.INSTANCE.idkeyStat(1241L, 8L, 1L, false);
                    return;
                }
                fq3.n nVar7 = (fq3.n) i95.n0.c(cls);
                nVar7.requireAccountInitialized();
                nVar7.f265531p.f(qcVar.f383818d, qcVar.f383826o, 2);
                cVar = this;
                cVar.f338991d.f338992d = qcVar.f383818d;
                ((ku5.t0) ku5.t0.f312615d).B(new nq3.b(cVar, o27, v17));
                jx3.f.INSTANCE.idkeyStat(1241L, 0L, 1L, false);
                oq3.h e18 = oq3.k.f347394a.e(o27.G);
                ((kq3.e) ((bx1.s) i95.n0.c(bx1.s.class))).Di(4L, qcVar.f383826o, qcVar.f383819e, kq3.i.b(qcVar.f383830s), e18.f347386b, e18.f347387c, qcVar.f383822h);
            } else {
                i18 = i17;
                java.util.Iterator it = bt3.g2.A(v17.f348663h0).f387465f.iterator();
                while (it.hasNext()) {
                    r45.gp0 gp0Var = (r45.gp0) it.next();
                    if (gp0Var.T.equals(qcVar.f383818d)) {
                        ((bt3.t1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).bj()).y0(cVar.f338991d);
                        if (bt3.g2.O(gp0Var, o27.Q0(), o27.getMsgId(), true)) {
                            cVar.f338991d.f338992d = qcVar.f383818d;
                            jx3.f.INSTANCE.idkeyStat(1241L, 1L, 1L, false);
                        } else {
                            ((bt3.t1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).bj()).P0(cVar.f338991d);
                        }
                    }
                }
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(cVar.f338991d.f338992d)) {
                return;
            }
            int i28 = i18;
            if (i28 == 1) {
                jx3.f.INSTANCE.idkeyStat(1241L, 6L, 1L, false);
            } else if (i28 == 2) {
                jx3.f.INSTANCE.idkeyStat(1241L, 7L, 1L, false);
            } else if (i28 == 3) {
                jx3.f.INSTANCE.idkeyStat(1241L, 9L, 1L, false);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Priority.C2CFileAutoDownloader", "downloading file way:%d currentId %s", java.lang.Integer.valueOf(i28), cVar.f338991d.f338992d);
        } finally {
        }
    }
}
