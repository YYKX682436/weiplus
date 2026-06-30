package d04;

/* loaded from: classes8.dex */
public final class v1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f225525d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d04.w1 f225526e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f225527f;

    public v1(kotlin.jvm.internal.h0 h0Var, d04.w1 w1Var, int i17) {
        this.f225525d = h0Var;
        this.f225526e = w1Var;
        this.f225527f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int indexOf;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/scanner/ui/widget/ScanProductMaskDecorView$ProductInfoAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.h0 h0Var = this.f225525d;
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanProductMaskDecorView", "onScanProductItemClick reqKey: %s", ((sz3.w0) h0Var.f310123d).f414139j);
        d04.w1 w1Var = this.f225526e;
        d04.i iVar = w1Var.f225541n;
        if (iVar != null) {
            kotlin.jvm.internal.o.d(view);
            sz3.w0 w0Var = (sz3.w0) h0Var.f310123d;
            java.util.ArrayList arrayList2 = w1Var.f225539i;
            iVar.a(view, w0Var, null, arrayList2 == null ? 0 : arrayList2.size(), ((arrayList2 == null || arrayList2.isEmpty()) || (indexOf = arrayList2.indexOf(java.lang.Integer.valueOf(this.f225527f))) == -1) ? 1 : indexOf + 1);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/scanner/ui/widget/ScanProductMaskDecorView$ProductInfoAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
