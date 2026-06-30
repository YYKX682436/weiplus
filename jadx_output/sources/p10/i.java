package p10;

/* loaded from: classes7.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.nirvana.ui.MagicDebugPanelView f350956d;

    public i(com.tencent.mm.feature.ecs.nirvana.ui.MagicDebugPanelView magicDebugPanelView) {
        this.f350956d = magicDebugPanelView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/ecs/nirvana/ui/MagicDebugPanelView$createHeapSnapshotButton$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.feature.ecs.nirvana.ui.MagicDebugPanelView magicDebugPanelView = this.f350956d;
        iq0.c cVar = magicDebugPanelView.f65818h;
        if (cVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MagicDebugPanelView", "takeHeapSnapshot failed: bizHandle is null");
            db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "bizHandle is null", 0).show();
        } else {
            java.lang.String path = "wxfile://usr/test_" + java.lang.System.currentTimeMillis() + ".heapsnapshot";
            kotlin.jvm.internal.o.g(path, "path");
            java.lang.String format = java.lang.String.format(";(function() {var path = %s;try {mb.JSBridge.invoke('takeHeapSnapshot', { path: path });} catch (e) { console.error('takeHeapSnapshot invoke failed', e); }return path;})();", java.util.Arrays.copyOf(new java.lang.Object[]{"\"" + r26.i0.t(r26.i0.t(r26.i0.t(r26.i0.t(path, "\\", "\\\\", false), "\"", "\\\"", false), "\n", "\\n", false), "\r", "\\r", false) + '\"'}, 1));
            kotlin.jvm.internal.o.f(format, "format(...)");
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicDebugPanelView", "takeHeapSnapshot: wxPath=".concat(path));
            db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "Taking heap snapshot: ".concat(path), 0).show();
            ((nq0.p) ((gq0.t) i95.n0.c(gq0.t.class))).bj(cVar, format, new p10.v(magicDebugPanelView));
        }
        yj0.a.h(this, "com/tencent/mm/feature/ecs/nirvana/ui/MagicDebugPanelView$createHeapSnapshotButton$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
