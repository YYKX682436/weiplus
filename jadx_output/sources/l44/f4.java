package l44;

/* loaded from: classes4.dex */
public abstract class f4 {
    public static void a(android.content.Context context, android.widget.Button button, float f17, ab4.u uVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("adjustFloatBarIconBtn", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
        if (button == null || uVar == null) {
            com.tencent.mars.xlog.Log.e("BtnIconUpdateHelper", "adjustFloatBarIconBtn, but btn or btnInfo is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustFloatBarIconBtn", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
            return;
        }
        float f18 = uVar.f2895p0;
        if (f18 <= 0.0f) {
            f18 = i65.a.b(context, 20);
        }
        float b17 = f18 + i65.a.b(context, 4) + button.getPaint().measureText(button.getText().toString());
        com.tencent.mars.xlog.Log.i("BtnIconUpdateHelper", "btn width = " + f17);
        int i17 = ((int) (f17 - b17)) / 2;
        if (i17 < 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustFloatBarIconBtn", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
            return;
        }
        com.tencent.mars.xlog.Log.i("BtnIconUpdateHelper", "horizontalPadding = " + i17);
        button.setPadding(i17, 0, i17, 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustFloatBarIconBtn", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
    }

    public static boolean b(android.content.Context context, ab4.u uVar, android.widget.Button button) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkCanUpdateIcon", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
        if (context == null || uVar == null || button == null) {
            com.tencent.mars.xlog.Log.e("BtnIconUpdateHelper", "context or btnInfo or btn is null ");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkCanUpdateIcon", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
            return false;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(uVar.Z)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkCanUpdateIcon", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
            return false;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.J0(button.getText())) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkCanUpdateIcon", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
            return true;
        }
        com.tencent.mars.xlog.Log.e("BtnIconUpdateHelper", "btnText is null ");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkCanUpdateIcon", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
        return false;
    }

    public static void c(android.content.Context context, ab4.u uVar, android.widget.Button button, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBtnIcon", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
        android.graphics.Bitmap J2 = com.tencent.mm.sdk.platformtools.x.J(str, null);
        if (J2 == null) {
            com.tencent.mars.xlog.Log.e("BtnIconUpdateHelper", "onDownloaded, bitmap == null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBtnIcon", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
            return;
        }
        android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(J2);
        float f17 = uVar.f2895p0;
        if (f17 <= 0.0f) {
            f17 = i65.a.b(context, 20);
        }
        int b17 = i65.a.b(context, 4);
        float measureText = b17 + f17 + button.getPaint().measureText(button.getText().toString());
        float width = button.getWidth();
        com.tencent.mars.xlog.Log.i("BtnIconUpdateHelper", "btn width = " + width);
        int i17 = ((int) (width - measureText)) / 2;
        if (i17 < 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBtnIcon", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
            return;
        }
        com.tencent.mars.xlog.Log.i("BtnIconUpdateHelper", "horizontalPadding = " + i17);
        button.setPadding(i17, 0, i17, 0);
        button.setIncludeFontPadding(false);
        f3.b.g(bitmapDrawable, android.graphics.Color.parseColor(uVar.I));
        int i18 = (int) f17;
        bitmapDrawable.setBounds(0, 0, i18, i18);
        button.setCompoundDrawables(bitmapDrawable, null, null, null);
        button.setCompoundDrawablePadding(b17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBtnIcon", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
    }

    public static void d(android.content.Context context, ab4.u uVar, android.widget.Button button, java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBtnIcon", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
        ((ku5.t0) ku5.t0.f312615d).g(new l44.e4(str, uVar, context, button, i17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBtnIcon", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
    }

    public static void e(android.content.Context context, ab4.u uVar, android.widget.Button button) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateBtnIcon", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
        try {
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("BtnIconUpdateHelper", th6.toString());
        }
        if (!b(context, uVar, button)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateBtnIcon", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
            return;
        }
        if (button.getWidth() <= 0) {
            button.addOnLayoutChangeListener(new l44.a4(context, uVar, button));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateBtnIcon", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
        } else {
            com.tencent.mars.xlog.Log.i("BtnIconUpdateHelper", "already onLayoutChange, then updateBtnIconLogic");
            f(context, uVar, button);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateBtnIcon", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
        }
    }

    public static void f(android.content.Context context, ab4.u uVar, android.widget.Button button) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateBtnIconLogic", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
        java.lang.String l17 = za4.t0.l("adId", uVar.Z);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(l17) && com.tencent.mm.vfs.w6.j(l17)) {
            com.tencent.mars.xlog.Log.i("BtnIconUpdateHelper", "icon exists, url = " + uVar.Z);
            c(context, uVar, button, l17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateBtnIconLogic", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("loadImage", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
        java.lang.String str = uVar.Z;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadImage", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
        } else {
            button.hashCode();
            button.setTag(com.tencent.mm.R.id.n1z, str);
            za4.t0.b("adId", str, false, 41, 0, new l44.b4(button, str, context, uVar));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadImage", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateBtnIconLogic", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
    }
}
