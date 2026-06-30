package y73;

/* loaded from: classes11.dex */
public abstract class p implements q25.a {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f459741a = "000";

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String[] f459742b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String[] f459743c;

    static {
        e42.d0 d0Var = e42.d0.clicfg_gallery_image_edit_icon_hide;
        e42.d0 d0Var2 = e42.d0.clicfg_gallery_image_edit_icon_hide;
        e42.d0 d0Var3 = e42.d0.clicfg_gallery_image_edit_icon_hide;
        e42.d0 d0Var4 = e42.d0.clicfg_gallery_image_edit_icon_hide;
        e42.d0 d0Var5 = e42.d0.clicfg_gallery_image_edit_icon_hide;
        e42.d0 d0Var6 = e42.d0.clicfg_gallery_image_edit_icon_hide;
        e42.d0 d0Var7 = e42.d0.clicfg_gallery_image_edit_icon_hide;
        e42.d0 d0Var8 = e42.d0.clicfg_gallery_image_edit_icon_hide;
        e42.d0 d0Var9 = e42.d0.clicfg_gallery_image_edit_icon_hide;
        e42.d0 d0Var10 = e42.d0.clicfg_gallery_image_edit_icon_hide;
        e42.d0 d0Var11 = e42.d0.clicfg_gallery_image_edit_icon_hide;
        e42.d0 d0Var12 = e42.d0.clicfg_gallery_image_edit_icon_hide;
        e42.d0 d0Var13 = e42.d0.clicfg_gallery_image_edit_icon_hide;
        e42.d0 d0Var14 = e42.d0.clicfg_gallery_image_edit_icon_hide;
        e42.d0 d0Var15 = e42.d0.clicfg_gallery_image_edit_icon_hide;
        e42.d0 d0Var16 = e42.d0.clicfg_gallery_image_edit_icon_hide;
        f459742b = new java.lang.String[]{"clicfg_tinker_patch_pkg_update_params_0", "clicfg_tinker_patch_pkg_update_params_1", "clicfg_tinker_patch_pkg_update_params_2", "clicfg_tinker_patch_pkg_update_params_3", "clicfg_tinker_patch_pkg_update_params_4", "clicfg_tinker_patch_pkg_update_params_5", "clicfg_tinker_patch_pkg_update_params_6", "clicfg_tinker_patch_pkg_update_params_7", "clicfg_tinker_patch_pkg_update_params_8", "clicfg_tinker_patch_pkg_update_params_9", "clicfg_tinker_patch_pkg_update_params_10", "clicfg_tinker_patch_pkg_update_params_11", "clicfg_tinker_patch_pkg_update_params_12", "clicfg_tinker_patch_pkg_update_params_13", "clicfg_tinker_patch_pkg_update_params_14", "clicfg_tinker_patch_pkg_update_params_15"};
        e42.d0 d0Var17 = e42.d0.clicfg_gallery_image_edit_icon_hide;
        e42.d0 d0Var18 = e42.d0.clicfg_gallery_image_edit_icon_hide;
        e42.d0 d0Var19 = e42.d0.clicfg_gallery_image_edit_icon_hide;
        e42.d0 d0Var20 = e42.d0.clicfg_gallery_image_edit_icon_hide;
        e42.d0 d0Var21 = e42.d0.clicfg_gallery_image_edit_icon_hide;
        e42.d0 d0Var22 = e42.d0.clicfg_gallery_image_edit_icon_hide;
        e42.d0 d0Var23 = e42.d0.clicfg_gallery_image_edit_icon_hide;
        e42.d0 d0Var24 = e42.d0.clicfg_gallery_image_edit_icon_hide;
        e42.d0 d0Var25 = e42.d0.clicfg_gallery_image_edit_icon_hide;
        e42.d0 d0Var26 = e42.d0.clicfg_gallery_image_edit_icon_hide;
        e42.d0 d0Var27 = e42.d0.clicfg_gallery_image_edit_icon_hide;
        e42.d0 d0Var28 = e42.d0.clicfg_gallery_image_edit_icon_hide;
        e42.d0 d0Var29 = e42.d0.clicfg_gallery_image_edit_icon_hide;
        e42.d0 d0Var30 = e42.d0.clicfg_gallery_image_edit_icon_hide;
        e42.d0 d0Var31 = e42.d0.clicfg_gallery_image_edit_icon_hide;
        e42.d0 d0Var32 = e42.d0.clicfg_gallery_image_edit_icon_hide;
        e42.d0 d0Var33 = e42.d0.clicfg_gallery_image_edit_icon_hide;
        f459743c = new java.lang.String[]{"clicfg_mmdiff_patch_pkg_update_params", "clicfg_mmdiff_patch_pkg_update_params_0", "clicfg_mmdiff_patch_pkg_update_params_1", "clicfg_mmdiff_patch_pkg_update_params_2", "clicfg_mmdiff_patch_pkg_update_params_3", "clicfg_mmdiff_patch_pkg_update_params_4", "clicfg_mmdiff_patch_pkg_update_params_5", "clicfg_mmdiff_patch_pkg_update_params_6", "clicfg_mmdiff_patch_pkg_update_params_7", "clicfg_mmdiff_patch_pkg_update_params_8", "clicfg_mmdiff_patch_pkg_update_params_9", "clicfg_mmdiff_patch_pkg_update_params_10", "clicfg_mmdiff_patch_pkg_update_params_11", "clicfg_mmdiff_patch_pkg_update_params_12", "clicfg_mmdiff_patch_pkg_update_params_13", "clicfg_mmdiff_patch_pkg_update_params_14", "clicfg_mmdiff_patch_pkg_update_params_15"};
    }

