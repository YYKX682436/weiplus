package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes3.dex */
public final class i7 implements com.tencent.mm.ui.tools.p5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderImagePreviewUI f129353a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f129354b;

    public i7(com.tencent.mm.plugin.finder.ui.FinderImagePreviewUI finderImagePreviewUI, java.util.ArrayList arrayList) {
        this.f129353a = finderImagePreviewUI;
        this.f129354b = arrayList;
    }

    @Override // com.tencent.mm.ui.tools.p5
    public final void a() {
        java.lang.String str;
        android.graphics.Bitmap bitmap;
        java.util.ArrayList arrayList = this.f129354b;
        if (arrayList == null || (str = (java.lang.String) kz5.n0.Z(arrayList)) == null) {
            str = "";
        }
        int i17 = com.tencent.mm.plugin.finder.ui.FinderImagePreviewUI.H;
        com.tencent.mm.plugin.finder.ui.FinderImagePreviewUI finderImagePreviewUI = this.f129353a;
        finderImagePreviewUI.getClass();
        if ((str.length() == 0) || (bitmap = finderImagePreviewUI.G) == null) {
            return;
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) finderImagePreviewUI, 1, false);
        k0Var.f211872n = new com.tencent.mm.plugin.finder.ui.m7(finderImagePreviewUI);
        k0Var.f211881s = new com.tencent.mm.plugin.finder.ui.o7(finderImagePreviewUI, str, bitmap);
        k0Var.v();
    }
}
