package px2;

/* loaded from: classes2.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.landscape.FinderLandscapePreviewLayout f358922d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.tencent.mm.plugin.finder.view.landscape.FinderLandscapePreviewLayout finderLandscapePreviewLayout) {
        super(0);
        this.f358922d = finderLandscapePreviewLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return com.tencent.mm.ui.id.b(this.f358922d.getContext()).inflate(com.tencent.mm.R.layout.e7p, (android.view.ViewGroup) null);
    }
}
