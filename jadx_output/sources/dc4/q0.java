package dc4;

/* loaded from: classes4.dex */
public class q0 implements jb4.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f228809a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f228810b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dc4.v0 f228811c;

    public q0(dc4.v0 v0Var, java.lang.String str, java.lang.String str2) {
        this.f228811c = v0Var;
        this.f228809a = str;
        this.f228810b = str2;
    }

    @Override // jb4.u
    public void a(boolean z17, java.lang.String str, android.graphics.Bitmap bitmap, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFinish", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$1");
        if (str2 == null || !str2.equals(this.f228809a)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFinish", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$1");
            return;
        }
        dc4.v0 v0Var = this.f228811c;
        if (bitmap != null) {
            dc4.v0.l(v0Var).setImageBitmap(bitmap);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.SphereImageView.SphereCardAdDetailItem", "show progressView");
            dc4.v0.m(v0Var).setVisibility(0);
            dc4.v0.m(v0Var).a();
            java.lang.String str3 = this.f228810b;
            if (android.text.TextUtils.isEmpty(str3)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SphereImageView.SphereCardAdDetailItem", "thumbUrl is empty");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.SphereImageView.SphereCardAdDetailItem", "have no shot and thumb cache, start download thumb image");
                za4.t0.c(str3, false, 133, 0, new dc4.p0(this));
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFinish", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$1");
    }

    @Override // jb4.u
    public void b(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$1");
    }
}
