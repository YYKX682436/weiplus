package com.tencent.tav.core;

/* loaded from: classes16.dex */
public class AudioMixInputParameters {
    protected com.tencent.tav.core.AudioTapProcessor audioTapProcessor;
    protected java.lang.String audioTimePitchAlgorithm;
    protected int trackID;
    protected java.util.ArrayList<com.tencent.tav.core.AudioMixInputParameters.VolumeRange> volumeRanges = new java.util.ArrayList<>();

    /* loaded from: classes16.dex */
    public static class VolumeRange {
        public float endVolume;
        public float startVolume;
        public com.tencent.tav.coremedia.CMTimeRange timeRange;
    }

    public AudioMixInputParameters(int i17, java.lang.String str) {
        this.trackID = i17;
        this.audioTimePitchAlgorithm = str;
    }

    public boolean containsTime(com.tencent.tav.coremedia.CMTime cMTime) {
        java.util.Iterator<com.tencent.tav.core.AudioMixInputParameters.VolumeRange> it = this.volumeRanges.iterator();
        while (it.hasNext()) {
            if (it.next().timeRange.containsTime(cMTime)) {
                return true;
            }
        }
        return false;
    }

    public com.tencent.tav.core.AudioTapProcessor getAudioTapProcessor() {
        return this.audioTapProcessor;
    }

    public java.lang.String getAudioTimePitchAlgorithm() {
        return this.audioTimePitchAlgorithm;
    }

    public int getTrackID() {
        return this.trackID;
    }

    public float getVolumeAtTime(com.tencent.tav.coremedia.CMTime cMTime) {
        com.tencent.tav.core.AudioMixInputParameters.VolumeRange volumeRange;
        long timeUs = cMTime.getTimeUs();
        java.util.Iterator<com.tencent.tav.core.AudioMixInputParameters.VolumeRange> it = this.volumeRanges.iterator();
        while (true) {
            if (!it.hasNext()) {
                volumeRange = null;
                break;
            }
            volumeRange = it.next();
            if (timeUs >= volumeRange.timeRange.getStart().getTimeUs() && timeUs < volumeRange.timeRange.getEnd().getTimeUs()) {
                break;
            }
        }
        if (volumeRange == null) {
            return 1.0f;
        }
        long timeUs2 = timeUs - volumeRange.timeRange.getStart().getTimeUs();
        float f17 = volumeRange.startVolume;
        return f17 + ((volumeRange.endVolume - f17) * ((((float) timeUs2) * 1.0f) / ((float) volumeRange.timeRange.getDuration().getTimeUs())));
    }

    public com.tencent.tav.core.AudioMixInputParameters.VolumeRange getVolumeRampAtTimeRange(com.tencent.tav.coremedia.CMTime cMTime) {
        java.util.Iterator<com.tencent.tav.core.AudioMixInputParameters.VolumeRange> it = this.volumeRanges.iterator();
        while (it.hasNext()) {
            com.tencent.tav.core.AudioMixInputParameters.VolumeRange next = it.next();
            if (next.timeRange.containsTime(cMTime)) {
                return next;
            }
        }
        return null;
    }

    public java.lang.String toString() {
        return "AudioMixInputParameters{trackID=" + this.trackID + ", audioTimePitchAlgorithm='" + this.audioTimePitchAlgorithm + "', audioTapProcessor=" + this.audioTapProcessor + ", volumeRanges=" + this.volumeRanges + '}';
    }
}
