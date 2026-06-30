package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class ea extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.ga f118241d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f118242e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f118243f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea(com.tencent.mm.plugin.finder.live.widget.ga gaVar, pk2.o9 o9Var, int i17) {
        super(0);
        this.f118241d = gaVar;
        this.f118242e = o9Var;
        this.f118243f = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        pk2.o9 o9Var = this.f118242e;
        if (o9Var == null) {
            com.tencent.mars.xlog.Log.e("Finder.FinderLiveCoLiveInviteeMoreActionPanel", "invokeOption: helper is null, skip");
        } else {
            try {
                new pk2.c3(o9Var, this.f118243f).A();
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("Finder.FinderLiveCoLiveInviteeMoreActionPanel", th6, "invokeOption " + pk2.c3.class.getSimpleName() + " crashed", new java.lang.Object[0]);
            }
            com.tencent.mm.plugin.finder.live.widget.e0.t(this.f118241d, false, 1, null);
        }
        return jz5.f0.f302826a;
    }
}
