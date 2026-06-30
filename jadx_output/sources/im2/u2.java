package im2;

/* loaded from: classes3.dex */
public final class u2 implements com.tencent.mm.ui.tools.c5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.z3 f292571d;

    public u2(im2.z3 z3Var) {
        this.f292571d = z3Var;
    }

    @Override // com.tencent.mm.ui.tools.c5
    public final void w2(int i17, boolean z17) {
        im2.z3 z3Var = this.f292571d;
        com.tencent.mars.xlog.Log.i(z3Var.f292635d, "onKeyboardHeightChanged, height:" + i17 + ", isResized:" + z17);
        boolean z18 = i17 > 0;
        android.widget.TextView b76 = z3Var.b7();
        android.view.ViewGroup.LayoutParams layoutParams = b76 != null ? b76.getLayoutParams() : null;
        android.widget.LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
        android.widget.TextView g76 = z3Var.g7();
        android.view.ViewGroup.LayoutParams layoutParams3 = g76 != null ? g76.getLayoutParams() : null;
        android.widget.LinearLayout.LayoutParams layoutParams4 = layoutParams3 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams3 : null;
        android.view.View c76 = z3Var.c7();
        android.view.ViewGroup.LayoutParams layoutParams5 = c76 != null ? c76.getLayoutParams() : null;
        android.widget.RelativeLayout.LayoutParams layoutParams6 = layoutParams5 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams5 : null;
        android.widget.ScrollView k76 = z3Var.k7();
        android.view.ViewGroup.LayoutParams layoutParams7 = k76 != null ? k76.getLayoutParams() : null;
        android.widget.RelativeLayout.LayoutParams layoutParams8 = layoutParams7 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams7 : null;
        if (z18) {
            if (layoutParams6 != null) {
                layoutParams6.bottomMargin = (int) z3Var.U1;
            }
            float f17 = z3Var.S1;
            if (layoutParams2 != null) {
                layoutParams2.bottomMargin = (int) f17;
            }
            if (layoutParams4 != null) {
                layoutParams4.bottomMargin = (int) f17;
            }
            if (layoutParams8 != null) {
                layoutParams8.height = z3Var.Q1 - i17;
            }
            android.widget.ScrollView k77 = z3Var.k7();
            if (k77 != null) {
                k77.post(new im2.v(z3Var));
            }
        } else {
            if (layoutParams6 != null) {
                layoutParams6.bottomMargin = (int) z3Var.V1;
            }
            if (layoutParams2 != null) {
                layoutParams2.bottomMargin = (int) z3Var.T1;
            }
            if (layoutParams4 != null) {
                layoutParams4.bottomMargin = (int) z3Var.R1;
            }
            if (layoutParams8 != null) {
                layoutParams8.height = z3Var.Q1;
            }
        }
        android.widget.TextView b77 = z3Var.b7();
        android.view.ViewParent parent = b77 != null ? b77.getParent() : null;
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.updateViewLayout(z3Var.b7(), layoutParams2);
            viewGroup.updateViewLayout(z3Var.g7(), layoutParams4);
        }
    }
}
