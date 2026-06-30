package com.tencent.mm.plugin.lite.jsapi.comms;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/e7;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class e7 extends com.tencent.mm.plugin.lite.api.p {
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0047, code lost:
    
        r9.f143442e.b("message length reach max count");
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        if (r12.intValue() > 70) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        if (r12.intValue() <= 160) goto L12;
     */
    @Override // jd.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.String r10, org.json.JSONObject r11, boolean r12) {
        /*
            r9 = this;
            java.lang.String r10 = ""
            r12 = 0
            if (r11 == 0) goto Lc
            java.lang.String r0 = "content"
            java.lang.String r0 = r11.optString(r0, r10)
            goto Ld
        Lc:
            r0 = r12
        Ld:
            if (r0 == 0) goto L17
            int r12 = r0.length()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
        L17:
            java.lang.String r1 = "[\\x00-\\x7f]+"
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            java.lang.String r2 = "compile(...)"
            kotlin.jvm.internal.o.f(r1, r2)
            kotlin.jvm.internal.o.d(r0)
            java.util.regex.Matcher r1 = r1.matcher(r0)
            boolean r1 = r1.matches()
            if (r1 == 0) goto L3a
            kotlin.jvm.internal.o.d(r12)
            int r2 = r12.intValue()
            r3 = 160(0xa0, float:2.24E-43)
            if (r2 > r3) goto L47
        L3a:
            if (r1 != 0) goto L4f
            kotlin.jvm.internal.o.d(r12)
            int r12 = r12.intValue()
            r1 = 70
            if (r12 <= r1) goto L4f
        L47:
            jd.c r10 = r9.f143442e
            java.lang.String r11 = "message length reach max count"
            r10.b(r11)
            return
        L4f:
            java.lang.String r12 = "phoneNumber"
            java.lang.String r10 = r11.optString(r12, r10)
            java.lang.String r10 = fp.s0.a(r10)
            android.content.Context r11 = r9.c()
            java.lang.String r12 = "null cannot be cast to non-null type android.app.Activity"
            kotlin.jvm.internal.o.e(r11, r12)
            android.app.Activity r11 = (android.app.Activity) r11
            android.content.Intent r12 = new android.content.Intent
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "smsto:"
            r1.<init>(r2)
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            android.net.Uri r10 = android.net.Uri.parse(r10)
            java.lang.String r1 = "android.intent.action.SENDTO"
            r12.<init>(r1, r10)
            java.lang.String r10 = "sms_body"
            r12.putExtra(r10, r0)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r10.add(r12)
            java.util.Collections.reverse(r10)
            java.lang.Object[] r2 = r10.toArray()
            java.lang.String r3 = "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiSendSms"
            java.lang.String r4 = "invoke"
            java.lang.String r5 = "(Ljava/lang/String;Lorg/json/JSONObject;Z)V"
            java.lang.String r6 = "Undefined"
            java.lang.String r7 = "startActivity"
            java.lang.String r8 = "(Landroid/content/Intent;)V"
            r1 = r11
            yj0.a.d(r1, r2, r3, r4, r5, r6, r7, r8)
            r12 = 0
            java.lang.Object r10 = r10.get(r12)
            android.content.Intent r10 = (android.content.Intent) r10
            r11.startActivity(r10)
            java.lang.String r2 = "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiSendSms"
            java.lang.String r3 = "invoke"
            java.lang.String r4 = "(Ljava/lang/String;Lorg/json/JSONObject;Z)V"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            r1 = r11
            yj0.a.f(r1, r2, r3, r4, r5, r6, r7)
            jd.c r10 = r9.f143442e
            r10.d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.lite.jsapi.comms.e7.a(java.lang.String, org.json.JSONObject, boolean):void");
    }
}
