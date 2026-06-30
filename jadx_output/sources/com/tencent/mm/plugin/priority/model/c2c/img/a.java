package com.tencent.mm.plugin.priority.model.c2c.img;

/* loaded from: classes12.dex */
public class a extends tq3.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.priority.model.c2c.img.c f153171d;

    public a(com.tencent.mm.plugin.priority.model.c2c.img.c cVar, com.tencent.mm.plugin.priority.model.c2c.img.C2CImgAutoDownloader$1 c2CImgAutoDownloader$1) {
        this.f153171d = cVar;
    }

    @Override // tq3.a
    public java.lang.String a() {
        return "Priority.C2CImgAutoDownloaderTask";
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        r45.rc rcVar;
        r45.rc rcVar2;
        r45.rc rcVar3;
        int i18;
        android.database.Cursor h17;
        com.tencent.mm.storage.f9 f9Var;
        int b17;
        int i19;
        r45.rc rcVar4;
        r45.rc rcVar5;
        if (!iq3.a.a()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Priority.C2CImgAutoDownloader", "not auto download condition");
            return;
        }
        com.tencent.mm.plugin.priority.model.c2c.img.c cVar = this.f153171d;
        long j17 = cVar.f153173d;
        if (j17 != 0 || cVar.f153177h) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Priority.C2CImgAutoDownloader", "Downloading %d pauseOnMonitor %b", java.lang.Long.valueOf(j17), java.lang.Boolean.valueOf(cVar.f153177h));
            return;
        }
        ((fq3.n) i95.n0.c(fq3.n.class)).getClass();
        ((fq3.n) i95.n0.c(fq3.n.class)).getClass();
        com.tencent.mm.storage.f9 f9Var2 = null;
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_mmc2c_chat_img_auto_download_flag, false)) {
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_mmc2c_chat_img_auto_download_rank, 10);
            float Di = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Di(e42.d0.clicfg_mmc2c_chat_img_auto_download_score, 10.0f);
            if (com.tencent.mm.sdk.platformtools.t8.K0(cVar.f153176g)) {
                i17 = 0;
                rcVar = null;
            } else {
                fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
                nVar.requireAccountInitialized();
                com.tencent.mm.plugin.priority.model.c2c.img.e eVar = nVar.f265530o;
                java.lang.String str = cVar.f153176g;
                eVar.getClass();
                h17 = eVar.f153182a.h(java.lang.String.format("SELECT * FROM %s Img, %s Chat WHERE Chat.rank <= ? AND Chat.totallsp > ? AND Chat.chat = ? AND Img.fromuser = ? AND Img.createtime > ? AND Img.status = ? ORDER BY Img.createtime DESC LIMIT 1;", "C2CMsgAutoDownloadRes", "C2CChatUsageResult"), new java.lang.String[]{java.lang.String.valueOf(Ni), java.lang.String.valueOf(Di), str, str, java.lang.String.valueOf(java.lang.System.currentTimeMillis() - 432000000), java.lang.String.valueOf(1)});
                try {
                    if (h17.moveToNext()) {
                        rcVar = eVar.a(h17);
                    } else {
                        h17.close();
                        rcVar = null;
                    }
                    i17 = 5;
                } finally {
                }
            }
            if (rcVar == null) {
                fq3.n nVar2 = (fq3.n) i95.n0.c(fq3.n.class);
                nVar2.requireAccountInitialized();
                rcVar = nVar2.f265530o.b(Ni, Di);
                i17 = 6;
            }
            if (rcVar == null) {
                fq3.n nVar3 = (fq3.n) i95.n0.c(fq3.n.class);
                nVar3.requireAccountInitialized();
                rcVar2 = nVar3.f265530o.d(128);
                i17 = 4;
            } else {
                rcVar2 = rcVar;
            }
            if (rcVar2 == null && cVar.b()) {
                int Ni2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_mmc2c_chat_img_auto_download_bg_rank, 20);
                float Di2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Di(e42.d0.clicfg_mmc2c_chat_img_auto_download_bg_score, 10.0f);
                fq3.n nVar4 = (fq3.n) i95.n0.c(fq3.n.class);
                nVar4.requireAccountInitialized();
                rcVar3 = nVar4.f265530o.b(Ni2, Di2);
                i18 = 7;
            } else {
                rcVar3 = rcVar2;
                i18 = i17;
            }
        } else {
            if (com.tencent.mm.sdk.platformtools.t8.K0(cVar.f153176g)) {
                i19 = 0;
                rcVar4 = null;
            } else {
                fq3.n nVar5 = (fq3.n) i95.n0.c(fq3.n.class);
                nVar5.requireAccountInitialized();
                com.tencent.mm.plugin.priority.model.c2c.img.e eVar2 = nVar5.f265530o;
                java.lang.String str2 = cVar.f153176g;
                eVar2.getClass();
                h17 = eVar2.f153182a.h(java.lang.String.format("SELECT * FROM %s WHERE status = ? AND fromuser = ? AND priority >= ? AND createtime > ? ORDER BY createtime DESC LIMIT 1;", "C2CMsgAutoDownloadRes"), new java.lang.String[]{java.lang.String.valueOf(1), java.lang.String.valueOf(str2), java.lang.String.valueOf(0.3f), java.lang.String.valueOf(java.lang.System.currentTimeMillis() - 432000000)});
                try {
                    if (h17.moveToNext()) {
                        rcVar4 = eVar2.a(h17);
                    } else {
                        h17.close();
                        rcVar4 = null;
                    }
                    i19 = 1;
                } finally {
                }
            }
            if (rcVar4 == null) {
                fq3.n nVar6 = (fq3.n) i95.n0.c(fq3.n.class);
                nVar6.requireAccountInitialized();
                com.tencent.mm.plugin.priority.model.c2c.img.e eVar3 = nVar6.f265530o;
                eVar3.getClass();
                h17 = eVar3.f153182a.h(java.lang.String.format("SELECT * FROM %s WHERE status = ? AND priority >= ? AND createtime > ? ORDER BY createtime DESC LIMIT 1;", "C2CMsgAutoDownloadRes"), new java.lang.String[]{java.lang.String.valueOf(1), java.lang.String.valueOf(0.3f), java.lang.String.valueOf(java.lang.System.currentTimeMillis() - 432000000)});
                try {
                    if (h17.moveToNext()) {
                        rcVar4 = eVar3.a(h17);
                    } else {
                        h17.close();
                        rcVar4 = null;
                    }
                    i19 = 2;
                } finally {
                }
            }
            if (rcVar4 == null) {
                fq3.n nVar7 = (fq3.n) i95.n0.c(fq3.n.class);
                nVar7.requireAccountInitialized();
                rcVar4 = nVar7.f265530o.d(128);
                i19 = 4;
            }
            if (rcVar4 == null && cVar.b()) {
                fq3.n nVar8 = (fq3.n) i95.n0.c(fq3.n.class);
                nVar8.requireAccountInitialized();
                com.tencent.mm.plugin.priority.model.c2c.img.e eVar4 = nVar8.f265530o;
                eVar4.getClass();
                h17 = eVar4.f153182a.h(java.lang.String.format("SELECT * FROM %s WHERE status = ? AND priority >= ? AND createtime > ? ORDER BY priority DESC, createtime DESC LIMIT 1;", "C2CMsgAutoDownloadRes"), new java.lang.String[]{java.lang.String.valueOf(1), java.lang.String.valueOf(0.1f), java.lang.String.valueOf(java.lang.System.currentTimeMillis() - 432000000)});
                try {
                    if (h17.moveToNext()) {
                        rcVar5 = eVar4.a(h17);
                    } else {
                        h17.close();
                        rcVar5 = null;
                    }
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    objArr[0] = java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED")).getIntExtra("plugged", -1) != 0);
                    com.tencent.mars.xlog.Log.i("MicroMsg.Priority.C2CImgAutoDownloader", "bg normal download %b", objArr);
                    rcVar3 = rcVar5;
                    i18 = 3;
                } finally {
                }
            } else {
                rcVar3 = rcVar4;
                i18 = i19;
            }
        }
        if (rcVar3 == null) {
            cVar.f153173d = 0L;
            com.tencent.mars.xlog.Log.i("MicroMsg.Priority.C2CImgAutoDownloader", "autoDownloadRes is null");
            return;
        }
        long j18 = rcVar3.f384709d;
        cVar.f153173d = j18;
        com.tencent.mars.xlog.Log.i("MicroMsg.Priority.C2CImgAutoDownloader", "curMsgId %d priority %.2f prioritytype %d way %d borderPriority %.2f bgBorderPriority %.2f", java.lang.Long.valueOf(j18), java.lang.Double.valueOf(rcVar3.f384720r), java.lang.Integer.valueOf(rcVar3.f384721s), java.lang.Integer.valueOf(i18), java.lang.Float.valueOf(0.3f), java.lang.Float.valueOf(0.1f));
        try {
            f9Var2 = pt0.f0.Li(rcVar3.f384710e, cVar.f153173d);
        } catch (java.lang.Error unused) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Priority.C2CImgAutoDownloader", "assert while get msg by msgId");
        }
        com.tencent.mm.storage.f9 f9Var3 = f9Var2;
        if (f9Var3 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Priority.C2CImgAutoDownloader", "can't get msgInfo of " + cVar.f153173d);
            fq3.n nVar9 = (fq3.n) i95.n0.c(fq3.n.class);
            nVar9.requireAccountInitialized();
            com.tencent.mm.plugin.priority.model.c2c.img.e eVar5 = nVar9.f265530o;
            long j19 = cVar.f153173d;
            com.tencent.wcdb.database.SQLiteStatement sQLiteStatement = eVar5.f153184c;
            sQLiteStatement.bindLong(1, j19);
            com.tencent.mars.xlog.Log.i("MicroMsg.Priority.C2CMsgAutoDownloadImgStorage", "delete %d img %d", java.lang.Integer.valueOf(sQLiteStatement.executeUpdateDelete()), java.lang.Long.valueOf(j19));
            cVar.f153173d = 0L;
            cVar.d();
            return;
        }
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        m11.b0 b27 = m11.b1.Di().b2(f9Var3.Q0(), f9Var3.I0());
        if (b27.f322651s == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Priority.C2CImgAutoDownloader", cVar.f153173d + " already has hd thumb");
            fq3.n nVar10 = (fq3.n) i95.n0.c(fq3.n.class);
            nVar10.requireAccountInitialized();
            nVar10.f265530o.f(cVar.f153173d, 5);
            cVar.f153173d = 0L;
            cVar.d();
            return;
        }
        ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).getClass();
        com.tencent.mm.modelcdntran.s1.fj().f70997u.add("image_" + f9Var3.getMsgId());
        if (com.tencent.mm.sdk.platformtools.t8.K0(cVar.f153176g) || !cVar.f153176g.equals(f9Var3.Q0())) {
            f9Var = f9Var3;
            b17 = ((m11.j) ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).Di()).b(b27.f322633a, tg3.l1.a(f9Var), 0, java.lang.Long.valueOf(cVar.f153173d), cVar.f153174e, cVar, com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL, false);
            com.tencent.mars.xlog.Log.i("MicroMsg.Priority.C2CImgAutoDownloader", "start download cdnautostart %d %s result=%d", java.lang.Long.valueOf(cVar.f153173d), "image_" + f9Var.getMsgId(), java.lang.Integer.valueOf(b17));
        } else {
            f9Var = f9Var3;
            b17 = ((m11.j) ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).Di()).b(b27.f322633a, tg3.l1.a(f9Var3), 0, java.lang.Long.valueOf(cVar.f153173d), cVar.f153174e, cVar, com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL, true);
            com.tencent.mars.xlog.Log.i("MicroMsg.Priority.C2CImgAutoDownloader", "start download cdnautostart %d %s %s result=%d", java.lang.Long.valueOf(cVar.f153173d), "image_" + f9Var.getMsgId(), cVar.f153176g, java.lang.Integer.valueOf(b17));
        }
        if (b17 != -4 && b17 != -3) {
            if (b17 == -2) {
                fq3.n nVar11 = (fq3.n) i95.n0.c(fq3.n.class);
                nVar11.requireAccountInitialized();
                nVar11.f265530o.f(cVar.f153173d, 3);
                if (i18 == 3) {
                    jx3.f.INSTANCE.idkeyStat(957L, 55L, 1L, false);
                } else if (i18 == 7) {
                    jx3.f.INSTANCE.idkeyStat(957L, 61L, 1L, false);
                }
                cVar.f153173d = 0L;
                cVar.d();
                return;
            }
            if (b17 == -1) {
                fq3.n nVar12 = (fq3.n) i95.n0.c(fq3.n.class);
                nVar12.requireAccountInitialized();
                nVar12.f265530o.f(cVar.f153173d, 4);
                if (i18 == 3) {
                    jx3.f.INSTANCE.idkeyStat(957L, 56L, 1L, false);
                } else if (i18 == 7) {
                    jx3.f.INSTANCE.idkeyStat(957L, 62L, 1L, false);
                }
                cVar.f153173d = 0L;
                cVar.d();
                return;
            }
            if (b17 != 0) {
                return;
            } else {
                kq3.i.f(rcVar3, f9Var);
            }
        }
        fq3.n nVar13 = (fq3.n) i95.n0.c(fq3.n.class);
        nVar13.requireAccountInitialized();
        nVar13.f265530o.f(cVar.f153173d, 2);
        if (i18 == 3) {
            jx3.f.INSTANCE.idkeyStat(957L, 52L, 1L, false);
            return;
        }
        if (i18 == 1) {
            jx3.f.INSTANCE.idkeyStat(957L, 50L, 1L, false);
            return;
        }
        if (i18 == 4) {
            jx3.f.INSTANCE.idkeyStat(957L, 57L, 1L, false);
            return;
        }
        if (i18 == 5) {
            jx3.f.INSTANCE.idkeyStat(957L, 58L, 1L, false);
            return;
        }
        if (i18 == 6) {
            jx3.f.INSTANCE.idkeyStat(957L, 59L, 1L, false);
        } else if (i18 == 7) {
            jx3.f.INSTANCE.idkeyStat(957L, 60L, 1L, false);
        } else {
            jx3.f.INSTANCE.idkeyStat(957L, 51L, 1L, false);
        }
    }
}
