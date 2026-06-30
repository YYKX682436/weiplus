package mn2;

/* loaded from: classes4.dex */
public final class y3 {
    public y3(kotlin.jvm.internal.i iVar) {
    }

    public final boolean a(java.lang.String mediaId) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        long[] jArr = new long[3];
        ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).queryDownloadedSize(mediaId, jArr);
        long j17 = jArr[0];
        long j18 = jArr[1];
        if (j17 == j18 && j18 == jArr[2]) {
            return true;
        }
        com.tencent.mars.xlog.Log.e("Finder.VideoDownloader", "[checkFinishValid] mediaId=" + mediaId + ' ' + jArr[0] + ':' + jArr[1] + ':' + jArr[2]);
        return false;
    }
}
