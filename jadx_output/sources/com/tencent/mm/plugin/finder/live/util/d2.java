package com.tencent.mm.plugin.finder.live.util;

/* loaded from: classes10.dex */
public abstract class d2 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f115476a = com.tencent.mm.vfs.q7.c("finder_live_ktv_sing_temp_song") + '/';

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.r2 f115477b = new com.tencent.mm.sdk.platformtools.r2(30);

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.LinkedHashMap f115478c;

    static {
        new java.util.LinkedHashMap();
        f115478c = new java.util.LinkedHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0154 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(gk2.e r13, r45.yx1 r14, kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.util.d2.a(gk2.e, r45.yx1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final om2.t b(java.lang.String songMid) {
        om2.t tVar;
        kotlin.jvm.internal.o.g(songMid, "songMid");
        com.tencent.mm.sdk.platformtools.r2 r2Var = f115477b;
        synchronized (r2Var) {
            tVar = (om2.t) r2Var.get(songMid);
        }
        return tVar;
    }

    public static final om2.t c(r45.yx1 songInfo, boolean z17) {
        kotlin.jvm.internal.o.g(songInfo, "songInfo");
        java.lang.String str = songInfo.f391458d;
        if (str == null) {
            str = "";
        }
        om2.t b17 = b(str);
        com.tencent.mars.xlog.Log.i("LiveKTVResourceUtil", "getBaseResourceSongInfo unique_id: " + songInfo.f391459e + " songMid: " + songInfo.f391458d + " res: " + b17 + " forceNeedNoteRes: " + z17);
        if ((b17 != null ? b17.f346382b : null) != null) {
            return b17;
        }
        r45.by1 by1Var = songInfo.f391466o;
        java.lang.String str2 = songInfo.f391459e;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = songInfo.f391458d;
        return e(by1Var, str2, str3 != null ? str3 : "", z17);
    }

    public static final void d(r45.sx1 sx1Var) {
        java.util.LinkedList<r45.h84> linkedList;
        if (sx1Var == null || (linkedList = sx1Var.f386003d) == null) {
            return;
        }
        for (r45.h84 h84Var : linkedList) {
            try {
                java.lang.String string = h84Var.getString(0);
                int optInt = new org.json.JSONObject(h84Var.getString(5)).optInt("reverb_type");
                java.util.LinkedHashMap linkedHashMap = f115478c;
                java.lang.Integer valueOf = java.lang.Integer.valueOf(optInt);
                java.lang.String str = "";
                if (string == null) {
                    string = "";
                }
                java.lang.String string2 = h84Var.getString(2);
                if (string2 == null) {
                    string2 = "";
                }
                java.lang.String string3 = h84Var.getString(1);
                if (string3 != null) {
                    str = string3;
                }
                om2.b bVar = new om2.b(string, optInt, string2, str);
                com.tencent.mars.xlog.Log.i("LiveKTVResourceUtil", "reverbData: " + bVar);
                linkedHashMap.put(valueOf, bVar);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("LiveKTVResourceUtil", "parse reverbData error", th6);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x017a, code lost:
    
        if ((r10 != null ? r10.size() : 0) > 0) goto L80;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0196 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01b7 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [int] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [int] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final om2.t e(r45.by1 r17, java.lang.String r18, java.lang.String r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.util.d2.e(r45.by1, java.lang.String, java.lang.String, boolean):om2.t");
    }
}
