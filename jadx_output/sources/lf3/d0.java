package lf3;

/* loaded from: classes3.dex */
public final class d0 extends lf3.n {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        getActivity().getWindow().clearFlags(2048);
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        com.tencent.mm.ui.vas.VASActivity vASActivity = activity instanceof com.tencent.mm.ui.vas.VASActivity ? (com.tencent.mm.ui.vas.VASActivity) activity : null;
        if (vASActivity != null) {
            if (vASActivity.isVASValid()) {
                android.view.Window window = vASActivity.getWindow();
                if (fp.e0.c() || fp.e0.i() || fp.e0.e()) {
                    window.setFlags(134218752, 134218752);
                } else {
                    window.setFlags(134217728, 134217728);
                }
                vASActivity.setActionbarColor(0);
                android.view.View decorView = vASActivity.getWindow().getDecorView();
                kotlin.jvm.internal.o.f(decorView, "getDecorView(...)");
                decorView.getSystemUiVisibility();
                decorView.setSystemUiVisibility(1028);
                androidx.appcompat.app.b supportActionBar = vASActivity.getSupportActionBar();
                kotlin.jvm.internal.o.d(supportActionBar);
                supportActionBar.o();
            } else {
                if (fp.h.c(19)) {
                    vASActivity.getWindow().setFlags(201327616, 201327616);
                } else {
                    vASActivity.getWindow().setFlags(1024, 1024);
                }
                vASActivity.setLightNavigationbarIcon();
            }
            vASActivity.getController().I();
        }
    }
}
