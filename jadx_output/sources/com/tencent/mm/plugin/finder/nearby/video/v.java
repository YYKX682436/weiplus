package com.tencent.mm.plugin.finder.nearby.video;

/* loaded from: classes2.dex */
public final class v extends ym5.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.video.d0 f122224a;

    public v(com.tencent.mm.plugin.finder.nearby.video.d0 d0Var) {
        this.f122224a = d0Var;
    }

    @Override // ym5.q3
    public void b(int i17) {
        this.f122224a.f122177f.onLoadMore();
    }

    @Override // ym5.q3
    public void c(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
    }

    @Override // ym5.q3
    public void d(int i17, rn5.a aVar, boolean z17) {
        this.f122224a.f122177f.onRefresh();
    }

    @Override // ym5.q3
    public void e(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        this.f122224a.f122177f.onRefreshEnd(reason);
    }
}
