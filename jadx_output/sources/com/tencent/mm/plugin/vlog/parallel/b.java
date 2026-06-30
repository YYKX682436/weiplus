package com.tencent.mm.plugin.vlog.parallel;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: l, reason: collision with root package name */
    public static final com.tencent.mm.plugin.vlog.parallel.a f175803l = new com.tencent.mm.plugin.vlog.parallel.a(null);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f175804a;

    /* renamed from: b, reason: collision with root package name */
    public final int f175805b;

    /* renamed from: c, reason: collision with root package name */
    public final android.media.MediaFormat f175806c;

    /* renamed from: d, reason: collision with root package name */
    public int f175807d;

    /* renamed from: e, reason: collision with root package name */
    public int f175808e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f175809f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f175810g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f175811h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f175812i;

    /* renamed from: j, reason: collision with root package name */
    public java.nio.channels.WritableByteChannel f175813j;

    /* renamed from: k, reason: collision with root package name */
    public int f175814k;

    public b(boolean z17, int i17, android.media.MediaFormat mediaFormat, int i18, int i19, java.lang.String localSavePath, java.util.ArrayList pendingMediaDts, java.util.ArrayList pendingMediaPts, int i27, kotlin.jvm.internal.i iVar) {
        i18 = (i27 & 8) != 0 ? 0 : i18;
        i19 = (i27 & 16) != 0 ? 0 : i19;
        pendingMediaDts = (i27 & 64) != 0 ? new java.util.ArrayList() : pendingMediaDts;
        pendingMediaPts = (i27 & 128) != 0 ? new java.util.ArrayList() : pendingMediaPts;
        kotlin.jvm.internal.o.g(mediaFormat, "mediaFormat");
        kotlin.jvm.internal.o.g(localSavePath, "localSavePath");
        kotlin.jvm.internal.o.g(pendingMediaDts, "pendingMediaDts");
        kotlin.jvm.internal.o.g(pendingMediaPts, "pendingMediaPts");
        this.f175804a = z17;
        this.f175805b = i17;
        this.f175806c = mediaFormat;
        this.f175807d = i18;
        this.f175808e = i19;
        this.f175809f = localSavePath;
        this.f175810g = pendingMediaDts;
        this.f175811h = pendingMediaPts;
        this.f175812i = "MicroMsg.ParallelMuxTrackInfo";
    }

    public final void a(java.nio.ByteBuffer byteBuf, android.media.MediaCodec.BufferInfo bufferInfo) {
        android.media.MediaFormat mediaFormat = this.f175806c;
        kotlin.jvm.internal.o.g(byteBuf, "byteBuf");
        kotlin.jvm.internal.o.g(bufferInfo, "bufferInfo");
        this.f175807d++;
        int b17 = a06.d.b(((float) bufferInfo.presentationTimeUs) / 1000.0f);
        if (b17 > this.f175808e) {
            this.f175808e = b17;
        }
        java.nio.channels.WritableByteChannel writableByteChannel = this.f175813j;
        java.lang.String str = this.f175812i;
        if (writableByteChannel == null) {
            java.lang.String str2 = this.f175809f;
            this.f175813j = com.tencent.mm.vfs.w6.L(com.tencent.mm.vfs.z7.a(str2), null, false);
            com.tencent.mars.xlog.Log.i(str, "create localSavePath:".concat(str2));
        }
        try {
            boolean z17 = byteBuf.remaining() <= 0 || byteBuf.get(byteBuf.position()) != -1;
            boolean z18 = this.f175804a;
            if (!z18 && z17) {
                byte[] aACADTSHeaderData = com.tencent.mm.plugin.sight.base.SightVideoJNI.getAACADTSHeaderData(byteBuf.limit(), bufferInfo.presentationTimeUs, mediaFormat.containsKey("aac-profile") ? mediaFormat.getInteger("aac-profile") : 2, mediaFormat.containsKey("sample-rate") ? mediaFormat.getInteger("sample-rate") : 4, mediaFormat.containsKey("channel-count") ? mediaFormat.getInteger("channel-count") : 1);
                java.nio.channels.WritableByteChannel writableByteChannel2 = this.f175813j;
                if (writableByteChannel2 != null) {
                    writableByteChannel2.write(java.nio.ByteBuffer.wrap(aACADTSHeaderData));
                }
            }
            if (z18 && bufferInfo.presentationTimeUs < ((java.lang.Number) kz5.n0.i0(this.f175810g)).longValue()) {
                this.f175814k++;
            }
            java.nio.channels.WritableByteChannel writableByteChannel3 = this.f175813j;
            if (writableByteChannel3 != null) {
                writableByteChannel3.write(byteBuf);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(str, e17, "", new java.lang.Object[0]);
        }
        long j17 = bufferInfo.presentationTimeUs;
        java.util.ArrayList arrayList = this.f175811h;
        if (j17 != 0 || arrayList.size() <= 0) {
            arrayList.add(java.lang.Long.valueOf(bufferInfo.presentationTimeUs));
            return;
        }
        com.tencent.mars.xlog.Log.e(str, "happen error ,bufferInfo size:" + bufferInfo.size);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.vlog.parallel.b)) {
            return false;
        }
        com.tencent.mm.plugin.vlog.parallel.b bVar = (com.tencent.mm.plugin.vlog.parallel.b) obj;
        return this.f175804a == bVar.f175804a && this.f175805b == bVar.f175805b && kotlin.jvm.internal.o.b(this.f175806c, bVar.f175806c) && this.f175807d == bVar.f175807d && this.f175808e == bVar.f175808e && kotlin.jvm.internal.o.b(this.f175809f, bVar.f175809f) && kotlin.jvm.internal.o.b(this.f175810g, bVar.f175810g) && kotlin.jvm.internal.o.b(this.f175811h, bVar.f175811h);
    }

    public int hashCode() {
        return (((((((((((((java.lang.Boolean.hashCode(this.f175804a) * 31) + java.lang.Integer.hashCode(this.f175805b)) * 31) + this.f175806c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f175807d)) * 31) + java.lang.Integer.hashCode(this.f175808e)) * 31) + this.f175809f.hashCode()) * 31) + this.f175810g.hashCode()) * 31) + this.f175811h.hashCode();
    }

    public java.lang.String toString() {
        return "ParallelMuxTrackInfo(isVideoTrack=" + this.f175804a + ", trackId=" + this.f175805b + ", mediaFormat=" + this.f175806c + ", frameCount=" + this.f175807d + ", trackDuration=" + this.f175808e + ", localSavePath=" + this.f175809f + ", pendingMediaDts=" + this.f175810g + ", pendingMediaPts=" + this.f175811h + ')';
    }
}
