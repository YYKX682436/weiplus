package l44;

/* loaded from: classes4.dex */
public class d4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f316085d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l44.e4 f316086e;

    public d4(l44.e4 e4Var, android.graphics.Bitmap bitmap) {
        this.f316086e = e4Var;
        this.f316085d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper$4$1");
        android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(this.f316085d);
        l44.e4 e4Var = this.f316086e;
        float f17 = e4Var.f316120e.f2895p0;
        if (f17 <= 0.0f) {
            f17 = i65.a.b(e4Var.f316121f, 20);
        }
        int b17 = i65.a.b(e4Var.f316121f, 4);
        float measureText = b17 + f17 + e4Var.f316122g.getPaint().measureText(e4Var.f316122g.getText().toString());
        com.tencent.mars.xlog.Log.i("BtnIconUpdateHelper", "btn width = " + e4Var.f316123h);
        int i17 = ((int) (((float) e4Var.f316123h) - measureText)) / 2;
        if (i17 < 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper$4$1");
            return;
        }
        com.tencent.mars.xlog.Log.i("BtnIconUpdateHelper", "horizontalPadding = " + i17);
        e4Var.f316122g.setPadding(i17, 0, i17, 0);
        e4Var.f316122g.setIncludeFontPadding(false);
        f3.b.g(bitmapDrawable, android.graphics.Color.parseColor(e4Var.f316120e.I));
        int i18 = (int) f17;
        bitmapDrawable.setBounds(0, 0, i18, i18);
        e4Var.f316122g.setCompoundDrawables(bitmapDrawable, null, null, null);
        e4Var.f316122g.setCompoundDrawablePadding(b17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper$4$1");
    }
}
