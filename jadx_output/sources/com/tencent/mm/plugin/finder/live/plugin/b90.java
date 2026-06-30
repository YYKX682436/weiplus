package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class b90 implements com.tencent.xweb.o1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.g90 f111993a;

    public b90(com.tencent.mm.plugin.finder.live.plugin.g90 g90Var) {
        this.f111993a = g90Var;
    }

    @Override // com.tencent.xweb.o1
    public void a() {
        com.tencent.mars.xlog.Log.i("FinderLiveScreenShareWidget", "xfile on user cancel finish");
    }

    @Override // com.tencent.xweb.o1
    public void b(java.lang.String str, java.util.HashMap hashMap) {
    }

    @Override // com.tencent.xweb.o1
    public void c() {
    }

    @Override // com.tencent.xweb.o1
    public void d(int i17, android.graphics.Bitmap thumbnail) {
        kotlin.jvm.internal.o.g(thumbnail, "thumbnail");
        com.tencent.mars.xlog.Log.i("FinderLiveScreenShareWidget", "xfile onThumbnailLoad " + i17);
    }

    @Override // com.tencent.xweb.o1
    public void e(int i17) {
        com.tencent.mars.xlog.Log.i("FinderLiveScreenShareWidget", "xfile onPageCountUpdate " + i17);
    }

    @Override // com.tencent.xweb.o1
    public void f(int i17, int i18, int i19) {
        com.tencent.mars.xlog.Log.i("FinderLiveScreenShareWidget", "xfile onPageChange " + i17 + " and pageWidth " + i18 + " and pageHeight " + i19);
        com.tencent.mm.plugin.finder.live.plugin.g90 g90Var = this.f111993a;
        com.tencent.xweb.r1.b(g90Var.f112659i, g90Var.f112660j);
        g90Var.getClass();
    }

    @Override // com.tencent.xweb.o1
    public void g(int i17, float f17, int i18, int i19, int i27, int i28) {
        com.tencent.mars.xlog.Log.i("FinderLiveScreenShareWidget", "xfile onViewStatusChange " + i17 + " and pageWidth " + i18 + " and pageHeight " + i19 + " and scale " + f17 + " and transX " + i27 + " and " + i28);
    }

    @Override // com.tencent.xweb.o1
    public void h(android.view.MotionEvent motionEvent) {
    }

    @Override // com.tencent.xweb.o1
    public void i() {
    }

    @Override // com.tencent.xweb.o1
    public void onDoubleTap(android.view.MotionEvent motionEvent) {
    }
}
