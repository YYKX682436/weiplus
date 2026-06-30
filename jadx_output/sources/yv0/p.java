package yv0;

/* loaded from: classes5.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.base.MJID f465985a;

    /* renamed from: b, reason: collision with root package name */
    public final ug.m f465986b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f465987c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f465988d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Rect f465989e;

    public p(com.tencent.maas.base.MJID segmentId, ug.m segmentType, android.graphics.Rect cachedFrame, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(segmentId, "segmentId");
        kotlin.jvm.internal.o.g(segmentType, "segmentType");
        kotlin.jvm.internal.o.g(cachedFrame, "cachedFrame");
        this.f465985a = segmentId;
        this.f465986b = segmentType;
        this.f465987c = z17;
        this.f465988d = z18;
        this.f465989e = cachedFrame;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.o.b(yv0.p.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.timeline.StorylineSegmentInfo");
        yv0.p pVar = (yv0.p) obj;
        return kotlin.jvm.internal.o.b(this.f465985a, pVar.f465985a) && this.f465986b == pVar.f465986b && kotlin.jvm.internal.o.b(this.f465989e, pVar.f465989e);
    }

    public int hashCode() {
        return (((this.f465985a.hashCode() * 31) + this.f465986b.hashCode()) * 31) + this.f465989e.hashCode();
    }
}