    public static boolean b(oq1.n nVar) {
        if (nVar != null) {
            com.tencent.mm.plugin.hp.util.TinkerSyncResponse tinkerSyncResponse = (com.tencent.mm.plugin.hp.util.TinkerSyncResponse) nVar;
            if (tinkerSyncResponse.a() && tinkerSyncResponse.i() && !tinkerSyncResponse.h() && !tinkerSyncResponse.f()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.HdiffBootsCommand.HdiffApk", "checkTinkerSyncResponseVaild, yes, response = %s", nVar);
                return true;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.HdiffBootsCommand.HdiffApk", "checkTinkerSyncResponseVaild, no, response = %s", nVar);
        return false;
    }

    public static void c(com.tencent.mm.plugin.hp.util.TinkerSyncResponse tinkerSyncResponse) {
        if (tinkerSyncResponse == null) {
            return;
        }
        java.util.Map map = c83.e.f39678a;
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_upgrade_force_user_boot_md5_update, 1) == 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.HdiffBootsCommand.HdiffApk", "isForceUserBootMd5 = %s.", java.lang.Boolean.valueOf(z17));
        if (!z17 && tinkerSyncResponse.e() == 4) {
            java.lang.String str = tinkerSyncResponse.f142413i;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                if (str.length() > 8) {
                    java.lang.String substring = str.substring(str.length() - 8, str.length());
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(substring)) {
                        f459741a = substring;
                    }
                } else if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    f459741a = str;
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.HdiffBootsCommand.HdiffApk", "before commandNewApkMd5HardCode, response.newApkMd5 = " + tinkerSyncResponse.f142416o + ", response.oldApkMd5 = " + tinkerSyncResponse.f142417p + ", stack: " + new com.tencent.mm.sdk.platformtools.z3() + ", NEW_APK_MD5_SUFFIX = " + f459741a + ", response.fileMd5 = " + str);
            java.lang.String g17 = c83.e.g(c83.e.i(com.tencent.mm.sdk.platformtools.x2.f193071a));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(g17);
            sb6.append(f459741a);
            tinkerSyncResponse.f142416o = sb6.toString();
            tinkerSyncResponse.f142417p = g17;
            com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.HdiffBootsCommand.HdiffApk", "after commandNewApkMd5HardCode, response.newApkMd5 = " + tinkerSyncResponse.f142416o + ", response.oldApkMd5 = " + tinkerSyncResponse.f142417p);
        }
    }

