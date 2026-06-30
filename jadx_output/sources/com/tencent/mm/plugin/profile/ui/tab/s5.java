package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes8.dex */
public final class s5 implements tk.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f154589a;

    public s5(java.lang.ref.WeakReference weakReference) {
        this.f154589a = weakReference;
    }

    @Override // tk.p
    public void a(boolean z17, java.lang.String err_msg, org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.o.g(err_msg, "err_msg");
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetTabBizInfo", "[PhotoAccountGuide] openRegisterPage publishResult: success=" + z17);
        com.tencent.mm.plugin.appbrand.utils.d5.b(new com.tencent.mm.plugin.profile.ui.tab.r5(this.f154589a, this));
    }
}
