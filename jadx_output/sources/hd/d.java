package hd;

/* loaded from: classes9.dex */
public final class d implements q80.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f280372a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.framework.dynamic_module.thirdpay.YunShanFuPayService$startYunShanFuPay$observer$1 f280373b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hd.e f280374c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f280375d;

    public d(android.content.Context context, com.tencent.liteapp.framework.dynamic_module.thirdpay.YunShanFuPayService$startYunShanFuPay$observer$1 yunShanFuPayService$startYunShanFuPay$observer$1, hd.e eVar, yz5.p pVar) {
        this.f280372a = context;
        this.f280373b = yunShanFuPayService$startYunShanFuPay$observer$1;
        this.f280374c = eVar;
        this.f280375d = pVar;
    }

    @Override // q80.x
    public final void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WeixinPayService.YunShanFuPayService", "onActivityResult: " + i17 + ", " + i18);
        if (i17 == 10) {
            java.lang.Object obj = this.f280372a;
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.feature.lite.api.ILiteAppFeatureService.ISetOnActivityResult");
            java.lang.String str = null;
            ((q80.z) obj).R1(null);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
            ((androidx.lifecycle.y) obj).mo133getLifecycle().c(this.f280373b);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.putOpt("ret_scene", 0);
            this.f280374c.f280376a = true;
            yz5.p pVar = this.f280375d;
            if (intent == null) {
                jSONObject.putOpt("ret", 2);
                pVar.invoke(dd.d.f228871a.i(jSONObject, "ok"), java.lang.Boolean.FALSE);
                return;
            }
            android.os.Bundle extras = intent.getExtras();
            kotlin.jvm.internal.o.d(extras);
            java.lang.String string = extras.getString("pay_result");
            if (string != null) {
                java.util.Locale locale = java.util.Locale.getDefault();
                kotlin.jvm.internal.o.f(locale, "getDefault(...)");
                str = string.toLowerCase(locale);
                kotlin.jvm.internal.o.f(str, "toLowerCase(...)");
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WeixinPayService.YunShanFuPayService", "pay result: " + str);
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != -1867169789) {
                    if (hashCode != -1367724422) {
                        if (hashCode == 3135262 && str.equals("fail")) {
                            jSONObject.putOpt("ret", 1);
                        }
                    } else if (str.equals("cancel")) {
                        jSONObject.putOpt("ret", 2);
                    }
                } else if (str.equals(ya.b.SUCCESS)) {
                    jSONObject.putOpt("ret", 0);
                }
                pVar.invoke(dd.d.f228871a.i(jSONObject, "ok"), java.lang.Boolean.FALSE);
            }
            jSONObject.putOpt("ret", 2);
            pVar.invoke(dd.d.f228871a.i(jSONObject, "ok"), java.lang.Boolean.FALSE);
        }
    }
}
