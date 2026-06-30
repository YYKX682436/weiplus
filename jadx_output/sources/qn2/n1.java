package qn2;

/* loaded from: classes3.dex */
public final class n1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qn2.u1 f365121d;

    public n1(qn2.u1 u1Var) {
        this.f365121d = u1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Rect rect = new android.graphics.Rect();
        qn2.u1 u1Var = this.f365121d;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = u1Var.f365167f;
        if (weImageView != null) {
            weImageView.getHitRect(rect);
        }
        int i17 = -com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479688cn);
        rect.inset(i17, i17);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = u1Var.f365167f;
        java.lang.Object parent = weImageView2 != null ? weImageView2.getParent() : null;
        kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.View");
        ((android.view.View) parent).setTouchDelegate(new android.view.TouchDelegate(rect, u1Var.f365167f));
    }
}
