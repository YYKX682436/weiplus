package h54;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final zg0.v2 f279083a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f279084b;

    /* renamed from: c, reason: collision with root package name */
    public final m54.l f279085c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f279086d;

    /* renamed from: e, reason: collision with root package name */
    public final h54.a f279087e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.ref.WeakReference f279088f;

    public d(zg0.v2 jsApiHandler, java.lang.String jsCallbackId, m54.l lVar, java.lang.String url, android.content.Context context, h54.a formData) {
        kotlin.jvm.internal.o.g(jsApiHandler, "jsApiHandler");
        kotlin.jvm.internal.o.g(jsCallbackId, "jsCallbackId");
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(formData, "formData");
        this.f279083a = jsApiHandler;
        this.f279084b = jsCallbackId;
        this.f279085c = lVar;
        this.f279086d = url;
        this.f279087e = formData;
        this.f279088f = new java.lang.ref.WeakReference(context);
    }

    public final void a(java.lang.String msg, java.util.Map value) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callbackToJs", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormJsApiContext");
        kotlin.jvm.internal.o.g(msg, "msg");
        kotlin.jvm.internal.o.g(value, "value");
        if (kotlin.jvm.internal.o.b(android.os.Looper.getMainLooper(), android.os.Looper.myLooper())) {
            f(msg, value);
        } else {
            ((ku5.t0) ku5.t0.f312615d).B(new h54.c(this, msg, value));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callbackToJs", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormJsApiContext");
    }

    public final java.lang.String b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCallbackId", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormJsApiContext");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCallbackId", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormJsApiContext");
        return this.f279084b;
    }

    public final android.content.Context c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContext", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormJsApiContext");
        android.content.Context context = (android.content.Context) this.f279088f.get();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContext", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormJsApiContext");
        return context;
    }

    public final h54.a d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFormData", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormJsApiContext");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFormData", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormJsApiContext");
        return this.f279087e;
    }

    public final m54.l e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPageParam", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormJsApiContext");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPageParam", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormJsApiContext");
        return this.f279085c;
    }

    public final void f(java.lang.String str, java.util.Map map) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toJs", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormJsApiContext");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            ((nw4.n) this.f279083a).O(this.f279084b, str, map, true);
            kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toJs", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormJsApiContext");
    }
}
