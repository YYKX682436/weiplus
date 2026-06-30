package com.tencent.tav.decoder.muxer;

/* loaded from: classes10.dex */
public class MediaMuxerFactory {
    private static com.tencent.tav.decoder.muxer.MediaMuxerFactory.DefaultMediaMuxerCreator defaultMuxerCreator = new com.tencent.tav.decoder.muxer.MediaMuxerFactory.DefaultMediaMuxerCreator();
    private static com.tencent.tav.decoder.muxer.MediaMuxerFactory.MediaMuxerCreator muxerCreator = null;

    /* loaded from: classes10.dex */
    public static class DefaultMediaMuxerCreator implements com.tencent.tav.decoder.muxer.MediaMuxerFactory.MediaMuxerCreator {
        private DefaultMediaMuxerCreator() {
        }

        @Override // com.tencent.tav.decoder.muxer.MediaMuxerFactory.MediaMuxerCreator
        public com.tencent.tav.decoder.muxer.IMediaMuxer createMediaMuxer(java.lang.String str, int i17) {
            return new com.tencent.tav.decoder.muxer.DefaultMediaMuxer(str, i17);
        }

        @Override // com.tencent.tav.decoder.muxer.MediaMuxerFactory.MediaMuxerCreator
        public int parallelMux(java.util.List<com.tencent.tav.decoder.muxer.IMediaMuxer> list) {
            return 0;
        }
    }

    /* loaded from: classes10.dex */
    public interface MediaMuxerCreator {
        com.tencent.tav.decoder.muxer.IMediaMuxer createMediaMuxer(java.lang.String str, int i17);

        int parallelMux(java.util.List<com.tencent.tav.decoder.muxer.IMediaMuxer> list);
    }

    public static com.tencent.tav.decoder.muxer.IMediaMuxer createMediaMuxer(java.lang.String str, int i17) {
        com.tencent.tav.decoder.muxer.MediaMuxerFactory.MediaMuxerCreator mediaMuxerCreator = muxerCreator;
        return mediaMuxerCreator == null ? defaultMuxerCreator.createMediaMuxer(str, i17) : mediaMuxerCreator.createMediaMuxer(str, i17);
    }

    public static int parallelMux(java.util.List<com.tencent.tav.decoder.muxer.IMediaMuxer> list) {
        com.tencent.tav.decoder.muxer.MediaMuxerFactory.MediaMuxerCreator mediaMuxerCreator = muxerCreator;
        return mediaMuxerCreator == null ? defaultMuxerCreator.parallelMux(list) : mediaMuxerCreator.parallelMux(list);
    }

    public static void setMuxerCreator(com.tencent.tav.decoder.muxer.MediaMuxerFactory.MediaMuxerCreator mediaMuxerCreator) {
        muxerCreator = mediaMuxerCreator;
    }
}
