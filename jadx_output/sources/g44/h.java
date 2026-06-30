package g44;

/* loaded from: classes4.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f268827d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.content.Context context) {
        super(0);
        this.f268827d = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderDownloadAppHalfScreenHelper$mScrollContainer$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderDownloadAppHalfScreenHelper$mScrollContainer$2");
        android.content.Context context = this.f268827d;
        kotlin.jvm.internal.o.d(context);
        android.widget.ScrollView scrollView = new android.widget.ScrollView(context);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderDownloadAppHalfScreenHelper$mScrollContainer$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderDownloadAppHalfScreenHelper$mScrollContainer$2");
        return scrollView;
    }
}
