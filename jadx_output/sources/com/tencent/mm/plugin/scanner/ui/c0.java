package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes15.dex */
public class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f159512d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.model.a f159513e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.f0 f159514f;

    public c0(com.tencent.mm.plugin.scanner.ui.f0 f0Var, java.lang.String str, com.tencent.mm.plugin.scanner.model.a aVar) {
        this.f159514f = f0Var;
        this.f159512d = str;
        this.f159513e = aVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/scanner/ui/ProductGridPreference$ProductGridAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String str = this.f159512d;
        com.tencent.mm.plugin.scanner.model.a aVar = this.f159513e;
        java.lang.String str2 = aVar.f158794n;
        int i17 = aVar.f158781a;
        com.tencent.mm.plugin.scanner.ui.f0 f0Var = this.f159514f;
        gm0.j1.d().g(new com.tencent.mm.plugin.scanner.model.h0(str, str2, i17, str, f0Var.getCount(), 11294, aVar.f158788h, null));
        java.lang.String str3 = this.f159512d;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_Product_ID", str3);
            j45.l.j(f0Var.f159545h.f197770d, "scanner", ".ui.ProductUI", intent, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/scanner/ui/ProductGridPreference$ProductGridAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
