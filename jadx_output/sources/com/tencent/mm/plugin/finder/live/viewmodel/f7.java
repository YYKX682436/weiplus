package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class f7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.b8 f117091d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yl2.m f117092e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7(com.tencent.mm.plugin.finder.live.viewmodel.b8 b8Var, yl2.m mVar) {
        super(0);
        this.f117091d = b8Var;
        this.f117092e = mVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("Finder.FinderLivePostUIC", "showLicenseBottomSheet: user clicked auth button");
        com.tencent.mm.plugin.finder.live.viewmodel.b8.Q6(this.f117091d, this.f117092e);
        return jz5.f0.f302826a;
    }
}
