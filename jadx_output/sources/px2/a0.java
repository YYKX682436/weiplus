package px2;

/* loaded from: classes2.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.landscape.FinderLandscapePreviewLayout f358867d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.tencent.mm.plugin.finder.view.landscape.FinderLandscapePreviewLayout finderLandscapePreviewLayout) {
        super(0);
        this.f358867d = finderLandscapePreviewLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Integer.valueOf(android.view.ViewConfiguration.get(this.f358867d.getContext()).getScaledTouchSlop());
    }
}
