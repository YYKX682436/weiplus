package com.tencent.mm.plugin.scanner.view;

/* loaded from: classes8.dex */
public class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.view.ScanCardRectView f159924d;

    public d(com.tencent.mm.plugin.scanner.view.ScanCardRectView scanCardRectView) {
        this.f159924d = scanCardRectView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/scanner/view/ScanCardRectView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.scanner.view.ScanCardRectView scanCardRectView = this.f159924d;
        db5.e1.w(scanCardRectView.getContext(), scanCardRectView.getContext().getString(com.tencent.mm.R.string.i8t), scanCardRectView.getContext().getString(com.tencent.mm.R.string.i8s), android.view.View.inflate(scanCardRectView.getContext(), com.tencent.mm.R.layout.cho, null), new com.tencent.mm.plugin.scanner.view.c(this));
        yj0.a.h(this, "com/tencent/mm/plugin/scanner/view/ScanCardRectView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
