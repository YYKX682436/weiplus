package l54;

/* loaded from: classes5.dex */
public class a extends com.tencent.mm.ui.widget.dialog.u3 {
    public a(android.content.Context context, int i17, int i18) {
        super(context, i17, i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(nd1.h.NAME, "com.tencent.mm.plugin.sns.ad.landingpage.dialog.AdProgressDialog");
        android.view.Window window = getWindow();
        if (window != null) {
            window.addFlags(8);
            window.getDecorView().setSystemUiVisibility(4102);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(nd1.h.NAME, "com.tencent.mm.plugin.sns.ad.landingpage.dialog.AdProgressDialog");
    }

    public static com.tencent.mm.ui.widget.dialog.u3 h(android.content.Context context, int i17, android.content.DialogInterface.OnCancelListener onCancelListener) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getProgressDialog", "com.tencent.mm.plugin.sns.ad.landingpage.dialog.AdProgressDialog");
        if (!(context instanceof android.app.Activity)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getProgressDialog", "com.tencent.mm.plugin.sns.ad.landingpage.dialog.AdProgressDialog");
            return null;
        }
        java.lang.String string = i17 > 0 ? context.getString(i17) : "";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("progressDialog", "com.tencent.mm.plugin.sns.ad.landingpage.dialog.AdProgressDialog");
        l54.a aVar = new l54.a(context, com.tencent.mm.R.style.f494791wd, 0);
        if (!android.text.TextUtils.isEmpty(string)) {
            aVar.setMessage(string);
        }
        aVar.setCancelable(true);
        aVar.setOnCancelListener(onCancelListener);
        aVar.setCanceledOnTouchOutside(false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("progressDialog", "com.tencent.mm.plugin.sns.ad.landingpage.dialog.AdProgressDialog");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getProgressDialog", "com.tencent.mm.plugin.sns.ad.landingpage.dialog.AdProgressDialog");
        return aVar;
    }
}
