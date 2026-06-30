package da4;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f227770a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f227771b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f227772c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f227773d;

    public b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.f227770a = str;
        this.f227771b = str2;
        this.f227772c = str3;
        this.f227773d = str4;
    }

    public final android.content.Intent a() {
        android.net.Uri parse;
        java.lang.String queryParameter;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseIntent", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketIntentNode");
        java.lang.String str = this.f227770a;
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseIntent", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketIntentNode");
            return null;
        }
        android.content.Intent intent = new android.content.Intent();
        java.lang.String str2 = this.f227772c;
        if (android.text.TextUtils.isEmpty(str2)) {
            parse = android.net.Uri.parse(str);
            str2 = parse.getQueryParameter(dm.i4.COL_ID);
            if (android.text.TextUtils.isEmpty(str2)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseIntent", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketIntentNode");
                return null;
            }
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("estimateUri", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketIntentNode");
            parse = android.net.Uri.parse(str);
            if (!android.text.TextUtils.isEmpty(str2)) {
                java.util.Set<java.lang.String> queryParameterNames = parse.getQueryParameterNames();
                if (queryParameterNames == null || queryParameterNames.isEmpty() || !queryParameterNames.contains(dm.i4.COL_ID)) {
                    parse = parse.buildUpon().appendQueryParameter(dm.i4.COL_ID, str2).build();
                } else if (!str2.equals(parse.getQueryParameter(dm.i4.COL_ID))) {
                    android.net.Uri.Builder clearQuery = parse.buildUpon().clearQuery();
                    for (java.lang.String str3 : queryParameterNames) {
                        if (dm.i4.COL_ID.equals(str3)) {
                            clearQuery.appendQueryParameter(dm.i4.COL_ID, str2);
                        } else if (str3 != null && (queryParameter = parse.getQueryParameter(str3)) != null) {
                            clearQuery.appendQueryParameter(str3, queryParameter);
                        }
                    }
                    parse = clearQuery.build();
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("estimateUri", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketIntentNode");
        }
        intent.putExtra("target_app_id", str2);
        intent.setAction("android.intent.action.VIEW");
        intent.setData(parse);
        java.lang.String str4 = this.f227771b;
        if (!android.text.TextUtils.isEmpty(str4)) {
            intent.setPackage(str4);
        }
        java.lang.String str5 = this.f227773d;
        if (!android.text.TextUtils.isEmpty(str5)) {
            intent.putExtra("market_app_name", str5);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseIntent", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketIntentNode");
        return intent;
    }
}
