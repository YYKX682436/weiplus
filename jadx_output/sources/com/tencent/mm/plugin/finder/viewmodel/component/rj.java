package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class rj implements ym5.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.bl f135799a;

    public rj(com.tencent.mm.plugin.finder.viewmodel.component.bl blVar) {
        this.f135799a = blVar;
    }

    @Override // ym5.d1
    public void a(android.view.View view, android.view.MotionEvent e17) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(e17, "e");
        com.tencent.mars.xlog.Log.i("Finder.HomeActionBarUIC", "onDoubleClick ...");
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.finder.viewmodel.component.qj(this.f135799a));
    }
}
