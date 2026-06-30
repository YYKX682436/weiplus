package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes8.dex */
public class z0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e04.n3 f159824d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.ProductUI f159825e;

    public z0(com.tencent.mm.plugin.scanner.ui.ProductUI productUI, e04.n3 n3Var) {
        this.f159825e = productUI;
        this.f159824d = n3Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/scanner/ui/ProductUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        e04.n3 n3Var = this.f159824d;
        java.lang.String str = n3Var.field_introlink;
        int i17 = com.tencent.mm.plugin.scanner.ui.ProductUI.S;
        com.tencent.mm.plugin.scanner.ui.ProductUI productUI = this.f159825e;
        productUI.X6(com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NULL, str);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", n3Var.field_introlink);
        int i18 = productUI.f159321s;
        intent.putExtra("geta8key_scene", i18 == 4 ? 11 : i18 == 3 ? 12 : 0);
        j45.l.j(productUI.getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/scanner/ui/ProductUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
