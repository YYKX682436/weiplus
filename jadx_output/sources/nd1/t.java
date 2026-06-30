package nd1;

/* loaded from: classes7.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.page.JsApiNavigateToWC$LaunchArgs f336396d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f336397e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.tencent.mm.plugin.appbrand.jsapi.page.JsApiNavigateToWC$LaunchArgs jsApiNavigateToWC$LaunchArgs, com.tencent.mm.ipcinvoker.r rVar) {
        super(0);
        this.f336396d = jsApiNavigateToWC$LaunchArgs;
        this.f336397e = rVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.ref.WeakReference k17 = com.tencent.mm.app.w.k();
        android.app.Activity activity = k17 != null ? (android.app.Activity) k17.get() : null;
        android.app.Activity activity2 = (android.app.Activity) com.tencent.mm.app.w.INSTANCE.f53886h.get();
        android.content.Context context = activity != null ? activity : activity2 != null ? activity2 : com.tencent.mm.sdk.platformtools.x2.f193071a;
        com.tencent.mars.xlog.Log.w("MicroMsg.JsApiNavigateToWC", "halfRestartAppBrandImpl ipc topActivity=" + activity + ", foregroundActivity=" + activity2);
        nd1.s sVar = nd1.c0.f336273g;
        kotlin.jvm.internal.o.d(context);
        nd1.s.a(sVar, context, this.f336396d);
        com.tencent.mm.ipcinvoker.r rVar = this.f336397e;
        if (rVar != null) {
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(true));
        }
        return jz5.f0.f302826a;
    }
}
