package e1;

/* loaded from: classes13.dex */
public final class j implements e1.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.PathMeasure f246275a;

    public j(android.graphics.PathMeasure internalPathMeasure) {
        kotlin.jvm.internal.o.g(internalPathMeasure, "internalPathMeasure");
        this.f246275a = internalPathMeasure;
    }

    public boolean a(float f17, float f18, e1.p0 destination, boolean z17) {
        kotlin.jvm.internal.o.g(destination, "destination");
        if (destination instanceof e1.i) {
            return this.f246275a.getSegment(f17, f18, ((e1.i) destination).f246263a, z17);
        }
        throw new java.lang.UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }
}
