package com.tencent.mm.plugin.vlog.parallel;

/* loaded from: classes10.dex */
public final class c implements com.tencent.tav.decoder.muxer.IMediaMuxer {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f175815a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f175816b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.tav.core.ExportConfig f175817c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f175818d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f175819e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f175820f;

    /* renamed from: g, reason: collision with root package name */
    public int f175821g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.tav.coremedia.CMTimeRange f175822h;

    /* renamed from: i, reason: collision with root package name */
    public int f175823i;

    /* renamed from: j, reason: collision with root package name */
    public int f175824j;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.ArrayList f175825k;

    public c(java.lang.String path, int i17) {
        kotlin.jvm.internal.o.g(path, "path");
        this.f175815a = path;
        this.f175816b = "MicroMsg.ParallelVideoJniMuxer[" + hashCode() + ']';
        this.f175820f = new java.util.ArrayList();
        this.f175821g = -1;
        this.f175825k = new java.util.ArrayList();
    }

    public final com.tencent.mm.plugin.vlog.parallel.b a() {
        java.lang.Object obj;
        java.util.Iterator it = this.f175820f.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!((com.tencent.mm.plugin.vlog.parallel.b) obj).f175804a) {
                break;
            }
        }
        return (com.tencent.mm.plugin.vlog.parallel.b) obj;
    }

    @Override // com.tencent.tav.decoder.muxer.IMediaMuxer
    public int addTrack(android.media.MediaFormat format) {
        kotlin.jvm.internal.o.g(format, "format");
        com.tencent.mars.xlog.Log.i(this.f175816b, "[" + hashCode() + "]add track " + format.getString("mime"));
        com.tencent.mm.plugin.vlog.parallel.b a17 = com.tencent.mm.plugin.vlog.parallel.b.f175803l.a(format, java.lang.String.valueOf(hashCode()));
        this.f175820f.add(a17);
        return a17.f175805b;
    }

    @Override // com.tencent.tav.decoder.muxer.IMediaMuxer
    public int audioTrackIndex() {
        com.tencent.mm.plugin.vlog.parallel.b a17 = a();
        if (a17 != null) {
            return a17.f175805b;
        }
        return -1;
    }

    public final com.tencent.mm.plugin.vlog.parallel.b b() {
        java.lang.Object obj;
        java.util.Iterator it = this.f175820f.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((com.tencent.mm.plugin.vlog.parallel.b) obj).f175804a) {
                break;
            }
        }
        return (com.tencent.mm.plugin.vlog.parallel.b) obj;
    }

    @Override // com.tencent.tav.decoder.muxer.IMediaMuxer
    public void clearResource() {
        for (com.tencent.mm.plugin.vlog.parallel.b bVar : this.f175820f) {
            com.tencent.mm.vfs.w6.h(bVar.f175809f);
            com.tencent.mars.xlog.Log.i(this.f175816b, "clearResource:" + bVar.f175809f);
        }
    }

    @Override // com.tencent.tav.decoder.muxer.IMediaMuxer
    public com.tencent.tav.core.ExportConfig getExportConfig() {
        return this.f175817c;
    }

    @Override // com.tencent.tav.decoder.muxer.IMediaMuxer
    public boolean ignoreHeader() {
        return false;
    }

    @Override // com.tencent.tav.decoder.muxer.IMediaMuxer
    public boolean isMuxerStarted() {
        return this.f175818d;
    }

    @Override // com.tencent.tav.decoder.muxer.IMediaMuxer
    public void prepareParallelSegmentInfo(int i17, com.tencent.tav.coremedia.CMTimeRange cMTimeRange, com.tencent.tav.coremedia.CMTimeRange cMTimeRange2) {
        this.f175821g = i17;
        this.f175822h = cMTimeRange;
        com.tencent.mars.xlog.Log.i(this.f175816b, "index:" + i17 + " segmentRange:" + cMTimeRange + " allRange:" + cMTimeRange2);
    }

    @Override // com.tencent.tav.decoder.muxer.IMediaMuxer
    public void release() {
    }

    @Override // com.tencent.tav.decoder.muxer.IMediaMuxer
    public void setExportConfig(com.tencent.tav.core.ExportConfig exportConfig) {
        kotlin.jvm.internal.o.g(exportConfig, "exportConfig");
        this.f175817c = exportConfig;
    }

    @Override // com.tencent.tav.decoder.muxer.IMediaMuxer
    public void start() {
        this.f175818d = true;
    }

    @Override // com.tencent.tav.decoder.muxer.IMediaMuxer
    public boolean stop(boolean z17) {
        if (!this.f175819e) {
            com.tencent.mars.xlog.Log.i(this.f175816b, "muxer[" + hashCode() + "][" + this.f175821g + "] stop  timeCount:" + this.f175823i + "  dataCount:" + this.f175824j);
            java.util.Iterator it = this.f175820f.iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.vlog.parallel.b bVar = (com.tencent.mm.plugin.vlog.parallel.b) it.next();
                bVar.getClass();
                try {
                    java.nio.channels.WritableByteChannel writableByteChannel = bVar.f175813j;
                    if (writableByteChannel != null) {
                        writableByteChannel.close();
                    }
                } catch (java.lang.Exception unused) {
                }
            }
            this.f175819e = true;
            this.f175818d = false;
        }
        return true;
    }

    @Override // com.tencent.tav.decoder.muxer.IMediaMuxer
    public int videoTrackIndex() {
        com.tencent.mm.plugin.vlog.parallel.b b17 = b();
        if (b17 != null) {
            return b17.f175805b;
        }
        return -1;
    }

    @Override // com.tencent.tav.decoder.muxer.IMediaMuxer
    public void writeSampleData(int i17, java.nio.ByteBuffer byteBuf, android.media.MediaCodec.BufferInfo bufferInfo) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(byteBuf, "byteBuf");
        kotlin.jvm.internal.o.g(bufferInfo, "bufferInfo");
        if (this.f175819e) {
            com.tencent.mars.xlog.Log.i(this.f175816b, "writeSampleData error,has finished");
            return;
        }
        java.util.Iterator it = this.f175820f.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((com.tencent.mm.plugin.vlog.parallel.b) obj).f175805b == i17) {
                    break;
                }
            }
        }
        com.tencent.mm.plugin.vlog.parallel.b bVar = (com.tencent.mm.plugin.vlog.parallel.b) obj;
        if (bVar != null) {
            if (bVar.f175804a && bufferInfo.presentationTimeUs == 0) {
                com.tencent.mars.xlog.Log.e(this.f175816b, "[" + hashCode() + "]writeSampleData pts track id:" + i17 + "  timeUs:" + bufferInfo.presentationTimeUs);
            }
            bVar.a(byteBuf, bufferInfo);
            this.f175824j++;
        }
    }

    @Override // com.tencent.tav.decoder.muxer.IMediaMuxer
    public void writeSampleDataTime(boolean z17, com.tencent.tav.coremedia.CMTime sampleTime) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.util.ArrayList arrayList3;
        kotlin.jvm.internal.o.g(sampleTime, "sampleTime");
        if (this.f175819e) {
            com.tencent.mars.xlog.Log.i(this.f175816b, "writeSampleDataTime error,has finished");
            return;
        }
        this.f175823i++;
        if (z17) {
            if (b() == null) {
                this.f175825k.add(java.lang.Long.valueOf(sampleTime.getTimeUs()));
                return;
            }
            if (!this.f175825k.isEmpty()) {
                com.tencent.mars.xlog.Log.i(this.f175816b, "videoTrack cache dts size:" + this.f175825k.size());
                com.tencent.mm.plugin.vlog.parallel.b b17 = b();
                if (b17 != null && (arrayList3 = b17.f175810g) != null) {
                    arrayList3.addAll(this.f175825k);
                }
                this.f175825k.clear();
            }
            com.tencent.mm.plugin.vlog.parallel.b b18 = b();
            if (b18 == null || (arrayList = b18.f175810g) == null) {
                return;
            }
            if (arrayList.size() <= 2 || sampleTime.getTimeUs() > ((java.lang.Number) kz5.n0.i0(arrayList)).longValue()) {
                arrayList.add(java.lang.Long.valueOf(sampleTime.getTimeUs()));
            } else {
                long longValue = ((java.lang.Number) kz5.n0.i0(arrayList)).longValue();
                long longValue2 = ((java.lang.Number) arrayList.get(1)).longValue();
                java.lang.Object obj = arrayList.get(2);
                kotlin.jvm.internal.o.f(obj, "get(...)");
                long longValue3 = longValue + (longValue2 - ((java.lang.Number) obj).longValue());
                com.tencent.mars.xlog.Log.e(this.f175816b, "writeSampleDataTime error timeus:" + sampleTime.getTimeUs());
                arrayList.add(java.lang.Long.valueOf(longValue3));
            }
            sampleTime.getTimeUs();
            arrayList.size();
            com.tencent.mm.plugin.vlog.parallel.b b19 = b();
            if (b19 == null || (arrayList2 = b19.f175810g) == null) {
                return;
            }
            arrayList2.size();
        }
    }
}
