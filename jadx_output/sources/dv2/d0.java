package dv2;

/* loaded from: classes2.dex */
public final class d0 extends com.tencent.mm.ui.component.UIComponent implements zy2.f9 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.FinderLikeDrawer f243830d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        com.tencent.mm.plugin.finder.view.FinderLikeDrawer finderLikeDrawer = this.f243830d;
        boolean z17 = false;
        if (finderLikeDrawer != null && finderLikeDrawer.q()) {
            z17 = true;
        }
        if (!z17) {
            return super.onBackPressed();
        }
        com.tencent.mm.plugin.finder.view.FinderLikeDrawer finderLikeDrawer2 = this.f243830d;
        if (finderLikeDrawer2 != null) {
            finderLikeDrawer2.u();
        }
        return true;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        int indexOfChild;
        com.tencent.mm.plugin.finder.view.vc vcVar = com.tencent.mm.plugin.finder.view.FinderLikeDrawer.D;
        com.tencent.mm.plugin.finder.view.FinderLikeDrawer finderLikeDrawer = this.f243830d;
        if (finderLikeDrawer == null) {
            android.app.Activity context = getContext();
            android.app.Activity context2 = getContext();
            kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            android.view.Window window = ((androidx.appcompat.app.AppCompatActivity) context2).getWindow();
            kotlin.jvm.internal.o.f(window, "getWindow(...)");
            com.tencent.mm.plugin.finder.view.FinderLikeDrawer a17 = com.tencent.mm.plugin.finder.view.vc.a(vcVar, context, window, 2, true, false, 16, null);
            this.f243830d = a17;
            a17.setChangeBackgroundAlpha(true);
            com.tencent.mm.plugin.finder.view.FinderLikeDrawer finderLikeDrawer2 = this.f243830d;
            if (finderLikeDrawer2 == null) {
                return;
            }
            finderLikeDrawer2.setBackgroundColorRes(com.tencent.mm.R.color.UN_BW_0_Alpha_0_5);
            return;
        }
        android.app.Activity context3 = getContext();
        kotlin.jvm.internal.o.e(context3, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        android.view.Window window2 = ((androidx.appcompat.app.AppCompatActivity) context3).getWindow();
        if (window2 != null) {
            android.view.View decorView = window2.getDecorView();
            android.widget.FrameLayout frameLayout = decorView instanceof android.widget.FrameLayout ? (android.widget.FrameLayout) decorView : null;
            if (frameLayout == null || (indexOfChild = frameLayout.indexOfChild(finderLikeDrawer)) <= 0 || indexOfChild == frameLayout.getChildCount() - 1) {
                return;
            }
            frameLayout.removeView(finderLikeDrawer);
            frameLayout.addView(finderLikeDrawer);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mm.plugin.finder.view.FinderLikeDrawer finderLikeDrawer = this.f243830d;
        if (finderLikeDrawer != null) {
            finderLikeDrawer.u();
        }
        this.f243830d = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
    }
}
