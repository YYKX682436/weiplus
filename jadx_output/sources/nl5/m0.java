package nl5;

/* loaded from: classes15.dex */
public final class m0 implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nl5.s0 f338328d;

    public m0(nl5.s0 s0Var) {
        this.f338328d = s0Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        nl5.s0 s0Var = this.f338328d;
        int f17 = s0Var.f();
        s0Var.getClass();
        if (f17 > 0) {
            int[] iArr = s0Var.I;
            int[] iArr2 = {iArr[0], iArr[1]};
            s0Var.f338357h.getLocationInWindow(iArr);
            com.tencent.mm.ui.yk.a("SelectableEditTextHelper", "LayoutChangeFromWindow l:%d,t:%d,r:%d,b:%d,oldl:%d,oldt:%d,oldr:%d,oldb:%d,oldx:%d, newx:%d, oldy:%d, newy:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(i38), java.lang.Integer.valueOf(iArr2[0]), java.lang.Integer.valueOf(s0Var.I[0]), java.lang.Integer.valueOf(iArr2[1]), java.lang.Integer.valueOf(s0Var.I[1]));
            if (i18 == i29 && i27 == i38 && iArr2[1] == s0Var.I[1]) {
                return;
            }
            s0Var.a();
        }
    }
}
