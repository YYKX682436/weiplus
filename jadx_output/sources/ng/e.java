package ng;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.base.Vec2 f336886a;

    /* renamed from: b, reason: collision with root package name */
    public final ng.f f336887b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.maas.base.Rect2 f336888c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f336889d;

    /* renamed from: e, reason: collision with root package name */
    public float f336890e;

    /* renamed from: f, reason: collision with root package name */
    public float f336891f;

    public e(android.content.Context context, com.tencent.maas.base.Vec2 viewSize, ng.f gestureDetectorListener) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(viewSize, "viewSize");
        kotlin.jvm.internal.o.g(gestureDetectorListener, "gestureDetectorListener");
        this.f336886a = viewSize;
        this.f336887b = gestureDetectorListener;
        this.f336891f = 1.0f;
        new ng.k(context, new ng.c(this));
        new ng.h(context, new ng.b(this));
        new android.view.GestureDetector(context, new ng.d(this));
    }
}
