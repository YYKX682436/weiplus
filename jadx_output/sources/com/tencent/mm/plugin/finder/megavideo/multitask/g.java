package com.tencent.mm.plugin.finder.megavideo.multitask;

/* loaded from: classes8.dex */
public final class g implements kk3.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.megavideo.multitask.h f120863a;

    public g(com.tencent.mm.plugin.finder.megavideo.multitask.h hVar) {
        this.f120863a = hVar;
    }

    @Override // kk3.d
    public void b(android.graphics.Bitmap bitmap, int i17) {
        com.tencent.mars.xlog.Log.i("FinderVideoMultiTaskHelper", "startMaskAnim: transform to float ball animation end ,way:" + i17);
        com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.finder.megavideo.multitask.f(this.f120863a), 150L);
    }

    @Override // kk3.d
    public void d(android.graphics.Bitmap bitmap, boolean z17, int i17) {
        com.tencent.mars.xlog.Log.i("FinderVideoMultiTaskHelper", "startMaskAnim: transform to float ball animation start, isSwipeBack:" + z17 + ", way:" + i17);
        com.tencent.mm.plugin.finder.megavideo.multitask.h hVar = this.f120863a;
        jk3.f fVar = hVar.f300125r;
        if (fVar != null) {
            kk3.c.h(fVar, hVar.f300077a, null, 2, null);
        }
    }

    @Override // kk3.d
    public void e(int i17) {
        com.tencent.mars.xlog.Log.i("FinderVideoMultiTaskHelper", "startMaskAnim: transform to float ball animation cancel, way:" + i17);
        jk3.f fVar = this.f120863a.f300125r;
        if (fVar != null) {
            com.tencent.mm.sdk.platformtools.u3.h(new pk3.j((pk3.l) fVar, false, false, null));
        }
    }
}
