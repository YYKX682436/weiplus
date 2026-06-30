package tm0;

/* loaded from: classes8.dex */
public final class e implements androidx.lifecycle.y {

    /* renamed from: e, reason: collision with root package name */
    public boolean f420459e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f420460f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f420461g;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f420458d = jz5.h.b(tm0.d.f420457d);

    /* renamed from: h, reason: collision with root package name */
    public final i75.a f420462h = new i75.a(this);

    public final tm0.c a() {
        return (tm0.c) ((jz5.n) this.f420458d).getValue();
    }

    public final boolean b() {
        ((com.tencent.mm.ui.a9) ((hh5.e) i95.n0.c(hh5.e.class))).getClass();
        return com.tencent.mm.ui.LauncherUI.getCurrentTabIndex() == 2;
    }

    public final void c(boolean z17) {
        boolean z18 = this.f420461g;
        if (z18 && !z17) {
            this.f420461g = false;
            a().notify(kz5.b0.c(new tm0.a(tm0.b.f420455n, this)));
            com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreTabStateOwner", "OnTabFromExposeToUnExpose");
        } else {
            if (z18 || !z17) {
                return;
            }
            this.f420461g = true;
            a().notify(kz5.b0.c(new tm0.a(tm0.b.f420454m, this)));
            com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreTabStateOwner", "OnTabFromUnExposeToExpose");
        }
    }

    @Override // androidx.lifecycle.y
    /* renamed from: getLifecycle */
    public androidx.lifecycle.o mo133getLifecycle() {
        return this.f420462h;
    }
}
