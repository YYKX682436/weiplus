package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes8.dex */
public final class u6 implements com.tencent.wechat.iam.biz.y0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f154614a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo f154615b;

    public u6(java.lang.ref.WeakReference weakReference, com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo contactWidgetTabBizInfo) {
        this.f154614a = weakReference;
        this.f154615b = contactWidgetTabBizInfo;
    }

    @Override // com.tencent.wechat.iam.biz.y0
    public final void a(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetTabBizInfo", "[PhotoAccountGuide] onPersonalCenterLoginPhotoAccount, biz=" + str);
        com.tencent.mm.plugin.appbrand.utils.d5.b(new com.tencent.mm.plugin.profile.ui.tab.t6(this.f154614a, this.f154615b));
    }
}
