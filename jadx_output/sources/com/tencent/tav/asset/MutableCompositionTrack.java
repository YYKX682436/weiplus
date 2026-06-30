package com.tencent.tav.asset;

/* loaded from: classes16.dex */
public class MutableCompositionTrack extends com.tencent.tav.asset.CompositionTrack {
    private java.lang.String extendedLanguageTag;
    private java.lang.String languageCode;

    public MutableCompositionTrack(int i17, int i18) {
        this.mediaType = i17;
        this.trackID = i18;
    }

    private int findSegmentIndexAt(com.tencent.tav.coremedia.CMTime cMTime, boolean z17) {
        boolean z18;
        com.tencent.tav.coremedia.CMTime cMTime2 = com.tencent.tav.coremedia.CMTime.CMTimeZero;
        java.util.Iterator<com.tencent.tav.asset.CompositionTrackSegment> it = ((com.tencent.tav.asset.CompositionTrack) this).segments.iterator();
        boolean z19 = false;
        int i17 = 0;
        while (true) {
            z18 = true;
            if (!it.hasNext()) {
                break;
            }
            com.tencent.tav.asset.CompositionTrackSegment next = it.next();
            if (next.timeRange.containsTime(cMTime)) {
                z19 = true;
                break;
            }
            cMTime2 = next.timeRange.getEnd();
            i17++;
        }
        if (z19 || !cMTime.equalsTo(cMTime2) || i17 <= 0 || !z17) {
            z18 = z19;
        } else {
            i17--;
        }
        if (z18) {
            return i17;
        }
        return -1;
    }

    private com.tencent.tav.coremedia.CMTime getSegmentStartCMTime(int i17) {
        com.tencent.tav.coremedia.CMTime cMTime = com.tencent.tav.coremedia.CMTime.CMTimeZero;
        for (int i18 = 0; i18 < i17 && i18 < ((com.tencent.tav.asset.CompositionTrack) this).segments.size(); i18++) {
            cMTime = cMTime.add(((com.tencent.tav.asset.CompositionTrack) this).segments.get(i18).getScaleDuration());
        }
        return cMTime;
    }

    private long getSegmentStartTime(int i17) {
        com.tencent.tav.coremedia.CMTime cMTime = com.tencent.tav.coremedia.CMTime.CMTimeZero;
        for (int i18 = 0; i18 < i17 && i18 < ((com.tencent.tav.asset.CompositionTrack) this).segments.size(); i18++) {
            cMTime = cMTime.add(((com.tencent.tav.asset.CompositionTrack) this).segments.get(i18).getScaleDuration());
        }
        return cMTime.getTimeUs();
    }

    private void insertSegment(com.tencent.tav.asset.CompositionTrackSegment compositionTrackSegment, int i17) {
        if (i17 >= 0) {
            ((com.tencent.tav.asset.CompositionTrack) this).segments.add(i17, compositionTrackSegment);
        } else {
            ((com.tencent.tav.asset.CompositionTrack) this).segments.add(compositionTrackSegment);
        }
        updateTimeRange();
    }

    private com.tencent.tav.asset.CompositionTrackSegment[] split(com.tencent.tav.asset.CompositionTrackSegment compositionTrackSegment, com.tencent.tav.coremedia.CMTime cMTime) {
        if (compositionTrackSegment == null || compositionTrackSegment.timeRange.getDuration().smallThan(cMTime)) {
            return null;
        }
        float timeUs = (((float) cMTime.getTimeUs()) * 1.0f) / ((float) compositionTrackSegment.timeRange.getDurationUs());
        com.tencent.tav.coremedia.CMTimeRange[] split = compositionTrackSegment.getTimeMapping().getTarget().split(timeUs);
        com.tencent.tav.coremedia.CMTimeRange[] split2 = compositionTrackSegment.getTimeMapping().getSource().split(timeUs);
        if (split == null || split2 == null) {
            return null;
        }
        com.tencent.tav.asset.CompositionTrackSegment compositionTrackSegment2 = new com.tencent.tav.asset.CompositionTrackSegment(compositionTrackSegment.getSourcePath(), compositionTrackSegment.getSourceTrackID(), split2[0], split[0], compositionTrackSegment.getSourceType());
        com.tencent.tav.asset.CompositionTrackSegment compositionTrackSegment3 = new com.tencent.tav.asset.CompositionTrackSegment(compositionTrackSegment.getSourcePath(), compositionTrackSegment.getSourceTrackID(), split2[1], split[1], compositionTrackSegment.getSourceType());
        compositionTrackSegment2.scaleDuration = cMTime;
        compositionTrackSegment3.scaleDuration = compositionTrackSegment.scaleDuration.sub(cMTime);
        return new com.tencent.tav.asset.CompositionTrackSegment[]{compositionTrackSegment2, compositionTrackSegment3};
    }

