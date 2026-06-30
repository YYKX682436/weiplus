package x64;

/* loaded from: classes3.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f452273d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f452274e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x64.f f452275f;

    public e(x64.f fVar, int i17, java.lang.String str) {
        this.f452275f = fVar;
        this.f452273d = i17;
        this.f452274e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick$AdCouponHalfScreenPrompt$4");
        try {
            int i17 = this.f452273d;
            java.lang.String str = this.f452274e;
            x64.f fVar = this.f452275f;
            if (i17 == 0) {
                android.content.Context b17 = x64.f.b(fVar);
                if (android.text.TextUtils.isEmpty(str)) {
                    str = x64.f.b(fVar).getString(com.tencent.mm.R.string.j6q);
                }
                db5.t7.h(b17, str);
            } else {
                android.content.Context b18 = x64.f.b(fVar);
                if (android.text.TextUtils.isEmpty(str)) {
                    str = x64.f.b(fVar).getString(com.tencent.mm.R.string.j6p);
                }
                db5.t7.g(b18, str);
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick$AdCouponHalfScreenPrompt$4");
    }
}
