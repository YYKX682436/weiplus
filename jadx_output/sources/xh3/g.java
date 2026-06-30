package xh3;

/* loaded from: classes12.dex */
public final class g implements sx.z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xh3.h f454578d;

    public g(xh3.h hVar) {
        this.f454578d = hVar;
    }

    @Override // sx.z
    public int a(java.lang.String str, dn.g gVar, dn.h hVar) {
        java.util.List c17 = this.f454578d.c(str);
        xh3.h hVar2 = this.f454578d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("progressFinishLength:");
        sb6.append(gVar != null ? gVar.field_finishedLength : -123456L);
        sb6.append(" sceneResultRet:");
        sb6.append(hVar != null ? hVar.field_retCode : -123456);
        if (!xh3.h.a(hVar2, str, c17, "callback", "downloader", sb6.toString())) {
            return 0;
        }
        java.util.ArrayList<yh3.d> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : c17) {
            if (obj instanceof yh3.d) {
                arrayList.add(obj);
            }
        }
        for (yh3.d dVar : arrayList) {
            if (gVar != null) {
                com.tencent.mars.xlog.Log.i("MMMarsTaskDistributor", "callback by downloader onProgress progressFinishLength:" + gVar.field_finishedLength + ' ' + dVar + ' ');
                kotlin.jvm.internal.o.d(str);
                dVar.f(str, gVar.field_finishedLength, gVar.field_toltalLength);
            }
            if (hVar != null) {
                com.tencent.mars.xlog.Log.i("MMMarsTaskDistributor", "callback by downloader onFinish sceneResultRet:" + hVar.field_retCode + ' ' + dVar);
                kotlin.jvm.internal.o.d(str);
                dVar.g(str, hVar.field_retCode, hVar);
            }
        }
        return 1;
    }

    @Override // sx.z
    public int b(java.lang.String str, int i17, int i18) {
        return 0;
    }

    @Override // sx.z
    public int c(java.lang.String str, int i17, int i18) {
        java.util.List c17 = this.f454578d.c(str);
        if (!xh3.h.a(this.f454578d, str, c17, "onDataAvailable", "downloader", "offset:" + i17 + " length:" + i18)) {
            return 0;
        }
        java.util.ArrayList<yh3.d> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : c17) {
            if (obj instanceof yh3.d) {
                arrayList.add(obj);
            }
        }
        for (yh3.d dVar : arrayList) {
            com.tencent.mars.xlog.Log.i("MMMarsTaskDistributor", "onDataAvailable by downloader offset:" + i17 + " length:" + i18 + " task" + dVar);
            kotlin.jvm.internal.o.d(str);
            dVar.onDataAvailable(str, (long) i17, (long) i18);
        }
        return 1;
    }

    @Override // sx.z
    public int d(java.lang.String str, int i17, int i18, com.tencent.mars.cdn.CdnManager.VideoInfo videoInfo) {
        java.lang.String str2 = videoInfo != null ? videoInfo.svrFlag : null;
        if (str2 == null) {
            str2 = "";
        }
        java.util.List c17 = this.f454578d.c(str);
        if (!xh3.h.a(this.f454578d, str, c17, "onMoovReady", "downloader", "offset:" + i17 + " length:" + i18 + " svrflag:" + str2)) {
            return 0;
        }
        java.util.ArrayList<yh3.d> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : c17) {
            if (obj instanceof yh3.d) {
                arrayList.add(obj);
            }
        }
        for (yh3.d dVar : arrayList) {
            com.tencent.mars.xlog.Log.i("MMMarsTaskDistributor", "onMoovReady by downloader onMoovReady mediaId:" + str + " offset:" + i17 + " length:" + i18 + " task:" + dVar);
            kotlin.jvm.internal.o.d(str);
            dVar.onMoovReady(str, (long) i17, (long) i18, videoInfo);
        }
        return 1;
    }

    @Override // sx.z
    public int onM3U8Ready(java.lang.String str, java.lang.String str2) {
        return 0;
    }
}
