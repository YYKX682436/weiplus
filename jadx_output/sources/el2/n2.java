package el2;

/* loaded from: classes3.dex */
public final class n2 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ el2.r2 f253876d;

    public n2(el2.r2 r2Var) {
        this.f253876d = r2Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.Long l17 = (java.lang.Long) obj;
        java.lang.Long valueOf = java.lang.Long.valueOf(((java.lang.Number) ae2.in.E7.r()).intValue());
        if (!(valueOf.longValue() > 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            l17 = valueOf;
        }
        el2.r2 r2Var = this.f253876d;
        android.widget.TextView textView = r2Var.f253904i;
        kotlin.jvm.internal.o.d(l17);
        textView.setText(l17.longValue() <= 0 ? "" : zl2.r4.S(zl2.r4.f473950a, l17.longValue(), 0, 2, null));
        android.widget.TextView textView2 = r2Var.f253905m;
        if (textView2 != null) {
            textView2.requestLayout();
        }
        if (textView2 != null) {
            textView2.invalidate();
        }
        android.widget.TextView textView3 = r2Var.f253904i;
        if (textView3 != null) {
            textView3.requestLayout();
        }
        if (textView3 != null) {
            textView3.invalidate();
        }
        float textSize = textView2 != null ? textView2.getTextSize() : 0.0f;
        float textSize2 = textView3 != null ? textView3.getTextSize() : 0.0f;
        if (textSize <= 0.0f || textSize2 <= 0.0f) {
            return;
        }
        float min = java.lang.Math.min(textSize, textSize2);
        if (textView2 != null) {
            textView2.setTextSize(0, min);
        }
        if (textView3 != null) {
            textView3.setTextSize(0, min);
        }
        if (textView2 != null) {
            textView2.requestLayout();
        }
        if (textView3 != null) {
            textView3.requestLayout();
        }
    }
}
