package ly;

/* loaded from: classes11.dex */
public final class f implements u4.b1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f322178d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f322179e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f322180f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.transition.ChangeBounds f322181g;

    public f(yz5.a aVar, yz5.l lVar, yz5.a aVar2, androidx.transition.ChangeBounds changeBounds) {
        this.f322178d = aVar;
        this.f322179e = lVar;
        this.f322180f = aVar2;
        this.f322181g = changeBounds;
    }

    @Override // u4.b1
    public void a(androidx.transition.Transition transition) {
        kotlin.jvm.internal.o.g(transition, "transition");
    }

    @Override // u4.b1
    public void b(androidx.transition.Transition transition) {
        kotlin.jvm.internal.o.g(transition, "transition");
        try {
            yz5.a aVar = this.f322178d;
            if (aVar != null) {
                aVar.invoke();
            }
        } catch (java.lang.Exception e17) {
            yz5.l lVar = this.f322179e;
            if (lVar != null) {
                lVar.invoke(e17);
            }
        }
    }

    @Override // u4.b1
    public void c(androidx.transition.Transition transition) {
        kotlin.jvm.internal.o.g(transition, "transition");
    }

    @Override // u4.b1
    public void d(androidx.transition.Transition transition) {
        androidx.transition.ChangeBounds changeBounds = this.f322181g;
        kotlin.jvm.internal.o.g(transition, "transition");
        try {
            try {
                yz5.a aVar = this.f322180f;
                if (aVar != null) {
                    aVar.invoke();
                }
            } catch (java.lang.Exception e17) {
                yz5.l lVar = this.f322179e;
                if (lVar != null) {
                    lVar.invoke(e17);
                }
            }
        } finally {
            changeBounds.E(this);
        }
    }
}
