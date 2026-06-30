package com.tencent.tav.player;

/* loaded from: classes16.dex */
public class PlayerItem {
    private com.tencent.tav.asset.Asset asset;
    private com.tencent.tav.core.AssetExtension assetExtension;
    private com.tencent.tav.core.AudioCompositionDecoderTrack audioCompositionDecoderTrack;
    private com.tencent.tav.core.AudioMix audioMix;
    java.lang.String audioTimePitchAlgorithm;
    com.tencent.tav.core.compositing.VideoCompositing customVideoCompositor;
    com.tencent.tav.codec.IDecoderFactory decoderFactory;
    private java.util.List<com.tencent.tav.decoder.IDecoderTrack> decoderTrackList;
    private com.tencent.tav.coremedia.CMTime duration;
    private boolean enableLut;
    private com.tencent.tav.player.ErrorMsg errorMsg;
    private com.tencent.tav.coremedia.CMTime forwardPlaybackEndTime;
    private com.tencent.tav.player.PlayerLayer layer;
    private android.graphics.Bitmap lutBitmap;
    private int maxCacheSize;
    java.util.List<com.tencent.tav.player.PlayerItemOutput> outputs;
    private com.tencent.tav.player.Player player;
    private com.tencent.tav.player.PlayerThreadAudio playerThreadAudio;
    private com.tencent.tav.player.PlayerThread playerThreadMain;
    private com.tencent.tav.coremedia.CGSize presentationSize;
    private float rate;
    private com.tencent.tav.decoder.IDecoderTrack realVDecoderTrack;
    private com.tencent.tav.coremedia.CMTime reversePlaybackEndTime;
    private java.util.List<com.tencent.tav.coremedia.CMTimeRange> seekableTimeRanges;
    private boolean seekingWaitsForVideoCompositionRendering;
    private com.tencent.tav.player.PlayerItem.PlayerItemStatus status;
    private java.util.List<com.tencent.tav.asset.MetadataItem> timedMetadata;
    private java.util.List<com.tencent.tav.player.PlayerItemTrack> tracks;
    private com.tencent.tav.decoder.IDecoderTrack vDecoderTrack;
    int videoApertureMode;
    private com.tencent.tav.core.composition.VideoComposition videoComposition;

    /* loaded from: classes6.dex */
    public enum PlayerItemStatus {
        PlayerItemStatusUnknown,
        PlayerItemStatusReadyToPlay,
        PlayerItemStatusFailed
    }

    public PlayerItem(java.lang.String str) {
        this(new com.tencent.tav.asset.URLAsset(str), null);
    }

    private float getVideoFrameRate() {
        return this.videoComposition != null ? (r0.getFrameDuration().timeScale * 1.0f) / ((float) this.videoComposition.getFrameDuration().getValue()) : com.tencent.tav.player.PlayerDefaultConfigs.DEFAULT_FRAME_DURATION.timeScale;
    }

    private void initVideoCompositionDecoderTrack() {
        com.tencent.tav.core.VideoCompositionDecoderTrack videoCompositionDecoderTrack = new com.tencent.tav.core.VideoCompositionDecoderTrack(this.assetExtension, 1, this.decoderFactory, false);
        int i17 = 24;
        for (com.tencent.tav.player.PlayerItemTrack playerItemTrack : this.tracks) {
            if (playerItemTrack != null && playerItemTrack.isEnabled() && playerItemTrack.getAssetTrack().getMediaType() == 1) {
                videoCompositionDecoderTrack.addTrack(playerItemTrack.getAssetTrack());
                i17 = (int) java.lang.Math.min(playerItemTrack.getCurrentVideoFrameRate(), i17);
            }
        }
        com.tencent.tav.core.composition.VideoComposition videoComposition = this.videoComposition;
        if (videoComposition != null && videoComposition.getFrameDuration() != null) {
            i17 = (int) (this.videoComposition.getFrameDuration().timeScale / this.videoComposition.getFrameDuration().value);
        }
        if (i17 <= 0) {
            i17 = 30;
        }
        videoCompositionDecoderTrack.setVideoComposition(this.videoComposition);
        com.tencent.tav.core.compositing.VideoCompositing videoCompositing = this.customVideoCompositor;
        if (videoCompositing != null) {
            videoCompositionDecoderTrack.setVideoCompositing(videoCompositing);
        }
        videoCompositionDecoderTrack.setFrameRate(i17);
        videoCompositionDecoderTrack.setFrameDuration(new com.tencent.tav.coremedia.CMTime(1L, i17));
        this.realVDecoderTrack = videoCompositionDecoderTrack;
    }

