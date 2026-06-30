package px2;

/* loaded from: classes2.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.landscape.FinderLandscapePreviewLayout f358933d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.tencent.mm.plugin.finder.view.landscape.FinderLandscapePreviewLayout finderLandscapePreviewLayout) {
        super(0);
        this.f358933d = finderLandscapePreviewLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.TextView textView = (android.widget.TextView) this.f358933d.getSeekTimeLayout().findViewById(com.tencent.mm.R.id.ohr);
        kotlin.jvm.internal.o.d(textView);
        com.tencent.mm.ui.fk.a(textView);
        return textView;
    }
}
