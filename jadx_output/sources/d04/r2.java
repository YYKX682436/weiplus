package d04;

/* loaded from: classes8.dex */
public final class r2 implements in5.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.widget.ScanProductNewMaskDecorView f225498d;

    public r2(com.tencent.mm.plugin.scanner.ui.widget.ScanProductNewMaskDecorView scanProductNewMaskDecorView) {
        this.f225498d = scanProductNewMaskDecorView;
    }

    @Override // in5.u
    public void g(android.view.View itemView, in5.c cVar, int i17) {
        java.lang.Object obj;
        java.lang.Object obj2;
        com.tencent.mm.plugin.scanner.ui.widget.ScanProductNewMaskDecorView scanProductNewMaskDecorView;
        d04.i iVar;
        d04.d2 mAdapter;
        d04.d2 mAdapter2;
        d04.d2 mAdapter3;
        d04.j2 data = (d04.j2) cVar;
        kotlin.jvm.internal.o.g(itemView, "itemView");
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanProductNewMaskDecorView", "onItemClickListener onClick position: " + i17);
        if (data.f225447e == 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanProductNewMaskDecorView", "onScanProductItemClick uniqueId: " + data.f225446d.f414130a);
            com.tencent.mm.plugin.scanner.ui.widget.ScanProductNewMaskDecorView scanProductNewMaskDecorView2 = this.f225498d;
            synchronized (scanProductNewMaskDecorView2.A) {
                obj = scanProductNewMaskDecorView2.A.get(java.lang.Long.valueOf(data.f225446d.f414130a));
            }
            com.tencent.mm.plugin.scanner.ui.widget.ScanProductNewMaskDecorView scanProductNewMaskDecorView3 = this.f225498d;
            synchronized (scanProductNewMaskDecorView3.f159786z) {
                obj2 = scanProductNewMaskDecorView3.f159786z.get(java.lang.Integer.valueOf(data.f225446d.f414138i));
            }
            sz3.w0 w0Var = (sz3.w0) obj2;
            java.lang.String str = w0Var != null ? w0Var.f414139j : null;
            boolean z17 = false;
            if (str == null || str.length() == 0) {
                boolean z18 = w0Var != null && w0Var.f414137h == 1;
                if (w0Var != null) {
                    w0Var.f414137h = 1;
                }
                int i18 = w0Var != null ? w0Var.f414138i : -1;
                com.tencent.mm.plugin.scanner.ui.widget.ScanProductNewMaskDecorView scanProductNewMaskDecorView4 = this.f225498d;
                java.lang.Integer num = scanProductNewMaskDecorView4.f159776p;
                if (num != null && num.intValue() != i18) {
                    java.lang.Integer num2 = scanProductNewMaskDecorView4.f159776p;
                    kotlin.jvm.internal.o.d(num2);
                    jz5.l h17 = com.tencent.mm.plugin.scanner.ui.widget.ScanProductNewMaskDecorView.h(scanProductNewMaskDecorView4, num2.intValue());
                    int intValue = h17 != null ? ((java.lang.Number) h17.f302833d).intValue() : -1;
                    d04.j2 j2Var = h17 != null ? (d04.j2) h17.f302834e : null;
                    sz3.w0 w0Var2 = j2Var != null ? j2Var.f225446d : null;
                    if (w0Var2 != null) {
                        w0Var2.f414137h = 0;
                    }
                    if (intValue >= 0) {
                        mAdapter2 = scanProductNewMaskDecorView4.getMAdapter();
                        if (intValue < mAdapter2.getItemCount()) {
                            mAdapter3 = scanProductNewMaskDecorView4.getMAdapter();
                            mAdapter3.notifyItemChanged(intValue);
                        }
                    }
                }
                this.f225498d.f159776p = w0Var != null ? java.lang.Integer.valueOf(w0Var.f414138i) : -1;
                if (!z18) {
                    mAdapter = this.f225498d.getMAdapter();
                    mAdapter.notifyItemChanged(i17);
                }
                z17 = z18;
            }
            if (obj == null || obj2 == null || z17 || (iVar = (scanProductNewMaskDecorView = this.f225498d).f159781u) == null) {
                return;
            }
            iVar.a(itemView, (sz3.w0) obj2, (sz3.c1) obj, scanProductNewMaskDecorView.getF159785y(), i17);
        }
    }
}
