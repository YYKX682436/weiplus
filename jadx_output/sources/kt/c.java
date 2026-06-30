package kt;

@j95.b
/* loaded from: classes8.dex */
public class c extends i95.w implements lt.i0 {
    public boolean Ai(java.lang.String str) {
        com.tencent.mm.pluginsdk.model.app.m h17;
        return (com.tencent.mm.sdk.platformtools.t8.K0(str) || (h17 = com.tencent.mm.pluginsdk.model.app.w.h(str)) == null || com.tencent.mm.sdk.platformtools.t8.K0(h17.field_appId) || (h17.field_appInfoFlag & 32) <= 0) ? false : true;
    }

    public boolean Bi(com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage) {
        if (wXMediaMessage == null) {
            return false;
        }
        zo3.p.wi();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(zo3.p.Ai());
        sb6.append("content_");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(java.lang.System.currentTimeMillis());
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject iMediaObject = wXMediaMessage.mediaObject;
        if (iMediaObject instanceof com.tencent.mm.opensdk.modelmsg.WXImageObject) {
            com.tencent.mm.opensdk.modelmsg.WXImageObject wXImageObject = (com.tencent.mm.opensdk.modelmsg.WXImageObject) iMediaObject;
            java.lang.String str = wXImageObject.imagePath;
            if (!com.tencent.mm.pluginsdk.model.app.w.e(str)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppInfoLogic", "copyFileIfNeed file invalid: %s", str);
                return false;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppInfoLogic", "copyFileIfNeed filePath: %s", str);
            if (com.tencent.mm.pluginsdk.model.app.w.f(str)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppInfoLogic", "copyFileIfNeed filename: %s, type: %d, ret: %d", sb7, java.lang.Integer.valueOf(wXMediaMessage.getType()), java.lang.Long.valueOf(com.tencent.mm.vfs.w6.d(str, sb7, false)));
                wXImageObject.imagePath = sb7;
            }
        } else if (iMediaObject instanceof com.tencent.mm.opensdk.modelmsg.WXFileObject) {
            com.tencent.mm.opensdk.modelmsg.WXFileObject wXFileObject = (com.tencent.mm.opensdk.modelmsg.WXFileObject) iMediaObject;
            java.lang.String str2 = wXFileObject.filePath;
            if (!com.tencent.mm.pluginsdk.model.app.w.e(str2)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppInfoLogic", "copyFileIfNeed file invalid: %s", str2);
                return false;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppInfoLogic", "copyFileIfNeed filePath: %s", str2);
            if (com.tencent.mm.pluginsdk.model.app.w.f(str2)) {
                java.lang.String n17 = com.tencent.mm.vfs.w6.n(str2);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(n17)) {
                    sb7 = sb7 + "." + n17;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.AppInfoLogic", "copyFileIfNeed filename: %s, type: %d, ret: %d", sb7, java.lang.Integer.valueOf(wXMediaMessage.getType()), java.lang.Long.valueOf(com.tencent.mm.vfs.w6.d(str2, sb7, false)));
                wXFileObject.filePath = sb7;
            }
        } else if (iMediaObject instanceof com.tencent.mm.opensdk.modelmsg.WXEmojiObject) {
            com.tencent.mm.opensdk.modelmsg.WXEmojiObject wXEmojiObject = (com.tencent.mm.opensdk.modelmsg.WXEmojiObject) iMediaObject;
            java.lang.String str3 = wXEmojiObject.emojiPath;
            if (!com.tencent.mm.pluginsdk.model.app.w.e(str3)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppInfoLogic", "copyFileIfNeed file invalid: %s", str3);
                return false;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppInfoLogic", "copyFileIfNeed filePath: %s", str3);
            if (com.tencent.mm.pluginsdk.model.app.w.f(str3)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppInfoLogic", "copyFileIfNeed filename: %s, type: %d, ret: %d", sb7, java.lang.Integer.valueOf(wXMediaMessage.getType()), java.lang.Long.valueOf(com.tencent.mm.vfs.w6.d(str3, sb7, false)));
                wXEmojiObject.emojiPath = sb7;
            }
        } else if (iMediaObject instanceof com.tencent.mm.opensdk.modelmsg.WXVideoFileObject) {
            com.tencent.mm.opensdk.modelmsg.WXVideoFileObject wXVideoFileObject = (com.tencent.mm.opensdk.modelmsg.WXVideoFileObject) iMediaObject;
            java.lang.String str4 = wXVideoFileObject.filePath;
            if (!com.tencent.mm.pluginsdk.model.app.w.e(str4)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppInfoLogic", "copyFileIfNeed file invalid: %s", str4);
                return false;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppInfoLogic", "copyFileIfNeed filePath: %s", str4);
            if (com.tencent.mm.pluginsdk.model.app.w.f(str4)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppInfoLogic", "copyFileIfNeed filename: %s, type: %d, ret: %d", sb7, java.lang.Integer.valueOf(wXMediaMessage.getType()), java.lang.Long.valueOf(com.tencent.mm.vfs.w6.d(str4, sb7, false)));
                wXVideoFileObject.filePath = sb7;
            }
        } else if (iMediaObject instanceof com.tencent.mm.opensdk.modelmsg.WXGameVideoFileObject) {
            com.tencent.mm.opensdk.modelmsg.WXGameVideoFileObject wXGameVideoFileObject = (com.tencent.mm.opensdk.modelmsg.WXGameVideoFileObject) iMediaObject;
            java.lang.String str5 = wXGameVideoFileObject.filePath;
            if (!com.tencent.mm.pluginsdk.model.app.w.e(str5)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppInfoLogic", "copyFileIfNeed file invalid: %s", str5);
                return false;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppInfoLogic", "copyFileIfNeed filePath: %s", str5);
            if (com.tencent.mm.pluginsdk.model.app.w.f(str5)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppInfoLogic", "copyFileIfNeed filename: %s, type: %d, ret: %d", sb7, java.lang.Integer.valueOf(wXMediaMessage.getType()), java.lang.Long.valueOf(com.tencent.mm.vfs.w6.d(str5, sb7, false)));
                wXGameVideoFileObject.filePath = sb7;
            }
        } else if (iMediaObject instanceof com.tencent.mm.opensdk.modelmsg.WXAppExtendObject) {
            com.tencent.mm.opensdk.modelmsg.WXAppExtendObject wXAppExtendObject = (com.tencent.mm.opensdk.modelmsg.WXAppExtendObject) iMediaObject;
            java.lang.String str6 = wXAppExtendObject.filePath;
            if (!com.tencent.mm.pluginsdk.model.app.w.e(str6)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppInfoLogic", "copyFileIfNeed file invalid: %s", str6);
                return false;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppInfoLogic", "copyFileIfNeed filePath: %s", str6);
            if (com.tencent.mm.pluginsdk.model.app.w.f(str6)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppInfoLogic", "copyFileIfNeed filename: %s, type: %d, ret: %d", sb7, java.lang.Integer.valueOf(wXMediaMessage.getType()), java.lang.Long.valueOf(com.tencent.mm.vfs.w6.d(str6, sb7, false)));
                wXAppExtendObject.filePath = sb7;
            }
        } else {
            if (!(iMediaObject instanceof com.tencent.mm.opensdk.modelmsg.WXMusicVideoObject)) {
                return false;
            }
            com.tencent.mm.opensdk.modelmsg.WXMusicVideoObject wXMusicVideoObject = (com.tencent.mm.opensdk.modelmsg.WXMusicVideoObject) iMediaObject;
            java.lang.String str7 = wXMusicVideoObject.hdAlbumThumbFilePath;
            if (str7 != null) {
                if (!com.tencent.mm.pluginsdk.model.app.w.e(str7)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppInfoLogic", "copyFileIfNeed file invalid: %s", str7);
                    return false;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.AppInfoLogic", "copyFileIfNeed filePath: %s", str7);
                if (com.tencent.mm.pluginsdk.model.app.w.f(str7)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppInfoLogic", "copyFileIfNeed filename: %s, type: %d, ret: %d", sb7, java.lang.Integer.valueOf(wXMediaMessage.getType()), java.lang.Long.valueOf(com.tencent.mm.vfs.w6.d(str7, sb7, false)));
                    wXMusicVideoObject.hdAlbumThumbFilePath = sb7;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0185  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Bitmap Di(java.lang.String r18, int r19, float r20) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kt.c.Di(java.lang.String, int, float):android.graphics.Bitmap");
    }

    public com.tencent.mm.pluginsdk.model.app.m Ni(java.lang.String str) {
        return com.tencent.mm.pluginsdk.model.app.w.h(str);
    }

    public void Ri(java.lang.String str, java.lang.String str2, lt.h0 h0Var) {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && !com.tencent.mm.sdk.platformtools.t8.K0(str2) && h0Var != null) {
            ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.pluginsdk.model.app.n(h0Var, str, str2), "GetAppInfoASyncThread");
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppInfoLogic", "getAppInfoASync, appId is null");
            if (h0Var != null) {
                h0Var.a(null);
            }
        }
    }

    public java.lang.String Ui(android.content.Context context, dm.m0 m0Var) {
        return com.tencent.mm.pluginsdk.model.app.w.n(context, (com.tencent.mm.pluginsdk.model.app.m) m0Var, null);
    }

    public java.lang.String Vi(android.content.Context context, dm.m0 m0Var, java.lang.String str) {
        return com.tencent.mm.pluginsdk.model.app.w.n(context, (com.tencent.mm.pluginsdk.model.app.m) m0Var, str);
    }

    public java.lang.String Zi(android.content.Context context, java.lang.String str) {
        return com.tencent.mm.pluginsdk.model.app.w.n(context, com.tencent.mm.pluginsdk.model.app.w.h(str), null);
    }

    public boolean aj(android.content.Context context, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mm.pluginsdk.model.app.z Ri = zo3.p.Ri();
        Ri.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(256);
        sb6.append("select * from AppInfo where  ( appSupportContentType & ");
        sb6.append(j17);
        sb6.append(" ) != 0 and  ( svrAppSupportContentType & ");
        sb6.append(j17);
        sb6.append(" ) != 0 and  ( appInfoFlag & 8192 ) != 0 and status != 4");
        android.database.Cursor rawQuery = Ri.rawQuery(sb6.toString(), new java.lang.String[0]);
        if (rawQuery == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppInfoStorage", "getAppByStatus : cursor is null");
            rawQuery = null;
        }
        if (rawQuery != null) {
            while (rawQuery.moveToNext()) {
                com.tencent.mm.pluginsdk.model.app.m mVar = new com.tencent.mm.pluginsdk.model.app.m();
                mVar.convertFrom(rawQuery);
                if (mVar.field_status == 1) {
                    if (!com.tencent.mm.pluginsdk.model.app.w.r(context, mVar.field_appId)) {
                        mVar.field_status = 4;
                        ((kt.a) ap3.e.a()).getClass();
                        zo3.p.Ri().update(mVar, new java.lang.String[0]);
                    } else if (!com.tencent.mm.sdk.platformtools.t8.K0(mVar.field_signature)) {
                        arrayList.add(mVar);
                    }
                } else if (mVar.field_signature != null) {
                    arrayList.add(mVar);
                }
            }
            rawQuery.close();
        }
        return arrayList.size() != 0;
    }

    public boolean bj(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.D0("wx485a97c844086dc9", str) || com.tencent.mm.sdk.platformtools.t8.D0("wxaf060266bfa9a35c", str)) {
            return true;
        }
        com.tencent.mm.pluginsdk.model.app.m h17 = com.tencent.mm.pluginsdk.model.app.w.h(str);
        return (h17 == null || com.tencent.mm.sdk.platformtools.t8.K0(h17.field_packageName) || com.tencent.mm.sdk.platformtools.t8.K0(h17.field_signature)) ? false : true;
    }

    public boolean cj(android.content.Context context, android.content.Intent intent, java.lang.String str, int i17, com.tencent.mm.pluginsdk.model.app.a5 a5Var, android.os.Bundle bundle) {
        return com.tencent.mm.pluginsdk.model.app.w.u(context, intent, str, i17, a5Var, bundle, null, null);
    }

    public boolean fj(android.content.Context context, java.lang.String str, com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage, int i17, com.tencent.mm.pluginsdk.model.app.a5 a5Var, android.os.Bundle bundle) {
        if (context == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppInfoLogic", "launch app failed: context is null");
            if (a5Var == null) {
                return false;
            }
            a5Var.a(false, false);
            return false;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppInfoLogic", "launch app failed: appid is null or nil");
            if (a5Var == null) {
                return false;
            }
            a5Var.a(false, false);
            return false;
        }
        if (wXMediaMessage == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppInfoLogic", "launch app failed: wxMsg is null");
            if (a5Var == null) {
                return false;
            }
            a5Var.a(false, false);
            return false;
        }
        com.tencent.mm.pluginsdk.model.app.m i18 = android.os.Looper.myLooper() == android.os.Looper.getMainLooper() ? com.tencent.mm.pluginsdk.model.app.w.i(str, Integer.MAX_VALUE) : com.tencent.mm.pluginsdk.model.app.w.k(str, false);
        if (i18 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppInfoLogic", "get appinfo is null, appid is : [%s]", str);
            if (a5Var == null) {
                return false;
            }
            a5Var.a(false, false);
            return false;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(5);
        arrayList.add(new com.tencent.mars.smc.IDKey(2088, 0));
        try {
            if (i18.field_status == 3) {
                if (com.tencent.mm.sdk.platformtools.t8.w0(context)) {
                    arrayList.add(new com.tencent.mars.smc.IDKey(2088, 4));
                } else {
                    arrayList.add(new com.tencent.mars.smc.IDKey(2088, 1));
                    boolean a17 = com.tencent.mm.pluginsdk.model.app.i1.a(context, i18, i18.field_packageName);
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppInfoLogic", "requestAppShow, app is in blacklist, retry check signature, packageName:%s, isAppValid:%b", i18.field_packageName, java.lang.Boolean.valueOf(a17));
                    if (a17) {
                        arrayList.add(new com.tencent.mars.smc.IDKey(2088, 2));
                        i18 = ((kt.a) ap3.e.a()).wi(str);
                    } else {
                        arrayList.add(new com.tencent.mars.smc.IDKey(2088, 3));
                    }
                }
            }
            if (i18.field_status != 3) {
                arrayList.add(new com.tencent.mars.smc.IDKey(2088, 5));
                if (com.tencent.mm.sdk.platformtools.t8.w0(context)) {
                    arrayList.add(new com.tencent.mars.smc.IDKey(2088, 6));
                }
                return com.tencent.mm.pluginsdk.model.app.w.w(context, i18.field_packageName, wXMediaMessage, str, i18.field_openId, i17, a5Var, bundle);
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.AppInfoLogic", "requestAppShow fail, app is in blacklist, packageName = " + i18.field_packageName);
            if (a5Var != null) {
                a5Var.a(false, false);
            }
            return false;
        } finally {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.j(arrayList, false, false);
        }
    }

    public boolean hj(android.content.Context context, android.content.Intent intent, java.lang.String str, int i17, java.lang.String str2, com.tencent.mm.pluginsdk.model.app.a5 a5Var, com.tencent.mm.pluginsdk.model.app.e5 e5Var) {
        return com.tencent.mm.pluginsdk.model.app.w.u(context, intent, str, i17, a5Var, null, str2, e5Var);
    }

    public boolean ij(java.lang.String str) {
        return (str == null || str.trim().length() == 0 || str.equals("weixinfile") || str.equals("invalid_appname")) ? false : true;
    }

    public boolean mj(com.tencent.mm.pluginsdk.model.app.m mVar) {
        return (mVar == null || com.tencent.mm.sdk.platformtools.t8.K0(mVar.field_appId) || (mVar.field_appInfoFlag & 1) <= 0) ? false : true;
    }

    public boolean nj(com.tencent.mm.pluginsdk.model.app.m mVar) {
        return mVar == null || (mVar.field_appInfoFlag & 2) == 0;
    }

    public boolean wi(java.lang.String str) {
        com.tencent.mm.pluginsdk.model.app.m h17;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || (h17 = com.tencent.mm.pluginsdk.model.app.w.h(str)) == null || com.tencent.mm.sdk.platformtools.t8.K0(h17.field_appId)) {
            return false;
        }
        return h17.field_appId.equals("wx7fa037cc7dfabad5") || (h17.field_appInfoFlag & 8) > 0;
    }
}
