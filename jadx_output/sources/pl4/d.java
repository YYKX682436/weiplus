package pl4;

/* loaded from: classes15.dex */
public final class d extends pl4.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pl4.k f356707d;

    public d(pl4.k kVar) {
        this.f356707d = kVar;
    }

    @Override // com.tencent.mars.cdn.CdnManager.DownloadCallback
    public void onC2CDownloadCompleted(java.lang.String str, com.tencent.mars.cdn.CdnManager.C2CDownloadResult c2CDownloadResult) {
        int i17;
        boolean z17;
        if (kotlin.jvm.internal.o.b(str, this.f356707d.f356718b)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onC2CDownloadCompleted mediaId:");
            sb6.append(this.f356707d.f356718b);
            sb6.append(" onC2CDownloadCompleted result:");
            sb6.append(c2CDownloadResult != null ? java.lang.Integer.valueOf(c2CDownloadResult.errorCode) : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.TingTPResourceLoader", sb6.toString());
            boolean z18 = true;
            if (c2CDownloadResult != null && c2CDownloadResult.errorCode == 0) {
                pl4.k kVar = this.f356707d;
                kVar.f356726j = true;
                try {
                    java.lang.String field_fullpath = kVar.f356735s.field_fullpath;
                    kotlin.jvm.internal.o.f(field_fullpath, "field_fullpath");
                    com.tencent.mars.xlog.Log.i("MicroMsg.TingTPResourceLoader", "markDownloadCompleted fileCacheId:" + kVar.f356718b + ", createNewFile ret: " + com.tencent.mm.vfs.w6.e(field_fullpath.concat(".finish")));
                    return;
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.TingTPResourceLoader", "markDownloadCompleted createNewFile failed e " + e17.getMessage());
                    return;
                }
            }
            if (c2CDownloadResult == null || (i17 = c2CDownloadResult.errorCode) == 0) {
                return;
            }
            if (i17 == -10012) {
                pl4.k kVar2 = this.f356707d;
                synchronized (kVar2.f356721e) {
                    if (!kVar2.f356732p.isEmpty()) {
                        java.util.Iterator it = kVar2.f356732p.iterator();
                        while (it.hasNext()) {
                            com.tencent.thumbplayer.api.resourceloader.ITPAssetResourceLoadingRequest iTPAssetResourceLoadingRequest = (com.tencent.thumbplayer.api.resourceloader.ITPAssetResourceLoadingRequest) it.next();
                            long currentOffset = iTPAssetResourceLoadingRequest.getLoadingDataRequest().getCurrentOffset();
                            if (currentOffset + kVar2.d(currentOffset) < iTPAssetResourceLoadingRequest.getLoadingDataRequest().getRequestedLength() + iTPAssetResourceLoadingRequest.getLoadingDataRequest().getRequestedOffset()) {
                                z17 = false;
                                break;
                            }
                        }
                    }
                    z17 = true;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.TingTPResourceLoader", "onC2CDownloadCompleted mediaId:" + this.f356707d.f356718b + " allRequestDownloadFinished:" + z17 + ", hasRequested:" + this.f356707d.f356731o);
                pl4.k kVar3 = this.f356707d;
                if (kVar3.f356731o && z17) {
                    kVar3.j(false);
                    z18 = false;
                }
            }
            if (z18) {
                this.f356707d.f356720d.invoke("download error: " + c2CDownloadResult.errorCode);
            }
        }
    }

    @Override // com.tencent.mars.cdn.CdnManager.DownloadCallback
    public void onDownloadProgressChanged(java.lang.String str, long j17, long j18, boolean z17) {
        pl4.k kVar = this.f356707d;
        if (kotlin.jvm.internal.o.b(str, kVar.f356718b)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TingTPResourceLoader", "onDownloadProgressChanged mediaId:" + kVar.f356718b + " onProgress finished:" + j17 + " total:" + j18);
            if (kVar.f356725i <= 0 && j18 > 0) {
                kVar.c(j18);
            }
            if (j17 > 0) {
                kVar.g();
            }
        }
    }
}