    private void updateSegmentStartTimeAfterInserted(com.tencent.tav.coremedia.CMTime cMTime, com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
        int findSegmentIndexAt = findSegmentIndexAt(cMTime, false);
        if (findSegmentIndexAt < 0 || findSegmentIndexAt >= ((com.tencent.tav.asset.CompositionTrack) this).segments.size()) {
            return;
        }
        while (true) {
            findSegmentIndexAt++;
            if (findSegmentIndexAt >= ((com.tencent.tav.asset.CompositionTrack) this).segments.size()) {
                return;
            }
            com.tencent.tav.asset.CompositionTrackSegment compositionTrackSegment = ((com.tencent.tav.asset.CompositionTrack) this).segments.get(findSegmentIndexAt);
            com.tencent.tav.coremedia.CMTimeRange target = compositionTrackSegment.getTimeMapping().getTarget();
            compositionTrackSegment.updateTargetTimeRange(new com.tencent.tav.coremedia.CMTimeRange(target.getStart().add(cMTimeRange.getDuration()), target.getDuration().m413clone()));
        }
    }

    private void updateSegmentsStartTimeAfterRemoved(com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
        int findSegmentIndexAt = findSegmentIndexAt(cMTimeRange.getStart(), false);
        if (findSegmentIndexAt < 0 || findSegmentIndexAt >= ((com.tencent.tav.asset.CompositionTrack) this).segments.size()) {
            return;
        }
        while (findSegmentIndexAt < ((com.tencent.tav.asset.CompositionTrack) this).segments.size()) {
            com.tencent.tav.asset.CompositionTrackSegment compositionTrackSegment = ((com.tencent.tav.asset.CompositionTrack) this).segments.get(findSegmentIndexAt);
            com.tencent.tav.coremedia.CMTimeRange target = compositionTrackSegment.getTimeMapping().getTarget();
            com.tencent.tav.coremedia.CMTime start = target.getStart();
            com.tencent.tav.coremedia.CMTime duration = cMTimeRange.getDuration();
            com.tencent.tav.coremedia.CMTime cMTime = com.tencent.tav.coremedia.CMTime.CMTimeOne;
            compositionTrackSegment.updateTargetTimeRange(new com.tencent.tav.coremedia.CMTimeRange(start.sub(duration.add(cMTime).add(cMTime)), target.getDuration().m413clone()));
            findSegmentIndexAt++;
        }
    }

    private void updateTimeRange() {
        java.util.List<com.tencent.tav.asset.CompositionTrackSegment> list = ((com.tencent.tav.asset.CompositionTrack) this).segments;
        if (list != null && list.size() > 0) {
            this.timeRange = new com.tencent.tav.coremedia.CMTimeRange(((com.tencent.tav.asset.CompositionTrack) this).segments.get(0).timeRange.getStart(), getDuration());
        } else {
            com.tencent.tav.coremedia.CMTime cMTime = com.tencent.tav.coremedia.CMTime.CMTimeZero;
            this.timeRange = new com.tencent.tav.coremedia.CMTimeRange(cMTime, cMTime);
        }
    }