    public void addOutput(com.tencent.tav.player.PlayerItemOutput playerItemOutput) {
        this.outputs.add(playerItemOutput);
    }

    public void bindLayer(com.tencent.tav.player.PlayerLayer playerLayer) {
        com.tencent.tav.decoder.IDecoderTrack iDecoderTrack;
        this.layer = playerLayer;
        if (this.playerThreadMain == null) {
            return;
        }
        float f17 = this.rate;
        if (f17 < 0.0f) {
            com.tencent.tav.decoder.decodecache.CachedVideoDecoderTrack cachedVideoDecoderTrack = new com.tencent.tav.decoder.decodecache.CachedVideoDecoderTrack(this.realVDecoderTrack, f17 < 0.0f);
            this.vDecoderTrack = cachedVideoDecoderTrack;
            cachedVideoDecoderTrack.setMaxFrameCacheSize(this.maxCacheSize);
            iDecoderTrack = this.vDecoderTrack;
        } else {
            iDecoderTrack = this.realVDecoderTrack;
        }
        this.playerThreadMain.bindSurface(iDecoderTrack, playerLayer);
    }

    public void cancelPendingSeeks() {
        com.tencent.tav.player.PlayerThread playerThread = this.playerThreadMain;
        if (playerThread != null) {
            playerThread.cancelAllPendingSeeks();
        }
    }

    public com.tencent.tav.coremedia.CMTime currentTime() {
        return null;
    }

    public com.tencent.tav.asset.Asset getAsset() {
        return this.asset;
    }

    public com.tencent.tav.core.AssetExtension getAssetExtension() {
        return this.assetExtension;
    }

    public com.tencent.tav.core.AudioCompositionDecoderTrack getAudioCompositionDecoderTrack() {
        return this.audioCompositionDecoderTrack;
    }

    public com.tencent.tav.core.AudioMix getAudioMix() {
        return this.audioMix;
    }

    public java.lang.String getAudioTimePitchAlgorithm() {
        return this.audioTimePitchAlgorithm;
    }

    public com.tencent.tav.core.compositing.VideoCompositing getCustomVideoCompositor() {
        return this.customVideoCompositor;
    }

    public com.tencent.tav.codec.IDecoderFactory getDecoderFactory() {
        return this.decoderFactory;
    }

    public com.tencent.tav.coremedia.CMTime getDuration() {
        return this.duration;
    }

    public com.tencent.tav.player.ErrorMsg getErrorMsg() {
        return this.errorMsg;
    }

    public com.tencent.tav.coremedia.CMTime getForwardPlaybackEndTime() {
        return this.forwardPlaybackEndTime;
    }

    public long getLaggingTime() {
        com.tencent.tav.decoder.IDecoderTrack iDecoderTrack = this.realVDecoderTrack;
        if (iDecoderTrack != null) {
            return iDecoderTrack.getLaggingTime();
        }
        return 0L;
    }

    public java.util.List<com.tencent.tav.player.PlayerItemOutput> getOutputs() {
        return this.outputs;
    }

    public com.tencent.tav.player.PlayerThreadAudio getPlayerThreadAudio() {
        return this.playerThreadAudio;
    }

    public com.tencent.tav.player.PlayerThread getPlayerThreadMain() {
        return this.playerThreadMain;
    }

    public com.tencent.tav.coremedia.CGSize getPresentationSize() {
        return this.presentationSize == null ? this.asset.getNaturalSize() : new com.tencent.tav.coremedia.CGSize(16.0f, 16.0f);
    }

    public com.tencent.tav.decoder.IDecoderTrack getRealDecoderTrack() {
        return this.realVDecoderTrack;
    }

    public com.tencent.tav.coremedia.CMTime getReversePlaybackEndTime() {
        return this.reversePlaybackEndTime;
    }

    public java.util.List<com.tencent.tav.coremedia.CMTimeRange> getSeekableTimeRanges() {
        return this.seekableTimeRanges;
    }

