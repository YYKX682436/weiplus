package com.tencent.mm.ui.feature.api.screenshot;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/ui/feature/api/screenshot/ScreenShotShareService$forbidScreenShotShare$1", "Landroidx/lifecycle/f;", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class ScreenShotShareService$forbidScreenShotShare$1 implements androidx.lifecycle.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.feature.api.screenshot.j1 f208455d;

    public ScreenShotShareService$forbidScreenShotShare$1(com.tencent.mm.ui.feature.api.screenshot.j1 j1Var) {
        this.f208455d = j1Var;
    }

    @Override // androidx.lifecycle.f, androidx.lifecycle.h
    public void onDestroy(androidx.lifecycle.y owner) {
        kotlin.jvm.internal.o.g(owner, "owner");
        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotShareService", "forbidScreenShotShare, registerScreenShotCallback");
        ct.d3 d3Var = (ct.d3) i95.n0.c(ct.d3.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ((com.tencent.mm.ui.feature.api.screenshot.t) d3Var).wi(context, this.f208455d);
    }
}
