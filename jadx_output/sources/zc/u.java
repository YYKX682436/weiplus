package zc;

/* loaded from: classes15.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.WxaLiteAppWidgetAdapter f471372d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.tencent.liteapp.WxaLiteAppWidgetAdapter wxaLiteAppWidgetAdapter) {
        super(1);
        this.f471372d = wxaLiteAppWidgetAdapter;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.Window window;
        android.view.View decorView;
        android.view.Window window2;
        android.view.View decorView2;
        android.view.Window window3;
        android.view.View decorView3;
        android.view.Window window4;
        android.view.View decorView4;
        android.content.res.Configuration it = (android.content.res.Configuration) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.liteapp.WxaLiteAppWidgetAdapter wxaLiteAppWidgetAdapter = this.f471372d;
        wxaLiteAppWidgetAdapter.getClass();
        boolean isCurrentDarkMode = com.tencent.mm.plugin.lite.LiteAppCenter.isCurrentDarkMode();
        if (isCurrentDarkMode != wxaLiteAppWidgetAdapter.A) {
            kd.c.c("LiteApp.WxaLiteAppWidgetAdapter", "DarkMode change %b", java.lang.Boolean.valueOf(isCurrentDarkMode));
            wxaLiteAppWidgetAdapter.A = isCurrentDarkMode;
            com.tencent.mm.plugin.lite.LiteAppCenter.updateDarkMode(isCurrentDarkMode);
        }
        int i17 = it.orientation;
        android.app.Activity activity = wxaLiteAppWidgetAdapter.f45975q;
        int i18 = 0;
        if (i17 == 2 && !wxaLiteAppWidgetAdapter.f45984z) {
            wxaLiteAppWidgetAdapter.f45984z = true;
            wxaLiteAppWidgetAdapter.e();
            int i19 = wxaLiteAppWidgetAdapter.F;
            if (i19 != 2 && i19 != 4) {
                if (activity != null && (window4 = activity.getWindow()) != null && (decorView4 = window4.getDecorView()) != null) {
                    i18 = decorView4.getSystemUiVisibility();
                }
                int i27 = i18 | 4100;
                if (activity != null && (window3 = activity.getWindow()) != null && (decorView3 = window3.getDecorView()) != null) {
                    decorView3.setSystemUiVisibility(i27);
                }
            }
        } else if (i17 == 1 && wxaLiteAppWidgetAdapter.f45984z) {
            wxaLiteAppWidgetAdapter.f45984z = false;
            wxaLiteAppWidgetAdapter.e();
            int i28 = wxaLiteAppWidgetAdapter.F;
            if (i28 != 2 && i28 != 4) {
                if (activity != null && (window2 = activity.getWindow()) != null && (decorView2 = window2.getDecorView()) != null) {
                    i18 = decorView2.getSystemUiVisibility();
                }
                int i29 = i18 & (-4101);
                if (activity != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                    decorView.setSystemUiVisibility(i29);
                }
            }
        } else {
            float f17 = it.fontScale;
            if (!(f17 == wxaLiteAppWidgetAdapter.B) && com.tencent.mm.plugin.lite.LiteAppCenter.fontScaleFollowSystem) {
                kd.c.c("LiteApp.WxaLiteAppWidgetAdapter", "fontScale change %b", java.lang.Float.valueOf(f17));
                float f18 = it.fontScale;
                wxaLiteAppWidgetAdapter.B = f18;
                com.tencent.mm.plugin.lite.LiteAppCenter.updateFontScale(f18);
            }
        }
        return jz5.f0.f302826a;
    }
}