    public com.tencent.tav.player.PlayerItem.PlayerItemStatus getStatus() {
        return this.status;
    }

    public java.util.List<com.tencent.tav.asset.MetadataItem> getTimedMetadata() {
        return this.timedMetadata;
    }

    public java.util.List<com.tencent.tav.player.PlayerItemTrack> getTracks() {
        return this.tracks;
    }

    public int getVideoApertureMode() {
        return this.videoApertureMode;
    }

    public com.tencent.tav.core.composition.VideoComposition getVideoComposition() {
        return this.videoComposition;
    }

    public com.tencent.tav.core.AudioCompositionDecoderTrack initAudioCompositionDecoderTrack() {
        this.audioCompositionDecoderTrack = new com.tencent.tav.core.AudioCompositionDecoderTrack(2, this.decoderFactory);
        for (com.tencent.tav.player.PlayerItemTrack playerItemTrack : this.tracks) {
            if (playerItemTrack != null && playerItemTrack.isEnabled() && playerItemTrack.getAssetTrack().getMediaType() == 2) {
                this.audioCompositionDecoderTrack.addTrack(playerItemTrack.getAssetTrack());
            }
        }
        this.audioCompositionDecoderTrack.setAudioMix(this.audioMix);
        return this.audioCompositionDecoderTrack;
    }

    public boolean isSeekingWaitsForVideoCompositionRendering() {
        return this.seekingWaitsForVideoCompositionRendering;
    }

    public void release() {
        com.tencent.tav.player.PlayerLayer playerLayer = this.layer;
        if (playerLayer != null) {
            playerLayer.release();
        }
        com.tencent.tav.core.AudioMix audioMix = this.audioMix;
        if (audioMix != null) {
            audioMix.release();
        }
    }

    public void removeOutput(com.tencent.tav.player.PlayerItemOutput playerItemOutput) {
        this.outputs.remove(playerItemOutput);
    }

    public void seekToTime(com.tencent.tav.coremedia.CMTime cMTime, com.tencent.tav.player.Callback callback) {
        com.tencent.tav.coremedia.CMTime cMTime2 = com.tencent.tav.coremedia.CMTime.CMTimeZero;
        seekToTime(cMTime, cMTime2, cMTime2, callback);
    }

    public void setAudioMix(com.tencent.tav.core.AudioMix audioMix) {
        this.audioMix = audioMix;
        com.tencent.tav.core.AudioCompositionDecoderTrack audioCompositionDecoderTrack = this.audioCompositionDecoderTrack;
        if (audioCompositionDecoderTrack != null) {
            audioCompositionDecoderTrack.setAudioMix(audioMix);
        }
    }

    public void setAudioTimePitchAlgorithm(java.lang.String str) {
        this.audioTimePitchAlgorithm = str;
    }

    public void setCustomVideoCompositor(com.tencent.tav.core.compositing.VideoCompositing videoCompositing) {
        this.customVideoCompositor = videoCompositing;
    }

    public void setDecoderFactory(com.tencent.tav.codec.IDecoderFactory iDecoderFactory) {
        this.decoderFactory = iDecoderFactory;
    }

