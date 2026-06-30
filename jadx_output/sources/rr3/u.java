package rr3;

/* loaded from: classes3.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rr3.z f399214d;

    public u(rr3.z zVar) {
        this.f399214d = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rr3.z zVar = this.f399214d;
        android.view.ViewGroup.LayoutParams layoutParams = zVar.P6().getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams2 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams;
        android.graphics.Rect rect = new android.graphics.Rect();
        zVar.P6().getGlobalVisibleRect(rect);
        layoutParams2.setMargins(((android.view.ViewGroup.MarginLayoutParams) layoutParams2).leftMargin, ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).topMargin - (rect.bottom - (zVar.getContext().getResources().getDisplayMetrics().heightPixels - i65.a.b(zVar.getContext(), 108))), ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).rightMargin, ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
        zVar.P6().setLayoutParams(layoutParams2);
        com.tencent.mars.xlog.Log.i("NewBizInfoAuthScopeUIC", "adjust btn pos, margin top = " + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).topMargin);
    }
}
