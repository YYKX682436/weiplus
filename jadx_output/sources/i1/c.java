package i1;

/* loaded from: classes13.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f286836a;

    /* renamed from: b, reason: collision with root package name */
    public final float f286837b;

    /* renamed from: c, reason: collision with root package name */
    public final float f286838c;

    /* renamed from: d, reason: collision with root package name */
    public final float f286839d;

    /* renamed from: e, reason: collision with root package name */
    public final float f286840e;

    /* renamed from: f, reason: collision with root package name */
    public final float f286841f;

    /* renamed from: g, reason: collision with root package name */
    public final float f286842g;

    /* renamed from: h, reason: collision with root package name */
    public final float f286843h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f286844i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.List f286845j;

    public c(java.lang.String name, float f17, float f18, float f19, float f27, float f28, float f29, float f37, java.util.List clipPathData, java.util.List children, int i17, kotlin.jvm.internal.i iVar) {
        name = (i17 & 1) != 0 ? "" : name;
        f17 = (i17 & 2) != 0 ? 0.0f : f17;
        f18 = (i17 & 4) != 0 ? 0.0f : f18;
        f19 = (i17 & 8) != 0 ? 0.0f : f19;
        f27 = (i17 & 16) != 0 ? 1.0f : f27;
        f28 = (i17 & 32) != 0 ? 1.0f : f28;
        f29 = (i17 & 64) != 0 ? 0.0f : f29;
        f37 = (i17 & 128) != 0 ? 0.0f : f37;
        if ((i17 & 256) != 0) {
            int i18 = i1.p1.f287001a;
            clipPathData = kz5.p0.f313996d;
        }
        children = (i17 & 512) != 0 ? new java.util.ArrayList() : children;
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(clipPathData, "clipPathData");
        kotlin.jvm.internal.o.g(children, "children");
        this.f286836a = name;
        this.f286837b = f17;
        this.f286838c = f18;
        this.f286839d = f19;
        this.f286840e = f27;
        this.f286841f = f28;
        this.f286842g = f29;
        this.f286843h = f37;
        this.f286844i = clipPathData;
        this.f286845j = children;
    }
}
