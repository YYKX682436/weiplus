package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public class n3 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.w3 f182582d;

    public n3(com.tencent.mm.plugin.webview.luggage.w3 w3Var) {
        this.f182582d = w3Var;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.webview.luggage.w3 w3Var = this.f182582d;
        w3Var.getClass();
        boolean b17 = com.tencent.mm.plugin.webview.luggage.util.g.b();
        com.tencent.mm.plugin.webview.luggage.e0 e0Var = w3Var.f182669j;
        boolean z17 = (e0Var.f182178J.e(e0Var.u()).f192177d & 16384) > 0;
        com.tencent.mm.plugin.webview.luggage.e0 e0Var2 = w3Var.f182669j;
        boolean z18 = (e0Var2.f182178J.e(e0Var2.u()).f192177d & 32768) > 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuggageWebViewLongClickHelper", "installMenuItems hasSetAcc = %b, canShareImage = %b, canFavImage = %b", java.lang.Boolean.valueOf(b17), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (b17 && z17) {
            arrayList.add(new com.tencent.mm.plugin.webview.luggage.r3(1, w3Var.f182669j.f406610d.getString(com.tencent.mm.R.string.hr_)));
        }
        arrayList.add(new com.tencent.mm.plugin.webview.luggage.r3(2, w3Var.f182669j.f406610d.getString(com.tencent.mm.R.string.i8c)));
        if (b17 && z18) {
            arrayList.add(new com.tencent.mm.plugin.webview.luggage.r3(3, w3Var.f182669j.f406610d.getString(com.tencent.mm.R.string.hjg)));
        }
        java.lang.String str = w3Var.f182660a;
        kd0.p2 p2Var = w3Var.f182668i;
        if (str != null) {
            arrayList.add(new com.tencent.mm.plugin.webview.luggage.r3(4, ((com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic) p2Var).l(w3Var.f182662c, str)));
        }
        w3Var.f182667h.o(null);
        g4Var.clear();
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            com.tencent.mm.plugin.webview.luggage.r3 r3Var = (com.tencent.mm.plugin.webview.luggage.r3) arrayList.get(i17);
            int i18 = r3Var.f182614a;
            if (i18 == 4) {
                w3Var.f182667h.o(((com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic) p2Var).b(new com.tencent.mm.plugin.webview.luggage.b3(w3Var), w3Var.f182662c, w3Var.f182660a, 7));
            } else {
                g4Var.f(i18, r3Var.f182615b);
            }
        }
    }
}
