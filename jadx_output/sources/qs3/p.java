package qs3;

/* loaded from: classes14.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.radar.ui.RadarMemberView f366373d;

    public p(com.tencent.mm.plugin.radar.ui.RadarMemberView radarMemberView) {
        this.f366373d = radarMemberView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View currentFocus;
        com.tencent.mm.plugin.radar.ui.RadarMemberView radarMemberView = this.f366373d;
        if (radarMemberView.getContext() instanceof android.app.Activity) {
            int i17 = com.tencent.mm.plugin.radar.ui.RadarMemberView.B;
            android.content.Context context = radarMemberView.getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            android.app.Activity activity = (android.app.Activity) context;
            java.lang.Object systemService = activity.getSystemService("input_method");
            android.view.inputmethod.InputMethodManager inputMethodManager = systemService instanceof android.view.inputmethod.InputMethodManager ? (android.view.inputmethod.InputMethodManager) systemService : null;
            if (inputMethodManager == null || (currentFocus = activity.getCurrentFocus()) == null || currentFocus.getWindowToken() == null) {
                return;
            }
            inputMethodManager.toggleSoftInput(0, 2);
        }
    }
}
