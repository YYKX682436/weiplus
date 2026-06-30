package dc4;

/* loaded from: classes.dex */
public class a0 implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dc4.d0 f228716a;

    public a0(dc4.d0 d0Var) {
        this.f228716a = d0Var;
    }

    @Override // za4.e0
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem$5");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem$5");
    }

    @Override // za4.e0
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem$5");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem$5");
    }

    @Override // za4.e0
    public void c(java.lang.String str) {
        android.graphics.Bitmap J2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem$5");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && (J2 = com.tencent.mm.sdk.platformtools.x.J(str, null)) != null) {
            dc4.d0 d0Var = this.f228716a;
            android.view.View view = d0Var.A;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/detail/item/CardAdDetailItem$5", "onDownloaded", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/detail/item/CardAdDetailItem$5", "onDownloaded", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.ImageView imageView = (android.widget.ImageView) d0Var.A.findViewById(com.tencent.mm.R.id.n1w);
            imageView.setImageBitmap(J2);
            imageView.setVisibility(0);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem$5");
    }
}
