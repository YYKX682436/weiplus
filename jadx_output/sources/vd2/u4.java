package vd2;

/* loaded from: classes3.dex */
public final class u4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.FinderLiveViewCallback f435932d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f435933e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(com.tencent.mm.plugin.finder.live.FinderLiveViewCallback finderLiveViewCallback, boolean z17) {
        super(0);
        this.f435932d = finderLiveViewCallback;
        this.f435933e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.FinderLiveViewCallback finderLiveViewCallback = this.f435932d;
        if (!finderLiveViewCallback.f111481J) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#setNewGuide isRealHistory=");
            boolean z17 = this.f435933e;
            sb6.append(z17);
            sb6.append(" scroll, cur data pos:");
            sb6.append(finderLiveViewCallback.f111495t.f436055f);
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveViewCallback", sb6.toString());
            com.tencent.mm.plugin.finder.live.FinderLiveViewCallback.N = z17 ? 1 : 2;
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveViewCallback", "#detachSnapHelperToRV");
            ((com.tencent.mm.plugin.finder.ui.o6) ((jz5.n) finderLiveViewCallback.f111491p).getValue()).b(null);
            finderLiveViewCallback.f111492q.b1(0, z17 ? -finderLiveViewCallback.f111501z : finderLiveViewCallback.A, new android.view.animation.DecelerateInterpolator());
            pm0.v.V(100L, new vd2.t4(z17, finderLiveViewCallback));
            finderLiveViewCallback.x(!z17, true);
        }
        return jz5.f0.f302826a;
    }
}
