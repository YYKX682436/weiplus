package dc4;

/* loaded from: classes4.dex */
public abstract class v {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.TimeLineObject f228831d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f228832e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f228833f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f228834g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.g9 f228835h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f228836i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f228837m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.listener.i f228838n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f228839o = false;

    public abstract void c(android.view.View view, android.view.View view2);

    public void e(android.content.res.Configuration configuration) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.detail.item.BaseAdDetailItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.detail.item.BaseAdDetailItem");
    }

    public void g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.detail.item.BaseAdDetailItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.detail.item.BaseAdDetailItem");
    }

    public void h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrollIdle", "com.tencent.mm.plugin.sns.ui.detail.item.BaseAdDetailItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrollIdle", "com.tencent.mm.plugin.sns.ui.detail.item.BaseAdDetailItem");
    }

    public void i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ui.detail.item.BaseAdDetailItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ui.detail.item.BaseAdDetailItem");
    }

    public abstract void j();

    public com.tencent.mm.plugin.sns.storage.SnsInfo k(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetSnsInfoLikeFlag", "com.tencent.mm.plugin.sns.ui.detail.item.BaseAdDetailItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetSnsInfoLikeFlag", "com.tencent.mm.plugin.sns.ui.detail.item.BaseAdDetailItem");
        return snsInfo;
    }
}
