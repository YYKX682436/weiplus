package ja4;

/* loaded from: classes4.dex */
public abstract class d {
    public static android.app.Dialog a(android.content.Context context, android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showTipsDialog", "com.tencent.mm.plugin.sns.lucky.ui.SnsLuckyCommentAlertUI");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.btx, (android.view.ViewGroup) null);
        java.lang.String str = com.tencent.mm.sdk.platformtools.m2.m() ? "font_1.otf" : com.tencent.mm.sdk.platformtools.m2.n() ? "font_2.otf" : null;
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.j7a);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            textView.setTypeface(android.graphics.Typeface.createFromAsset(context.getAssets(), str));
        }
        if (!com.tencent.mm.sdk.platformtools.m2.j()) {
            textView.setTextSize(1, 10.0f);
        }
        sp.b bVar = new sp.b(context, com.tencent.mm.R.style.f494791wd);
        bVar.setContentView(inflate);
        bVar.setTitle((java.lang.CharSequence) null);
        bVar.setOnCancelListener(new ja4.a(bVar));
        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.gso)).setOnClickListener(new ja4.b(bVar, view));
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.oaa);
        int d17 = com.tencent.mm.sdk.platformtools.j.d(context, 10.0f);
        com.tencent.mm.sdk.platformtools.t8.q(findViewById, d17, d17, d17, d17);
        findViewById.setOnClickListener(new ja4.c(bVar));
        bVar.show();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showTipsDialog", "com.tencent.mm.plugin.sns.lucky.ui.SnsLuckyCommentAlertUI");
        return bVar;
    }
}
