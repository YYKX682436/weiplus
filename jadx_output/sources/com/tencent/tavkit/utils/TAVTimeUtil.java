package com.tencent.tavkit.utils;

/* loaded from: classes16.dex */
public class TAVTimeUtil {
    public static float factorForTime(com.tencent.tav.coremedia.CMTime cMTime, com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
        if (cMTimeRange == null) {
            return 0.0f;
        }
        return cMTime.sub(cMTimeRange.getStart()).getTimeSeconds() / cMTimeRange.getDuration().getTimeSeconds();
    }

    public static com.tencent.tav.coremedia.CMTimeRange getIntersection(com.tencent.tav.coremedia.CMTimeRange cMTimeRange, com.tencent.tav.coremedia.CMTimeRange cMTimeRange2) {
        if (cMTimeRange == null || cMTimeRange2 == null) {
            return null;
        }
        if (cMTimeRange.getStart().bigThan(cMTimeRange2.getStart())) {
            cMTimeRange2 = cMTimeRange;
            cMTimeRange = cMTimeRange2;
        }
        if (cMTimeRange.getEnd().smallThan(cMTimeRange2.getStart())) {
            return null;
        }
        com.tencent.tav.coremedia.CMTime start = cMTimeRange.getStart().bigThan(cMTimeRange2.getStart()) ? cMTimeRange.getStart() : cMTimeRange2.getStart();
        return new com.tencent.tav.coremedia.CMTimeRange(start, (cMTimeRange.getEnd().smallThan(cMTimeRange2.getEnd()) ? cMTimeRange.getEnd() : cMTimeRange2.getEnd()).sub(start));
    }

    public static java.util.List<com.tencent.tav.coremedia.CMTimeRange> mixTimeRangesWithMinTimeRange(com.tencent.tav.coremedia.CMTimeRange cMTimeRange, com.tencent.tav.coremedia.CMTimeRange cMTimeRange2, com.tencent.tav.coremedia.CMTimeRange cMTimeRange3) {
        if (cMTimeRange3.containsTimeRange(cMTimeRange)) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.tencent.tav.coremedia.CMTime sub = cMTimeRange2.getStart().sub(cMTimeRange3.getStart());
            if (sub.getTimeSeconds() > 0.0f) {
                arrayList.add(new com.tencent.tav.coremedia.CMTimeRange(cMTimeRange3.getStart(), sub));
            }
            arrayList.add(cMTimeRange2);
            com.tencent.tav.coremedia.CMTime sub2 = cMTimeRange3.getEnd().sub(cMTimeRange2.getEnd());
            if (sub2.getTimeSeconds() > 0.0f) {
                arrayList.add(new com.tencent.tav.coremedia.CMTimeRange(cMTimeRange2.getEnd(), sub2));
            }
            return arrayList;
        }
        if (cMTimeRange.equals(cMTimeRange3)) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(cMTimeRange2);
            return arrayList2;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        com.tencent.tav.coremedia.CMTimeRange cMTimeRange4 = new com.tencent.tav.coremedia.CMTimeRange(cMTimeRange.getStart(), cMTimeRange.getDuration().sub(cMTimeRange2.getDuration()));
        if (cMTimeRange4.getDuration().getTimeSeconds() > 0.0f) {
            arrayList3.add(cMTimeRange4);
        }
        arrayList3.add(cMTimeRange2);
        com.tencent.tav.coremedia.CMTimeRange cMTimeRange5 = new com.tencent.tav.coremedia.CMTimeRange(cMTimeRange2.getEnd(), cMTimeRange3.getEnd().sub(cMTimeRange2.getEnd()));
        if (cMTimeRange5.getDuration().getTimeSeconds() > 0.0f) {
            arrayList3.add(cMTimeRange5);
        }
        return arrayList3;
    }

    public static java.util.List<com.tencent.tav.coremedia.CMTimeRange> sliceTimeRangesForTimeRange1(com.tencent.tav.coremedia.CMTimeRange cMTimeRange, com.tencent.tav.coremedia.CMTimeRange cMTimeRange2) {
        java.util.List<com.tencent.tav.coremedia.CMTimeRange> list;
        com.tencent.tav.coremedia.CMTimeRange intersection = getIntersection(cMTimeRange, cMTimeRange2);
        if (intersection.getDuration().getTimeSeconds() > 0.0f) {
            list = (cMTimeRange2.containsTimeRange(cMTimeRange) || (cMTimeRange.getStart().getTimeSeconds() < cMTimeRange2.getStart().getTimeSeconds() && cMTimeRange.getEnd().getTimeSeconds() < cMTimeRange2.getEnd().getTimeSeconds())) ? mixTimeRangesWithMinTimeRange(cMTimeRange, intersection, cMTimeRange2) : mixTimeRangesWithMinTimeRange(cMTimeRange2, intersection, cMTimeRange);
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(cMTimeRange);
            arrayList.add(cMTimeRange2);
            list = arrayList;
        }
        java.util.Collections.sort(list, new java.util.Comparator<com.tencent.tav.coremedia.CMTimeRange>() { // from class: com.tencent.tavkit.utils.TAVTimeUtil.1
            @Override // java.util.Comparator
            public int compare(com.tencent.tav.coremedia.CMTimeRange cMTimeRange3, com.tencent.tav.coremedia.CMTimeRange cMTimeRange4) {
                com.tencent.tav.coremedia.CMTime start = cMTimeRange3.getStart();
                com.tencent.tav.coremedia.CMTime start2 = cMTimeRange4.getStart();
                if (start.equalsTo(start2)) {
                    return 0;
                }
                return start.smallThan(start2) ? -1 : 1;
            }
        });
        return list;
    }

    public static java.util.List<com.tencent.tav.coremedia.CMTimeRange> timeRange(com.tencent.tav.coremedia.CMTimeRange cMTimeRange, com.tencent.tav.coremedia.CMTimeRange cMTimeRange2) {
        com.tencent.tav.coremedia.CMTimeRange intersection = getIntersection(cMTimeRange, cMTimeRange2);
        if (intersection == null || intersection.getDuration().getTimeSeconds() <= 0.0f) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(cMTimeRange);
            return arrayList;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        com.tencent.tav.coremedia.CMTimeRange cMTimeRange3 = new com.tencent.tav.coremedia.CMTimeRange(cMTimeRange.getStart(), intersection.getStart().sub(cMTimeRange.getStart()));
        if (cMTimeRange3.getDuration().getTimeSeconds() > 0.0f) {
            arrayList2.add(cMTimeRange3);
        }
        com.tencent.tav.coremedia.CMTimeRange cMTimeRange4 = new com.tencent.tav.coremedia.CMTimeRange(intersection.getEnd(), cMTimeRange.getEnd().sub(intersection.getEnd()));
        if (cMTimeRange4.getDuration().getTimeSeconds() > 0.0f) {
            arrayList2.add(cMTimeRange4);
        }
        return arrayList2;
    }
}
