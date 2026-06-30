package wo2;

/* loaded from: classes2.dex */
public final class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f448084d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wo2.m0 f448085e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f448086f;

    public j0(java.lang.String str, wo2.m0 m0Var, android.view.View view) {
        this.f448084d = str;
        this.f448085e = m0Var;
        this.f448086f = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wo2.q qVar;
        oa.i k17;
        java.lang.String str = this.f448084d;
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        wo2.m0 m0Var = this.f448085e;
        com.google.android.material.tabs.TabLayout R6 = m0Var.R6();
        if (R6 == null || (k17 = R6.k(0)) == null) {
            qVar = null;
        } else {
            java.lang.Object obj = k17.f343778a;
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.nearby.NearbyActionBarUIC.NearbyTab");
            qVar = (wo2.q) obj;
        }
        android.widget.TextView textView = qVar != null ? qVar.f448117c : null;
        if (textView != null) {
            textView.setText(str);
        }
        if (str.length() != 2) {
            int length = (str.length() - 2) * mo0.h.a(m0Var.getActivity(), 15.0f);
            android.view.View view = this.f448086f;
            if (view.getLayoutParams() != null) {
                android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams2 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams;
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).leftMargin -= length;
                view.setLayoutParams(layoutParams2);
            }
        }
    }
}
