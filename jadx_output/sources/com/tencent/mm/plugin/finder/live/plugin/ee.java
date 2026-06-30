package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ee extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.mg f112402a;

    public ee(com.tencent.mm.plugin.finder.live.plugin.mg mgVar) {
        this.f112402a = mgVar;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        boolean isShown = this.f112402a.C1().isShown();
        if (isShown && !this.f112402a.N) {
            this.f112402a.C1().post(new com.tencent.mm.plugin.finder.live.plugin.de(this.f112402a));
        }
        this.f112402a.N = isShown;
    }
}
