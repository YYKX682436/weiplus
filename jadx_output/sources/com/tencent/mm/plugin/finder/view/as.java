package com.tencent.mm.plugin.finder.view;

/* loaded from: classes13.dex */
public final class as extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.PageIndicatorView f131683d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f131684e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public as(com.tencent.mm.plugin.finder.view.PageIndicatorView pageIndicatorView, int i17) {
        super(0);
        this.f131683d = pageIndicatorView;
        this.f131684e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.view.PageIndicatorView pageIndicatorView = this.f131683d;
        float f17 = pageIndicatorView.f131557n;
        float f18 = this.f131684e;
        if (!(f17 == f18)) {
            pageIndicatorView.a(f18);
        }
        return jz5.f0.f302826a;
    }
}
