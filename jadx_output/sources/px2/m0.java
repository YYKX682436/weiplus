package px2;

/* loaded from: classes2.dex */
public final class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f358903d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.landscape.FinderVideoLandscapePreviewLayout f358904e;

    public m0(in5.s0 s0Var, com.tencent.mm.plugin.finder.view.landscape.FinderVideoLandscapePreviewLayout finderVideoLandscapePreviewLayout) {
        this.f358903d = s0Var;
        this.f358904e = finderVideoLandscapePreviewLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.recyclerview.widget.RecyclerView o17 = this.f358903d.o();
        px2.v0 callback = this.f358904e.getCallback();
        int i17 = callback != null ? ((com.tencent.mm.plugin.finder.viewmodel.component.at) callback).f133803b.f135618s : -1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(o17, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/landscape/FinderVideoLandscapePreviewLayout$addPreview$2$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
        o17.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(o17, "com/tencent/mm/plugin/finder/view/landscape/FinderVideoLandscapePreviewLayout$addPreview$2$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
    }
}