    public void setEnableLut(boolean z17, android.graphics.Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            this.enableLut = false;
            return;
        }
        this.enableLut = z17;
        this.lutBitmap = bitmap;
        com.tencent.tav.player.PlayerThread playerThread = this.playerThreadMain;
        if (playerThread != null) {
            playerThread.setEnableLut(z17, bitmap);
        }
    }

    public void setForwardPlaybackEndTime(com.tencent.tav.coremedia.CMTime cMTime) {
        this.forwardPlaybackEndTime = cMTime;
    }

    public void setOutputs(java.util.List<com.tencent.tav.player.PlayerItemOutput> list) {
        this.outputs = list;
    }

    public void setRate(float f17, int i17) {
        this.rate = f17;
        this.maxCacheSize = i17;
        com.tencent.tav.player.PlayerThread playerThread = this.playerThreadMain;
        if (playerThread != null) {
            playerThread.setRate(f17);
        }
    }

    public void setReversePlaybackEndTime(com.tencent.tav.coremedia.CMTime cMTime) {
        this.reversePlaybackEndTime = cMTime;
    }

    public void setSeekableTimeRanges(java.util.List<com.tencent.tav.coremedia.CMTimeRange> list) {
        this.seekableTimeRanges = list;
    }

    public void setSeekingWaitsForVideoCompositionRendering(boolean z17) {
        this.seekingWaitsForVideoCompositionRendering = z17;
    }

    public void setVideoApertureMode(int i17) {
        this.videoApertureMode = i17;
    }

    public void setVideoComposition(com.tencent.tav.core.composition.VideoComposition videoComposition) {
        this.videoComposition = videoComposition;
        if (videoComposition != null) {
            this.customVideoCompositor = videoComposition.getCustomVideoCompositor();
        }
    }

    public void start(com.tencent.tav.player.Player player) {
        initVideoCompositionDecoderTrack();
        initAudioCompositionDecoderTrack();
        com.tencent.tav.decoder.IDecoderTrack iDecoderTrack = this.layer == null ? null : this.vDecoderTrack;
        com.tencent.tav.core.AudioCompositionDecoderTrack audioCompositionDecoderTrack = this.audioCompositionDecoderTrack;
        com.tencent.tav.coremedia.CGSize presentationSize = getPresentationSize();
        com.tencent.tav.player.PlayerLayer playerLayer = this.layer;
        com.tencent.tav.player.PlayerThread playerThread = new com.tencent.tav.player.PlayerThread(iDecoderTrack, audioCompositionDecoderTrack, presentationSize, playerLayer == null ? null : playerLayer.getSurface(), player.mMainHandler, player);
        this.playerThreadMain = playerThread;
        playerThread.setEnableLut(this.enableLut, this.lutBitmap);
        this.playerThreadMain.setRate(this.rate);
        com.tencent.tav.core.composition.VideoComposition videoComposition = this.videoComposition;
        if (videoComposition != null) {
            this.playerThreadMain.setFrameDuration(videoComposition.getFrameDuration());
        }
    }

    public void updateComposition(com.tencent.tav.asset.Asset asset) {
        this.asset = asset;
        this.tracks.clear();
        for (com.tencent.tav.asset.AssetTrack assetTrack : asset.getTracks()) {
            com.tencent.tav.player.PlayerItemTrack playerItemTrack = new com.tencent.tav.player.PlayerItemTrack();
            playerItemTrack.setAssetTrack(assetTrack);
            playerItemTrack.setCurrentVideoFrameRate(getVideoFrameRate());
            playerItemTrack.setEnabled(true);
            this.tracks.add(playerItemTrack);
        }
    }

    public void updateDecoderTrack() {
        initVideoCompositionDecoderTrack();
        initAudioCompositionDecoderTrack();
    }

    public PlayerItem(com.tencent.tav.asset.Asset asset) {
        this(asset, new com.tencent.tav.core.AssetExtension(com.tencent.tav.core.AssetExtension.SCENE_PLAY));
    }

    public void seekToTime(com.tencent.tav.coremedia.CMTime cMTime, com.tencent.tav.coremedia.CMTime cMTime2, com.tencent.tav.coremedia.CMTime cMTime3, com.tencent.tav.player.Callback callback) {
        com.tencent.tav.player.PlayerThread playerThread = this.playerThreadMain;
        if (playerThread != null) {
            playerThread.updatePositionRightAway(cMTime);
            this.playerThreadMain.sendMessage(5, cMTime, com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM);
        }
    }

    public PlayerItem(com.tencent.tav.asset.Asset asset, com.tencent.tav.core.AssetExtension assetExtension) {
        this.status = com.tencent.tav.player.PlayerItem.PlayerItemStatus.PlayerItemStatusUnknown;
        this.tracks = new java.util.ArrayList();
        this.rate = 1.0f;
        this.layer = null;
        this.maxCacheSize = 60;
        this.asset = asset;
        this.assetExtension = assetExtension;
        for (com.tencent.tav.asset.AssetTrack assetTrack : asset.getTracks()) {
            com.tencent.tav.player.PlayerItemTrack playerItemTrack = new com.tencent.tav.player.PlayerItemTrack();
            playerItemTrack.setAssetTrack(assetTrack);
            playerItemTrack.setCurrentVideoFrameRate(getVideoFrameRate());
            playerItemTrack.setEnabled(true);
            this.tracks.add(playerItemTrack);
        }
    }
}
