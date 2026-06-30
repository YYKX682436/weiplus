package w73;

/* loaded from: classes11.dex */
public abstract class f {
    public static void a() {
        try {
            java.lang.Iterable<com.tencent.mm.vfs.x1> s17 = com.tencent.mm.vfs.w6.s(com.tencent.mm.sdk.platformtools.x2.f193071a.getExternalCacheDir().getAbsolutePath(), false);
            if (s17 == null) {
                return;
            }
            for (com.tencent.mm.vfs.x1 x1Var : s17) {
                java.lang.String str = x1Var.f213232b;
                if (str.startsWith("mm_patch") && str.endsWith("tmp")) {
                    x1Var.a();
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", th6, "", new java.lang.Object[0]);
        }
    }

    public static boolean b(java.lang.String str, int i17) {
        boolean z17 = false;
        if (i17 == 0) {
            return false;
        }
        try {
            java.io.File file = new java.io.File(str);
            com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "newApk.size = " + file.length());
            z17 = ak0.z.b(file);
            com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "合成失败，不保留文件，防止出现检测文件存在就去安装，因为现在没有md5了, deleteDownloadPatch = " + z17);
            return z17;
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "deleteDownloadPatch = " + z17);
            return z17;
        }
    }

    public static boolean c() {
        return bm5.o1.f22719a.g(bm5.h0.RepairerConfig_Updater_HdiffMOCKOLDAPK_Int, 0) == 1;
    }

    public static int d(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        java.io.File file;
        java.io.File file2;
        java.io.File file3;
        java.io.File file4;
        java.io.File file5 = new java.io.File(str4);
        if (str == null || str2 == null || str3 == null) {
            b(str3, -5);
            com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "deleteOldDeltaPatch = " + ak0.z.b(file5));
            return -5;
        }
        try {
            try {
                com.tencent.mm.vfs.w6.u(com.tencent.mm.vfs.w6.r(str3));
                file = new java.io.File(str);
                file2 = new java.io.File(str3);
                file3 = new java.io.File(str2);
                file4 = new java.io.File(str4);
            } catch (java.lang.Throwable th6) {
                th = th6;
            }
        } catch (java.lang.Exception e17) {
            e = e17;
        } catch (java.lang.OutOfMemoryError e18) {
            e = e18;
        }
        try {
            file2.deleteOnExit();
            com.tencent.mm.vfs.w6.e(str3);
            if (!file.exists() || !file3.exists()) {
                if (file3.exists()) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 175L, 1L, false);
                } else {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 174L, 1L, false);
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "MicroMsg.MergePatchApk:.HdiffApk file not found in merge(): oldFile.exists()=%s , newFile.exists()=%s , patch.exists()=%s ", java.lang.Boolean.valueOf(file.exists()), java.lang.Boolean.valueOf(file2.exists()), java.lang.Boolean.valueOf(file3.exists()));
                a();
                b(str3, -1);
                com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "deleteOldDeltaPatch = " + ak0.z.b(file4));
                return -1;
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            int b17 = file4.exists() ? k51.a.b(file, file3, file2, file4) : k51.a.b(file, file3, file2, null);
            long currentTimeMillis2 = (java.lang.System.currentTimeMillis() - currentTimeMillis) / 1000;
            g(currentTimeMillis2, file3.length());
            f(b17);
            com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "MicroMsg.HdiffApk:statusCode = %d， stayTime= %d", java.lang.Integer.valueOf(b17), java.lang.Long.valueOf(currentTimeMillis2));
            if (b17 == 303) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "HdiffApk happen check crc error, deleteNewApkFile, delete? success = " + com.tencent.mm.vfs.w6.h(str3));
            }
            if (b17 != 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "MicroMsg.MergePatchApk:merge failed in patchLessMemory()");
                a();
                b(str3, b17);
                com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "deleteOldDeltaPatch = " + ak0.z.b(file4));
                return b17;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "HdiffApk response.newApkMd5:%s file md5:%s", str5, com.tencent.mm.vfs.w6.p(str3));
            a();
            b(str3, 0);
            com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "deleteOldDeltaPatch = " + ak0.z.b(file4));
            return 0;
        } catch (java.lang.Exception e19) {
            e = e19;
            file5 = file4;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", e, ".HdiffApk merge apk failed.", new java.lang.Object[0]);
            a();
            b(str3, -1);
            com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "deleteOldDeltaPatch = " + ak0.z.b(file5));
            return -4;
        } catch (java.lang.OutOfMemoryError e27) {
            e = e27;
            file5 = file4;
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 201L, 1L, false);
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", e, ".HdiffApk merge apk failed.", new java.lang.Object[0]);
            a();
            b(str3, -1);
            com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "deleteOldDeltaPatch = " + ak0.z.b(file5));
            return -6;
        } catch (java.lang.Throwable th7) {
            th = th7;
            file5 = file4;
            a();
            b(str3, -1);
            com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "deleteOldDeltaPatch = " + ak0.z.b(file5));
            throw th;
        }
    }

    public static void e() {
        try {
            java.lang.String string = com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).getString("update_old_delata_file_head_infor_tmp", "");
            java.lang.String string2 = com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).getString("update_old_delata_file_tmp", "");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(string) && com.tencent.mm.vfs.w6.h(string)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "removeUnUseFile, headinfo_file = " + string);
                com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).putString("update_old_delata_file_head_infor_tmp", "");
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(string) || !com.tencent.mm.vfs.w6.h(string2)) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "removeUnUseFile, headinfo_file = " + string2);
            com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).putString("update_old_delata_file_tmp", "");
        } catch (java.lang.Exception unused) {
        }
    }

    public static void f(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "MicroMsg.MergePatchApk.HdiffApk: reportErrorLog statusCode = %s.", java.lang.Integer.valueOf(i17));
        if (i17 != 0) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 150L, 1L, false);
            com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "MicroMsg.MergePatchApk.HdiffApk: reportErrorLog status = common error");
        }
        if (i17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "MicroMsg.MergePatchApk.HdiffApk: reportErrorLog status = PATCH_SUCCESS");
            return;
        }
        if (i17 == 101) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "MicroMsg.MergePatchApk.HdiffApk: reportErrorLog status = PATCH_VIRTUAL_IN_BEGIN_ERROR");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 190L, 1L, false);
            return;
        }
        if (i17 == 102) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "MicroMsg.MergePatchApk.HdiffApk: reportErrorLog status = PATCH_VIRTUAL_IN_END_ERROR");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 191L, 1L, false);
            return;
        }
        switch (i17) {
            case 301:
                com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "MicroMsg.MergePatchApk.HdiffApk: reportErrorLog status = PATCH_OPENREAD_ERROR");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 151L, 1L, false);
                return;
            case 302:
                com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "MicroMsg.MergePatchApk.HdiffApk: reportErrorLog status = PATCH_OPENWRITE_ERROR");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 152L, 1L, false);
                return;
            case 303:
                com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "MicroMsg.MergePatchApk.HdiffApk: reportErrorLog status = PATCH_OPENWRITE_ERROR");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 153L, 1L, false);
                return;
            case 304:
                com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "MicroMsg.MergePatchApk.HdiffApk: reportErrorLog status = PATCH_CLOSEFILE_ERROR");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 154L, 1L, false);
                return;
            case 305:
                com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "MicroMsg.MergePatchApk.HdiffApk: reportErrorLog status = PATCH_MEM_ERROR");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 155L, 1L, false);
                return;
            case com.tencent.thumbplayer.tplayer.plugins.ITPEventID.RICH_MEDIA_SYNCHRONIZER_RESET /* 306 */:
                com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "MicroMsg.MergePatchApk.HdiffApk: reportErrorLog status = PATCH_HDIFFINFO_ERROR");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 156L, 1L, false);
                return;
            case com.tencent.thumbplayer.tplayer.plugins.ITPEventID.RICH_MEDIA_SYNCHRONIZER_RELEASE /* 307 */:
                com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "MicroMsg.MergePatchApk.HdiffApk: reportErrorLog status = PATCH_COMPRESSTYPE_ERROR");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 157L, 1L, false);
                return;
            case com.tencent.thumbplayer.tplayer.plugins.ITPEventID.RICH_MEDIA_SYNCHRONIZER_ON_ERROR /* 308 */:
                com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "MicroMsg.MergePatchApk.HdiffApk: reportErrorLog status = PATCH_ZIPPATCH_ERROR");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 158L, 1L, false);
                return;
            case com.tencent.thumbplayer.tplayer.plugins.ITPEventID.RICH_MEDIA_SYNCHRONIZER_SET_URL /* 309 */:
                com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "MicroMsg.MergePatchApk.HdiffApk: reportErrorLog status = PATCH_ZIPDIFFINFO_ERROR");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 159L, 1L, false);
                return;
            case 310:
                com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "MicroMsg.MergePatchApk.HdiffApk: reportErrorLog status = PATCH_OLDDECOMPRESS_ERROR");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 160L, 1L, false);
                return;
            case 311:
                com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "MicroMsg.MergePatchApk.HdiffApk: reportErrorLog status = PATCH_OLDSTREAM_ERROR");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 161L, 1L, false);
                return;
            case 312:
                com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "MicroMsg.MergePatchApk.HdiffApk: reportErrorLog status = PATCH_NEWSTREAM_ERROR");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 162L, 1L, false);
                return;
            case 313:
                com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "MicroMsg.MergePatchApk.HdiffApk: reportErrorLog status = PATCH_FILE_OPENREAD_ERROR_INPUT_OPEN");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 163L, 1L, false);
                return;
            case 314:
                com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "MicroMsg.MergePatchApk.HdiffApk: reportErrorLog status = PATCH_FILE_OPENREAD_ERROR_OPEN_STREAM");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 164L, 1L, false);
                return;
            case qf1.n.CTRL_INDEX /* 315 */:
                com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "MicroMsg.MergePatchApk.HdiffApk: reportErrorLog status = PATCH_OPENREAD_ERROR_OLDZIPPATH");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 165L, 1L, false);
                return;
            case qf1.e.CTRL_INDEX /* 316 */:
                com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "MicroMsg.MergePatchApk.HdiffApk: reportErrorLog status = PATCH_OPENREAD_ERROR_OLDZIP_STREAM");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 166L, 1L, false);
                return;
            case qf1.j.CTRL_INDEX /* 317 */:
                com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "MicroMsg.MergePatchApk.HdiffApk: reportErrorLog status = PATCH_OPENREAD_ERROR_NEW_ZIP_RESULT");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 167L, 1L, false);
                return;
            case qf1.f.CTRL_INDEX /* 318 */:
                com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "MicroMsg.MergePatchApk.HdiffApk: reportErrorLog status = PATCH_OLDDATA_ERROR_CESIZE");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 168L, 1L, false);
                return;
            case 319:
                com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "MicroMsg.MergePatchApk.HdiffApk: reportErrorLog status = PATCH_OLDDATA_ERROR_OLDCRC");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 169L, 1L, false);
                return;
            case com.tencent.mapsdk.internal.km.f50100e /* 320 */:
                com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "MicroMsg.MergePatchApk.HdiffApk: reportErrorLog status = PATCH_OLDDATA_ERROR_STREAMSIZE");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 170L, 1L, false);
                return;
            case 321:
                com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "MicroMsg.MergePatchApk.HdiffApk: reportErrorLog status = PATCH_HPATCH_ERROR");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 171L, 1L, false);
                return;
            case 322:
                com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "MicroMsg.MergePatchApk.HdiffApk: reportErrorLog status = PATCH_CHECKCRC_ERROR");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 172L, 1L, false);
                return;
            case com.tencent.mm.plugin.appbrand.jsapi.xe.CTRL_INDEX /* 323 */:
                com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "MicroMsg.MergePatchApk.HdiffApk: reportErrorLog status = PATCH_CHECKCRC_STREAM_ERROR");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 173L, 1L, false);
                return;
            default:
                com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.MergeHDiffApk.HdiffApk", "MicroMsg.MergePatchApk.HdiffApk: reportErrorLog status = others");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 192L, 1L, false);
                return;
        }
    }

    public static void g(long j17, long j18) {
        if (j17 <= 5) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 131L, 1L, false);
            return;
        }
        if (j17 <= 10) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 132L, 1L, false);
            return;
        }
        if (j17 <= 20) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 133L, 1L, false);
        } else if (j17 <= 40) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 134L, 1L, false);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 135L, 1L, false);
        }
    }

    public static void h(int i17, int i18) {
        j(i17, i18, 0, 0, 0, 0);
    }

    public static void i(int i17, int i18, int i19) {
        j(i17, i18, i19, 0, 0, 0);
    }

    public static void j(int i17, int i18, int i19, int i27, int i28, int i29) {
        try {
            com.tencent.mm.autogen.mmdata.rpt.UpgradeBootStageDetailReportStruct upgradeBootStageDetailReportStruct = new com.tencent.mm.autogen.mmdata.rpt.UpgradeBootStageDetailReportStruct();
            upgradeBootStageDetailReportStruct.f61482d = i17;
            upgradeBootStageDetailReportStruct.f61484f = i18;
            long j17 = i29;
            upgradeBootStageDetailReportStruct.f61485g = j17;
            upgradeBootStageDetailReportStruct.f61486h = i27;
            upgradeBootStageDetailReportStruct.f61490l = i28;
            upgradeBootStageDetailReportStruct.f61483e = c83.e.f39683f;
            if (i17 == 3) {
                upgradeBootStageDetailReportStruct.f61487i = j17;
                upgradeBootStageDetailReportStruct.f61488j = i29 + i27;
            }
            upgradeBootStageDetailReportStruct.f61489k = i19;
            upgradeBootStageDetailReportStruct.k();
            com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.MergeHrepotDiffApk", "report logbuffer(25395) : " + upgradeBootStageDetailReportStruct.n());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Tinker.MergeHrepotDiffApk", "report logbuffer(25395), error = " + e17);
        }
    }

    public static void k(int i17) {
        l(i17, -100, 0L, -1L, 1L);
    }

    public static void l(int i17, int i18, long j17, long j18, long j19) {
        try {
            r45.bw3 k17 = c83.e.k();
            long j27 = k17 != null ? (k17.f371098i - k17.f371097h) / 1000 : 0L;
            com.tencent.mm.autogen.mmdata.rpt.UpgradeBootStatusReportStruct upgradeBootStatusReportStruct = new com.tencent.mm.autogen.mmdata.rpt.UpgradeBootStatusReportStruct();
            upgradeBootStatusReportStruct.f61492e = i17;
            upgradeBootStatusReportStruct.f61491d = j19;
            upgradeBootStatusReportStruct.f61493f = i18;
            upgradeBootStatusReportStruct.f61494g = j17;
            upgradeBootStatusReportStruct.f61496i = j27;
            upgradeBootStatusReportStruct.f61497j = j27 + j17;
            upgradeBootStatusReportStruct.f61495h = j18;
            if (j17 > 0 && k17 != null) {
                upgradeBootStatusReportStruct.f61498k = (java.lang.System.currentTimeMillis() - k17.f371097h) / 1000;
            }
            upgradeBootStatusReportStruct.k();
            com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.MergeHrepotDiffApk", "report logbuffer(23550) : " + upgradeBootStatusReportStruct.n());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Tinker.MergeHrepotDiffApk", "report logbuffer(23550), error = " + e17);
        }
    }
}
