package ed4;

/* loaded from: classes4.dex */
public class s implements jb4.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.item.q0 f251323a;

    public s(com.tencent.mm.plugin.sns.ui.item.q0 q0Var) {
        this.f251323a = q0Var;
    }

    @Override // jb4.u
    public void a(boolean z17, java.lang.String str, android.graphics.Bitmap bitmap, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFinish", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$2");
        com.tencent.mars.xlog.Log.i("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "ImageLoader onFinish, isSucc=" + z17 + ", errInfo=" + str);
        com.tencent.mm.plugin.sns.ui.item.q0 q0Var = this.f251323a;
        if (q0Var.f169408s == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "onFinish, mViewHolder==null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFinish", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$2");
            return;
        }
        com.tencent.mm.plugin.sns.storage.p pVar = q0Var.f169407r;
        java.lang.String str3 = pVar != null ? pVar.f166095g : "";
        if (str2 == null || !str2.equals(str3)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "onFinish, url != nowUrl");
        } else {
            q0Var.f169408s.G0.j(bitmap, str2);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFinish", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$2");
    }

    @Override // jb4.u
    public void b(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$2");
    }
}
