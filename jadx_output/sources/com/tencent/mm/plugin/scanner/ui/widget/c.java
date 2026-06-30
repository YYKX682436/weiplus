package com.tencent.mm.plugin.scanner.ui.widget;

/* loaded from: classes8.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.widget.ScanProductNewMaskDecorView f159811d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.plugin.scanner.ui.widget.ScanProductNewMaskDecorView scanProductNewMaskDecorView) {
        super(0);
        this.f159811d = scanProductNewMaskDecorView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.scanner.ui.widget.ScanProductNewMaskDecorView.ScanProductLiveList liveList;
        com.tencent.mm.plugin.scanner.ui.widget.ScanProductNewMaskDecorView scanProductNewMaskDecorView = this.f159811d;
        android.content.Context context = scanProductNewMaskDecorView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        liveList = scanProductNewMaskDecorView.getLiveList();
        d04.d2 d2Var = new d04.d2(context, liveList, new in5.s() { // from class: com.tencent.mm.plugin.scanner.ui.widget.ScanProductNewMaskDecorView$buildItemConvertFactory$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ScanProductNewMaskDecorView", "type: " + type);
                return type == 2 ? new d04.i2() : new d04.e2();
            }
        });
        d2Var.setHasStableIds(true);
        return d2Var;
    }
}
