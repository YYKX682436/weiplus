package com.tencent.mm.plugin.vlog.model;

/* loaded from: classes10.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.vlog.model.d1 f175577a = new com.tencent.mm.plugin.vlog.model.d1();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f175578b = jz5.h.b(com.tencent.mm.plugin.vlog.model.c1.f175574d);

    public final void a() {
        com.tencent.tav.decoder.muxer.MediaMuxerFactory.setMuxerCreator(new com.tencent.tav.decoder.muxer.MediaMuxerFactory.MediaMuxerCreator() { // from class: com.tencent.mm.plugin.vlog.model.TAVKitMuxer$SightVideoJNIMediaMuxerFactory
            @Override // com.tencent.tav.decoder.muxer.MediaMuxerFactory.MediaMuxerCreator
            public com.tencent.tav.decoder.muxer.IMediaMuxer createMediaMuxer(java.lang.String path, int format) {
                kotlin.jvm.internal.o.g(path, "path");
                return new com.tencent.mm.plugin.vlog.model.TAVKitMuxer$SightVideoJNIMediaMuxer(path, format);
            }

            @Override // com.tencent.tav.decoder.muxer.MediaMuxerFactory.MediaMuxerCreator
            public int parallelMux(java.util.List<com.tencent.tav.decoder.muxer.IMediaMuxer> muxers) {
                return 0;
            }
        });
    }
}