    public void clipRangeAndRemoveOutRange(com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
        java.util.List<com.tencent.tav.asset.CompositionTrackSegment> list;
        if (cMTimeRange == null || cMTimeRange.getDuration().getTimeUs() <= 0 || (list = ((com.tencent.tav.asset.CompositionTrack) this).segments) == null || list.size() == 0) {
            return;
        }
        com.tencent.tav.coremedia.CMTime start = cMTimeRange.getStart();
        com.tencent.tav.coremedia.CMTime end = cMTimeRange.getEnd();
        int findSegmentIndexAt = findSegmentIndexAt(start, false);
        if (findSegmentIndexAt == -1) {
            return;
        }
        int findSegmentIndexAt2 = findSegmentIndexAt(end, false);
        if (findSegmentIndexAt2 == -1) {
            findSegmentIndexAt2 = ((com.tencent.tav.asset.CompositionTrack) this).segments.size() - 1;
        } else if (getSegmentStartTime(findSegmentIndexAt2) == end.getTimeUs()) {
            findSegmentIndexAt2--;
        }
        long segmentStartTime = getSegmentStartTime(findSegmentIndexAt);
        long segmentStartTime2 = getSegmentStartTime(findSegmentIndexAt2);
        com.tencent.tav.asset.CompositionTrackSegment compositionTrackSegment = ((com.tencent.tav.asset.CompositionTrack) this).segments.get(findSegmentIndexAt);
        com.tencent.tav.asset.CompositionTrackSegment compositionTrackSegment2 = ((com.tencent.tav.asset.CompositionTrack) this).segments.get(findSegmentIndexAt2);
        long timeUs = cMTimeRange.getEnd().getTimeUs() - segmentStartTime2;
        compositionTrackSegment2.timeRange = new com.tencent.tav.coremedia.CMTimeRange(compositionTrackSegment2.timeRange.getStart(), com.tencent.tav.coremedia.TimeUtil.us2CMTime(((float) timeUs) * ((float) (compositionTrackSegment2.scaleDuration.getTimeUs() / compositionTrackSegment2.timeRange.getDuration().getTimeUs()))));
        compositionTrackSegment2.scaleDuration = com.tencent.tav.coremedia.TimeUtil.us2CMTime(timeUs);
        float timeUs2 = (float) (compositionTrackSegment.scaleDuration.getTimeUs() / compositionTrackSegment.timeRange.getDuration().getTimeUs());
        long timeUs3 = cMTimeRange.getStart().getTimeUs() - segmentStartTime;
        long j17 = ((float) timeUs3) * timeUs2;
        compositionTrackSegment.timeRange = new com.tencent.tav.coremedia.CMTimeRange(com.tencent.tav.coremedia.TimeUtil.us2CMTime(compositionTrackSegment.timeRange.getStart().getTimeUs() + j17), com.tencent.tav.coremedia.TimeUtil.us2CMTime(compositionTrackSegment.timeRange.getDuration().getTimeUs() - j17));
        compositionTrackSegment.scaleDuration = com.tencent.tav.coremedia.TimeUtil.us2CMTime(compositionTrackSegment.scaleDuration.getTimeUs() - timeUs3);
        for (int size = ((com.tencent.tav.asset.CompositionTrack) this).segments.size() - 1; size >= 0; size--) {
            if (size > findSegmentIndexAt2 || size < findSegmentIndexAt) {
                ((com.tencent.tav.asset.CompositionTrack) this).segments.remove(size);
            }
        }
    }

    @Override // com.tencent.tav.asset.AssetTrack
    public com.tencent.tav.coremedia.CMTime getDuration() {
        com.tencent.tav.coremedia.CMTime cMTime = com.tencent.tav.coremedia.CMTime.CMTimeZero;
        for (int i17 = 0; i17 < ((com.tencent.tav.asset.CompositionTrack) this).segments.size(); i17++) {
            cMTime = cMTime.add(((com.tencent.tav.asset.CompositionTrack) this).segments.get(i17).getScaleDuration());
        }
        return cMTime;
    }

    public java.lang.String getExtendedLanguageTag() {
        return this.extendedLanguageTag;
    }

    public java.lang.String getLanguageCode() {
        return this.languageCode;
    }

