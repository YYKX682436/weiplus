package uy3;

/* loaded from: classes8.dex */
public final class v0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.box.ScanOCRDialogBackgroundOpView f431998d;

    public v0(com.tencent.mm.plugin.scanner.box.ScanOCRDialogBackgroundOpView scanOCRDialogBackgroundOpView) {
        this.f431998d = scanOCRDialogBackgroundOpView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/scanner/box/ScanOCRDialogBackgroundOpView$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        uy3.p pVar = this.f431998d.f158712d;
        if (pVar != null) {
            ((kz3.g) pVar).onClick(view);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/scanner/box/ScanOCRDialogBackgroundOpView$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
