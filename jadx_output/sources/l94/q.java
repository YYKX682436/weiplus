package l94;

/* loaded from: classes4.dex */
public final class q extends l94.e {

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f317387h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(android.content.Context context) {
        super("WsFoldSingleImageAdComponent", context);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // l94.e
    public void j(h94.a adInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBindData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldImageAdComponent");
        kotlin.jvm.internal.o.g(adInfo, "adInfo");
        r45.d43 b17 = adInfo.b();
        if (b17 == null) {
            com.tencent.mars.xlog.Log.i(h(), "the fold sns info is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBindData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldImageAdComponent");
            return;
        }
        android.widget.ImageView imageView = this.f317387h;
        if (imageView == null) {
            com.tencent.mars.xlog.Log.e(h(), "the image view is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBindData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldImageAdComponent");
            return;
        }
        java.util.LinkedList media_info = b17.f372071d;
        kotlin.jvm.internal.o.f(media_info, "media_info");
        if (!media_info.isEmpty()) {
            r45.d96 d96Var = ((r45.i96) media_info.get(0)).f376852d;
            a84.m.a(d96Var != null ? d96Var.f372253d : null, imageView);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBindData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldImageAdComponent");
    }

    @Override // l94.e
    public android.view.View k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBuildView", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldImageAdComponent");
        android.widget.ImageView imageView = new android.widget.ImageView(f());
        c44.a.l();
        if (imageView.getLayoutParams() == null) {
            c44.a.o();
            imageView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.width = -1;
            imageView.setLayoutParams(layoutParams);
        }
        c44.a.l();
        if (imageView.getLayoutParams() == null) {
            c44.a.o();
            imageView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -1));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
            layoutParams2.height = -1;
            imageView.setLayoutParams(layoutParams2);
        }
        this.f317387h = imageView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBuildView", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldImageAdComponent");
        return imageView;
    }
}