    public void insertCompositionTrackSegment(com.tencent.tav.asset.CompositionTrackSegment compositionTrackSegment) {
        com.tencent.tav.coremedia.CGSize cGSize = this.naturalSize;
        if ((cGSize == null || cGSize.equals(com.tencent.tav.coremedia.CGSize.CGSizeZero)) && compositionTrackSegment.getSourceType() == 3 && !android.text.TextUtils.isEmpty(compositionTrackSegment.getSourcePath())) {
            this.naturalSize = com.tencent.tav.decoder.ImageDecoder.getDefaultOutputImageSize(compositionTrackSegment.getSourcePath());
        }
        com.tencent.tav.coremedia.CMTimeRange target = compositionTrackSegment.timeMapping.getTarget();
        com.tencent.tav.coremedia.CMTime start = target.getStart();
        if (((com.tencent.tav.asset.CompositionTrack) this).segments.size() == 0) {
            if (target.getStart().value > 0) {
                ((com.tencent.tav.asset.CompositionTrack) this).segments.add(new com.tencent.tav.asset.CompositionTrackSegment(new com.tencent.tav.coremedia.CMTimeRange(com.tencent.tav.coremedia.CMTime.CMTimeZero, target.getStart())));
            }
            insertSegment(compositionTrackSegment, -1);
            return;
        }
        int findSegmentIndexAt = findSegmentIndexAt(start, false);
        if (findSegmentIndexAt != -1) {
            com.tencent.tav.coremedia.CMTime segmentStartCMTime = getSegmentStartCMTime(findSegmentIndexAt);
            if (start.equalsTo(segmentStartCMTime)) {
                insertSegment(compositionTrackSegment, findSegmentIndexAt);
            } else {
                com.tencent.tav.asset.CompositionTrackSegment[] split = split(((com.tencent.tav.asset.CompositionTrack) this).segments.remove(findSegmentIndexAt), start.sub(segmentStartCMTime));
                if (split[1].scaleDuration.getTimeUs() > 0) {
                    ((com.tencent.tav.asset.CompositionTrack) this).segments.add(findSegmentIndexAt, split[1]);
                }
                insertSegment(compositionTrackSegment, findSegmentIndexAt);
                if (split[0].scaleDuration.getTimeUs() > 0) {
                    ((com.tencent.tav.asset.CompositionTrack) this).segments.add(findSegmentIndexAt, split[0]);
                }
            }
        } else {
            com.tencent.tav.coremedia.CMTime segmentStartCMTime2 = getSegmentStartCMTime(((com.tencent.tav.asset.CompositionTrack) this).segments.size());
            if (start.bigThan(segmentStartCMTime2)) {
                ((com.tencent.tav.asset.CompositionTrack) this).segments.add(new com.tencent.tav.asset.CompositionTrackSegment(new com.tencent.tav.coremedia.CMTimeRange(segmentStartCMTime2, start.sub(segmentStartCMTime2))));
            }
            insertSegment(compositionTrackSegment, -1);
        }
        com.tencent.tav.coremedia.CMTime cMTime = com.tencent.tav.coremedia.CMTime.CMTimeZero;
        for (com.tencent.tav.asset.CompositionTrackSegment compositionTrackSegment2 : ((com.tencent.tav.asset.CompositionTrack) this).segments) {
            compositionTrackSegment2.updateTargetTimeRange(new com.tencent.tav.coremedia.CMTimeRange(cMTime, compositionTrackSegment2.scaleDuration));
            cMTime = cMTime.add(compositionTrackSegment2.scaleDuration);
        }
        updateTimeRange();
    }

    public void insertEmptyTimeRange(com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
        insertTimeRange(cMTimeRange, null, cMTimeRange.getStart());
    }

