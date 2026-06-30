package l44;

/* loaded from: classes4.dex */
public class a4 implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f316027d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ab4.u f316028e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f316029f;

    public a4(android.content.Context context, ab4.u uVar, android.widget.Button button) {
        this.f316027d = context;
        this.f316028e = uVar;
        this.f316029f = button;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        android.widget.Button button = this.f316029f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLayoutChange", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper$1");
        try {
            com.tencent.mars.xlog.Log.i("BtnIconUpdateHelper", "after onLayoutChange, then updateBtnIconLogic");
            android.content.Context context = this.f316027d;
            ab4.u uVar = this.f316028e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
            l44.f4.f(context, uVar, button);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
            button.removeOnLayoutChangeListener(this);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("BtnIconUpdateHelper", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLayoutChange", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper$1");
    }
}
