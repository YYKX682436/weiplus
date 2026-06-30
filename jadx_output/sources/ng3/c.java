package ng3;

/* loaded from: classes10.dex */
public final class c implements ng3.h {

    /* renamed from: a, reason: collision with root package name */
    public final ng3.t f336996a;

    /* renamed from: b, reason: collision with root package name */
    public final float f336997b;

    /* renamed from: c, reason: collision with root package name */
    public final float f336998c;

    public c(ng3.t trigger, float f17, float f18) {
        kotlin.jvm.internal.o.g(trigger, "trigger");
        this.f336996a = trigger;
        this.f336997b = f17;
        this.f336998c = f18;
    }

    @Override // ng3.h
    public ng3.t a() {
        return this.f336996a;
    }

    @Override // ng3.h
    public void b(mg3.b gesture, mg3.e pageGesture) {
        kotlin.jvm.internal.o.g(gesture, "gesture");
        kotlin.jvm.internal.o.g(pageGesture, "pageGesture");
        ng3.t tVar = ng3.t.f337049t;
        float f17 = this.f336998c;
        float f18 = this.f336997b;
        ng3.t tVar2 = this.f336996a;
        if (tVar2 == tVar) {
            pageGesture.a(f18, f17);
        }
        if (tVar2 == ng3.t.f337050u) {
            pageGesture.a(f18, f17);
        }
        if (tVar2 == ng3.t.f337051v) {
            pageGesture.d();
        }
    }
}
