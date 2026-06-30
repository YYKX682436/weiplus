package hv0;

/* loaded from: classes5.dex */
public final class i implements hv0.j {

    /* renamed from: a, reason: collision with root package name */
    public float f285260a;

    /* renamed from: b, reason: collision with root package name */
    public yz5.p f285261b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f285262c = jz5.h.b(new hv0.g(this));

    @Override // hv0.j
    public void a(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel panel, android.view.View animView, android.view.View backgroundView, yz5.p onTranslation, yz5.a end) {
        kotlin.jvm.internal.o.g(panel, "panel");
        kotlin.jvm.internal.o.g(animView, "animView");
        kotlin.jvm.internal.o.g(backgroundView, "backgroundView");
        kotlin.jvm.internal.o.g(onTranslation, "onTranslation");
        kotlin.jvm.internal.o.g(end, "end");
        animView.animate().withEndAction(new hv0.h(end)).setDuration(300L).start();
    }

    @Override // hv0.j
    public void b(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel panel, android.view.View animView, android.view.View backgroundView, yz5.p onTranslation, yz5.a end) {
        kotlin.jvm.internal.o.g(panel, "panel");
        kotlin.jvm.internal.o.g(animView, "animView");
        kotlin.jvm.internal.o.g(backgroundView, "backgroundView");
        kotlin.jvm.internal.o.g(onTranslation, "onTranslation");
        kotlin.jvm.internal.o.g(end, "end");
        this.f285261b = onTranslation;
        end.invoke();
    }
}
