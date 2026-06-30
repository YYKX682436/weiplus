package com.tencent.mm.plugin.vlog.parallel;

/* loaded from: classes10.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.vlog.parallel.h f175832a = new com.tencent.mm.plugin.vlog.parallel.h();

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.plugin.vlog.parallel.TAVKitParallelSoftEncodeMuxer$SightVideoJNIMediaMuxerFactory f175833b;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.tencent.mm.plugin.vlog.parallel.TAVKitParallelSoftEncodeMuxer$SightVideoJNIMediaMuxerFactory] */
    static {
        mq1.w0.wi();
        fp.d0.n("mediaplus");
        f175833b = new com.tencent.tav.decoder.muxer.MediaMuxerFactory.MediaMuxerCreator() { // from class: com.tencent.mm.plugin.vlog.parallel.TAVKitParallelSoftEncodeMuxer$SightVideoJNIMediaMuxerFactory
            @Override // com.tencent.tav.decoder.muxer.MediaMuxerFactory.MediaMuxerCreator
            public com.tencent.tav.decoder.muxer.IMediaMuxer createMediaMuxer(java.lang.String path, int format) {
                kotlin.jvm.internal.o.g(path, "path");
                return new com.tencent.mm.plugin.vlog.parallel.d(path, format);
            }

            @Override // com.tencent.tav.decoder.muxer.MediaMuxerFactory.MediaMuxerCreator
            public int parallelMux(java.util.List<? extends com.tencent.tav.decoder.muxer.IMediaMuxer> muxers) {
                java.lang.Object obj;
                java.lang.Object obj2;
                com.tencent.mm.plugin.vlog.parallel.h hVar;
                java.util.ArrayList arrayList;
                java.util.Iterator it;
                if (muxers == null) {
                    return -1;
                }
                com.tencent.mm.plugin.vlog.parallel.h hVar2 = com.tencent.mm.plugin.vlog.parallel.h.f175832a;
                com.tencent.mars.xlog.Log.i("MicroMsg.TAVKitParallelSoftEncodeMuxer", "parallelMuxImp size:" + muxers.size());
                com.tencent.tav.core.ExportConfig exportConfig = ((com.tencent.mm.plugin.vlog.parallel.d) kz5.n0.X(muxers)).getExportConfig();
                java.util.Iterator<T> it6 = muxers.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it6.next();
                    if (((com.tencent.mm.plugin.vlog.parallel.d) obj).getAudioFormat() != null) {
                        break;
                    }
                }
                com.tencent.mm.plugin.vlog.parallel.d dVar = (com.tencent.mm.plugin.vlog.parallel.d) obj;
                android.media.MediaFormat audioFormat = dVar != null ? dVar.getAudioFormat() : null;
                java.util.Iterator<T> it7 = muxers.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it7.next();
                    if (((com.tencent.mm.plugin.vlog.parallel.d) obj2).getVideoFormat() != null) {
                        break;
                    }
                }
                com.tencent.mm.plugin.vlog.parallel.d dVar2 = (com.tencent.mm.plugin.vlog.parallel.d) obj2;
                android.media.MediaFormat videoFormat = dVar2 != null ? dVar2.getVideoFormat() : null;
                int integer = (audioFormat != null && audioFormat.containsKey("channel-count")) ? audioFormat.getInteger("channel-count") : 0;
                int integer2 = (videoFormat != null && videoFormat.containsKey("frame-rate")) ? videoFormat.getInteger("frame-rate") : 0;
                if (integer2 < 1) {
                    integer2 = 30;
                }
                int audioChannelCount = exportConfig != null ? exportConfig.getAudioChannelCount() : 0;
                if (integer < 0) {
                    integer = audioChannelCount;
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                kz5.n0.F0(muxers, new com.tencent.mm.plugin.vlog.parallel.g());
                com.tencent.mm.mediaplus.ParallelMuxerJni parallelMuxerJni = new com.tencent.mm.mediaplus.ParallelMuxerJni();
                parallelMuxerJni.e();
                java.util.Iterator it8 = muxers.iterator();
                java.lang.String str = "";
                long j17 = 0;
                while (it8.hasNext()) {
                    com.tencent.mm.plugin.vlog.parallel.d dVar3 = (com.tencent.mm.plugin.vlog.parallel.d) it8.next();
                    com.tencent.mm.plugin.sight.base.h sightEncode = dVar3.getSightEncode();
                    java.lang.String muxerTempVideoPath = com.tencent.mm.plugin.sight.base.SightVideoJNI.getMuxerTempVideoPath(sightEncode != null ? sightEncode.f162415a : 0);
                    android.media.MediaFormat videoFormat2 = dVar3.getVideoFormat();
                    com.tencent.mm.plugin.vlog.parallel.h hVar3 = com.tencent.mm.plugin.vlog.parallel.h.f175832a;
                    if (videoFormat2 == null || !com.tencent.mm.vfs.w6.j(muxerTempVideoPath)) {
                        hVar = hVar2;
                        if (dVar3.getVideoFormat() != null && !com.tencent.mm.vfs.w6.j(muxerTempVideoPath)) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.TAVKitParallelSoftEncodeMuxer", "mux error,empty video file index:" + dVar3.getIndex() + " path:" + muxerTempVideoPath);
                            hVar3.a(parallelMuxerJni, muxers);
                            return -2;
                        }
                    } else {
                        com.tencent.mm.plugin.sight.base.h sightEncode2 = dVar3.getSightEncode();
                        int i17 = sightEncode2 != null ? sightEncode2.f162415a : -1;
                        arrayList3.add(java.lang.Integer.valueOf(i17));
                        kotlin.jvm.internal.o.d(muxerTempVideoPath);
                        arrayList2.add(muxerTempVideoPath);
                        hVar = hVar2;
                        j17 += dVar3.getVideoFrameCount();
                        long[] softEncodeDtsArray = com.tencent.mm.plugin.sight.base.SightVideoJNI.getSoftEncodeDtsArray(i17);
                        kotlin.jvm.internal.o.f(softEncodeDtsArray, "getSoftEncodeDtsArray(...)");
                        float f17 = integer2;
                        parallelMuxerJni.b(softEncodeDtsArray, f17);
                        long[] softEncodePtsArray = com.tencent.mm.plugin.sight.base.SightVideoJNI.getSoftEncodePtsArray(i17);
                        kotlin.jvm.internal.o.f(softEncodePtsArray, "getSoftEncodePtsArray(...)");
                        parallelMuxerJni.d(softEncodePtsArray, dVar3.getVideoFrameCount(), f17);
                    }
                    com.tencent.mm.plugin.vlog.parallel.b bVar = dVar3.f175829d;
                    if (bVar != null) {
                        java.lang.String str2 = bVar.f175809f;
                        long k17 = com.tencent.mm.vfs.w6.k(str2);
                        arrayList = arrayList3;
                        it = it8;
                        com.tencent.mars.xlog.Log.i("MicroMsg.TAVKitParallelSoftEncodeMuxer", "muxer[" + dVar3.getIndex() + "] write audio,path:" + str2 + " size:" + k17);
                        if (k17 <= 0) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.TAVKitParallelSoftEncodeMuxer", "mux error,empty audio file.index:" + dVar3.getIndex());
                            hVar3.a(parallelMuxerJni, muxers);
                            return -3;
                        }
                        parallelMuxerJni.a(kz5.n0.T0(bVar.f175811h));
                        str = str2;
                    } else {
                        arrayList = arrayList3;
                        it = it8;
                    }
                    arrayList3 = arrayList;
                    hVar2 = hVar;
                    it8 = it;
                }
                com.tencent.mm.plugin.vlog.parallel.h hVar4 = hVar2;
                boolean z17 = integer <= 0 || android.text.TextUtils.isEmpty(str);
                com.tencent.mars.xlog.Log.i("MicroMsg.TAVKitParallelSoftEncodeMuxer", "parallelMuxImp before start,videoFrameCount:" + j17 + " audioChannelCount " + integer + " mute:" + z17);
                int f18 = parallelMuxerJni.f((java.lang.String[]) arrayList2.toArray(new java.lang.String[0]), str, ((com.tencent.mm.plugin.vlog.parallel.d) kz5.n0.X(muxers)).f175826a, j17, (float) integer2, z17);
                hVar4.a(parallelMuxerJni, muxers);
                java.util.Iterator it9 = arrayList2.iterator();
                while (it9.hasNext()) {
                    java.lang.String str3 = (java.lang.String) it9.next();
                    if (com.tencent.mm.vfs.w6.j(str3)) {
                        com.tencent.mm.vfs.w6.h(str3);
                    }
                }
                if (com.tencent.mm.vfs.w6.j(str)) {
                    com.tencent.mm.vfs.w6.h(str);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.TAVKitParallelSoftEncodeMuxer", "stop ret:" + f18);
                return f18;
            }
        };
    }

    public final void a(com.tencent.mm.mediaplus.ParallelMuxerJni parallelMuxerJni, java.util.List list) {
        parallelMuxerJni.g();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.vlog.parallel.d dVar = (com.tencent.mm.plugin.vlog.parallel.d) it.next();
            dVar.release();
            dVar.clearResource();
        }
    }
}
