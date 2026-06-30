package gk3;

/* loaded from: classes8.dex */
public final class m extends ek3.a {

    /* renamed from: a, reason: collision with root package name */
    public ak3.c f272525a;

    /* renamed from: b, reason: collision with root package name */
    public jk3.e f272526b;

    /* renamed from: c, reason: collision with root package name */
    public ek3.d f272527c;

    /* renamed from: d, reason: collision with root package name */
    public ek3.e f272528d;

    /* renamed from: e, reason: collision with root package name */
    public kk3.d f272529e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f272530f;

    /* renamed from: g, reason: collision with root package name */
    public long f272531g = -1;

    /* renamed from: h, reason: collision with root package name */
    public boolean f272532h = true;

    @Override // ek3.a
    public void a(int i17) {
        b(i17, true);
    }

    public final void b(int i17, boolean z17) {
        if (c().c()) {
            if (((ak3.i) c()) instanceof rh1.e) {
                c().f(null);
            }
            com.tencent.mm.sdk.platformtools.u3.h(new gk3.g(this, i17, z17));
        } else {
            kk3.d dVar = this.f272529e;
            if (dVar == null || dVar == null) {
                return;
            }
            dVar.e(i17);
        }
    }

    public final ak3.c c() {
        ak3.c cVar = this.f272525a;
        if (cVar != null) {
            return cVar;
        }
        kotlin.jvm.internal.o.o("pageAdapter");
        throw null;
    }

    public void d(ak3.c pageAdapter, jk3.e multiTaskHelper, kk3.d dVar) {
        android.content.res.Resources resources;
        android.util.DisplayMetrics displayMetrics;
        kotlin.jvm.internal.o.g(pageAdapter, "pageAdapter");
        kotlin.jvm.internal.o.g(multiTaskHelper, "multiTaskHelper");
        this.f272525a = pageAdapter;
        this.f272526b = multiTaskHelper;
        this.f272529e = dVar;
        c().h(new gk3.l(this, multiTaskHelper));
        android.view.animation.Interpolator loadInterpolator = android.view.animation.AnimationUtils.loadInterpolator(c().getActivity(), com.tencent.mm.R.anim.f477822cg);
        android.view.ViewGroup a17 = c().a();
        if (a17 != null) {
            gk3.f fVar = new gk3.f(this);
            kotlin.jvm.internal.o.d(loadInterpolator);
            android.content.Context context = a17.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            this.f272527c = new ek3.d(context, a17, fVar, loadInterpolator, null);
        }
        ek3.d dVar2 = this.f272527c;
        if (dVar2 != null) {
            dVar2.f253601p = 1;
        }
        android.app.Activity activity = c().getActivity();
        float g17 = (activity == null || (resources = activity.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? i65.a.g(c().getActivity()) : displayMetrics.density;
        float f17 = 100 * g17;
        float f18 = 300 * g17;
        ek3.d dVar3 = this.f272527c;
        if (dVar3 != null) {
            dVar3.f253599n = f17;
        }
        if (dVar3 == null) {
            return;
        }
        dVar3.f253598m = f18;
    }

    public final void e() {
        ek3.e eVar = this.f272528d;
        if (eVar != null) {
            eVar.setTranslationX(0.0f);
        }
        ek3.e eVar2 = this.f272528d;
        if (eVar2 != null) {
            eVar2.setTranslationY(0.0f);
        }
        ek3.e eVar3 = this.f272528d;
        if (eVar3 != null) {
            eVar3.setScaleX(1.0f);
        }
        ek3.e eVar4 = this.f272528d;
        if (eVar4 == null) {
            return;
        }
        eVar4.setScaleY(1.0f);
    }
}
