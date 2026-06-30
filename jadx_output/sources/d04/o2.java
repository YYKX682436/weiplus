package d04;

/* loaded from: classes8.dex */
public final class o2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.widget.ScanProductNewMaskDecorView f225481d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(com.tencent.mm.plugin.scanner.ui.widget.ScanProductNewMaskDecorView scanProductNewMaskDecorView) {
        super(0);
        this.f225481d = scanProductNewMaskDecorView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.view.recyclerview.WxLinearLayoutManager wxLinearLayoutManager = new com.tencent.mm.view.recyclerview.WxLinearLayoutManager(this.f225481d.getContext(), 0, true);
        wxLinearLayoutManager.f11881u = 5;
        return wxLinearLayoutManager;
    }
}
