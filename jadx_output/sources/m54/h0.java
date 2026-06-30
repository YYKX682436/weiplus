package m54;

/* loaded from: classes4.dex */
public final class h0 implements com.tencent.mm.ui.tools.c5 {

    /* renamed from: d, reason: collision with root package name */
    public int f324270d;

    @Override // com.tencent.mm.ui.tools.c5
    public void w2(int i17, boolean z17) {
        float f17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onKeyboardHeightChanged", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageKeyboardObserver");
        com.tencent.mars.xlog.Log.i("SnsAd.VangoghPageKeyboardObserver", "the keyboard height is " + i17 + ", the resized is " + z17);
        m54.g0 g0Var = m54.g0.f324268a;
        if (i17 > 100) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toVangoghPageSize", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageKeyboardObserver$Companion");
            float g17 = i65.a.g(com.tencent.mm.sdk.platformtools.x2.f193071a);
            if (g17 > 1.0f) {
                f17 = i17 / g17;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toVangoghPageSize", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageKeyboardObserver$Companion");
            } else {
                f17 = 1.0f * i17;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toVangoghPageSize", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageKeyboardObserver$Companion");
            }
            int i18 = this.f324270d;
            if (i18 == 0) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("publishKeyboardWillShow", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageEventPublisher");
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("keyboardHeight", java.lang.Float.valueOf(f17));
                g0Var.a("onKeyboardWillShow", jSONObject);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("publishKeyboardWillShow", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageEventPublisher");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("publishKeyboardDidShow", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageEventPublisher");
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("keyboardHeight", java.lang.Float.valueOf(f17));
                g0Var.a("onKeyboardDidShow", jSONObject2);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("publishKeyboardDidShow", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageEventPublisher");
            } else if (i18 != i17) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("publishKeyboardWillChangeFrame", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageEventPublisher");
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                jSONObject3.put("keyboardHeight", java.lang.Float.valueOf(f17));
                g0Var.a("onKeyboardWillChangeFrame", jSONObject3);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("publishKeyboardWillChangeFrame", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageEventPublisher");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("publishKeyboardDidChangeFrame", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageEventPublisher");
                org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                jSONObject4.put("keyboardHeight", java.lang.Float.valueOf(f17));
                g0Var.a("onKeyboardDidChangeFrame", jSONObject4);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("publishKeyboardDidChangeFrame", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageEventPublisher");
            }
            this.f324270d = i17;
        } else {
            if (this.f324270d > 0) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("publishKeyboardWillHide", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageEventPublisher");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("publishVangoghPageEvent$default", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageEventPublisher");
                g0Var.a("onKeyboardWillHide", null);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("publishVangoghPageEvent$default", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageEventPublisher");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("publishKeyboardWillHide", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageEventPublisher");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("publishKeyboardDidHide", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageEventPublisher");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("publishVangoghPageEvent$default", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageEventPublisher");
                g0Var.a("onKeyboardDidHide", null);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("publishVangoghPageEvent$default", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageEventPublisher");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("publishKeyboardDidHide", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageEventPublisher");
            }
            this.f324270d = 0;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onKeyboardHeightChanged", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageKeyboardObserver");
    }
}
