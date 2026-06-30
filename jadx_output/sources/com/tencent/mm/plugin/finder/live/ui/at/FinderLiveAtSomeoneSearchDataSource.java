package com.tencent.mm.plugin.finder.live.ui.at;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0006\u001a\u00020\u0005H\u0007¨\u0006\n"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/ui/at/FinderLiveAtSomeoneSearchDataSource;", "Lym3/b;", "Lcom/tencent/mm/plugin/finder/ui/at/t;", "", "Landroidx/lifecycle/x;", "Ljz5/f0;", "destroy", "<init>", "()V", "com/tencent/mm/plugin/finder/live/ui/at/r", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class FinderLiveAtSomeoneSearchDataSource extends ym3.b implements androidx.lifecycle.x {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f115399d = jz5.h.b(com.tencent.mm.plugin.finder.live.ui.at.s.f115422d);

    /* renamed from: e, reason: collision with root package name */
    public p13.c f115400e;

    @Override // ym3.b
    public kotlinx.coroutines.flow.j d(v65.i scope, xm3.v0 dataRequest) {
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(dataRequest, "dataRequest");
        u26.k0 k0Var = new u26.k0();
        p13.u uVar = new p13.u();
        uVar.f351141c = (java.lang.String) dataRequest.f455390e;
        uVar.f351140b = 64;
        uVar.f351145g = new int[]{131072, 131081};
        uVar.f351152n = (com.tencent.mm.sdk.platformtools.n3) ((jz5.n) this.f115399d).getValue();
        uVar.f351151m = new com.tencent.mm.plugin.finder.live.ui.at.r(this, dataRequest, k0Var);
        uVar.f351148j.add(c01.z1.r());
        if (this.f115400e != null) {
            ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni(this.f115400e);
        }
        this.f115400e = ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(2, uVar);
        return new kotlinx.coroutines.flow.r(k0Var);
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
    public final void destroy() {
        if (this.f115400e != null) {
            ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni(this.f115400e);
        }
        this.f115400e = null;
    }

    @Override // ym3.b
    public void e() {
        if (this.f115400e != null) {
            ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni(this.f115400e);
        }
    }
}
