package qp;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final qp.b f365674a = new qp.b();

    /* renamed from: b, reason: collision with root package name */
    public static com.motion.core.LivePhotoCore f365675b = null;

    /* renamed from: c, reason: collision with root package name */
    public static int f365676c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f365677d = "";

    /* renamed from: e, reason: collision with root package name */
    public static boolean f365678e;

    static {
        boolean fj6;
        boolean z17 = true;
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_live_photo_switch, true)) {
            java.lang.String str = android.os.Build.MANUFACTURER;
            int i17 = android.os.Build.VERSION.SDK_INT;
            com.tencent.mars.xlog.Log.i("MicroMsg.MMLivePhotoCore", "checkPhoneIsSupportToInit >> manufacturer: " + str + " osApi:" + i17);
            if ((r26.i0.p(str, "OPPO", true) && i17 >= 35) || (r26.i0.p(str, "realme", true) && i17 >= 35) || (r26.i0.p(str, "OnePlus", true) && i17 >= 35) || (r26.i0.p(str, "vivo", true) && i17 >= 34) || (r26.i0.p(str, "HONOR", true) && i17 >= 34) || (r26.i0.p(str, "Xiaomi", true) && i17 >= 34) || (r26.i0.p(str, "meizu", true) && i17 >= 35) || (r26.i0.p(str, "nubia", true) && i17 >= 35) || (r26.i0.p(str, "samsung", true) && i17 >= 36)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMLivePhotoCore", "checkPhoneIsSupportToInit >> isManuSupport");
                fj6 = true;
            } else {
                fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_live_photo_extra_manufacturer, false);
                com.tencent.mars.xlog.Log.i("MicroMsg.MMLivePhotoCore", "checkPhoneIsSupportToInit >> isExtraExptManu " + fj6);
            }
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMLivePhotoCore", "checkPhoneIsSupportToInit >> livePhoto switch is close");
            fj6 = false;
        }
        f65.q qVar = f65.q.f259959a;
        if (!fj6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMLivePhotoCore", "not need to init core");
            f65.q.b(qVar, "can_use_livePhoto", -1, 0L, null, 12, null);
            return;
        }
        try {
            f365675b = new com.motion.core.LivePhotoCore();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.motion.core.LivePhotoCore livePhotoCore = f365675b;
            if (livePhotoCore == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MMLivePhotoCore", "initCore >> livePhotoCore is null");
                return;
            }
            int initCore = livePhotoCore.initCore(com.tencent.mm.sdk.platformtools.x2.f193071a);
            com.tencent.mars.xlog.Log.i("MicroMsg.MMLivePhotoCore", "initCore >> init result: " + initCore);
            qVar.a(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, initCore, java.lang.System.currentTimeMillis() - currentTimeMillis, "");
            boolean z18 = initCore == 0;
            f365678e = z18;
            if (!z18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MMLivePhotoCore", "initCore init error");
                f65.q.b(qVar, "can_use_livePhoto", -1, 0L, null, 12, null);
                return;
            }
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            com.motion.core.LivePhotoCore livePhotoCore2 = f365675b;
            if (livePhotoCore2 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MMLivePhotoCore", "isSupport >> livePhotoCore is null");
                return;
            }
            boolean isSupport = livePhotoCore2.isSupport();
            com.tencent.mars.xlog.Log.i("MicroMsg.MMLivePhotoCore", "initCore >> isSupport: " + isSupport);
            qVar.a("is_support", isSupport ? 0 : -1, java.lang.System.currentTimeMillis() - currentTimeMillis2, "");
            if (!isSupport) {
                f65.q.b(qVar, "can_use_livePhoto", -1, 0L, null, 12, null);
                f365678e = false;
                return;
            }
            long currentTimeMillis3 = java.lang.System.currentTimeMillis();
            com.motion.core.LivePhotoCore livePhotoCore3 = f365675b;
            java.lang.String str2 = null;
            java.lang.String coreMetaData = livePhotoCore3 != null ? livePhotoCore3.getCoreMetaData() : null;
            if (coreMetaData == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MMLivePhotoCore", "coreMetaData >> livePhotoCore is null");
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MMLivePhotoCore", "initCore >> getCoreData: " + coreMetaData + " costTime: " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(coreMetaData);
                f365676c = jSONObject.optInt("coreVersion", 0);
                try {
                    if (!jSONObject.has("sysVersion")) {
                        z17 = false;
                    }
                    if (z17) {
                        str2 = jSONObject.getString("sysVersion");
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mm.sdk.platformtools.Log.a("safeGetString", "", e17);
                }
                if (str2 == null) {
                    str2 = "";
                }
                f365677d = str2;
                com.tencent.mars.xlog.Log.i("MicroMsg.MMLivePhotoCore", "coreVersion: " + f365676c + " sysVersion: " + f365677d);
                java.lang.String optString = jSONObject.optString("wechatKey", "");
                if (f365676c != 0 && optString.equals("303e1e50a7e5a84dc261223a0dd6a083")) {
                    qVar.a("get_coreData", 0, java.lang.System.currentTimeMillis() - currentTimeMillis3, coreMetaData);
                    ((ku5.t0) ku5.t0.f312615d).h(qp.c.f365679d, "MMLivePhotoFileManager_clear");
                    f65.q.b(qVar, "can_use_livePhoto", 0, 0L, null, 12, null);
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MMLivePhotoCore", "initCore >> core data is invalid");
                    f365678e = false;
                    qVar.a("get_coreData", -1, java.lang.System.currentTimeMillis() - currentTimeMillis3, coreMetaData);
                    f65.q.b(qVar, "can_use_livePhoto", -1, 0L, null, 12, null);
                }
            } catch (org.json.JSONException unused) {
                f365678e = false;
                qVar.a("get_coreData", -2, java.lang.System.currentTimeMillis() - currentTimeMillis3, coreMetaData);
                f65.q.b(qVar, "can_use_livePhoto", -1, 0L, null, 12, null);
                com.tencent.mars.xlog.Log.e("MicroMsg.MMLivePhotoCore", "initCore >> parse core json error");
            }
        } catch (java.lang.NoSuchMethodError e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMLivePhotoCore", "LivePhotoCore() >> NoSuchMethodError: " + e18.getMessage());
            qVar.a(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, com.tencent.live.TXLivePluginDef.ErrorCode.CODE_PARAMNOTFOUND, 0L, "");
            f65.q.b(qVar, "can_use_livePhoto", -1, 0L, null, 12, null);
            f365678e = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0110 A[Catch: Exception -> 0x0175, TryCatch #1 {Exception -> 0x0175, blocks: (B:21:0x0102, B:24:0x0110, B:27:0x013d), top: B:20:0x0102 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0166 A[Catch: Exception -> 0x0173, TRY_LEAVE, TryCatch #2 {Exception -> 0x0173, blocks: (B:29:0x0151, B:31:0x0156, B:32:0x015b, B:35:0x0162, B:40:0x0166), top: B:22:0x010e }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Type inference failed for: r1v0, types: [qp.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(bs.b r19, aq.t0 r20, kotlin.coroutines.Continuation r21) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qp.b.a(bs.b, aq.t0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(39:18|(5:19|20|(1:22)(1:157)|(2:24|25)(1:156)|26)|27|(4:28|29|30|(1:32)(1:151))|(35:146|147|(1:36)(1:145)|37|38|39|(1:41)(1:142)|(1:43)(1:141)|44|45|46|47|(1:49)(1:137)|(1:51)(1:136)|52|53|54|55|56|(1:58)(1:131)|(2:126|127)(1:60)|61|62|63|64|(1:66)(1:123)|(1:68)(1:122)|69|70|71|72|(1:74)(1:118)|(1:76)(1:117)|77|(2:79|80)(2:81|(2:83|84)(2:85|(2:114|115)(2:88|(2:90|91)(2:92|(2:112|113)(6:95|(2:97|(2:99|100))(1:111)|101|(1:103)(1:110)|104|(2:106|107)(2:108|109)))))))|34|(0)(0)|37|38|39|(0)(0)|(0)(0)|44|45|46|47|(0)(0)|(0)(0)|52|53|54|55|56|(0)(0)|(0)(0)|61|62|63|64|(0)(0)|(0)(0)|69|70|71|72|(0)(0)|(0)(0)|77|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(42:18|(5:19|20|(1:22)(1:157)|(2:24|25)(1:156)|26)|27|28|29|30|(1:32)(1:151)|(35:146|147|(1:36)(1:145)|37|38|39|(1:41)(1:142)|(1:43)(1:141)|44|45|46|47|(1:49)(1:137)|(1:51)(1:136)|52|53|54|55|56|(1:58)(1:131)|(2:126|127)(1:60)|61|62|63|64|(1:66)(1:123)|(1:68)(1:122)|69|70|71|72|(1:74)(1:118)|(1:76)(1:117)|77|(2:79|80)(2:81|(2:83|84)(2:85|(2:114|115)(2:88|(2:90|91)(2:92|(2:112|113)(6:95|(2:97|(2:99|100))(1:111)|101|(1:103)(1:110)|104|(2:106|107)(2:108|109)))))))|34|(0)(0)|37|38|39|(0)(0)|(0)(0)|44|45|46|47|(0)(0)|(0)(0)|52|53|54|55|56|(0)(0)|(0)(0)|61|62|63|64|(0)(0)|(0)(0)|69|70|71|72|(0)(0)|(0)(0)|77|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(46:18|19|20|(1:22)(1:157)|(2:24|25)(1:156)|26|27|28|29|30|(1:32)(1:151)|(35:146|147|(1:36)(1:145)|37|38|39|(1:41)(1:142)|(1:43)(1:141)|44|45|46|47|(1:49)(1:137)|(1:51)(1:136)|52|53|54|55|56|(1:58)(1:131)|(2:126|127)(1:60)|61|62|63|64|(1:66)(1:123)|(1:68)(1:122)|69|70|71|72|(1:74)(1:118)|(1:76)(1:117)|77|(2:79|80)(2:81|(2:83|84)(2:85|(2:114|115)(2:88|(2:90|91)(2:92|(2:112|113)(6:95|(2:97|(2:99|100))(1:111)|101|(1:103)(1:110)|104|(2:106|107)(2:108|109)))))))|34|(0)(0)|37|38|39|(0)(0)|(0)(0)|44|45|46|47|(0)(0)|(0)(0)|52|53|54|55|56|(0)(0)|(0)(0)|61|62|63|64|(0)(0)|(0)(0)|69|70|71|72|(0)(0)|(0)(0)|77|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01c5, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01c6, code lost:
    
        com.tencent.mm.sdk.platformtools.Log.a("safeGetInt", "", r0);
        r30 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01a2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01a3, code lost:
    
        com.tencent.mm.sdk.platformtools.Log.a("safeGetInt", "", r0);
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0180, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0181, code lost:
    
        r20 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x015c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x015d, code lost:
    
        com.tencent.mm.sdk.platformtools.Log.a("safeGetInt", "", r0);
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x013b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x013c, code lost:
    
        com.tencent.mm.sdk.platformtools.Log.a("safeGetInt", "", r0);
        r26 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0176 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0132 A[Catch: Exception -> 0x013b, TRY_LEAVE, TryCatch #7 {Exception -> 0x013b, blocks: (B:39:0x0126, B:43:0x0132), top: B:38:0x0126 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0154 A[Catch: Exception -> 0x015c, TRY_LEAVE, TryCatch #2 {Exception -> 0x015c, blocks: (B:47:0x0148, B:51:0x0154), top: B:46:0x0148 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019a A[Catch: Exception -> 0x01a2, TRY_LEAVE, TryCatch #11 {Exception -> 0x01a2, blocks: (B:64:0x018e, B:68:0x019a), top: B:63:0x018e }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01bb A[Catch: Exception -> 0x01c5, TRY_LEAVE, TryCatch #10 {Exception -> 0x01c5, blocks: (B:72:0x01af, B:76:0x01bb), top: B:71:0x01af }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x021f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final aq.u0 b(long r38, java.lang.String r40, java.lang.String r41, long r42) {
        /*
            Method dump skipped, instructions count: 1785
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qp.b.b(long, java.lang.String, java.lang.String, long):aq.u0");
    }

    public final long c() {
        long parseLong;
        try {
            java.lang.String f17 = j62.e.g().f(new com.tencent.mm.repairer.config.chatting.RepairerConfigLiveDurationConfig());
            kotlin.jvm.internal.o.f(f17, "getExptString(...)");
            parseLong = java.lang.Long.parseLong(f17);
        } catch (java.lang.NumberFormatException unused) {
        }
        if (parseLong > 0) {
            return parseLong;
        }
        return 4000L;
    }
}
