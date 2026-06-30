package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes8.dex */
public class z0 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.m0 f154708d;

    public z0(com.tencent.mm.plugin.profile.ui.tab.m0 m0Var) {
        this.f154708d = m0Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        int[] iArr = new int[2];
        com.tencent.mm.plugin.profile.ui.tab.m0 m0Var = this.f154708d;
        android.view.View view = m0Var.f154457i;
        view.getLocationOnScreen(iArr);
        int i17 = iArr[1];
        com.tencent.mm.ui.MMActivity mMActivity = m0Var.f154456h;
        int f17 = i65.a.f(mMActivity, com.tencent.mm.R.dimen.a8h);
        int h17 = com.tencent.mm.ui.bl.h(mMActivity);
        int a17 = com.tencent.mm.ui.bl.a(mMActivity);
        if (a17 > 0) {
            f17 = a17;
        }
        if (i17 == 0) {
            f17 += h17;
        }
        if (m0Var.i()) {
            f17 = 0;
        }
        if (f17 == view.getPaddingTop()) {
            return true;
        }
        view.setPadding(view.getPaddingLeft(), f17, view.getPaddingRight(), view.getPaddingBottom());
        return false;
    }
}
