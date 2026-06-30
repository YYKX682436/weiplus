package dk2;

/* loaded from: classes10.dex */
public final class ca {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f233291a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f233292b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f233293c;

    public ca(androidx.appcompat.app.AppCompatActivity activity, java.lang.String downloadDir) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(downloadDir, "downloadDir");
        this.f233291a = downloadDir;
        this.f233292b = new java.util.LinkedHashMap();
    }

    public final void a(java.lang.String str) {
        java.util.Map map = this.f233292b;
        if (map.containsKey(str)) {
            com.tencent.mars.xlog.Log.i("FinderLiveKTVReplayDownloadManager", "cancel download, id: " + str);
            dn.o oVar = (dn.o) ((java.util.LinkedHashMap) map).get(str);
            if (oVar != null) {
                oVar.f241815c2 = null;
            }
            map.remove(str);
            ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
            t21.o2.Di().g(str, new java.lang.Object[0]);
        }
    }

    public final void b(java.util.List list, int i17, int i18, java.util.List list2, dk2.t9 t9Var) {
        if (i17 >= i18) {
            com.tencent.mars.xlog.Log.i("FinderLiveKTVReplayDownloadManager", "downloadVideosSequentially: all done, downloadedCount=" + list2.size());
            this.f233293c = false;
            pm0.v.X(new dk2.w9(t9Var, list2));
            return;
        }
        dk2.rf rfVar = (dk2.rf) list.get(i17);
        java.lang.String str = rfVar.f234040e;
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("FinderLiveKTVReplayDownloadManager", "downloadVideosSequentially: url is null or empty at index " + i17);
            b(list, i17 + 1, i18, list2, t9Var);
            return;
        }
        java.lang.String str2 = rfVar.f234039d;
        if (str2 == null || str2.length() == 0) {
            com.tencent.mars.xlog.Log.e("FinderLiveKTVReplayDownloadManager", "downloadVideosSequentially: micReplayId is null or empty at index " + i17);
            b(list, i17 + 1, i18, list2, t9Var);
            return;
        }
        java.lang.Long l17 = rfVar.f234046n;
        long longValue = l17 != null ? l17.longValue() : 0L;
        java.lang.Long l18 = rfVar.f234047o;
        long longValue2 = l18 != null ? l18.longValue() : 0L;
        java.lang.String str3 = str2 == null ? "" : str2;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String str4 = com.tencent.mm.sdk.platformtools.w2.a(longValue + '_' + longValue2 + '_' + str3) + '_' + currentTimeMillis;
        java.lang.String str5 = this.f233291a + '/' + str4 + ".mp4";
        java.lang.String str6 = str2 == null ? "" : str2;
        com.tencent.mars.xlog.Log.i("FinderLiveKTVReplayDownloadManager", "downloadVideosSequentially: start download " + i17 + '/' + i18 + ", fileName=" + str4);
        java.lang.String str7 = str6;
        dk2.y9 y9Var = new dk2.y9(i17, list2, this, list, i18, t9Var, str);
        dk2.z9 z9Var = new dk2.z9(i17, this, list, i18, list2, t9Var);
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str5);
        java.lang.String str8 = a17.f213279f;
        if (str8 != null) {
            java.lang.String l19 = com.tencent.mm.vfs.e8.l(str8, false, false);
            if (!str8.equals(l19)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l19, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (!m17.a() ? false : m17.f213266a.F(m17.f213267b)) {
            com.tencent.mars.xlog.Log.i("FinderLiveKTVReplayDownloadManager", "downloadSingleVideo: file already exists, mediaId=".concat(str7));
            y9Var.invoke(str5);
            return;
        }
        com.tencent.mm.vfs.w6.u(com.tencent.mm.vfs.w6.r(str5));
        dn.o oVar = new dn.o();
        oVar.f241785d = "task_FinderCdnDownloader";
        oVar.field_mediaId = str7;
        oVar.M1 = str;
        oVar.field_fullpath = str5;
        oVar.E1 = str4 + ".mp4";
        oVar.field_priority = 2;
        oVar.A = 60;
        oVar.B = 60;
        oVar.Y = 0;
        oVar.H1 = 0;
        oVar.Z = 8;
        oVar.field_fileType = 20302;
        oVar.field_requestVideoFormat = 0;
        oVar.X = 0L;
        oVar.f241809y0 = 4;
        oVar.f241806x0 = 1;
        this.f233292b.put(str7, oVar);
        oVar.f241815c2 = new dk2.v9(this, str5, y9Var, z9Var);
        ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
        boolean e17 = t21.o2.Di().e(oVar, false);
        com.tencent.mars.xlog.Log.i("FinderLiveKTVReplayDownloadManager", "addDownloadTask: mediaId=" + str7 + ", result=" + e17);
        if (e17) {
            return;
        }
        com.tencent.mars.xlog.Log.e("FinderLiveKTVReplayDownloadManager", "addRecvTask failed for mediaId: ".concat(str7));
        a(str7);
        z9Var.invoke("Failed to add download task");
    }
}
