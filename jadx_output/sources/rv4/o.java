package rv4;

/* loaded from: classes12.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv4.p f400522d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f400523e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f400524f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f400525g;

    public o(rv4.p pVar, long j17, long j18, java.lang.String str) {
        this.f400522d = pVar;
        this.f400523e = j17;
        this.f400524f = j18;
        this.f400525g = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f400525g;
        long j17 = this.f400524f;
        long j18 = this.f400523e;
        rv4.p pVar = this.f400522d;
        try {
            try {
                pVar.f400533h = j18;
                pVar.f400534i = j17;
                com.tencent.mars.xlog.Log.i("MicroMsg.FTSGlobalTeachHotSearchData", "[ftshotsearch] Response received, duration: " + (j17 - j18) + "ms");
                if (str.length() == 0) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.FTSGlobalTeachHotSearchData", "[ftshotsearch] Empty JSON received");
                    pVar.f400528c = kz5.p0.f313996d;
                } else {
                    java.util.List d17 = rv4.q.f400544a.d(new org.json.JSONObject(str));
                    com.tencent.mars.xlog.Log.i("MicroMsg.FTSGlobalTeachHotSearchData", "[ftshotsearch] Parsed " + d17.size() + " items");
                    pVar.f400528c = d17;
                    if (!d17.isEmpty()) {
                        pVar.l(ov4.f.f349232g, pVar.f400540o);
                    }
                    java.util.Iterator it = d17.iterator();
                    while (it.hasNext()) {
                        ((rv4.i0) it.next()).f400494e = pVar;
                    }
                    java.lang.String u17 = ((sg0.a3) ((su4.e1) i95.n0.c(su4.e1.class))).wi().u("websearch:hotsearch:config", "");
                    com.tencent.mars.xlog.Log.i("[FTSNativeGlobalTeach] FTSGlobalTeachDataMgr", "getHotSearchConfig: " + u17);
                    kotlin.jvm.internal.o.d(u17);
                    org.json.JSONObject f17 = pv4.a.f(u17);
                    if (f17 != null) {
                        java.lang.String optString = f17.optString("searchID", "");
                        kotlin.jvm.internal.o.f(optString, "optString(...)");
                        pVar.f400530e = optString;
                        java.lang.String optString2 = f17.optString("requestId", "");
                        kotlin.jvm.internal.o.f(optString2, "optString(...)");
                        pVar.f400529d = optString2;
                        f17.optBoolean("refreshCanShow", false);
                        kotlin.jvm.internal.o.f(f17.optString("refreshTitle", ""), "optString(...)");
                        java.lang.String optString3 = f17.optString("refreshDocInfo", "");
                        kotlin.jvm.internal.o.f(optString3, "optString(...)");
                        pVar.f400531f = optString3;
                        kotlin.jvm.internal.o.f(f17.optString("guessTitle", ""), "optString(...)");
                        f17.optInt("showCount", 4);
                        kotlin.jvm.internal.o.f(f17.optString("ctx", ""), "optString(...)");
                        com.tencent.mars.xlog.Log.i("MicroMsg.FTSGlobalTeachHotSearchData", "[ftshotsearch] Config updated: searchId=" + pVar.f400530e);
                    }
                }
                if (pVar.f400542q == 1) {
                    pVar.f400535j = 1;
                }
                pVar.f400536k = false;
                yz5.a aVar = pVar.f400541p;
                if (aVar != null) {
                    aVar.invoke();
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.FTSGlobalTeachHotSearchData", "[ftshotsearch] UI updated successfully with " + pVar.f400528c.size() + " items");
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FTSGlobalTeachHotSearchData", "[ftshotsearch] Error handling network response", e17);
                yz5.a aVar2 = pVar.f400541p;
                if (aVar2 != null) {
                    aVar2.invoke();
                }
            }
            pVar.f400541p = null;
        } catch (java.lang.Throwable th6) {
            pVar.f400541p = null;
            throw th6;
        }
    }
}