    public boolean insertTimeRange(com.tencent.tav.coremedia.CMTimeRange cMTimeRange, com.tencent.tav.asset.AssetTrack assetTrack, com.tencent.tav.coremedia.CMTime cMTime) {
        if (this.timeRange == null) {
            com.tencent.tav.coremedia.CMTime cMTime2 = com.tencent.tav.coremedia.CMTime.CMTimeZero;
            this.timeRange = new com.tencent.tav.coremedia.CMTimeRange(cMTime2, cMTime2);
        }
        com.tencent.tav.coremedia.CGSize cGSize = this.naturalSize;
        if ((cGSize == null || cGSize.equals(com.tencent.tav.coremedia.CGSize.CGSizeZero)) && assetTrack != null) {
            this.naturalSize = assetTrack.naturalSize;
        }
        if (this.preferredRotation == 0 && assetTrack != null) {
            this.preferredRotation = assetTrack.preferredRotation;
        }
        if (cMTime == com.tencent.tav.coremedia.CMTime.CMTimeInvalid || cMTime.getValue() < 0) {
            insertTimeRange(cMTimeRange, new com.tencent.tav.coremedia.CMTimeRange(this.timeRange.getDuration(), cMTimeRange.getDuration()), assetTrack, -1);
            return true;
        }
        if (cMTimeRange.getDuration().value <= 0) {
            return false;
        }
        com.tencent.tav.coremedia.CMTimeRange cMTimeRange2 = new com.tencent.tav.coremedia.CMTimeRange(cMTime, cMTimeRange.getDuration());
        if (((com.tencent.tav.asset.CompositionTrack) this).segments.size() == 0) {
            if (cMTime.value > 0) {
                ((com.tencent.tav.asset.CompositionTrack) this).segments.add(new com.tencent.tav.asset.CompositionTrackSegment(new com.tencent.tav.coremedia.CMTimeRange(com.tencent.tav.coremedia.CMTime.CMTimeZero, cMTime)));
            }
            insertTimeRange(cMTimeRange, cMTimeRange2, assetTrack, -1);
            return true;
        }
        int findSegmentIndexAt = findSegmentIndexAt(cMTime, false);
        if (findSegmentIndexAt != -1) {
            com.tencent.tav.coremedia.CMTime segmentStartCMTime = getSegmentStartCMTime(findSegmentIndexAt);
            if (cMTime.equalsTo(segmentStartCMTime)) {
                insertTimeRange(cMTimeRange, cMTimeRange2, assetTrack, findSegmentIndexAt);
            } else {
                com.tencent.tav.asset.CompositionTrackSegment[] split = split(((com.tencent.tav.asset.CompositionTrack) this).segments.remove(findSegmentIndexAt), cMTime.sub(segmentStartCMTime));
                if (split[1].scaleDuration.getTimeUs() > 0) {
                    ((com.tencent.tav.asset.CompositionTrack) this).segments.add(findSegmentIndexAt, split[1]);
                }
                insertTimeRange(cMTimeRange, cMTimeRange, assetTrack, findSegmentIndexAt);
                if (split[0].scaleDuration.getTimeUs() > 0) {
                    ((com.tencent.tav.asset.CompositionTrack) this).segments.add(findSegmentIndexAt, split[0]);
                }
            }
        } else {
            com.tencent.tav.coremedia.CMTime segmentStartCMTime2 = getSegmentStartCMTime(((com.tencent.tav.asset.CompositionTrack) this).segments.size());
            if (cMTime.bigThan(segmentStartCMTime2)) {
                ((com.tencent.tav.asset.CompositionTrack) this).segments.add(new com.tencent.tav.asset.CompositionTrackSegment(new com.tencent.tav.coremedia.CMTimeRange(segmentStartCMTime2, cMTime.sub(segmentStartCMTime2))));
            }
            insertTimeRange(cMTimeRange, cMTimeRange2, assetTrack, -1);
        }
        updateTimeRange();
        return true;
    }

