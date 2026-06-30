package h12;

@j95.b
/* loaded from: classes10.dex */
public class z extends i95.w implements k12.u {
    public java.lang.String Ai(java.lang.String str, int i17) {
        com.tencent.mm.vfs.r7 r7Var = com.tencent.mm.vfs.q7.f213141a;
        com.tencent.mm.vfs.r6 n17 = lp0.b.h0("wxam_temp").n();
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
        java.lang.String str2 = a17.f213279f;
        if (str2 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        java.lang.String str3 = a17.f213279f;
        int lastIndexOf = str3.lastIndexOf("/");
        if (lastIndexOf >= 0) {
            str3 = str3.substring(lastIndexOf + 1);
        }
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(n17, str3);
        if (r6Var.m()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.HevcHelperService", "WXAM export to JPG use cache = " + r6Var.o());
            return r6Var.o();
        }
        if (aj(str, r6Var.o(), i17) != 0) {
            return str;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.HevcHelperService", "WXAM export to JPG jpgFile = " + r6Var.o());
        return r6Var.o();
    }

    public java.lang.String Bi(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return str;
        }
        return str + "_hevc";
    }

    public final int Di() {
        int i17 = 60;
        try {
            i17 = com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a) ? com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("CompressPicLevelForWifi"), 60) : com.tencent.mars.comm.NetStatusUtil.is2G(com.tencent.mm.sdk.platformtools.x2.f193071a) ? com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("CompressPicLevelFor2G"), 40) : com.tencent.mars.comm.NetStatusUtil.is3G(com.tencent.mm.sdk.platformtools.x2.f193071a) ? com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("CompressPicLevelFor3G"), 40) : com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("CompressPicLevelFor4G"), 60);
        } catch (java.lang.Exception unused) {
        }
        return java.lang.Math.round(39.0f - (i17 / 5.0f));
    }

    public boolean Ni() {
        boolean z17 = j62.e.g().c(new com.tencent.mm.repairer.config.msgsync.RepairerConfigImgDownloadHevc()) == 1;
        boolean bj6 = ((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).bj();
        com.tencent.mars.xlog.Log.i("MicroMsg.HevcHelperService", "hevc download %s, support %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(bj6));
        return wi() && z17 && bj6;
    }

    public boolean Ri() {
        boolean z17 = j62.e.g().c(new com.tencent.mm.repairer.config.msgsend.RepairerConfigImgUploadHevc()) == 1;
        boolean bj6 = ((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).bj();
        com.tencent.mars.xlog.Log.i("MicroMsg.HevcHelperService", "hevc upload %s, support %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(bj6));
        return wi() && z17 && bj6;
    }

    public int Ui(java.lang.String str, java.lang.String str2, int i17) {
        return cj(str, str2, 0, 0, i17);
    }

    public int Zi(byte[] bArr, java.lang.String str, java.lang.String str2, int i17, int i18, int i19, int i27, int i28, int i29, byte[] bArr2) {
        int Di;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.tencent.mm.sdk.platformtools.y1.a(str);
        int errorCode = com.tencent.mm.plugin.gif.MMWXGFJNI.getErrorCode();
        if (errorCode == 0) {
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_wxam_adaptive_resolution, 0);
            int Ni2 = (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_wxam_enc_report_closeexistc2c, 0) <= 0 || i28 != 9) ? ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_wxam_enc_report_a, 0) : 0;
            int Ni3 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_wxam_fasthb_a, 0);
            int Ni4 = i28 == 1 ? ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_wxam_c2c_roi_a, 0) : ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_wxam_other_roi_a, 0);
            int i37 = Ni3 != 0 ? 1 : 0;
            int i38 = Ni4 != 0 ? 1 : 0;
            ((p05.l2) ((lg0.o) i95.n0.c(lg0.o.class))).Ai(((p05.l2) ((lg0.o) i95.n0.c(lg0.o.class))).wi("roi_saliencymap"), i38);
            int i39 = (i37 << 8) + i38;
            java.lang.String i47 = com.tencent.mm.vfs.w6.i(str2, true);
            int length = bArr.length;
            if (i28 == 2) {
                Di = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_wxam_params, 25);
                if (Di < 0) {
                    Di = Di();
                }
            } else {
                Di = Di();
            }
            errorCode = com.tencent.mm.plugin.gif.MMWXGFJNI.pic2WxamWithWH(i47, bArr, length, 7, Di, i17, i18, i19, i27, Ni, Ni2, i28, i39, 0, i29, 0, bArr2);
            if (com.tencent.mm.vfs.w6.k(str2) <= 0) {
                errorCode = -10;
            }
            if (errorCode != 0) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(944, 0);
            } else {
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var.A(944, 2);
                g0Var.C(944L, 3L, android.os.SystemClock.elapsedRealtime() - elapsedRealtime);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.HevcHelperService", "pic2wxam %d, %d, %d, %d，%s", java.lang.Integer.valueOf(errorCode), 7, java.lang.Long.valueOf(com.tencent.mm.vfs.w6.k(str2)), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime), com.tencent.mm.vfs.w6.i(str2, true));
        return errorCode;
    }

    public int aj(java.lang.String str, java.lang.String str2, int i17) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        int errorCode = com.tencent.mm.plugin.gif.MMWXGFJNI.getErrorCode();
        if (errorCode == 0) {
            int wxam2Pic = com.tencent.mm.plugin.gif.MMWXGFJNI.wxam2Pic(com.tencent.mm.vfs.w6.i(str, false), com.tencent.mm.vfs.w6.i(str2, true), ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_wxam_dec_report_a, 0), i17);
            if (com.tencent.mm.vfs.w6.k(str2) <= 0) {
                wxam2Pic = -10;
            }
            errorCode = wxam2Pic;
            if (errorCode != 0) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(944, 1);
            } else {
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var.A(944, 5);
                g0Var.C(944L, 6L, android.os.SystemClock.elapsedRealtime() - elapsedRealtime);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.HevcHelperService", "wxam2pic %d, %d, %d, %d", java.lang.Integer.valueOf(errorCode), java.lang.Long.valueOf(com.tencent.mm.vfs.w6.k(str)), java.lang.Long.valueOf(com.tencent.mm.vfs.w6.k(str2)), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        return errorCode;
    }

    public byte[] bj(byte[] bArr, int i17) {
        byte[] bArr2;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        int errorCode = com.tencent.mm.plugin.gif.MMWXGFJNI.getErrorCode();
        if (errorCode == 0) {
            bArr2 = com.tencent.mm.plugin.gif.MMWXGFJNI.wxam2PicBuf(bArr, ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_wxam_dec_report_a, 0), i17);
            if (bArr2 == null) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(944, 1);
            } else {
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var.A(944, 5);
                g0Var.C(944L, 6L, android.os.SystemClock.elapsedRealtime() - elapsedRealtime);
            }
        } else {
            bArr2 = null;
        }
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Integer.valueOf(errorCode);
        objArr[1] = java.lang.Integer.valueOf(bArr.length);
        objArr[2] = java.lang.Integer.valueOf(bArr2 != null ? bArr2.length : 0);
        objArr[3] = java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime);
        com.tencent.mars.xlog.Log.i("MicroMsg.HevcHelperService", "wxam2pic %d, %d, %d, %d", objArr);
        return bArr2;
    }

    public int cj(java.lang.String str, java.lang.String str2, int i17, int i18, int i19) {
        return fj(str, str2, i17, i18, i19, false);
    }

    public int fj(java.lang.String str, java.lang.String str2, int i17, int i18, int i19, boolean z17) {
        long j17;
        java.lang.String str3;
        java.lang.String str4;
        int i27;
        android.graphics.ColorSpace colorSpace;
        java.lang.String str5;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.lang.String a17 = com.tencent.mm.sdk.platformtools.y1.a(str);
        int i28 = ".png".equals(a17) ? 1 : ".gif".equals(a17) ? 3 : 0;
        int errorCode = com.tencent.mm.plugin.gif.MMWXGFJNI.getErrorCode();
        if (errorCode == 0) {
            java.lang.String i29 = com.tencent.mm.vfs.w6.i(str, false);
            java.lang.String i37 = com.tencent.mm.vfs.w6.i(str2, true);
            if (i29 != null) {
                android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                com.tencent.mm.graphics.e.d(i29, options);
                int i38 = options.outWidth;
                long j18 = i38 * options.outHeight * 4;
                if (j18 < 0 || j18 > com.tencent.tmassistantsdk.downloadservice.DownloadHelper.SAVE_LENGTH) {
                    j17 = elapsedRealtime;
                    str3 = "MicroMsg.HevcHelperService";
                    com.tencent.mars.xlog.Log.e(str3, "pic2wxam image is too large that may cause crash. w: %s, h: %s", java.lang.Integer.valueOf(i38), java.lang.Integer.valueOf(options.outHeight));
                    errorCode = -11;
                } else {
                    int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_wxam_full_range, 0);
                    int Ni2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_wxam_adaptive_resolution, 0);
                    int Ni3 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_wxam_enc_report_a, 0);
                    if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_wxam_enc_report_closeexistc2c, 0) > 0 && i19 == 9) {
                        Ni3 = 0;
                    }
                    int Ni4 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_wxam_fasthb_a, 0);
                    int Ni5 = i19 == 1 ? ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_wxam_c2c_roi_a, 0) : ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_wxam_other_roi_a, 0);
                    int i39 = Ni4 != 0 ? 1 : 0;
                    int i47 = Ni5 != 0 ? 1 : 0;
                    ((p05.l2) ((lg0.o) i95.n0.c(lg0.o.class))).Ai(((p05.l2) ((lg0.o) i95.n0.c(lg0.o.class))).wi("roi_saliencymap"), i47);
                    int i48 = (i39 << 8) + i47;
                    if (i19 == 9) {
                        int i49 = j62.e.g().i("clicfg_c2c_convert_to_wxam", 0, false, true);
                        if (z65.c.a()) {
                            i49 = 25;
                        } else {
                            java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.HevcHelperService", "WXAM_SCENE_CONVERT_EXIST_C2C_IMAGE, qp = " + i49);
                        if (i49 <= 18 || i49 >= 28) {
                            str5 = "MicroMsg.HevcHelperService";
                            j17 = elapsedRealtime;
                        } else {
                            str5 = "MicroMsg.HevcHelperService";
                            j17 = elapsedRealtime;
                            errorCode = com.tencent.mm.plugin.gif.MMWXGFJNI.pic2Wxam(i29, i37, i28, 24, i17, i18, Ni, Ni2, Ni3, i19, false, i48, 0, 0, 0);
                        }
                        str3 = str5;
                    } else {
                        j17 = elapsedRealtime;
                        if (i19 == 1 && j62.e.g().c(new com.tencent.mm.repairer.config.msgsend.RepairerConfigImgMidWideColorGamut()) == 1 && android.os.Build.VERSION.SDK_INT >= 26 && (colorSpace = options.outColorSpace) != null && colorSpace.getId() == android.graphics.ColorSpace.Named.DISPLAY_P3.ordinal()) {
                            str4 = "MicroMsg.HevcHelperService";
                            com.tencent.mars.xlog.Log.i(str4, "c2c pic is p3 color space, use wide color gamut");
                            i27 = 2;
                        } else {
                            str4 = "MicroMsg.HevcHelperService";
                            i27 = 0;
                        }
                        str3 = str4;
                        errorCode = com.tencent.mm.plugin.gif.MMWXGFJNI.pic2Wxam(i29, i37, i28, Di(), i17, i18, Ni, Ni2, Ni3, i19, z17, i48, i27, 0, 0);
                    }
                    if (com.tencent.mm.vfs.w6.k(str2) <= 0) {
                        errorCode = -10;
                    }
                }
            } else {
                j17 = elapsedRealtime;
                str3 = "MicroMsg.HevcHelperService";
                com.tencent.mars.xlog.Log.e(str3, "pic2wxam image src path is null.");
                errorCode = -1;
            }
            if (errorCode != 0) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(944, 0);
            } else {
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var.A(944, 2);
                g0Var.C(944L, 3L, android.os.SystemClock.elapsedRealtime() - j17);
            }
        } else {
            j17 = elapsedRealtime;
            str3 = "MicroMsg.HevcHelperService";
        }
        com.tencent.mars.xlog.Log.i(str3, "pic2wxam %d, %d, %d, %d, %d", java.lang.Integer.valueOf(errorCode), java.lang.Integer.valueOf(i28), java.lang.Long.valueOf(com.tencent.mm.vfs.w6.k(str)), java.lang.Long.valueOf(com.tencent.mm.vfs.w6.k(str2)), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - j17));
        return errorCode;
    }

    public boolean wi() {
        int errorCode = com.tencent.mm.plugin.gif.MMWXGFJNI.getErrorCode();
        com.tencent.mars.xlog.Log.i("MicroMsg.HevcHelperService", "checkHevcReady: %s", java.lang.Integer.valueOf(errorCode));
        return errorCode == 0;
    }
}
