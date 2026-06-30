package e51;

/* loaded from: classes11.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    public static int f249568b;

    /* renamed from: a, reason: collision with root package name */
    public e51.j f249569a;

    public a(android.view.ViewGroup viewGroup) {
        if (f249568b == 0) {
            android.content.res.Resources resources = viewGroup.getResources();
            f249568b = resources.getDimensionPixelSize(com.tencent.mm.R.dimen.f480259ss);
            resources.getDimensionPixelOffset(com.tencent.mm.R.dimen.f480264sx);
            resources.getDimensionPixelOffset(com.tencent.mm.R.dimen.f480263sw);
            resources.getDimensionPixelOffset(com.tencent.mm.R.dimen.f480262sv);
            resources.getDimensionPixelOffset(com.tencent.mm.R.dimen.f480265sy);
            resources.getDimensionPixelOffset(com.tencent.mm.R.dimen.f480260st);
        }
    }

    public static e51.a a(android.view.ViewGroup viewGroup, e51.f fVar) {
        e51.a aVar = new e51.a(viewGroup);
        e51.j jVar = new e51.j(viewGroup.getContext(), fVar, new e51.k(viewGroup.getWidth() / 2, viewGroup.getHeight() + 400), new g51.b(viewGroup));
        jVar.f249595p = 0.0f;
        jVar.f249596q = 0.8f;
        jVar.f(-2000.0f, 1250.0f);
        jVar.f249601v = 0.002f;
        jVar.f249602w = 0.0f;
        jVar.E = 3000.0f;
        jVar.F = 500.0f;
        jVar.f249603x = 180;
        jVar.f249604y = 180;
        if (e51.o.f249610a == null) {
            e51.o.f249610a = new e51.n();
        }
        jVar.f249593n = e51.o.f249610a;
        jVar.f249605z = 3.6E-4f;
        jVar.A = 1.8E-4f;
        jVar.e(360.0f);
        aVar.f249569a = jVar;
        return aVar;
    }

    public static e51.a b(android.view.ViewGroup viewGroup, e51.f fVar) {
        e51.a aVar = new e51.a(viewGroup);
        e51.j jVar = new e51.j(viewGroup.getContext(), fVar, new e51.k(-100, viewGroup.getHeight() / 2), new g51.b(viewGroup));
        jVar.f249595p = 0.6f;
        jVar.f249596q = 0.15f;
        jVar.f(-1000.0f, 250.0f);
        jVar.f249599t = -2.0E-4f;
        jVar.f249600u = 0.0f;
        jVar.f249601v = 0.0015f;
        jVar.f249602w = 0.0f;
        jVar.E = 600.0f;
        jVar.F = 300.0f;
        jVar.f249603x = 180;
        jVar.f249604y = 180;
        if (e51.o.f249610a == null) {
            e51.o.f249610a = new e51.n();
        }
        jVar.f249593n = e51.o.f249610a;
        jVar.f249605z = 3.6E-4f;
        jVar.A = 1.8E-4f;
        jVar.e(360.0f);
        aVar.f249569a = jVar;
        return aVar;
    }

    public static e51.a c(android.view.ViewGroup viewGroup, e51.f fVar) {
        e51.a aVar = new e51.a(viewGroup);
        e51.j jVar = new e51.j(viewGroup.getContext(), fVar, new e51.k(viewGroup.getWidth() + 100, viewGroup.getHeight() / 2), new g51.b(viewGroup));
        jVar.f249595p = -0.6f;
        jVar.f249596q = 0.15f;
        jVar.f(-1000.0f, 250.0f);
        jVar.f249599t = 2.0E-4f;
        jVar.f249600u = 0.0f;
        jVar.f249601v = 0.0015f;
        jVar.f249602w = 0.0f;
        jVar.E = 600.0f;
        jVar.F = 300.0f;
        jVar.f249603x = 180;
        jVar.f249604y = 180;
        if (e51.o.f249610a == null) {
            e51.o.f249610a = new e51.n();
        }
        jVar.f249593n = e51.o.f249610a;
        jVar.f249605z = 3.6E-4f;
        jVar.A = 1.8E-4f;
        jVar.e(360.0f);
        aVar.f249569a = jVar;
        return aVar;
    }

    public e51.j d(int i17, long j17) {
        e51.j jVar = this.f249569a;
        jVar.f249589j = 0;
        jVar.f249590k = j17;
        float f17 = i17 / 1000.0f;
        jVar.f249591l = f17;
        jVar.f249592m = 1.0f / f17;
        jVar.d();
        jVar.g();
        return jVar;
    }
}