    public void removeTimeRange(com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
        if (cMTimeRange == null || !cMTimeRange.isLegal()) {
            return;
        }
        com.tencent.tav.coremedia.CMTime start = cMTimeRange.getStart();
        com.tencent.tav.coremedia.CMTime cMTime = com.tencent.tav.coremedia.CMTime.CMTimeOne;
        insertEmptyTimeRange(new com.tencent.tav.coremedia.CMTimeRange(start, cMTime));
        insertEmptyTimeRange(new com.tencent.tav.coremedia.CMTimeRange(cMTimeRange.getEnd().add(cMTime), cMTime));
        int findSegmentIndexAt = findSegmentIndexAt(cMTimeRange.getStart(), false);
        int findSegmentIndexAt2 = findSegmentIndexAt(cMTimeRange.getEnd().add(cMTime), false);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < ((com.tencent.tav.asset.CompositionTrack) this).segments.size(); i17++) {
            if (i17 < findSegmentIndexAt || i17 > findSegmentIndexAt2) {
                arrayList.add(((com.tencent.tav.asset.CompositionTrack) this).segments.get(i17));
            }
        }
        ((com.tencent.tav.asset.CompositionTrack) this).segments = arrayList;
        updateTimeRange();
        updateSegmentsStartTimeAfterRemoved(cMTimeRange);
    }

    public void scaleTimeRange(com.tencent.tav.coremedia.CMTimeRange cMTimeRange, com.tencent.tav.coremedia.CMTime cMTime) {
        java.util.List<com.tencent.tav.asset.CompositionTrackSegment> list;
        int findSegmentIndexAt;
        com.tencent.tav.coremedia.CMTime sub;
        com.tencent.tav.coremedia.CMTime start = cMTimeRange.getStart();
        com.tencent.tav.coremedia.CMTime end = cMTimeRange.getEnd();
        if (cMTimeRange.getDuration().getTimeUs() <= 0 || (list = ((com.tencent.tav.asset.CompositionTrack) this).segments) == null || list.size() == 0 || (findSegmentIndexAt = findSegmentIndexAt(cMTimeRange.getStart(), false)) == -1) {
            return;
        }
        int findSegmentIndexAt2 = findSegmentIndexAt(cMTimeRange.getEnd(), false);
        if (findSegmentIndexAt2 == -1) {
            findSegmentIndexAt2 = ((com.tencent.tav.asset.CompositionTrack) this).segments.size() - 1;
        } else if (getSegmentStartCMTime(findSegmentIndexAt2).equalsTo(cMTimeRange.getEnd())) {
            findSegmentIndexAt2--;
        }
        if (findSegmentIndexAt == findSegmentIndexAt2) {
            com.tencent.tav.coremedia.CMTime segmentStartCMTime = getSegmentStartCMTime(findSegmentIndexAt);
            com.tencent.tav.asset.CompositionTrackSegment remove = ((com.tencent.tav.asset.CompositionTrack) this).segments.remove(findSegmentIndexAt);
            if (end.smallThan(segmentStartCMTime.add(remove.scaleDuration))) {
                com.tencent.tav.asset.CompositionTrackSegment[] split = split(remove, start.sub(segmentStartCMTime));
                remove = split[0];
                if (split[1].scaleDuration.getTimeUs() > 0) {
                    ((com.tencent.tav.asset.CompositionTrack) this).segments.add(findSegmentIndexAt, split[1]);
                }
            }
            if (start.bigThan(segmentStartCMTime)) {
                com.tencent.tav.asset.CompositionTrackSegment[] split2 = split(remove, start.sub(segmentStartCMTime));
                split2[1].scaleDuration = cMTime;
                if (cMTime.getTimeUs() > 0) {
                    ((com.tencent.tav.asset.CompositionTrack) this).segments.add(findSegmentIndexAt, split2[1]);
                }
                if (split2[0].scaleDuration.getTimeUs() > 0) {
                    ((com.tencent.tav.asset.CompositionTrack) this).segments.add(findSegmentIndexAt, split2[0]);
                }
            } else {
                remove.scaleDuration = cMTime;
                ((com.tencent.tav.asset.CompositionTrack) this).segments.add(findSegmentIndexAt, remove);
            }
        } else {
            com.tencent.tav.coremedia.CMTime segmentStartCMTime2 = getSegmentStartCMTime(findSegmentIndexAt);
            com.tencent.tav.coremedia.CMTime segmentStartCMTime3 = getSegmentStartCMTime(findSegmentIndexAt2);
            if (start.bigThan(segmentStartCMTime2)) {
                com.tencent.tav.asset.CompositionTrackSegment[] split3 = split(((com.tencent.tav.asset.CompositionTrack) this).segments.remove(findSegmentIndexAt), start.sub(segmentStartCMTime2));
                com.tencent.tav.asset.CompositionTrackSegment compositionTrackSegment = split3[1];
                compositionTrackSegment.scaleDuration = cMTime.multi(compositionTrackSegment.scaleDuration).divide(cMTimeRange.getDuration());
                sub = cMTime.sub(split3[1].scaleDuration);
                if (split3[1].scaleDuration.getTimeUs() > 0) {
                    ((com.tencent.tav.asset.CompositionTrack) this).segments.add(findSegmentIndexAt, split3[1]);
                }
                if (split3[0].scaleDuration.getTimeUs() > 0) {
                    ((com.tencent.tav.asset.CompositionTrack) this).segments.add(findSegmentIndexAt, split3[0]);
                }
            } else {
                com.tencent.tav.asset.CompositionTrackSegment compositionTrackSegment2 = ((com.tencent.tav.asset.CompositionTrack) this).segments.get(findSegmentIndexAt);
                com.tencent.tav.coremedia.CMTime divide = cMTime.multi(compositionTrackSegment2.scaleDuration).divide(cMTimeRange.getDuration());
                compositionTrackSegment2.scaleDuration = divide;
                sub = cMTime.sub(divide);
            }
            for (int i17 = findSegmentIndexAt + 1; i17 < findSegmentIndexAt2; i17++) {
                com.tencent.tav.asset.CompositionTrackSegment compositionTrackSegment3 = ((com.tencent.tav.asset.CompositionTrack) this).segments.get(i17);
                com.tencent.tav.coremedia.CMTime divide2 = sub.multi(compositionTrackSegment3.scaleDuration).divide(cMTimeRange.getDuration());
                compositionTrackSegment3.scaleDuration = divide2;
                sub = sub.sub(divide2);
            }
            com.tencent.tav.asset.CompositionTrackSegment compositionTrackSegment4 = ((com.tencent.tav.asset.CompositionTrack) this).segments.get(findSegmentIndexAt2);
            if (end.smallThan(segmentStartCMTime3.add(compositionTrackSegment4.scaleDuration))) {
                com.tencent.tav.asset.CompositionTrackSegment[] split4 = split(((com.tencent.tav.asset.CompositionTrack) this).segments.remove(findSegmentIndexAt2), end.sub(segmentStartCMTime3));
                split4[0].scaleDuration = sub;
                if (split4[1].scaleDuration.getTimeUs() > 0) {
                    ((com.tencent.tav.asset.CompositionTrack) this).segments.add(findSegmentIndexAt2, split4[1]);
                }
                if (split4[0].scaleDuration.getTimeUs() > 0) {
                    ((com.tencent.tav.asset.CompositionTrack) this).segments.add(findSegmentIndexAt2, split4[0]);
                }
            } else {
                compositionTrackSegment4.scaleDuration = sub;
            }
        }
        com.tencent.tav.coremedia.CMTime cMTime2 = com.tencent.tav.coremedia.CMTime.CMTimeZero;
        for (com.tencent.tav.asset.CompositionTrackSegment compositionTrackSegment5 : ((com.tencent.tav.asset.CompositionTrack) this).segments) {
            compositionTrackSegment5.updateTargetTimeRange(new com.tencent.tav.coremedia.CMTimeRange(cMTime2, compositionTrackSegment5.scaleDuration));
            cMTime2 = cMTime2.add(compositionTrackSegment5.scaleDuration);
        }
        updateTimeRange();
    }

    public void setExtendedLanguageTag(java.lang.String str) {
        this.extendedLanguageTag = str;
    }

    public void setLanguageCode(java.lang.String str) {
        this.languageCode = str;
    }

    public void setNaturalSize(com.tencent.tav.coremedia.CGSize cGSize) {
        this.naturalSize = cGSize;
    }

    public void setNaturalTimeScale(int i17) {
        this.naturalTimeScale = i17;
    }

    @Override // com.tencent.tav.asset.AssetTrack
    public void setPreferredTransform(android.graphics.Matrix matrix) {
        this.preferredTransform = matrix;
    }

    @Override // com.tencent.tav.asset.AssetTrack
    public void setPreferredVolume(float f17) {
        this.preferredVolume = f17;
    }

    public void setSegments(java.util.List<com.tencent.tav.asset.CompositionTrackSegment> list) {
        ((com.tencent.tav.asset.CompositionTrack) this).segments = list;
    }

    public boolean validateTrackSegments(java.util.List<com.tencent.tav.asset.CompositionTrackSegment> list) {
        return false;
    }

    private void insertTimeRange(com.tencent.tav.coremedia.CMTimeRange cMTimeRange, com.tencent.tav.coremedia.CMTimeRange cMTimeRange2, com.tencent.tav.asset.AssetTrack assetTrack, int i17) {
        com.tencent.tav.asset.CompositionTrackSegment compositionTrackSegment;
        if (assetTrack instanceof com.tencent.tav.asset.CompositionTrack) {
            insertTimeRange(cMTimeRange, cMTimeRange2, (com.tencent.tav.asset.CompositionTrack) assetTrack, i17);
            return;
        }
        if (assetTrack != null) {
            compositionTrackSegment = new com.tencent.tav.asset.CompositionTrackSegment(assetTrack.getSourcePath(), assetTrack.getTrackID(), cMTimeRange, cMTimeRange2, assetTrack.getMediaType());
        } else {
            compositionTrackSegment = new com.tencent.tav.asset.CompositionTrackSegment(cMTimeRange2);
        }
        if (i17 >= 0) {
            ((com.tencent.tav.asset.CompositionTrack) this).segments.add(i17, compositionTrackSegment);
        } else {
            ((com.tencent.tav.asset.CompositionTrack) this).segments.add(compositionTrackSegment);
        }
        updateTimeRange();
    }

    private void insertTimeRange(com.tencent.tav.coremedia.CMTimeRange cMTimeRange, com.tencent.tav.coremedia.CMTimeRange cMTimeRange2, com.tencent.tav.asset.CompositionTrack compositionTrack, int i17) {
        com.tencent.tav.coremedia.CMTime cMTime;
        com.tencent.tav.coremedia.CMTime start = cMTimeRange.getStart();
        com.tencent.tav.coremedia.CMTime end = cMTimeRange.getEnd();
        com.tencent.tav.coremedia.CMTime start2 = cMTimeRange2.getStart();
        float durationUs = (((float) cMTimeRange2.getDurationUs()) * 1.0f) / ((float) cMTimeRange.getDurationUs());
        com.tencent.tav.coremedia.CMTime cMTime2 = start2;
        int i18 = i17;
        for (com.tencent.tav.asset.CompositionTrackSegment compositionTrackSegment : compositionTrack.getSegments()) {
            com.tencent.tav.coremedia.CMTimeRange target = compositionTrackSegment.getTimeMapping().getTarget();
            com.tencent.tav.coremedia.CMTime start3 = target.getStart();
            com.tencent.tav.coremedia.CMTime end2 = target.getEnd();
            com.tencent.tav.coremedia.CMTime m413clone = start3.m413clone();
            com.tencent.tav.coremedia.CMTime m413clone2 = end2.m413clone();
            if (start3.smallThan(start)) {
                m413clone = cMTimeRange.getStart();
            } else if (start3.bigThan(end)) {
                m413clone = com.tencent.tav.coremedia.CMTime.CMTimeInvalid;
            }
            if (end2.smallThan(start)) {
                m413clone2 = com.tencent.tav.coremedia.CMTime.CMTimeInvalid;
            } else if (end2.bigThan(end)) {
                m413clone2 = end;
            }
            if (!m413clone.equalsTo(m413clone2) && m413clone != (cMTime = com.tencent.tav.coremedia.CMTime.CMTimeInvalid) && m413clone2 != cMTime) {
                com.tencent.tav.coremedia.CMTime sub = m413clone.sub(start3);
                com.tencent.tav.coremedia.CMTime sub2 = m413clone2.sub(m413clone);
                com.tencent.tav.coremedia.CMTime multi = sub2.multi(durationUs);
                com.tencent.tav.coremedia.CMTimeRange cMTimeRange3 = new com.tencent.tav.coremedia.CMTimeRange(compositionTrackSegment.timeMapping.getSource().getStart().add(sub.divide((((float) compositionTrackSegment.timeMapping.getTarget().getDurationUs()) * 1.0f) / ((float) compositionTrackSegment.timeMapping.getSource().getDurationUs()))), sub2);
                com.tencent.tav.coremedia.CMTimeRange cMTimeRange4 = new com.tencent.tav.coremedia.CMTimeRange(cMTime2, multi);
                cMTime2 = cMTime2.add(multi);
                com.tencent.tav.asset.CompositionTrackSegment compositionTrackSegment2 = new com.tencent.tav.asset.CompositionTrackSegment(compositionTrackSegment.getSourcePath(), this.trackID, cMTimeRange3, cMTimeRange4, compositionTrackSegment.getSourceType());
                if (i18 >= 0) {
                    ((com.tencent.tav.asset.CompositionTrack) this).segments.add(i18, compositionTrackSegment2);
                    i18++;
                } else {
                    ((com.tencent.tav.asset.CompositionTrack) this).segments.add(compositionTrackSegment2);
                }
            }
        }
        updateTimeRange();
    }
}
