package l93;

/* loaded from: classes2.dex */
public abstract class k0 implements com.tencent.mm.plugin.finder.view.mp {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f317284d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.model.BaseFinderFeed f317285e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f317286f;

    public k0(androidx.appcompat.app.AppCompatActivity activity, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f317284d = activity;
        this.f317285e = baseFinderFeed;
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void b() {
        com.tencent.mars.xlog.Log.i("FinderDrawerAnimateListener", "[onDrawerDetach]");
        if (this.f317286f) {
            if (g()) {
                k();
            } else {
                h();
            }
        }
        this.f317286f = false;
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void d() {
    }

    @Override // com.tencent.mm.plugin.finder.view.mp
    public void e() {
        if (g()) {
            k();
        } else {
            h();
        }
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void f() {
    }

    public final boolean g() {
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject2;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f317285e;
        return (baseFinderFeed == null || (feedObject = baseFinderFeed.getFeedObject()) == null || (feedObject2 = feedObject.getFeedObject()) == null || (objectDesc = feedObject2.getObjectDesc()) == null || objectDesc.getMediaType() != 4) ? false : true;
    }

    public final void h() {
        androidx.appcompat.app.AppCompatActivity activity = this.f317284d;
        kotlin.jvm.internal.o.g(activity, "activity");
        ((uo2.v) pf5.z.f353948a.a(activity).a(uo2.v.class)).T6();
    }

    @Override // com.tencent.mm.plugin.finder.view.mp
    public void i() {
        com.tencent.mars.xlog.Log.i("FinderDrawerAnimateListener", "[onBackFromFullScreen]");
        if (this.f317286f) {
            if (g()) {
                k();
            } else {
                h();
            }
        }
        this.f317286f = false;
    }

    @Override // com.tencent.mm.plugin.finder.view.mp
    public void j() {
        com.tencent.mars.xlog.Log.i("FinderDrawerAnimateListener", "[onReachTop]");
        this.f317286f = true;
        boolean g17 = g();
        androidx.appcompat.app.AppCompatActivity activity = this.f317284d;
        if (g17) {
            ((com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler) ((com.tencent.mm.plugin.finder.viewmodel.component.nb0) pf5.u.f353936a.e(zy2.b6.class).c(com.tencent.mm.plugin.finder.viewmodel.component.nb0.class))).c7(activity);
        } else {
            kotlin.jvm.internal.o.g(activity, "activity");
            ((uo2.v) pf5.z.f353948a.a(activity).a(uo2.v.class)).S6();
        }
    }

    public final void k() {
        ((com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler) ((com.tencent.mm.plugin.finder.viewmodel.component.nb0) pf5.u.f353936a.e(zy2.b6.class).c(com.tencent.mm.plugin.finder.viewmodel.component.nb0.class))).f7(this.f317284d);
    }

    @Override // com.tencent.mm.plugin.finder.view.mp
    public void m() {
        boolean g17 = g();
        androidx.appcompat.app.AppCompatActivity activity = this.f317284d;
        if (g17) {
            ((com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler) ((com.tencent.mm.plugin.finder.viewmodel.component.nb0) pf5.u.f353936a.e(zy2.b6.class).c(com.tencent.mm.plugin.finder.viewmodel.component.nb0.class))).c7(activity);
        } else {
            kotlin.jvm.internal.o.g(activity, "activity");
            ((uo2.v) pf5.z.f353948a.a(activity).a(uo2.v.class)).S6();
        }
    }
}
