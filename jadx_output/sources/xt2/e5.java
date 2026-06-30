package xt2;

/* loaded from: classes3.dex */
public final class e5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingPanel f456726d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingPanel finderLiveShoppingPanel) {
        super(0);
        this.f456726d = finderLiveShoppingPanel;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return android.animation.ObjectAnimator.ofFloat(this.f456726d.getMaskView(), "alpha", 1.0f, 0.0f);
    }
}
