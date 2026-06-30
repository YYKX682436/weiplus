package ha3;

/* loaded from: classes15.dex */
public final class z extends com.tencent.thumbplayer.datatransport.resourceloader.AbsTPAssetResourceLoader {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f279961d;

    /* renamed from: e, reason: collision with root package name */
    public long f279962e;

    /* renamed from: f, reason: collision with root package name */
    public long f279963f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ha3.d0 f279964g;

    public z(ha3.d0 d0Var, java.lang.String mediaId) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        this.f279964g = d0Var;
        this.f279961d = mediaId;
    }

    @Override // com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public java.lang.String getContentType(int i17, java.lang.String fileName, java.lang.String str) {
        kotlin.jvm.internal.o.g(fileName, "fileName");
        return com.tencent.thumbplayer.tmediacodec.util.MimeTypes.VIDEO_MP4;
    }

    @Override // com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public java.lang.String getDataFilePath(int i17, java.lang.String fileName, java.lang.String str) {
        java.lang.String str2;
        kotlin.jvm.internal.o.g(fileName, "fileName");
        ha3.i0 i0Var = ha3.j0.f279886a;
        ha3.h0 h0Var = ha3.j0.f279887b;
        ha3.d0 d0Var = this.f279964g;
        ha3.e0 b17 = h0Var.b(d0Var.f279816f);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayer", "getDataFilePath textureId: " + d0Var.f279824n + ", mediaId: " + this.f279961d + " fileId: " + i17 + ", fileName: " + fileName + ", fileKey: " + str + ", taskInfo: " + b17 + ", state: " + d0Var.f279814d);
        return (b17 == null || (str2 = b17.f279837e) == null) ? "" : str2;
    }

    @Override // com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public long getDataTotalSize(int i17, java.lang.String fileName, java.lang.String str) {
        kotlin.jvm.internal.o.g(fileName, "fileName");
        ha3.i0 i0Var = ha3.j0.f279886a;
        ha3.h0 h0Var = ha3.j0.f279887b;
        ha3.d0 d0Var = this.f279964g;
        ha3.e0 b17 = h0Var.b(d0Var.f279816f);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayer", "getDataTotalSize textureId: " + d0Var.f279824n + ", mediaId: " + this.f279961d + " fileId: " + i17 + ", fileName: " + fileName + ", fileKey: " + str + ", taskInfo: " + b17 + ", state: " + d0Var.f279814d);
        if (b17 != null) {
            return b17.f279835c;
        }
        return 0L;
    }

    @Override // com.tencent.thumbplayer.datatransport.resourceloader.AbsTPAssetResourceLoader, com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public java.lang.String getM3U8Content(int i17, java.lang.String str, java.lang.String str2) {
        return super.getM3U8Content(i17, str, str2);
    }

    @Override // com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public int onReadData(int i17, java.lang.String fileName, java.lang.String str, long j17, long j18) {
        ha3.e0 e0Var;
        ha3.h0 h0Var;
        int i18;
        boolean z17;
        java.lang.String str2;
        java.lang.String str3;
        int i19;
        kotlin.jvm.internal.o.g(fileName, "fileName");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onReadData textureId: ");
        ha3.d0 d0Var = this.f279964g;
        sb6.append(d0Var.f279824n);
        sb6.append(", mediaId: ");
        java.lang.String str4 = this.f279961d;
        sb6.append(str4);
        sb6.append(" fileId: ");
        sb6.append(i17);
        sb6.append(", fileName: ");
        sb6.append(fileName);
        sb6.append(", fileKey: ");
        sb6.append(str);
        sb6.append(", offset: ");
        sb6.append(j17);
        sb6.append(", length: ");
        sb6.append(j18);
        sb6.append(", state: ");
        sb6.append(d0Var.f279814d);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayer", sb6.toString());
        if (j18 <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppVideoPlayer", "onReadData length <= 0");
            return 0;
        }
        ha3.i0 i0Var = ha3.j0.f279886a;
        ha3.h0 h0Var2 = ha3.j0.f279887b;
        ha3.e0 b17 = h0Var2.b(d0Var.f279816f);
        if (b17 != null && b17.f279836d) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayer", "onReadData is completed");
            return (int) j18;
        }
        if (d0Var.f279814d != 6) {
            boolean taskExist = ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).taskExist(str4);
            if (taskExist) {
                e0Var = b17;
                h0Var = h0Var2;
                i18 = 0;
                if (((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).isVideoDataAvailable(this.f279961d, j17, j18)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayer", "onReadData isVideoDataAvailable mediaId: " + str4 + ", offset: " + j17 + ", length: " + j18);
                    return (int) j18;
                }
            } else {
                e0Var = b17;
                h0Var = h0Var2;
                i18 = 0;
            }
            z17 = taskExist;
        } else {
            e0Var = b17;
            h0Var = h0Var2;
            i18 = 0;
            z17 = false;
        }
        int i27 = d0Var.f279814d;
        if (i27 != 3 && i27 != 5) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayer", "onReadData not in need data state, ignore, media:" + str4 + ", state:" + d0Var.f279814d);
            return i18;
        }
        if (i27 != 3) {
            ha3.h0 h0Var3 = h0Var;
            int i28 = i18;
            if (i27 != 5) {
                return i28;
            }
            if (this.f279962e == j17 && this.f279963f == j18) {
                return i28;
            }
            ha3.e0 e0Var2 = e0Var;
            int c17 = ha3.j0.f279886a.c(this.f279961d, j17, j18, 0);
            if (c17 == 0) {
                this.f279962e = j17;
                this.f279963f = j18;
                return 0;
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onReadData request video data error ");
            sb7.append(str4);
            sb7.append(", ret:");
            sb7.append(c17);
            sb7.append(" state:");
            sb7.append(d0Var.f279814d);
            sb7.append(", offset:");
            sb7.append(j17);
            sb7.append(", length:");
            sb7.append(j18);
            sb7.append(", cache:");
            sb7.append(e0Var2 != null ? java.lang.Long.valueOf(e0Var2.f279833a) : null);
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppVideoPlayer", sb7.toString());
            h0Var3.e(d0Var.f279816f, false, java.lang.Long.valueOf(j18 + j17));
            this.f279963f = 0L;
            return 0;
        }
        ha3.e0 e0Var3 = e0Var;
        if (e0Var != null) {
            str2 = ", offset:";
            r16 = java.lang.Long.valueOf(e0Var3.f279834b);
        } else {
            str2 = ", offset:";
        }
        kotlin.jvm.internal.o.d(r16);
        long j19 = j17 + j18;
        if (r16.longValue() >= j19) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayer", "onReadData preload enough, mediaId: " + str4);
            return (int) j18;
        }
        if (!z17 || !e0Var3.f279841i) {
            str3 = "MicroMsg.LiteAppVideoPlayer";
            ha3.h0 h0Var4 = h0Var;
            if (!e0Var3.f279839g) {
                i19 = 0;
                h0Var4.e(d0Var.f279816f, false, java.lang.Long.valueOf(j19));
                com.tencent.mars.xlog.Log.i(str3, "onReadData need more data, mediaId: " + str4);
                return i19;
            }
        } else {
            if (this.f279962e == j17 && this.f279963f == j18) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayer", "onReadData, range(" + j17 + ", " + j18 + ") is already requesting, mediaId: " + str4);
                return i18;
            }
            java.lang.String str5 = str2;
            int c18 = ha3.j0.f279886a.c(this.f279961d, j17, j18, 0);
            if (c18 != 0) {
                str3 = "MicroMsg.LiteAppVideoPlayer";
                com.tencent.mars.xlog.Log.e(str3, "onReadData request video data error " + str4 + ", ret:" + c18 + " state:" + d0Var.f279814d + str5 + j17 + ", length:" + j18 + ", cache:" + e0Var3.f279833a);
                h0Var.e(d0Var.f279816f, false, java.lang.Long.valueOf(j19));
                this.f279963f = 0L;
            } else {
                str3 = "MicroMsg.LiteAppVideoPlayer";
                this.f279962e = j17;
                this.f279963f = j18;
            }
        }
        i19 = 0;
        com.tencent.mars.xlog.Log.i(str3, "onReadData need more data, mediaId: " + str4);
        return i19;
    }

    @Override // com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public int onStartReadData(int i17, java.lang.String fileName, java.lang.String str, long j17, long j18) {
        kotlin.jvm.internal.o.g(fileName, "fileName");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onStartReadData textureId: ");
        sb6.append(this.f279964g.f279824n);
        sb6.append(", mediaId: ");
        java.lang.String str2 = this.f279961d;
        sb6.append(str2);
        sb6.append(", fileId: ");
        sb6.append(i17);
        sb6.append(", fileName: ");
        sb6.append(fileName);
        sb6.append(", fileKey: ");
        sb6.append(str);
        sb6.append(", requestStart: ");
        sb6.append(j17);
        sb6.append(", requestEnd: ");
        sb6.append(j18);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayer", sb6.toString());
        return str2.hashCode();
    }

    @Override // com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public int onStopReadData(int i17, java.lang.String fileName, java.lang.String str, int i18) {
        kotlin.jvm.internal.o.g(fileName, "fileName");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onStopReadData textureId: ");
        ha3.d0 d0Var = this.f279964g;
        sb6.append(d0Var.f279824n);
        sb6.append(", mediaId: ");
        sb6.append(this.f279961d);
        sb6.append(" fileId: ");
        sb6.append(i17);
        sb6.append(", fileName: ");
        sb6.append(fileName);
        sb6.append(", fileKey: ");
        sb6.append(str);
        sb6.append(", requestId: ");
        sb6.append(i18);
        sb6.append(", state: ");
        sb6.append(d0Var.f279814d);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayer", sb6.toString());
        return 0;
    }
}
