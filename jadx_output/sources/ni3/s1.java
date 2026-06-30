package ni3;

/* loaded from: classes12.dex */
public class s1 implements java.lang.Runnable {
    public s1(ni3.g2 g2Var) {
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        long j17;
        int i17;
        int i18;
        boolean z17;
        long j18;
        long j19;
        long j27;
        long j28;
        long j29;
        int i19;
        long j37;
        long j38;
        try {
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.storage.v3.f196273a + "SdcardInfo.cfg");
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.idkeyStat(340L, r6Var.m() ? 10L : 11L, 1L, true);
            boolean c17 = com.tencent.mm.sdk.platformtools.o7.c();
            java.lang.String path = fp.m.a().getPath();
            java.lang.String path2 = fp.m.b().getPath();
            android.os.StatFs statFs = new android.os.StatFs(path);
            long blockSize = statFs.getBlockSize();
            long blockCount = statFs.getBlockCount();
            long availableBlocks = statFs.getAvailableBlocks();
            long j39 = blockSize * blockCount;
            long j47 = blockSize * availableBlocks;
            int round = blockCount > 0 ? java.lang.Math.round((((float) availableBlocks) * 100.0f) / ((float) blockCount)) : -1;
            android.os.StatFs statFs2 = new android.os.StatFs(path2);
            long blockSize2 = statFs2.getBlockSize();
            long blockCount2 = statFs2.getBlockCount();
            long availableBlocks2 = statFs2.getAvailableBlocks();
            long j48 = blockSize2 * blockCount2;
            long j49 = blockSize2 * availableBlocks2;
            if (blockCount2 > 0) {
                j17 = availableBlocks2;
                try {
                    i17 = java.lang.Math.round((((float) availableBlocks2) * 100.0f) / ((float) blockCount2));
                } catch (java.lang.Exception e17) {
                    e = e17;
                    str = "MicroMsg.SubCoreBaseMonitor";
                    com.tencent.mars.xlog.Log.printErrStackTrace(str, e, "reportSDStatus err!", new java.lang.Object[0]);
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(340L, 8L, 1L, true);
                }
            } else {
                j17 = availableBlocks2;
                i17 = -1;
            }
            boolean equals = lp0.b.Y().equals(path2);
            if (equals) {
                i18 = i17;
                z17 = equals;
                j18 = blockCount2;
                j19 = blockSize2;
                j27 = j48;
                j28 = j49;
                j29 = j17;
                i19 = i18;
                j37 = j18;
                j38 = j19;
            } else {
                z17 = equals;
                android.os.StatFs statFs3 = new android.os.StatFs(lp0.b.Y());
                i18 = i17;
                j38 = statFs3.getBlockSize();
                j18 = blockCount2;
                long blockCount3 = statFs3.getBlockCount();
                j19 = blockSize2;
                long availableBlocks3 = statFs3.getAvailableBlocks();
                long j57 = j38 * blockCount3;
                long j58 = j38 * availableBlocks3;
                if (blockCount3 > 0) {
                    j28 = j58;
                    j27 = j57;
                    j29 = availableBlocks3;
                    i19 = java.lang.Math.round((((float) availableBlocks3) * 100.0f) / ((float) blockCount3));
                    j38 = j38;
                    j37 = blockCount3;
                } else {
                    j28 = j58;
                    j37 = blockCount3;
                    i19 = i18;
                    j27 = j57;
                    j29 = availableBlocks3;
                }
            }
            java.lang.String a17 = com.tencent.mm.sdk.platformtools.o7.a(lp0.b.Y());
            java.lang.String a18 = com.tencent.mm.sdk.platformtools.o7.a(path);
            java.lang.Object[] objArr = new java.lang.Object[26];
            objArr[0] = path;
            objArr[1] = path2;
            objArr[2] = lp0.b.Y();
            objArr[3] = a17;
            objArr[4] = java.lang.Boolean.valueOf(c17);
            objArr[5] = java.lang.Long.valueOf(blockSize);
            objArr[6] = java.lang.Long.valueOf(blockCount);
            objArr[7] = java.lang.Long.valueOf(availableBlocks);
            objArr[8] = java.lang.Long.valueOf(j39);
            objArr[9] = java.lang.Long.valueOf(j47);
            objArr[10] = java.lang.Integer.valueOf(round);
            objArr[11] = java.lang.Long.valueOf(j19);
            objArr[12] = java.lang.Long.valueOf(j18);
            objArr[13] = java.lang.Long.valueOf(j17);
            objArr[14] = java.lang.Long.valueOf(j48);
            objArr[15] = java.lang.Long.valueOf(j49);
            objArr[16] = java.lang.Integer.valueOf(i18);
            objArr[17] = java.lang.Boolean.valueOf(z17);
            objArr[18] = java.lang.Long.valueOf(j38);
            objArr[19] = java.lang.Long.valueOf(j37);
            objArr[20] = java.lang.Long.valueOf(j29);
            objArr[21] = java.lang.Long.valueOf(j27);
            objArr[22] = java.lang.Long.valueOf(j28);
            objArr[23] = java.lang.Integer.valueOf(i19);
            objArr[24] = java.lang.Integer.valueOf(r6Var.m() ? 1 : 0);
            objArr[25] = a18;
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreBaseMonitor", "summerStorage [%s, %s, %s] [%s] [%b] [%d,%d,%d,%d,%d,%d] [%d,%d,%d,%d,%d,%d] [%b] [%d,%d,%d,%d,%d,%d], [%d][%s]", objArr);
                str = "MicroMsg.SubCoreBaseMonitor";
                try {
                    g0Var.idkeyStat(340L, 0L, 1L, true);
                    g0Var.idkeyStat(340L, c17 ? 1L : 2L, 1L, true);
                    g0Var.idkeyStat(340L, z17 ? 3L : 4L, 1L, true);
                    java.lang.Object[] objArr2 = new java.lang.Object[2];
                    objArr2[0] = 5000;
                    java.lang.Object[] objArr3 = new java.lang.Object[26];
                    objArr3[0] = path;
                    objArr3[1] = path2;
                    objArr3[2] = lp0.b.Y();
                    objArr3[3] = a17;
                    objArr3[4] = java.lang.Integer.valueOf(c17 ? 1 : 0);
                    objArr3[5] = java.lang.Long.valueOf(blockSize);
                    objArr3[6] = java.lang.Long.valueOf(blockCount);
                    objArr3[7] = java.lang.Long.valueOf(availableBlocks);
                    objArr3[8] = java.lang.Long.valueOf(j39);
                    objArr3[9] = java.lang.Long.valueOf(j47);
                    objArr3[10] = java.lang.Integer.valueOf(round);
                    objArr3[11] = java.lang.Long.valueOf(j19);
                    objArr3[12] = java.lang.Long.valueOf(j18);
                    objArr3[13] = java.lang.Long.valueOf(j17);
                    objArr3[14] = java.lang.Long.valueOf(j48);
                    objArr3[15] = java.lang.Long.valueOf(j49);
                    objArr3[16] = java.lang.Integer.valueOf(i18);
                    objArr3[17] = java.lang.Integer.valueOf(z17 ? 1 : 0);
                    objArr3[18] = java.lang.Long.valueOf(j38);
                    objArr3[19] = java.lang.Long.valueOf(j37);
                    objArr3[20] = java.lang.Long.valueOf(j29);
                    objArr3[21] = java.lang.Long.valueOf(j27);
                    objArr3[22] = java.lang.Long.valueOf(j28);
                    objArr3[23] = java.lang.Integer.valueOf(i19);
                    objArr3[24] = java.lang.Integer.valueOf(r6Var.m() ? 1 : 0);
                    objArr3[25] = a18;
                    objArr2[1] = java.lang.String.format("%s;%s;%s;%s;%d;%d;%d;%d;%d;%d;%d;%d;%d;%d;%d;%d;%d;%d;%d;%d;%d;%d;%d;%d;%d;%s", objArr3);
                    g0Var.d(11098, objArr2);
                    g0Var.d(11098, java.lang.Integer.valueOf(com.tencent.thumbplayer.api.TPPlayerMsg.TP_PLAYER_INFO_LONG0_PREPARE_TIMEOUT), path + ";" + a18);
                    g0Var.d(11098, 5002, lp0.b.Y() + ";" + a17);
                    java.lang.Object[] objArr4 = new java.lang.Object[2];
                    objArr4[0] = 5003;
                    objArr4[1] = java.lang.Integer.valueOf(r6Var.m() ? 1 : 0);
                    g0Var.d(11098, objArr4);
                    java.lang.Object[] objArr5 = new java.lang.Object[2];
                    objArr5[0] = 5004;
                    objArr5[1] = java.lang.Integer.valueOf(c17 ? 1 : 0);
                    g0Var.d(11098, objArr5);
                    g0Var.idkeyStat(340L, 7L, 1L, true);
                } catch (java.lang.Exception e18) {
                    e = e18;
                    com.tencent.mars.xlog.Log.printErrStackTrace(str, e, "reportSDStatus err!", new java.lang.Object[0]);
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(340L, 8L, 1L, true);
                }
            } catch (java.lang.Exception e19) {
                e = e19;
                str = "MicroMsg.SubCoreBaseMonitor";
            }
        } catch (java.lang.Exception e27) {
            e = e27;
            str = "MicroMsg.SubCoreBaseMonitor";
        }
    }
}
