package qn2;

/* loaded from: classes3.dex */
public final class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qn2.v0 f365120d;

    public n0(qn2.v0 v0Var) {
        this.f365120d = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Rect rect = new android.graphics.Rect();
        qn2.v0 v0Var = this.f365120d;
        android.view.View view = v0Var.f365194s;
        if (view != null) {
            view.getHitRect(rect);
        }
        int i17 = -com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479738dv);
        rect.inset(i17, i17);
        android.view.View view2 = v0Var.f365194s;
        java.lang.Object parent = view2 != null ? view2.getParent() : null;
        kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.View");
        ((android.view.View) parent).setTouchDelegate(new android.view.TouchDelegate(rect, v0Var.f365194s));
    }
}
