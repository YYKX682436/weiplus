package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes3.dex */
public final class io implements q80.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.jo f134760a;

    public io(com.tencent.mm.plugin.finder.viewmodel.component.jo joVar) {
        this.f134760a = joVar;
    }

    @Override // q80.s
    public void a(android.view.View liteAppView) {
        kotlin.jvm.internal.o.g(liteAppView, "liteAppView");
        com.tencent.mars.xlog.Log.i(this.f134760a.f134873d, "startLiteAppView: success,liteAppView:" + liteAppView);
    }

    @Override // q80.s
    public void fail() {
        com.tencent.mars.xlog.Log.e(this.f134760a.f134873d, "startLiteAppView: fail!");
    }
}
