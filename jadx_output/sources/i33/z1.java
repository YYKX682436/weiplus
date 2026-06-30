package i33;

/* loaded from: classes10.dex */
public final class z1 extends i33.c {

    /* renamed from: f, reason: collision with root package name */
    public android.view.Window f288302f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // i33.c
    public void V6(com.tencent.mm.ui.q2 oldMode, com.tencent.mm.ui.q2 newMode) {
        android.view.Window window;
        kotlin.jvm.internal.o.g(oldMode, "oldMode");
        kotlin.jvm.internal.o.g(newMode, "newMode");
        super.V6(oldMode, newMode);
        if (oldMode != newMode) {
            if (newMode == com.tencent.mm.ui.q2.FULL_SCREEN_FOCUS) {
                android.view.Window window2 = this.f288302f;
                if (window2 != null) {
                    window2.addFlags(1024);
                    return;
                }
                return;
            }
            if (newMode != com.tencent.mm.ui.q2.NORMAL || (window = this.f288302f) == null) {
                return;
            }
            window.clearFlags(1024);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        android.widget.FrameLayout.LayoutParams layoutParams;
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        i33.z0 z0Var = (i33.z0) pf5.z.f353948a.a(activity).e(i33.z0.class);
        if (z0Var != null) {
            i33.z0.Y6(z0Var, this, 0, 2, null);
        }
        int h17 = com.tencent.mm.ui.bl.h(getContext());
        com.tencent.mars.xlog.Log.i(pf5.o.TAG, "MediaTabAlbumWindowUIC statusBarHeight=" + h17);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.hvf);
        if (com.tencent.mm.ui.b4.c(getContext())) {
            if (findViewById != null) {
                android.view.ViewGroup.LayoutParams layoutParams2 = findViewById.getLayoutParams();
                layoutParams = layoutParams2 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams2 : null;
                if (layoutParams != null) {
                    layoutParams.topMargin = h17;
                }
                findViewById.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        if (findViewById != null) {
            findViewById.setPadding(0, h17, 0, 0);
            android.view.ViewGroup.LayoutParams layoutParams3 = findViewById.getLayoutParams();
            layoutParams = layoutParams3 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams3 : null;
            if (layoutParams != null) {
                int i17 = layoutParams.height;
                if (i17 <= 0) {
                    i17 = i65.a.f(findViewById.getContext(), com.tencent.mm.R.dimen.f479623ay);
                }
                layoutParams.height = i17 + h17;
            }
            findViewById.setLayoutParams(layoutParams);
        }
    }
}
