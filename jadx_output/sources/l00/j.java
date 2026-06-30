package l00;

/* loaded from: classes7.dex */
public final class j implements jc3.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l00.m f314727d;

    public j(l00.m mVar) {
        this.f314727d = mVar;
    }

    @Override // jc3.r
    public void c(int i17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsGiftFlutterPlugin", "onCanvasViewFirstFrameRendered, canvasId: " + i17 + ", surfaceReady: " + z17);
        l00.m mVar = this.f314727d;
        mVar.f314731e.a(mVar.f314732f);
    }

    @Override // jc3.r
    public boolean d(int i17, cf3.d view) {
        kotlin.jvm.internal.o.g(view, "view");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCanvasViewDestroy, canvasId: ");
        sb6.append(i17);
        sb6.append(", viewGroupId: ");
        l00.m mVar = this.f314727d;
        sb6.append(mVar.f314730d);
        sb6.append(", viewId: ");
        sb6.append(mVar.f314732f);
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsGiftFlutterPlugin", sb6.toString());
        mVar.f314731e.c(mVar.f314732f);
        return true;
    }

    @Override // jc3.r
    public void e(int i17, cf3.d view) {
        kotlin.jvm.internal.o.g(view, "view");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCanvasViewCreated, canvasId: ");
        sb6.append(i17);
        sb6.append(", viewGroupId: ");
        l00.m mVar = this.f314727d;
        sb6.append(mVar.f314730d);
        sb6.append(", viewId: ");
        sb6.append(mVar.f314732f);
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsGiftFlutterPlugin", sb6.toString());
        mVar.f314731e.b(mVar.f314730d, mVar.f314732f, view);
    }

    @Override // jc3.r
    public void f(int i17, cf3.d view, int i18, int i19, int i27, int i28) {
        kotlin.jvm.internal.o.g(view, "view");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCanvasViewLayout, canvasId: ");
        sb6.append(i17);
        sb6.append(", viewGroupId: ");
        l00.m mVar = this.f314727d;
        sb6.append(mVar.f314730d);
        sb6.append(", viewId: ");
        sb6.append(mVar.f314732f);
        sb6.append(", left: ");
        sb6.append(i18);
        sb6.append(", top: ");
        sb6.append(i19);
        sb6.append(", width: ");
        sb6.append(i27);
        sb6.append(", height: ");
        sb6.append(i28);
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsGiftFlutterPlugin", sb6.toString());
        mVar.f314731e.d(mVar.f314732f, i18, i19, i27, i28);
    }
}
