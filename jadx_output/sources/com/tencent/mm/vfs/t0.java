package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public class t0 implements com.tencent.mm.vfs.x2 {
    @Override // com.tencent.mm.vfs.x2
    public void a(android.os.CancellationSignal cancellationSignal) {
        synchronized (com.tencent.mm.vfs.c1.f212848g) {
            com.tencent.mm.vfs.c1.f212850i = new java.util.HashMap();
        }
        com.tencent.mars.xlog.Log.i("VFS.DiskFileStatistics", "Begin statistics maintenance");
    }

    @Override // com.tencent.mm.vfs.x2
    public boolean b(java.lang.String str, com.tencent.mm.vfs.q2 q2Var, android.os.CancellationSignal cancellationSignal) {
        return true;
    }

    @Override // com.tencent.mm.vfs.x2
    public void c(boolean z17, boolean z18, android.os.CancellationSignal cancellationSignal) {
        int i17;
        boolean z19;
        long j17;
        if (z17 || z18) {
            synchronized (com.tencent.mm.vfs.c1.f212848g) {
                com.tencent.mars.xlog.Log.i("VFS.DiskFileStatistics", "Interrupted statistics maintenance, statistics count: " + com.tencent.mm.vfs.c1.f212850i.size());
                com.tencent.mm.vfs.c1.f212849h.putAll(com.tencent.mm.vfs.c1.f212850i);
                com.tencent.mm.vfs.c1.f212850i = null;
            }
            return;
        }
        try {
            java.lang.Iterable p17 = com.tencent.mm.vfs.e8.p(new com.tencent.mm.vfs.NativeFileSystem("${extData}/MicroMsg/${accountSalt}/record").b(com.tencent.mm.vfs.a3.f212781a.c()), "", false, null);
            if (p17 != null) {
                java.util.Iterator it = ((pm5.b) p17).iterator();
                j17 = 0;
                while (true) {
                    pm5.c cVar = (pm5.c) it;
                    if (!cVar.hasNext()) {
                        break;
                    }
                    com.tencent.mm.vfs.x1 x1Var = (com.tencent.mm.vfs.x1) cVar.next();
                    if (x1Var.f213236f) {
                        long j18 = x1Var.f213235e;
                        if (j18 > 1650902400000L) {
                            j17 = java.lang.Math.max(j17, j18);
                        }
                    }
                }
            } else {
                j17 = 0;
            }
            if (j17 > 0) {
                jx3.f fVar = jx3.f.INSTANCE;
                fVar.d(21388, "@WrongMigration-record", 0, 0, "", 0, 0, 0, 0, 0, java.lang.Long.valueOf(j17), 0, 0, com.tencent.mm.sdk.platformtools.z.f193109e);
                fVar.t(1912, 2);
                com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
                com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_C2C_OTHER_ACCOUNT_WRONG_MIGRANT_INT_SYNC;
                if (c17.t(u3Var, 0L) == 0) {
                    gm0.j1.u().c().x(u3Var, 2);
                }
            }
            com.tencent.mm.storage.n3 c18 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var2 = com.tencent.mm.storage.u3.USERINFO_C2C_RESCUE_OTHER_ACCOUNT_VOICE2_HIT_INT_SYNC;
            if (c18.r(u3Var2, 0) != 0) {
                gm0.j1.u().c().x(u3Var2, 0);
                jx3.f fVar2 = jx3.f.INSTANCE;
                fVar2.d(21388, "@WrongMigration-voice2", 0, 0, "", 0, 0, 0, 0, 0, 0, 0, 0, com.tencent.mm.sdk.platformtools.z.f193109e);
                fVar2.t(1912, 3);
            }
            com.tencent.mm.storage.n3 c19 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var3 = com.tencent.mm.storage.u3.USERINFO_C2C_RESCUE_OTHER_ACCOUNT_VIDEO_HIT_INT_SYNC;
            if (c19.r(u3Var3, 0) != 0) {
                gm0.j1.u().c().x(u3Var3, 0);
                jx3.f fVar3 = jx3.f.INSTANCE;
                fVar3.d(21388, "@WrongMigration-video", 0, 0, "", 0, 0, 0, 0, 0, 0, 0, 0, com.tencent.mm.sdk.platformtools.z.f193109e);
                fVar3.t(1912, 4);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("VFS.DiskFileStatistics", e17, "Cannot report wrong migration", new java.lang.Object[0]);
        }
        d();
        if (!(j62.e.g().c(new com.tencent.mm.repairer.config.msgrefactor.RepairerConfigCalcTypeMsgsStorage()) == 1)) {
            com.tencent.mars.xlog.Log.i("VFS.DiskFileStatistics", "calcMediaMessageStorage expt false");
        } else if (java.lang.System.currentTimeMillis() - com.tencent.mm.sdk.platformtools.o4.L().getLong("last_calcTypeMessageStorage", 0L) < 1209600000) {
            com.tencent.mars.xlog.Log.i("VFS.DiskFileStatistics", "Not time to calcTypeMessageStorage");
        } else {
            try {
                d95.f.q();
                qi3.y.sc();
            } finally {
                try {
                } finally {
                }
            }
        }
        if (java.lang.System.currentTimeMillis() - com.tencent.mm.sdk.platformtools.o4.L().getLong("last_calcC2CMediaInfo", 0L) < 1209600000) {
            com.tencent.mars.xlog.Log.i("VFS.DiskFileStatistics", "Not time to calcC2CMediaInfo");
        } else {
            try {
                qi3.y.p4();
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("VFS.DiskFileStatistics", th6, "calcC2CMediaInfo failed", new java.lang.Object[0]);
            }
        }
        try {
            ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.vfs.s0(this, d95.f.f227662h, true), "saveDbFreePage");
            ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.vfs.s0(this, d95.f.f227663i, false), "saveDbFreePage");
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.lang.Iterable<com.tencent.mm.vfs.x1> list = new com.tencent.mm.vfs.NativeFileSystem("${data}/MicroMsg/${account}").b(com.tencent.mm.vfs.a3.f212781a.c()).list("");
            if (list != null) {
                for (com.tencent.mm.vfs.x1 x1Var2 : list) {
                    if (!x1Var2.f213236f && x1Var2.f213232b.endsWith(".db")) {
                        java.lang.String str = "${data}/MicroMsg/${account}/" + x1Var2.f213232b;
                        com.tencent.mm.vfs.a1 a1Var = new com.tencent.mm.vfs.a1("@DiskSpace-DB", 12, 0, str, x1Var2.f213234d, 1, 0, 1, x1Var2.f213233c, x1Var2.f213235e - currentTimeMillis, 0L, 0L);
                        synchronized (com.tencent.mm.vfs.c1.f212848g) {
                            java.util.Map map = com.tencent.mm.vfs.c1.f212850i;
                            if (map == null) {
                                map = com.tencent.mm.vfs.c1.f212849h;
                            }
                            map.put(str + "|@DiskSpace-DB", a1Var);
                        }
                    }
                }
            }
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("VFS.DiskFileStatistics", e18, "Failed to calculate databases.", new java.lang.Object[0]);
        }
        boolean z27 = "1".equals(j62.e.g().j("clicfg_diskspace_force_report", "0", true, true)) || com.tencent.mm.vfs.c1.j() || z65.c.a();
        synchronized (com.tencent.mm.vfs.c1.f212848g) {
            java.util.Map map2 = com.tencent.mm.vfs.c1.f212850i;
            com.tencent.mm.vfs.c1.f212849h = map2;
            java.util.Iterator it6 = map2.values().iterator();
            int i18 = 0;
            while (true) {
                i17 = 14;
                if (!it6.hasNext()) {
                    break;
                }
                com.tencent.mm.vfs.a1 a1Var2 = (com.tencent.mm.vfs.a1) it6.next();
                java.util.Iterator it7 = ((java.util.HashSet) com.tencent.mm.vfs.c1.f212858q).iterator();
                while (true) {
                    if (it7.hasNext()) {
                        if (((com.tencent.mm.vfs.b1) it7.next()).c(a1Var2)) {
                            z19 = true;
                            break;
                        }
                    } else {
                        z19 = false;
                        break;
                    }
                }
                if (!z19) {
                    if (z27 && a1Var2.f212769e > 0) {
                        jx3.f.INSTANCE.d(21388, a1Var2.f212765a, java.lang.Integer.valueOf(a1Var2.f212766b), java.lang.Integer.valueOf(a1Var2.f212767c), a1Var2.f212768d, java.lang.Long.valueOf(a1Var2.f212769e), java.lang.Integer.valueOf(a1Var2.f212770f), java.lang.Integer.valueOf(a1Var2.f212771g), java.lang.Integer.valueOf(a1Var2.f212772h), java.lang.Long.valueOf(a1Var2.f212773i), 0L, java.lang.Long.valueOf(a1Var2.f212774j), java.lang.Long.valueOf(a1Var2.f212775k), java.lang.Long.valueOf(a1Var2.f212776l), com.tencent.mm.sdk.platformtools.z.f193109e);
                    }
                    com.tencent.mars.xlog.Log.i("VFS.DiskFileStatistics", "KV > name: %s, type: %d, flags: %d, path: %s, totalSize: %d, fileCount: %d, dirCount: %d, maxDepth: %d, maxFileSize: %d, filesAge: %d", a1Var2.f212765a, java.lang.Integer.valueOf(a1Var2.f212766b), java.lang.Integer.valueOf(a1Var2.f212767c), a1Var2.f212768d, java.lang.Long.valueOf(a1Var2.f212769e), java.lang.Integer.valueOf(a1Var2.f212770f), java.lang.Integer.valueOf(a1Var2.f212771g), java.lang.Integer.valueOf(a1Var2.f212772h), java.lang.Long.valueOf(a1Var2.f212773i), java.lang.Long.valueOf(a1Var2.f212774j));
                    i18++;
                }
            }
            java.util.Iterator it8 = ((java.util.HashSet) com.tencent.mm.vfs.c1.f212858q).iterator();
            while (it8.hasNext()) {
                com.tencent.mm.vfs.a1 b17 = ((com.tencent.mm.vfs.b1) it8.next()).b();
                if (b17 != null) {
                    if (z27 && b17.f212769e > 0) {
                        jx3.f fVar4 = jx3.f.INSTANCE;
                        java.lang.Object[] objArr = new java.lang.Object[i17];
                        objArr[0] = b17.f212765a;
                        objArr[1] = java.lang.Integer.valueOf(b17.f212766b);
                        objArr[2] = java.lang.Integer.valueOf(b17.f212767c);
                        objArr[3] = b17.f212768d;
                        objArr[4] = java.lang.Long.valueOf(b17.f212769e);
                        objArr[5] = java.lang.Integer.valueOf(b17.f212770f);
                        objArr[6] = java.lang.Integer.valueOf(b17.f212771g);
                        objArr[7] = java.lang.Integer.valueOf(b17.f212772h);
                        objArr[8] = java.lang.Long.valueOf(b17.f212773i);
                        objArr[9] = 0L;
                        objArr[10] = java.lang.Long.valueOf(b17.f212774j);
                        objArr[11] = java.lang.Long.valueOf(b17.f212775k);
                        objArr[12] = java.lang.Long.valueOf(b17.f212776l);
                        objArr[13] = com.tencent.mm.sdk.platformtools.z.f193109e;
                        fVar4.d(21388, objArr);
                    }
                    com.tencent.mars.xlog.Log.i("VFS.DiskFileStatistics", "KV > name: %s, type: %d, flags: %d, path: %s, totalSize: %d, fileCount: %d, dirCount: %d, maxDepth: %d, maxFileSize: %d, filesAge: %d", b17.f212765a, java.lang.Integer.valueOf(b17.f212766b), java.lang.Integer.valueOf(b17.f212767c), b17.f212768d, java.lang.Long.valueOf(b17.f212769e), java.lang.Integer.valueOf(b17.f212770f), java.lang.Integer.valueOf(b17.f212771g), java.lang.Integer.valueOf(b17.f212772h), java.lang.Long.valueOf(b17.f212773i), java.lang.Long.valueOf(b17.f212774j));
                    i18++;
                }
                i17 = 14;
            }
            if (z27) {
                com.tencent.mm.vfs.c1.c();
            }
            com.tencent.mars.xlog.Log.i("VFS.DiskFileStatistics", "End statistics maintenance, reported: %d, count: %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(com.tencent.mm.vfs.c1.f212850i.size()));
            com.tencent.mm.vfs.c1.f212850i = null;
            com.tencent.mm.vfs.c1.f212851j = true;
        }
        com.tencent.mm.vfs.c1.b();
    }

    public final void d() {
        if (!"1".equals(j62.e.g().j("clicfg_storage_efficiency_report", "0", true, true))) {
            com.tencent.mars.xlog.Log.i("VFS.DiskFileStatistics", "calcAndSaveMessageStorage expt false");
            return;
        }
        long j17 = 0;
        if (java.lang.System.currentTimeMillis() - com.tencent.mm.sdk.platformtools.o4.L().getLong("last_calcAndSaveMessageStorage", 0L) < 1209600000) {
            com.tencent.mars.xlog.Log.i("VFS.DiskFileStatistics", "Not time to calcAndSaveMessageStorage");
            return;
        }
        int i17 = 4;
        try {
            d95.f.q();
            l75.k0 k0Var = gm0.j1.u().f273153f;
            android.database.Cursor Ai = ((ot0.g3) ((com.tencent.mm.app.w2) i95.n0.c(com.tencent.mm.app.w2.class))).Ai();
            long j18 = 0;
            long j19 = 0;
            long j27 = 0;
            long j28 = 0;
            long j29 = 0;
            while (Ai.moveToNext()) {
                int i18 = Ai.getInt(0);
                long j37 = Ai.getLong(1);
                long j38 = Ai.getLong(2) + Ai.getLong(3) + Ai.getLong(i17);
                com.tencent.mars.xlog.Log.i("VFS.DiskFileStatistics", "type = $type, count = $count, contentSize = $contentSize, lvbufferSize = $lvbufferSize, reservedSize = $reservedSize, sumSize = $sumSize");
                if (java.lang.System.currentTimeMillis() % 10 != j17) {
                    jx3.f.INSTANCE.d(21019, java.lang.Long.valueOf(j37), java.lang.Long.valueOf(j38), java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.jsapi.sensor.z.CTRL_INDEX), "" + i18, "", java.lang.Long.valueOf(j38 / j37));
                }
                j18 += j37;
                if (i18 == 1) {
                    j19 = j37;
                } else if (i18 == 3) {
                    j27 = j37;
                } else if (i18 == 34) {
                    j29 = j37;
                } else if (i18 == 43) {
                    j28 = j37;
                }
                j17 = 0;
                i17 = 4;
            }
            Ai.close();
            android.database.Cursor B = k0Var.B("SELECT SUM(videolength) FROM videoinfo2,message WHERE message.msgId=videoinfo2.msglocalid", null);
            long j39 = 0;
            while (B.moveToNext()) {
                j39 = B.getLong(0);
            }
            B.close();
            android.database.Cursor B2 = k0Var.B("SELECT SUM(VoiceLength) FROM voiceinfo,message WHERE message.msgId=voiceinfo.msglocalid", null);
            long j47 = 0;
            while (B2.moveToNext()) {
                j47 = B2.getLong(0) / 1000;
            }
            B2.close();
            com.tencent.mm.sdk.platformtools.o4.L().B("daily_storage_total_msg_count", j18);
            com.tencent.mm.sdk.platformtools.o4.L().B("daily_storage_text_msg_count", j19);
            com.tencent.mm.sdk.platformtools.o4.L().B("daily_storage_image_msg_count", j27);
            com.tencent.mm.sdk.platformtools.o4.L().B("daily_storage_video_msg_count", j28);
            com.tencent.mm.sdk.platformtools.o4.L().B("daily_storage_voice_msg_count", j29);
            com.tencent.mm.sdk.platformtools.o4.L().B("daily_storage_video_msg_len", j39);
            com.tencent.mm.sdk.platformtools.o4.L().B("daily_storage_voice_msg_len", j47);
            com.tencent.mm.sdk.platformtools.o4.L().B("last_calcAndSaveMessageStorage", java.lang.System.currentTimeMillis());
        } finally {
            try {
            } finally {
            }
        }
    }
}
