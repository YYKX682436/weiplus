package d04;

/* loaded from: classes13.dex */
public final class d0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView f225401d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f225402e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f225403f;

    public d0(com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView scanCodeMaskView, int i17, kotlin.jvm.internal.h0 h0Var) {
        this.f225401d = scanCodeMaskView;
        this.f225402e = i17;
        this.f225403f = h0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/scanner/ui/widget/ScanCodeMaskView$showSuccessView$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView scanCodeMaskView = this.f225401d;
        int i17 = this.f225402e;
        scanCodeMaskView.f159691x0 = i17;
        com.tencent.mm.plugin.scanner.model.i2 i2Var = scanCodeMaskView.f159688p0;
        if (i2Var != null) {
            i2Var.a(i17, (android.view.View) this.f225403f.f310123d);
        }
        java.util.Iterator<T> it = scanCodeMaskView.getSuccessMarkViewList().iterator();
        while (it.hasNext()) {
            ((android.view.View) it.next()).setOnClickListener(null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeMaskView$showSuccessView$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
