package com.tencent.mm.plugin.scanner.ui.widget;

/* loaded from: classes8.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.widget.ScanProductNewMaskDecorView f159810d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.tencent.mm.plugin.scanner.ui.widget.ScanProductNewMaskDecorView scanProductNewMaskDecorView) {
        super(0);
        this.f159810d = scanProductNewMaskDecorView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.scanner.ui.widget.ScanProductNewMaskDecorView.ScanProductLiveDataSource dataSource;
        com.tencent.mm.plugin.scanner.ui.widget.ScanProductNewMaskDecorView scanProductNewMaskDecorView = this.f159810d;
        dataSource = scanProductNewMaskDecorView.getDataSource();
        xm3.n0 n0Var = new xm3.n0();
        java.lang.Object context = scanProductNewMaskDecorView.getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        return new com.tencent.mm.plugin.scanner.ui.widget.ScanProductNewMaskDecorView.ScanProductLiveList(dataSource, n0Var, (androidx.lifecycle.y) context);
    }
}
