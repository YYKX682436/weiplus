package n74;

/* loaded from: classes4.dex */
public class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f335368d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.n f335369e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f335370f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f335371g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f335372h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f335373i;

    public h1(int i17, com.tencent.mm.plugin.sns.storage.n nVar, android.widget.ImageView imageView, int i18, android.widget.ImageView imageView2, int i19) {
        this.f335368d = i17;
        this.f335369e = nVar;
        this.f335370f = imageView;
        this.f335371g = i18;
        this.f335372h = imageView2;
        this.f335373i = i19;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper$1");
        com.tencent.mm.plugin.sns.storage.n nVar = this.f335369e;
        int i17 = nVar.f166074i;
        try {
            boolean isEmpty = android.text.TextUtils.isEmpty(nVar.frontCoverUrl);
            int i18 = this.f335368d;
            android.widget.ImageView imageView = this.f335370f;
            if (isEmpty) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clearCover", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper");
                imageView.setVisibility(4);
                imageView.setImageDrawable(null);
                imageView.setTag(com.tencent.mm.R.id.n1z, "");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clearCover", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper");
            } else {
                a84.m.a(nVar.frontCoverUrl, imageView);
                int i19 = this.f335371g;
                if (i18 >= i19 && i19 > 0) {
                    n74.i1.a(imageView);
                } else if (imageView.getVisibility() != 0) {
                    imageView.setVisibility(0);
                    imageView.hashCode();
                }
            }
            boolean isEmpty2 = android.text.TextUtils.isEmpty(nVar.endCoverUrl);
            android.widget.ImageView imageView2 = this.f335372h;
            if (isEmpty2) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clearCover", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper");
                imageView2.setVisibility(4);
                imageView2.setImageDrawable(null);
                imageView2.setTag(com.tencent.mm.R.id.n1z, "");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clearCover", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper");
            } else {
                a84.m.a(nVar.endCoverUrl, imageView2);
                if (i18 >= this.f335373i) {
                    n74.i1.b(imageView2);
                } else if (imageView2.getVisibility() == 0) {
                    imageView2.setVisibility(4);
                    imageView2.hashCode();
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("FullCardCoverImageHelper", "checkCoverImageState exp=" + e17.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper$1");
    }
}
