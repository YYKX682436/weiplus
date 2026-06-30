package dc4;

/* loaded from: classes4.dex */
public class r0 implements jb4.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dc4.v0 f228813a;

    public r0(dc4.v0 v0Var) {
        this.f228813a = v0Var;
    }

    @Override // jb4.u
    public void a(boolean z17, java.lang.String str, android.graphics.Bitmap bitmap, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFinish", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$2");
        com.tencent.mars.xlog.Log.i("MicroMsg.SphereImageView.SphereCardAdDetailItem", "ImageLoader onFinish, isSucc=" + z17 + ", errInfo=" + str);
        this.f228813a.f228848x.j(bitmap, str2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFinish", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$2");
    }

    @Override // jb4.u
    public void b(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$2");
        com.tencent.mars.xlog.Log.i("MicroMsg.SphereImageView.SphereCardAdDetailItem", "ImageLoader onStart");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$2");
    }
}
