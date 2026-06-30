package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class fa extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.ga f118336d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f118337e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f118338f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fa(com.tencent.mm.plugin.finder.live.widget.ga gaVar, pk2.o9 o9Var, int i17) {
        super(0);
        this.f118336d = gaVar;
        this.f118337e = o9Var;
        this.f118338f = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        pk2.o9 o9Var = this.f118337e;
        if (o9Var == null) {
            com.tencent.mars.xlog.Log.e("Finder.FinderLiveCoLiveInviteeMoreActionPanel", "invokeOption: helper is null, skip");
        } else {
            try {
                new pk2.e0(o9Var, this.f118338f).A();
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("Finder.FinderLiveCoLiveInviteeMoreActionPanel", th6, "invokeOption " + pk2.e0.class.getSimpleName() + " crashed", new java.lang.Object[0]);
            }
            com.tencent.mm.plugin.finder.live.widget.e0.t(this.f118336d, false, 1, null);
        }
        return jz5.f0.f302826a;
    }
}
