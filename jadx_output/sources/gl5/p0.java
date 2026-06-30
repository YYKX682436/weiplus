package gl5;

/* loaded from: classes5.dex */
public final class p0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gl5.d1 f273056d;

    public p0(gl5.d1 d1Var) {
        this.f273056d = d1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/cedit/edit/FullScreenEditHelperHalfScreen$btnSmileyOrKeyboard$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        gl5.d1 d1Var = this.f273056d;
        android.view.View view2 = d1Var.f272927d;
        if (view2 != null) {
            view2.performClick();
        }
        boolean z17 = !d1Var.f272930g;
        d1Var.f272930g = z17;
        if (z17) {
            kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type com.tencent.mm.ui.widget.imageview.WeImageButton");
            ((com.tencent.mm.ui.widget.imageview.WeImageButton) view).setImageResource(com.tencent.mm.R.drawable.f481236o2);
        } else {
            kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type com.tencent.mm.ui.widget.imageview.WeImageButton");
            ((com.tencent.mm.ui.widget.imageview.WeImageButton) view).setImageResource(com.tencent.mm.R.raw.icons_outlined_emoji);
            gl5.d1.a(d1Var);
        }
        yj0.a.h(this, "com/tencent/mm/ui/widget/cedit/edit/FullScreenEditHelperHalfScreen$btnSmileyOrKeyboard$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
