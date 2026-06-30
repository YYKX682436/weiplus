package eh5;

/* loaded from: classes13.dex */
public final class j implements u4.b1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.transition.TransitionSet f252962d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f252963e;

    public j(androidx.transition.TransitionSet transitionSet, yz5.a aVar) {
        this.f252962d = transitionSet;
        this.f252963e = aVar;
    }

    @Override // u4.b1
    public void a(androidx.transition.Transition transition) {
        kotlin.jvm.internal.o.g(transition, "transition");
    }

    @Override // u4.b1
    public void b(androidx.transition.Transition transition) {
        kotlin.jvm.internal.o.g(transition, "transition");
    }

    @Override // u4.b1
    public void c(androidx.transition.Transition transition) {
        kotlin.jvm.internal.o.g(transition, "transition");
    }

    @Override // u4.b1
    public void d(androidx.transition.Transition transition) {
        kotlin.jvm.internal.o.g(transition, "transition");
        this.f252962d.Y(this);
        yz5.a aVar = this.f252963e;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