    public static int d(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return 0;
        }
        try {
            java.lang.String optString = jSONObject.optString("clientVersion", "");
            if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                return 0;
            }
            return java.lang.Integer.parseInt(optString.substring(2), 16);
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Tinker.HdiffBootsCommand.HdiffApk", "getJsonClientVersion, targetTinkerJson = %s", jSONObject);
            return 0;
        }
    }

    public static int e() {
        int i17 = 0;
        if (o45.wf.f343031i) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.HdiffBootsCommand.HdiffApk", "is GP version: %s", java.lang.Integer.valueOf(o45.wf.f343029g));
            return 0;
        }
        try {
            java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_full_pkg_update_default_params, "", true);
            if (com.tencent.mm.sdk.platformtools.t8.K0(Zi)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.HdiffBootsCommand.HdiffApk", "tabConfig = null.");
                return 0;
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject(Zi);
            int parseInt = java.lang.Integer.parseInt(jSONObject.getString("minBaseApk").substring(2), 16);
            try {
                int i18 = o45.wf.f343029g;
                java.lang.String string = jSONObject.getString("updateWebviewUrl");
                com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.HdiffBootsCommand.HdiffApk", "minBaseApk = %s, updateWebviewUrl = %s.", java.lang.Integer.valueOf(parseInt), string);
                if (parseInt > i18) {
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                        return parseInt;
                    }
                }
                return 0;
            } catch (java.lang.Exception e17) {
                i17 = parseInt;
                e = e17;
                com.tencent.mars.xlog.Log.w("MicroMsg.Tinker.HdiffBootsCommand.HdiffApk", "parse tabconfig failed: %s", e.getMessage());
                return i17;
            }
        } catch (java.lang.Exception e18) {
            e = e18;
        }
    }

    public static org.json.JSONObject f(java.lang.String str) {
        org.json.JSONObject jSONObject;
        java.lang.Exception e17;
        org.json.JSONObject jSONObject2;
        java.lang.Exception e18;
        org.json.JSONObject jSONObject3 = null;
        int i17 = 0;
        org.json.JSONObject jSONObject4 = null;
        int i18 = 0;
        while (true) {
            java.lang.String[] strArr = f459743c;
            if (i18 >= strArr.length) {
                break;
            }
            try {
                java.lang.String aj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).aj(strArr[i18], "");
                if (!android.text.TextUtils.isEmpty(aj6)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.HdiffBootsCommand.HdiffApk", "tabConfigMMDIFF = %s", aj6);
                    jSONObject2 = new org.json.JSONObject(aj6);
                    if (str.equals(jSONObject2.getString("oldApkMd5"))) {
                        try {
                            com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.HdiffBootsCommand.HdiffApk", "mmdiff use this json");
                            jSONObject4 = jSONObject2;
                            break;
                        } catch (java.lang.Exception e19) {
                            e18 = e19;
                            com.tencent.mars.xlog.Log.e("MicroMsg.Tinker.HdiffBootsCommand.HdiffApk", "getXpatchTargetJson, get mmdif json, e = %s", e18);
                            jSONObject4 = jSONObject2;
                            i18++;
                        }
                    } else {
                        continue;
                    }
                }
            } catch (java.lang.Exception e27) {
                jSONObject2 = jSONObject4;
                e18 = e27;
            }
            i18++;
        }
        while (true) {
            java.lang.String[] strArr2 = f459742b;
            if (i17 >= strArr2.length) {
                break;
            }
            try {
                java.lang.String aj7 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).aj(strArr2[i17], "");
                if (!android.text.TextUtils.isEmpty(aj7)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.HdiffBootsCommand.HdiffApk", "tabConfigTinker = %s", aj7);
                    jSONObject = new org.json.JSONObject(aj7);
                    if (str.equals(jSONObject.getString("oldApkMd5"))) {
                        try {
                            com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.HdiffBootsCommand.HdiffApk", "tinker use this json");
                            jSONObject3 = jSONObject;
                            break;
                        } catch (java.lang.Exception e28) {
                            e17 = e28;
                            com.tencent.mars.xlog.Log.e("MicroMsg.Tinker.HdiffBootsCommand.HdiffApk", "getXpatchTargetJson, get tinker json, e = %s", e17);
                            jSONObject3 = jSONObject;
                            i17++;
                        }
                    } else {
                        continue;
                    }
                }
            } catch (java.lang.Exception e29) {
                jSONObject = jSONObject3;
                e17 = e29;
            }
            i17++;
        }
        if (d(jSONObject3) >= d(jSONObject4)) {
            jSONObject4 = jSONObject3;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.HdiffBootsCommand.HdiffApk", "getXpatchTargetJson, final targetJson = %s", jSONObject4);
        return jSONObject4;
    }

    public static com.tencent.mm.plugin.hp.util.TinkerSyncResponse g() {
        org.json.JSONObject jSONObject;
        boolean z17;
        boolean z18;
        com.tencent.mm.plugin.hp.util.TinkerSyncResponse tinkerSyncResponse;
        int i17 = com.tencent.mm.sdk.platformtools.z.f193112h;
        boolean z19 = false;
        com.tencent.mm.plugin.hp.util.TinkerSyncResponse tinkerSyncResponse2 = null;
        if (!((i17 == 788529167 || i17 == 788529166) || z65.c.a())) {
            return null;
        }
        java.lang.String k17 = bm5.o1.f22719a.k(bm5.h0.RepairerConfig_Updater_MMdiffCgi_String, "");
        if (com.tencent.mm.sdk.platformtools.t8.K0(k17)) {
            return null;
        }
        try {
            jSONObject = new org.json.JSONObject(k17);
            jSONObject.getString("clientVersion");
            r45.j35 j35Var = new r45.j35();
            j35Var.f377538i = new r45.bs5();
            j35Var.f377534e = 2;
            j35Var.f377537h = 1;
            j35Var.f377536g = jSONObject.optInt("packageType", 4);
            java.lang.String string = jSONObject.getString("patchId");
            if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Tinker.HdiffBootsCommand.HdiffApk", "hardcode patchid, patchid can not null");
            } else {
                j35Var.f377533d = string;
            }
            j35Var.f377538i.f371032n = jSONObject.getInt("fileSize");
            j35Var.f377538i.f371027f = jSONObject.getString("cdnUrl");
            j35Var.f377538i.f371025d = jSONObject.getString("fileMd5");
            z17 = !k17.contains("isShowNotification") || jSONObject.optInt("isShowNotification", 1) == 1;
            z18 = !k17.contains("isShowRedot") || jSONObject.optInt("isShowRedot", 1) == 1;
            if (k17.contains("isShowDialog") && jSONObject.optInt("isShowDialog", 0) == 1) {
                z19 = true;
            }
            tinkerSyncResponse = new com.tencent.mm.plugin.hp.util.TinkerSyncResponse(j35Var);
        } catch (java.lang.Exception e17) {
            e = e17;
        }
        try {
            tinkerSyncResponse.f142419r = jSONObject.getString("clientVersion");
            tinkerSyncResponse.f142410f = java.lang.Integer.valueOf(jSONObject.optInt("packageType", 4));
            tinkerSyncResponse.f142425x = z17;
            tinkerSyncResponse.f142426y = z18;
            tinkerSyncResponse.f142427z = z19;
            tinkerSyncResponse.B = jSONObject.optInt("showDialogIntervalTime", 6);
            tinkerSyncResponse.C = jSONObject.optInt("showDialogMaxTimes", 3);
            tinkerSyncResponse.f142416o = jSONObject.getString("newApkMd5");
            tinkerSyncResponse.f142417p = jSONObject.getString("oldApkMd5");
            com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.HdiffBootsCommand.HdiffApk", "hardcode，respone = %s" + tinkerSyncResponse);
            return tinkerSyncResponse;
        } catch (java.lang.Exception e18) {
            tinkerSyncResponse2 = tinkerSyncResponse;
            e = e18;
            com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.HdiffBootsCommand.HdiffApk", "hardCodeMMdiffResponeForTest e = " + e);
            return tinkerSyncResponse2;
        }
    }

    public static oq1.n h(oq1.n nVar, boolean z17) {
        int i17;
        int i18;
        boolean z18;
        boolean z19;
        boolean z27;
        com.tencent.mm.plugin.hp.util.TinkerSyncResponse tinkerSyncResponse;
        java.util.Map map = c83.e.f39678a;
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_upgrade_force_stop_xpatch_all_update, 0) == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.HdiffBootsCommand.HdiffApk", "hardCodeXkeyMMdiffResponeForReddot, isForceStopTinkerXpatchAllMerge.");
            return null;
        }
        try {
            java.lang.String i19 = c83.e.i(com.tencent.mm.sdk.platformtools.x2.f193071a);
            java.lang.String g17 = c83.e.g(i19);
            com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.HdiffBootsCommand.HdiffApk", "hardCodeXkeyMMdiffResponeForReddot, baseApkMD5 = %s, baseApkPath = %s.", g17, i19);
            org.json.JSONObject f17 = f(g17);
            if (f17 == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.HdiffBootsCommand.HdiffApk", "hardCodeXkeyMMdiffResponeForReddot, json is null.");
                return null;
            }
            try {
                int i27 = f17.getInt("packageType");
                boolean z28 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_upgrade_force_stop_tinker_xpatch_auto_update, 0) == 1;
                com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.HdiffBootsCommand.HdiffApk", "isForceStopTinkerXpatchAutoMerge = %s, isAuto = %s, packageType = %s.", java.lang.Boolean.valueOf(z28), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i27));
                if (z17 && i27 == 2 && z28) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.HdiffBootsCommand.HdiffApk", "isForceStopTinkerXpatchMaunalMerge false.");
                    return null;
                }
                e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
                e42.d0 d0Var = e42.d0.clicfg_upgrade_force_stop_tinker_xpatch_maunal_update;
                com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.HdiffBootsCommand.HdiffApk", "isForceStopTinkerXpatchMaunalMerge = %s, isAuto = %s, packageType = %s.", java.lang.Boolean.valueOf(((h62.d) e0Var).Ni(d0Var, 0) == 1), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i27));
                if (!z17 && i27 == 2) {
                    if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(d0Var, 0) == 1) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.HdiffBootsCommand.HdiffApk", "isForceStopTinkerXpatchMaunalMerge false.");
                        return null;
                    }
                }
                if (z17 && f17.optInt("isAutoPatchUpdateEnable", 0) != 1) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.HdiffBootsCommand.HdiffApk", "isAutoPatchUpdateEnable false.");
                    return null;
                }
                java.lang.String string = f17.getString("clientVersion");
                java.lang.String string2 = f17.getString("cdnUrl");
                java.lang.String string3 = f17.getString("fileMd5");
                int i28 = f17.getInt("fileSize");
                java.lang.String string4 = f17.getString("oldApkMd5");
                com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.HdiffBootsCommand.HdiffApk", "hardCodeXkeyMMdiffResponeForReddot，x patch reddot, clientVersion = %s, cdnUrl = %s, fileMd5 = %s, fileSize = %s, oldApkMd5 = %s, baseApkMD5 = %s, baseApkMD5.equals(oldApkMd5)? = %s, BuildInfo.CLIENT_VERSION = %s", string, string2, string3, java.lang.Integer.valueOf(i28), string4, g17, java.lang.Boolean.valueOf(g17.equals(string4)), com.tencent.mm.sdk.platformtools.z.f193111g);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(string) && !com.tencent.mm.sdk.platformtools.t8.K0(string2) && !com.tencent.mm.sdk.platformtools.t8.K0(string3) && i28 != 0 && g17.equals(string4)) {
                    int e17 = e();
                    int parseInt = java.lang.Integer.parseInt(string.substring(2), 16);
                    int i29 = o45.wf.f343029g;
                    if (nVar instanceof com.tencent.mm.plugin.hp.util.TinkerSyncResponse) {
                        try {
                            i17 = c83.e.q(((com.tencent.mm.plugin.hp.util.TinkerSyncResponse) nVar).f142419r);
                        } catch (java.lang.Exception unused) {
                            i17 = 0;
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.HdiffBootsCommand.HdiffApk", "hardCodeXkeyMMdiffResponeForReddot x patch redot, currentResponse.clientVersion = %s, xkey clientVersion = %s.", ((com.tencent.mm.plugin.hp.util.TinkerSyncResponse) nVar).f142419r, string);
                        i18 = i17;
                    } else {
                        i18 = 0;
                    }
                    boolean z29 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_upgrade_force_tinker_xpatch_importantest, 0) == 1;
                    com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.HdiffBootsCommand.HdiffApk", "hardCodeXkeyMMdiffResponeForReddot x patch redot, xKeyTargetApk = %s, mmdiffTargetVersion = %s, currentApkClientVersionCode = %s, tinkerPatchVersion = %s.", java.lang.Integer.valueOf(e17), java.lang.Integer.valueOf(parseInt), java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i18));
                    java.lang.Object[] objArr = new java.lang.Object[3];
                    objArr[0] = java.lang.Boolean.valueOf(parseInt <= i29);
                    objArr[1] = java.lang.Boolean.valueOf(parseInt < e17);
                    objArr[2] = java.lang.Boolean.valueOf(parseInt <= i18);
                    com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.HdiffBootsCommand.HdiffApk", "less than versioncode， mmdiffTargetVersion <= currentApkClientVersionCode = %s, less than x redot， mmdiffTargetVersion < xKeyTargetApk  = %s, less than boot config，mmdiffTargetVersion <= tinkerPatchVersion = %s.", objArr);
                    if (parseInt <= i29 || (!z17 && parseInt < e17)) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.Tinker.HdiffBootsCommand.HdiffApk", "use x patch to be repsone.");
                        if ((i27 != 2 || !z29) && parseInt <= i18) {
                            return null;
                        }
                    }
                    if (i27 == 4) {
                        boolean z37 = f17.optInt("isShowNotification", 1) == 1;
                        z19 = f17.optInt("isShowRedot", 1) == 1;
                        z18 = f17.optInt("isShowDialog", 0) == 1;
                        z27 = z37;
                    } else {
                        z18 = false;
                        z19 = true;
                        z27 = true;
                    }
                    try {
                        f17.getString("clientVersion");
                        r45.j35 j35Var = new r45.j35();
                        j35Var.f377538i = new r45.bs5();
                        j35Var.f377534e = 2;
                        j35Var.f377537h = 1;
                        j35Var.f377536g = f17.optInt("packageType", 4);
                        java.lang.String string5 = f17.getString("patchId");
                        if (com.tencent.mm.sdk.platformtools.t8.K0(string5)) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.Tinker.HdiffBootsCommand.HdiffApk", "x key patch patchid， patchid can not null");
                            return null;
                        }
                        j35Var.f377533d = string5;
                        j35Var.f377538i.f371032n = f17.getInt("fileSize");
                        j35Var.f377538i.f371027f = f17.getString("cdnUrl");
                        j35Var.f377538i.f371025d = f17.getString("fileMd5");
                        com.tencent.mm.plugin.hp.util.TinkerSyncResponse tinkerSyncResponse2 = new com.tencent.mm.plugin.hp.util.TinkerSyncResponse(j35Var);
                        try {
                            tinkerSyncResponse2.f142419r = f17.getString("clientVersion");
                            tinkerSyncResponse2.f142410f = java.lang.Integer.valueOf(f17.optInt("packageType", -1));
                            tinkerSyncResponse2.f142416o = f17.getString("newApkMd5");
                            tinkerSyncResponse2.f142417p = f17.getString("oldApkMd5");
                            tinkerSyncResponse2.f142423v = z17;
                            tinkerSyncResponse2.f142425x = z27;
                            tinkerSyncResponse2.f142426y = z19;
                            tinkerSyncResponse2.f142427z = z18;
                            if (i27 == 4) {
                                tinkerSyncResponse2.B = f17.optInt("showDialogIntervalTime", 6);
                                tinkerSyncResponse2.C = f17.optInt("showDialogMaxTimes", 1);
                            }
                            com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.HdiffBootsCommand.HdiffApk", "use x patch to be respone = %s" + tinkerSyncResponse2);
                            return tinkerSyncResponse2;
                        } catch (java.lang.Exception e18) {
                            e = e18;
                            tinkerSyncResponse = tinkerSyncResponse2;
                            com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.HdiffBootsCommand.HdiffApk", "hardCodeXkeyMMdiffResponeForReddot，x patch redot, e = " + e);
                            return tinkerSyncResponse;
                        }
                    } catch (java.lang.Exception e19) {
                        e = e19;
                        tinkerSyncResponse = null;
                    }
                }
                return null;
            } catch (java.lang.Exception e27) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Tinker.HdiffBootsCommand.HdiffApk", "e = " + e27 + ", packageType = 0");
                return null;
            }
        } catch (java.lang.Exception e28) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Tinker.HdiffBootsCommand.HdiffApk", "hardCodeXkeyMMdiffResponeForReddot x patch redot, parse tabconfig failed: %s", e28.getMessage());
            return null;
        }
    }
}
