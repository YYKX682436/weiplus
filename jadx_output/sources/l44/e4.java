package l44;

/* loaded from: classes4.dex */
public class e4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316119d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ab4.u f316120e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f316121f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f316122g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f316123h;

    public e4(java.lang.String str, ab4.u uVar, android.content.Context context, android.widget.Button button, int i17) {
        this.f316119d = str;
        this.f316120e = uVar;
        this.f316121f = context;
        this.f316122g = button;
        this.f316123h = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper$4");
        android.graphics.Bitmap J2 = com.tencent.mm.sdk.platformtools.x.J(this.f316119d, null);
        if (J2 == null) {
            com.tencent.mars.xlog.Log.e("BtnIconUpdateHelper", "onDownloaded, bitmap == null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper$4");
        } else {
            ((ku5.t0) ku5.t0.f312615d).B(new l44.d4(this, J2));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper$4");
        }
    }
}
