package fk3;

/* loaded from: classes8.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fk3.o f263560d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f263561e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.animation.Interpolator f263562f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(fk3.o oVar, android.view.ViewGroup viewGroup, android.view.animation.Interpolator interpolator) {
        super(0);
        this.f263560d = oVar;
        this.f263561e = viewGroup;
        this.f263562f = interpolator;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.res.Resources resources;
        android.util.DisplayMetrics displayMetrics;
        fk3.o oVar = this.f263560d;
        fk3.f fVar = new fk3.f(oVar);
        android.view.animation.Interpolator interpolator = this.f263562f;
        kotlin.jvm.internal.o.f(interpolator, "$interpolator");
        android.view.ViewGroup forParent = this.f263561e;
        kotlin.jvm.internal.o.g(forParent, "forParent");
        android.content.Context context = forParent.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ek3.d dVar = new ek3.d(context, forParent, fVar, interpolator, null);
        oVar.f263587c = dVar;
        dVar.f253601p = 1;
        android.app.Activity activity = oVar.c().getActivity();
        float g17 = (activity == null || (resources = activity.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? i65.a.g(oVar.c().getActivity()) : displayMetrics.density;
        float f17 = 100 * g17;
        float f18 = 300 * g17;
        ek3.d dVar2 = oVar.f263587c;
        if (dVar2 != null) {
            dVar2.f253599n = f17;
        }
        if (dVar2 != null) {
            dVar2.f253598m = f18;
        }
        return jz5.f0.f302826a;
    }
}
