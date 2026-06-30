package ed4;

/* loaded from: classes4.dex */
public class r implements b94.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.item.m0 f251322a;

    public r(com.tencent.mm.plugin.sns.ui.item.m0 m0Var) {
        this.f251322a = m0Var;
    }

    @Override // b94.d
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onShake", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem$4");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem");
        com.tencent.mm.plugin.sns.ui.item.m0 m0Var = this.f251322a;
        m0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doOnShake", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem");
        int i17 = 0;
        while (true) {
            try {
                if (i17 >= com.tencent.mm.plugin.sns.ui.tm.f170529d[2]) {
                    break;
                }
                com.tencent.mm.plugin.sns.ui.MaskImageView imageView = ((com.tencent.mm.plugin.sns.ui.MaskImageWithLivePhotoTagView) m0Var.f169388y.T.findViewById(com.tencent.mm.plugin.sns.ui.tm.f170533h[i17])).getImageView();
                if (imageView != null) {
                    com.tencent.mars.xlog.Log.i("MiroMsg.PhotoTimeLineItem", "doOnShake, succ");
                    imageView.performClick();
                    break;
                }
                i17++;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MiroMsg.PhotoTimeLineItem", "doOnShake, exp=" + e17);
                ca4.q.c("doOnShake, photoAdItem", e17);
            }
        }
        com.tencent.mars.xlog.Log.w("MiroMsg.PhotoTimeLineItem", "doOnShake, failed");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doOnShake", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onShake", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem$4");
    }
}
