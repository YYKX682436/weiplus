package px2;

/* loaded from: classes2.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.landscape.FinderLandscapePreviewLayout f358931d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.tencent.mm.plugin.finder.view.landscape.FinderLandscapePreviewLayout finderLandscapePreviewLayout) {
        super(0);
        this.f358931d = finderLandscapePreviewLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.view.landscape.FinderLandscapePreviewLayout finderLandscapePreviewLayout = this.f358931d;
        android.content.Context context = finderLandscapePreviewLayout.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return new mw2.j(context, (android.widget.ImageView) finderLandscapePreviewLayout.getSeekTimeLayout().findViewById(com.tencent.mm.R.id.f486472uv5), finderLandscapePreviewLayout.f132567w);
    }
}
