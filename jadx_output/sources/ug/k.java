package ug;

/* loaded from: classes5.dex */
public abstract class k {
    public static com.tencent.maas.moviecomposing.segments.Segment a(ug.m mVar, java.lang.String str, com.tencent.maas.moviecomposing.Timeline timeline) {
        if (str == null || timeline == null) {
            return null;
        }
        switch (mVar.ordinal()) {
            case 1:
                return new com.tencent.maas.moviecomposing.segments.TransitionSegment(str, timeline);
            case 2:
            case 3:
            case 4:
                return new com.tencent.maas.moviecomposing.segments.ClipSegment(str, timeline);
            case 5:
                return new com.tencent.maas.moviecomposing.segments.MovieTitleSegment(str, timeline);
            case 6:
                return new com.tencent.maas.moviecomposing.segments.ContentDescSegment(str, timeline);
            case 7:
                return new com.tencent.maas.moviecomposing.segments.FancyTextSegment(str, timeline);
            case 8:
                return new com.tencent.maas.moviecomposing.segments.WhenWhereSegment(str, timeline);
            case 9:
                return new com.tencent.maas.moviecomposing.segments.EmoticonSegment(str, timeline);
            case 10:
                return new com.tencent.maas.moviecomposing.segments.MusicSegment(str, timeline);
            case 11:
                return new com.tencent.maas.moviecomposing.segments.NarrationSegment(str, timeline);
            case 12:
                return new com.tencent.maas.moviecomposing.segments.CaptionSegment(str, timeline);
            default:
                return null;
        }
    }
}
