package ou0;

/* loaded from: classes5.dex */
public abstract class b0 {
    public static final boolean a(com.tencent.maas.moviecomposing.segments.Segment segment) {
        kotlin.jvm.internal.o.g(segment, "<this>");
        return segment.C() == ug.m.ImageClip || segment.C() == ug.m.MovieClip || segment.C() == ug.m.VideoClip;
    }

    public static final boolean b(com.tencent.maas.moviecomposing.segments.Segment segment) {
        kotlin.jvm.internal.o.g(segment, "<this>");
        return segment.C() == ug.m.MovieClip || segment.C() == ug.m.VideoClip;
    }
}
