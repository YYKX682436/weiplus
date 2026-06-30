package fc3;

/* loaded from: classes9.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f261050a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.PointF f261051b;

    /* renamed from: c, reason: collision with root package name */
    public final float f261052c;

    /* renamed from: d, reason: collision with root package name */
    public final float f261053d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f261054e;

    /* renamed from: f, reason: collision with root package name */
    public final float f261055f;

    /* renamed from: g, reason: collision with root package name */
    public int f261056g;

    /* renamed from: h, reason: collision with root package name */
    public android.animation.AnimatorSet f261057h;

    public k(java.lang.String text, android.graphics.PointF endPos, float f17, float f18) {
        kotlin.jvm.internal.o.g(text, "text");
        kotlin.jvm.internal.o.g(endPos, "endPos");
        this.f261050a = text;
        this.f261051b = endPos;
        this.f261052c = f17;
        this.f261053d = f18;
        this.f261056g = 1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(java.lang.String text, android.graphics.PointF endPos, float f17, float f18, float f19) {
        this(text, endPos, f17, f18);
        kotlin.jvm.internal.o.g(text, "text");
        kotlin.jvm.internal.o.g(endPos, "endPos");
        this.f261055f = f19;
    }
}
