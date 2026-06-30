package com.tencent.mm.plugin.vlog.parallel;

/* loaded from: classes10.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.vlog.parallel.f f175830a = new com.tencent.mm.plugin.vlog.parallel.f();

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.plugin.vlog.parallel.TAVKitParallelHardwareMuxer$SightVideoJNIMediaMuxerFactory f175831b;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.tencent.mm.plugin.vlog.parallel.TAVKitParallelHardwareMuxer$SightVideoJNIMediaMuxerFactory] */
    static {
        mq1.w0.wi();
        fp.d0.n("mediaplus");
        f175831b = new com.tencent.tav.decoder.muxer.MediaMuxerFactory.MediaMuxerCreator() { // from class: com.tencent.mm.plugin.vlog.parallel.TAVKitParallelHardwareMuxer$SightVideoJNIMediaMuxerFactory
            @Override // com.tencent.tav.decoder.muxer.MediaMuxerFactory.MediaMuxerCreator
            public com.tencent.tav.decoder.muxer.IMediaMuxer createMediaMuxer(java.lang.String path, int format) {
                kotlin.jvm.internal.o.g(path, "path");
                return new com.tencent.mm.plugin.vlog.parallel.c(path, format);
            }

            @Override // com.tencent.tav.decoder.muxer.MediaMuxerFactory.MediaMuxerCreator
            public int parallelMux(java.util.List<? extends com.tencent.tav.decoder.muxer.IMediaMuxer> muxers) {
                java.lang.Object obj;
                java.lang.Object obj2;
                java.lang.Object obj3;
                java.lang.Object obj4;
                int i17;
                boolean z17;
                int i18;
                float f17;
                java.util.ArrayList arrayList;
                java.util.Iterator it;
                com.tencent.mm.plugin.vlog.parallel.b b17;
                if (muxers == null || !(kz5.n0.X(muxers) instanceof com.tencent.mm.plugin.vlog.parallel.c)) {
                    return -1;
                }
                com.tencent.mm.plugin.vlog.parallel.f fVar = com.tencent.mm.plugin.vlog.parallel.f.f175830a;
                com.tencent.mars.xlog.Log.i("MicroMsg.TAVKitParallelMuxer", "parallelMuxImp size:" + muxers.size());
                java.util.Iterator<T> it6 = muxers.iterator();
                while (true) {
                    obj = null;
                    if (!it6.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it6.next();
                    if (((com.tencent.mm.plugin.vlog.parallel.c) obj2).b() != null) {
                        break;
                    }
                }
                com.tencent.mm.plugin.vlog.parallel.c cVar = (com.tencent.mm.plugin.vlog.parallel.c) obj2;
                com.tencent.tav.core.ExportConfig exportConfig = cVar != null ? cVar.f175817c : null;
                java.util.Iterator<T> it7 = muxers.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it7.next();
                    com.tencent.mm.plugin.vlog.parallel.b a17 = ((com.tencent.mm.plugin.vlog.parallel.c) obj3).a();
                    if ((a17 != null ? a17.f175806c : null) != null) {
                        break;
                    }
                }
                com.tencent.mm.plugin.vlog.parallel.c cVar2 = (com.tencent.mm.plugin.vlog.parallel.c) obj3;
                com.tencent.mm.plugin.vlog.parallel.b a18 = cVar2 != null ? cVar2.a() : null;
                java.util.Iterator<T> it8 = muxers.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        obj4 = null;
                        break;
                    }
                    obj4 = it8.next();
                    com.tencent.mm.plugin.vlog.parallel.b b18 = ((com.tencent.mm.plugin.vlog.parallel.c) obj4).b();
                    if ((b18 != null ? b18.f175806c : null) != null) {
                        break;
                    }
                }
                com.tencent.mm.plugin.vlog.parallel.c cVar3 = (com.tencent.mm.plugin.vlog.parallel.c) obj4;
                com.tencent.mm.plugin.vlog.parallel.b b19 = cVar3 != null ? cVar3.b() : null;
                android.media.MediaFormat mediaFormat = a18 != null ? a18.f175806c : null;
                android.media.MediaFormat mediaFormat2 = b19 != null ? b19.f175806c : null;
                int a19 = fVar.a(mediaFormat, "sample-rate", 0);
                int a27 = fVar.a(mediaFormat, "channel-count", 0);
                int a28 = fVar.a(mediaFormat2, "frame-rate", 0);
                int a29 = fVar.a(mediaFormat2, com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE, 0);
                float a37 = fVar.a(mediaFormat2, "frame-rate", 0);
                float f18 = b19 != null ? (b19.f175807d * 1000.0f) / b19.f175808e : 30.0f;
                com.tencent.mars.xlog.Log.i("MicroMsg.TAVKitParallelMuxer", "audioSampleRate:" + a19 + " \naudioChannelCount:" + a27 + " \nmediaFormatFps:" + a28 + " \nvideoBitrate:" + a29 + "\nduration:$0\ncountFps:" + f18 + "\nconfigToSoftEncode:");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("exportConfig: \naudioSampleRate:");
                sb6.append(exportConfig != null ? java.lang.Integer.valueOf(exportConfig.getAudioSampleRateHz()) : null);
                sb6.append("\naudioChannelCount:");
                sb6.append(exportConfig != null ? java.lang.Integer.valueOf(exportConfig.getAudioChannelCount()) : null);
                sb6.append("\nvideoBitrate:");
                sb6.append(exportConfig != null ? java.lang.Integer.valueOf(exportConfig.getVideoBitRate()) : null);
                com.tencent.mars.xlog.Log.i("MicroMsg.TAVKitParallelMuxer", sb6.toString());
                if (a19 <= 0 && exportConfig != null) {
                    exportConfig.getAudioSampleRateHz();
                }
                if (a27 <= 0) {
                    a27 = exportConfig != null ? exportConfig.getAudioChannelCount() : 0;
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                kz5.n0.F0(muxers, new com.tencent.mm.plugin.vlog.parallel.e());
                if (a37 < 1.0f) {
                    a37 = f18;
                }
                java.util.Iterator<T> it9 = muxers.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it9.next();
                    if (((com.tencent.mm.plugin.vlog.parallel.c) next).b() != null) {
                        obj = next;
                        break;
                    }
                }
                com.tencent.mm.plugin.vlog.parallel.c cVar4 = (com.tencent.mm.plugin.vlog.parallel.c) obj;
                com.tencent.mm.sdk.platformtools.o4.L().G("device_make_b_frame", (cVar4 == null || (b17 = cVar4.b()) == null || b17.f175814k <= 30) ? false : true);
                com.tencent.mm.mediaplus.ParallelMuxerJni parallelMuxerJni = new com.tencent.mm.mediaplus.ParallelMuxerJni();
                parallelMuxerJni.e();
                java.util.Iterator it10 = muxers.iterator();
                java.lang.String str = "";
                long j17 = 0;
                while (it10.hasNext()) {
                    com.tencent.mm.plugin.vlog.parallel.c cVar5 = (com.tencent.mm.plugin.vlog.parallel.c) it10.next();
                    com.tencent.mm.plugin.vlog.parallel.b b27 = cVar5.b();
                    if (b27 != null) {
                        java.lang.String str2 = b27.f175809f;
                        long k17 = com.tencent.mm.vfs.w6.k(str2);
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("muxer[");
                        it = it10;
                        sb7.append(cVar5.f175821g);
                        sb7.append("] write video,path:");
                        sb7.append(str2);
                        sb7.append(" size:");
                        sb7.append(k17);
                        com.tencent.mars.xlog.Log.i("MicroMsg.TAVKitParallelMuxer", sb7.toString());
                        if (k17 <= 0) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.TAVKitParallelMuxer", "mux error,empty video file.index:" + cVar5.f175821g + " info:" + cVar5.f175822h);
                            i17 = 0;
                            i18 = 0;
                            break;
                        }
                        long[] T0 = kz5.n0.T0(b27.f175811h);
                        java.util.ArrayList arrayList3 = b27.f175810g;
                        long[] T02 = kz5.n0.T0(arrayList3);
                        parallelMuxerJni.c(T0, a37);
                        parallelMuxerJni.b(T02, a37);
                        arrayList2.add(str2);
                        f17 = a37;
                        arrayList = arrayList2;
                        long j18 = b27.f175807d + j17;
                        com.tencent.mars.xlog.Log.i("MicroMsg.TAVKitParallelMuxer", "muxer[" + cVar5.hashCode() + "] size:" + arrayList3.size() + " pts-size:" + T0.length + " dts-size:" + T02.length + " frame-size:" + b27.f175807d + " total:" + j18);
                        j17 = j18;
                    } else {
                        f17 = a37;
                        arrayList = arrayList2;
                        it = it10;
                    }
                    com.tencent.mm.plugin.vlog.parallel.b a38 = cVar5.a();
                    if (a38 != null) {
                        java.lang.String str3 = a38.f175809f;
                        long k18 = com.tencent.mm.vfs.w6.k(str3);
                        com.tencent.mars.xlog.Log.i("MicroMsg.TAVKitParallelMuxer", "muxer[" + cVar5.f175821g + "] write audio,path:" + str3 + " size:" + k18);
                        if (k18 <= 0) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.TAVKitParallelMuxer", "mux error,empty audio file.index:" + cVar5.f175821g + " info:" + cVar5.f175822h);
                            i17 = 0;
                            i18 = 0;
                            break;
                        }
                        parallelMuxerJni.a(kz5.n0.T0(a38.f175811h));
                        str = str3;
                    }
                    it10 = it;
                    arrayList2 = arrayList;
                    a37 = f17;
                }
                float f19 = a37;
                java.util.ArrayList arrayList4 = arrayList2;
                if (a27 <= 0 || android.text.TextUtils.isEmpty(str)) {
                    i17 = 0;
                    z17 = true;
                } else {
                    i17 = 0;
                    z17 = false;
                }
                int f27 = parallelMuxerJni.f((java.lang.String[]) arrayList4.toArray(new java.lang.String[i17]), str, ((com.tencent.mm.plugin.vlog.parallel.c) kz5.n0.X(muxers)).f175815a, j17, f19, z17);
                parallelMuxerJni.g();
                java.util.Iterator it11 = arrayList4.iterator();
                while (it11.hasNext()) {
                    java.lang.String str4 = (java.lang.String) it11.next();
                    if (com.tencent.mm.vfs.w6.j(str4)) {
                        com.tencent.mm.vfs.w6.h(str4);
                    }
                }
                if (com.tencent.mm.vfs.w6.j(str)) {
                    com.tencent.mm.vfs.w6.h(str);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.TAVKitParallelMuxer", "stop ret:" + f27);
                i18 = f27 == 0 ? 1 : i17;
                if (i18 != 0) {
                    return i17;
                }
                return -1;
            }
        };
    }

    public final int a(android.media.MediaFormat mediaFormat, java.lang.String str, int i17) {
        return (mediaFormat != null && mediaFormat.containsKey(str)) ? mediaFormat.getInteger(str) : i17;
    }
}
