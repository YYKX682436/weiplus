package com.tencent.tavkit.utils;

/* loaded from: classes16.dex */
public class CompositionUtils {
    private static final java.lang.String TAG = "CompositionUtils";

    /* loaded from: classes16.dex */
    public interface TransitionTimeCalculator {
        com.tencent.tav.coremedia.CMTime transition(int i17);
    }

    private static void checkScaleTimeRange(com.tencent.tav.asset.MutableCompositionTrack mutableCompositionTrack, com.tencent.tav.coremedia.CMTimeRange cMTimeRange, com.tencent.tav.coremedia.CMTimeRange cMTimeRange2) {
        if (com.tencent.tav.coremedia.CMTime.CMTimeInvalid.equalsTo(cMTimeRange.getDuration()) || cMTimeRange2.getDuration().equalsTo(cMTimeRange.getDuration())) {
            return;
        }
        mutableCompositionTrack.scaleTimeRange(new com.tencent.tav.coremedia.CMTimeRange(cMTimeRange.getStart(), cMTimeRange2.getDuration()), cMTimeRange.getDuration());
    }

    public static com.tencent.tavkit.composition.resource.TAVEmptyResource createEmptyResource(com.tencent.tav.coremedia.CMTime cMTime) {
        com.tencent.tavkit.composition.resource.TAVEmptyResource tAVEmptyResource = new com.tencent.tavkit.composition.resource.TAVEmptyResource(cMTime);
        tAVEmptyResource.setDuration(cMTime);
        tAVEmptyResource.setScaledDuration(cMTime);
        return tAVEmptyResource;
    }

    public static void insertTimeRangeToTrack(com.tencent.tavkit.composition.resource.TrackInfo trackInfo, com.tencent.tav.asset.MutableCompositionTrack mutableCompositionTrack, com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
        try {
            com.tencent.tav.coremedia.CMTimeRange selectedTimeRange = trackInfo.getSelectedTimeRange();
            if (trackInfo.getTrack() != null) {
                mutableCompositionTrack.insertTimeRange(selectedTimeRange, trackInfo.getTrack(), cMTimeRange.getStart());
                checkScaleTimeRange(mutableCompositionTrack, cMTimeRange, selectedTimeRange);
            } else if (trackInfo.getCompositionTrackSegment(cMTimeRange) != null) {
                mutableCompositionTrack.insertCompositionTrackSegment(trackInfo.getCompositionTrackSegment(cMTimeRange));
            } else {
                com.tencent.tav.decoder.logger.Logger.e(TAG, "insertTimeRangeToTrack: TrackInfo track and segment are null !!!");
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public static com.tencent.tav.asset.MutableCompositionTrack mutableTrackCompatibleWithTimeRange(com.tencent.tav.asset.MutableComposition mutableComposition, com.tencent.tav.coremedia.CMTimeRange cMTimeRange, int i17) {
        for (com.tencent.tav.asset.MutableCompositionTrack mutableCompositionTrack : mutableComposition.tracksWithMediaType(i17)) {
            com.tencent.tav.coremedia.CMTimeRange intersection = com.tencent.tavkit.utils.TAVTimeUtil.getIntersection(mutableCompositionTrack.getTimeRange(), cMTimeRange);
            if (intersection == null || intersection.getDuration().getTimeSeconds() <= 0.0f) {
                return mutableCompositionTrack;
            }
        }
        return null;
    }

    public static void reloadAudioStartTimeWithTransitionableAudio(final java.util.List<? extends com.tencent.tavkit.composition.model.TAVTransitionableAudio> list) {
        reloadStartTimeWithTransitionable(list, new com.tencent.tavkit.utils.CompositionUtils.TransitionTimeCalculator() { // from class: com.tencent.tavkit.utils.CompositionUtils.2
            @Override // com.tencent.tavkit.utils.CompositionUtils.TransitionTimeCalculator
            public com.tencent.tav.coremedia.CMTime transition(int i17) {
                com.tencent.tavkit.composition.audio.TAVAudioTransition audioTransition = ((com.tencent.tavkit.composition.model.TAVTransitionableAudio) list.get(i17)).getAudioTransition();
                return audioTransition != null ? audioTransition.getDuration() : com.tencent.tav.coremedia.CMTime.CMTimeZero;
            }
        });
    }

    private static void reloadStartTimeWithTransitionable(java.util.List<? extends com.tencent.tavkit.composition.model.TAVCompositionTimeRange> list, com.tencent.tavkit.utils.CompositionUtils.TransitionTimeCalculator transitionTimeCalculator) {
        com.tencent.tav.coremedia.CMTime cMTime = com.tencent.tav.coremedia.CMTime.CMTimeZero;
        int i17 = 0;
        com.tencent.tav.coremedia.CMTime cMTime2 = cMTime;
        while (i17 < list.size()) {
            com.tencent.tavkit.composition.model.TAVCompositionTimeRange tAVCompositionTimeRange = list.get(i17);
            com.tencent.tav.coremedia.CMTime cMTime3 = com.tencent.tav.coremedia.CMTime.CMTimeZero;
            com.tencent.tav.coremedia.CMTime transition = transitionTimeCalculator != null ? transitionTimeCalculator.transition(i17) : cMTime3;
            com.tencent.tav.coremedia.CMTime duration = tAVCompositionTimeRange.getTimeRange().getDuration();
            if (!duration.smallThan(transition) && i17 < list.size() - 1 && !list.get(i17 + 1).getTimeRange().getDuration().smallThan(transition)) {
                cMTime3 = transition;
            }
            com.tencent.tav.coremedia.CMTime sub = cMTime.sub(cMTime2);
            tAVCompositionTimeRange.setStartTime(sub);
            cMTime = sub.add(duration);
            i17++;
            cMTime2 = cMTime3;
        }
    }

    public static void reloadVideoStartTimeWithTransitionableVideo(final java.util.List<? extends com.tencent.tavkit.composition.model.TAVTransitionableVideo> list) {
        reloadStartTimeWithTransitionable(list, new com.tencent.tavkit.utils.CompositionUtils.TransitionTimeCalculator() { // from class: com.tencent.tavkit.utils.CompositionUtils.1
            @Override // com.tencent.tavkit.utils.CompositionUtils.TransitionTimeCalculator
            public com.tencent.tav.coremedia.CMTime transition(int i17) {
                com.tencent.tavkit.composition.video.TAVVideoTransition videoTransition = ((com.tencent.tavkit.composition.model.TAVTransitionableVideo) list.get(i17)).getVideoTransition();
                return videoTransition != null ? videoTransition.getDuration() : com.tencent.tav.coremedia.CMTime.CMTimeZero;
            }
        });
    }
}
