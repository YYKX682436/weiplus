package ri2;

/* loaded from: classes10.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ri2.j f396054d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f396055e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f396056f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f396057g;

    public i(ri2.j jVar, java.lang.Long l17, java.lang.Long l18, boolean z17) {
        this.f396054d = jVar;
        this.f396055e = l17;
        this.f396056f = l18;
        this.f396057g = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jz5.f0 f0Var;
        java.lang.Long l17;
        ri2.j jVar = this.f396054d;
        kotlinx.coroutines.y0 y0Var = jVar.f396059b.f417141d.f417147g;
        if (y0Var != null ? kotlinx.coroutines.z0.h(y0Var) : false) {
            android.view.View view = jVar.f396081x;
            int right = view != null ? view.getRight() : 0;
            int i17 = jVar.f396062e;
            int i18 = right + i17;
            android.view.View view2 = jVar.f396080w;
            java.lang.Integer valueOf = view2 != null ? java.lang.Integer.valueOf(view2.getLeft()) : null;
            com.tencent.mm.view.MMPAGView mMPAGView = jVar.f396073p;
            if ((mMPAGView != null ? mMPAGView.getMeasuredWidth() : 0) > 0) {
                com.tencent.mm.view.MMPAGView mMPAGView2 = jVar.f396073p;
                i17 = mMPAGView2 != null ? mMPAGView2.getMeasuredWidth() : 0;
            }
            android.view.View view3 = jVar.f396058a;
            java.lang.Long l18 = this.f396055e;
            if (l18 != null && (l17 = this.f396056f) != null && view3 != null) {
                long longValue = l17.longValue();
                long longValue2 = l18.longValue();
                long j17 = longValue + longValue2;
                com.tencent.mars.xlog.Log.i(jVar.f396060c, "updateBattleBar: rewardTotal:" + j17 + ", self.wecoinHot:" + longValue2);
                if (j17 == 0) {
                    com.tencent.mm.view.MMPAGView mMPAGView3 = jVar.f396073p;
                    android.view.ViewGroup.LayoutParams layoutParams = mMPAGView3 != null ? mMPAGView3.getLayoutParams() : null;
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
                    if (marginLayoutParams != null) {
                        marginLayoutParams.setMarginStart((((com.tencent.mm.ui.bl.b(view3.getContext()).x / 2) - i17) - 0) + com.tencent.mm.ui.zk.a(view3.getContext(), 8));
                    }
                    android.view.View view4 = jVar.f396065h;
                    android.view.ViewGroup.LayoutParams layoutParams2 = view4 != null ? view4.getLayoutParams() : null;
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
                    if (marginLayoutParams2 != null) {
                        marginLayoutParams2.setMarginStart((com.tencent.mm.ui.bl.b(view3.getContext()).x / 2) - 0);
                    }
                } else {
                    float f17 = (((float) longValue2) / ((float) j17)) * com.tencent.mm.ui.bl.b(view3.getContext()).x;
                    float f18 = i18;
                    if (f17 < f18) {
                        f17 = f18;
                    }
                    float intValue = valueOf != null ? valueOf.intValue() : 0;
                    if (f17 > intValue) {
                        f17 = intValue;
                    }
                    float f19 = f17 - 0;
                    com.tencent.mm.view.MMPAGView mMPAGView4 = jVar.f396073p;
                    android.view.ViewGroup.LayoutParams layoutParams3 = mMPAGView4 != null ? mMPAGView4.getLayoutParams() : null;
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams3 : null;
                    if (marginLayoutParams3 != null) {
                        marginLayoutParams3.setMarginStart((((int) f19) - i17) + com.tencent.mm.ui.zk.a(view3.getContext(), 8));
                    }
                    android.view.View view5 = jVar.f396065h;
                    android.view.ViewGroup.LayoutParams layoutParams4 = view5 != null ? view5.getLayoutParams() : null;
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams4 : null;
                    if (marginLayoutParams4 != null) {
                        marginLayoutParams4.setMarginStart((int) f19);
                    }
                }
                android.view.View view6 = jVar.f396064g;
                if (view6 != null) {
                    view6.requestLayout();
                    f0Var = jz5.f0.f302826a;
                    if (f0Var == null || view3 == null || !this.f396057g) {
                        return;
                    }
                    com.tencent.mm.view.MMPAGView mMPAGView5 = jVar.f396073p;
                    android.view.ViewGroup.LayoutParams layoutParams5 = mMPAGView5 != null ? mMPAGView5.getLayoutParams() : null;
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams5 = layoutParams5 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams5 : null;
                    if (marginLayoutParams5 != null) {
                        marginLayoutParams5.setMarginStart((((com.tencent.mm.ui.bl.b(view3.getContext()).x / 2) - i17) - 0) + com.tencent.mm.ui.zk.a(view3.getContext(), 8));
                    }
                    android.view.View view7 = jVar.f396065h;
                    android.view.ViewGroup.LayoutParams layoutParams6 = view7 != null ? view7.getLayoutParams() : null;
                    kotlin.jvm.internal.o.e(layoutParams6, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ((android.view.ViewGroup.MarginLayoutParams) layoutParams6).setMarginStart((com.tencent.mm.ui.bl.b(view3.getContext()).x / 2) - 0);
                    android.view.View view8 = jVar.f396064g;
                    if (view8 != null) {
                        view8.requestLayout();
                        return;
                    }
                    return;
                }
            }
            f0Var = null;
            if (f0Var == null) {
            }
        }
    }
}
