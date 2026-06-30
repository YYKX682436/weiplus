package vn2;

/* loaded from: classes2.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f438240a = jz5.h.b(vn2.y0.f438421d);

    public final java.util.LinkedList a() {
        return (java.util.LinkedList) ((jz5.n) this.f438240a).getValue();
    }

    public final boolean b() {
        i95.m c17 = i95.n0.c(n40.m.class);
        pg3.q qVar = c17 instanceof pg3.q ? (pg3.q) c17 : null;
        if (qVar == null || !qVar.wi()) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("Finder.TopStoryMegaVideoPreload", "LongVideo-Trace, optimize wait, locLoading");
        return true;
    }

    public final void c(com.tencent.mm.plugin.finder.megavideo.topstory.flow.h hVar) {
        pm0.v.I(a(), new vn2.z0(hVar, this));
    }
}
