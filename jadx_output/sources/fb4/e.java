package fb4;

/* loaded from: classes11.dex */
public abstract class e {
    public static final void a(android.content.Context context, java.lang.String callbackId, org.json.JSONObject paramsJson, eb4.k callbackInterface) {
        java.lang.String str;
        java.lang.String str2;
        java.util.ArrayList arrayList;
        java.lang.String str3;
        java.util.ArrayList arrayList2;
        java.lang.Object obj;
        java.util.ArrayList arrayList3;
        int i17;
        java.util.ArrayList arrayList4;
        kb4.c cVar;
        java.lang.Object obj2;
        java.util.Iterator it;
        boolean z17;
        java.lang.String str4 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.wheelpicker.WheelPickerCaller";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleOpenWheelPicker", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.wheelpicker.WheelPickerCaller");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(callbackId, "callbackId");
        kotlin.jvm.internal.o.g(paramsJson, "paramsJson");
        kotlin.jvm.internal.o.g(callbackInterface, "callbackInterface");
        if (!(context instanceof android.app.Activity)) {
            com.tencent.mars.xlog.Log.w("WheelPickerCaller", "handleOpenWheelPicker error");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleOpenWheelPicker", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.wheelpicker.WheelPickerCaller");
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(paramsJson.optString("pickerParams"));
            java.lang.String optString = jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            if (optString == null) {
                optString = "";
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseJson", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.wheelpicker.JsDataMapper");
            int optInt = jSONObject.optInt("deep");
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("default");
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.lang.String str5 = "k";
            if (optJSONArray != null) {
                arrayList = arrayList5;
                int length = optJSONArray.length();
                str = "handleOpenWheelPicker";
                int i18 = 0;
                while (i18 < length) {
                    int i19 = length;
                    org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i18);
                    org.json.JSONArray jSONArray = optJSONArray;
                    java.lang.String optString2 = optJSONObject != null ? optJSONObject.optString("k") : null;
                    java.lang.String str6 = str4;
                    java.lang.String str7 = optString2 == null ? "" : optString2;
                    java.lang.String optString3 = optJSONObject != null ? optJSONObject.optString(org.chromium.base.BaseSwitches.V) : null;
                    if (optString3 == null) {
                        optString3 = "";
                    }
                    arrayList6.add(new kb4.d(str7, optString3));
                    i18++;
                    length = i19;
                    optJSONArray = jSONArray;
                    str4 = str6;
                }
                str2 = str4;
            } else {
                str = "handleOpenWheelPicker";
                str2 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.wheelpicker.WheelPickerCaller";
                arrayList = arrayList5;
            }
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            org.json.JSONArray optJSONArray2 = jSONObject.optJSONArray("transferTable");
            if (optJSONArray2 != null) {
                int length2 = optJSONArray2.length();
                int i27 = 0;
                while (i27 < length2) {
                    int i28 = length2;
                    org.json.JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i27);
                    java.lang.String optString4 = optJSONObject2.optString(str5);
                    org.json.JSONArray jSONArray2 = optJSONArray2;
                    java.lang.String str8 = optString4 == null ? "" : optString4;
                    java.lang.String optString5 = optJSONObject2.optString(org.chromium.base.BaseSwitches.V);
                    kotlin.jvm.internal.o.f(optString5, "optString(...)");
                    linkedHashMap.put(str8, optString5);
                    i27++;
                    length2 = i28;
                    str5 = str5;
                    optJSONArray2 = jSONArray2;
                }
            }
            org.json.JSONArray optJSONArray3 = jSONObject.optJSONArray(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            kb4.c cVar2 = new kb4.c("root", "root", arrayList7, null);
            if (optJSONArray3 != null) {
                obj = null;
                arrayList2 = arrayList6;
                str3 = optString;
                i17 = 0;
                arrayList3 = arrayList;
                fb4.b.f260873a.a(optJSONArray3, arrayList7, cVar2, 0, optInt, linkedHashMap);
            } else {
                str3 = optString;
                arrayList2 = arrayList6;
                obj = null;
                arrayList3 = arrayList;
                i17 = 0;
            }
            int i29 = i17;
            kb4.c cVar3 = cVar2;
            while (i29 < optInt) {
                java.util.List a17 = cVar3.a();
                if (a17 != null) {
                    java.util.Iterator it6 = a17.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            arrayList4 = arrayList2;
                            cVar = cVar3;
                            obj2 = obj;
                            break;
                        }
                        obj2 = it6.next();
                        kb4.c cVar4 = (kb4.c) obj2;
                        if (arrayList2.size() > i29) {
                            java.lang.String b17 = cVar4.b();
                            arrayList4 = arrayList2;
                            kb4.d dVar = (kb4.d) arrayList4.get(i29);
                            dVar.getClass();
                            cVar = cVar3;
                            it = it6;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getKey", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.PickItem");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getKey", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.PickItem");
                            z17 = kotlin.jvm.internal.o.b(b17, dVar.f306244a);
                        } else {
                            arrayList4 = arrayList2;
                            cVar = cVar3;
                            it = it6;
                            z17 = false;
                        }
                        if (z17) {
                            break;
                        }
                        cVar3 = cVar;
                        arrayList2 = arrayList4;
                        it6 = it;
                    }
                    kb4.c cVar5 = (kb4.c) obj2;
                    if (cVar5 != null) {
                        arrayList3.add(cVar5);
                        cVar3 = cVar5;
                        i29++;
                        arrayList2 = arrayList4;
                    }
                } else {
                    arrayList4 = arrayList2;
                    cVar = cVar3;
                }
                cVar3 = cVar;
                i29++;
                arrayList2 = arrayList4;
            }
            fb4.a aVar = new fb4.a(optInt, cVar2, arrayList3);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseJson", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.wheelpicker.JsDataMapper");
            lb4.c cVar6 = new lb4.c(context, aVar);
            com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(context, 1, 2);
            z2Var.m(context.getString(com.tencent.mm.R.string.f490347sg), context.getString(com.tencent.mm.R.string.f490507x1));
            z2Var.o(0);
            fb4.c cVar7 = new fb4.c(callbackInterface, callbackId, z2Var);
            fb4.d dVar2 = new fb4.d(cVar6, callbackInterface, callbackId, z2Var);
            z2Var.D = cVar7;
            z2Var.E = dVar2;
            android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
            android.widget.TextView textView = new android.widget.TextView(context);
            textView.setGravity(17);
            int h17 = i65.a.h(context, com.tencent.mm.R.dimen.f480602aa1);
            textView.setText(str3);
            com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
            textView.setTextColor(i65.a.d(context, com.tencent.mm.R.color.f478893k2));
            textView.setTextSize(0, h17);
            linearLayout.addView(textView, new android.widget.LinearLayout.LayoutParams(-1, i65.a.f(context, com.tencent.mm.R.dimen.a_v)));
            linearLayout.setGravity(17);
            z2Var.s(linearLayout);
            android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(context);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContainerView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.MultiPickerWheelViewController");
            android.widget.LinearLayout linearLayout2 = cVar6.f317776c;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContainerView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.MultiPickerWheelViewController");
            relativeLayout.addView(linearLayout2, -1, i65.a.f(context, com.tencent.mm.R.dimen.a_u));
            z2Var.j(relativeLayout);
            z2Var.C();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str2);
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.w("WheelPickerCaller", "handleOpenWheelPicker error params");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleOpenWheelPicker", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.wheelpicker.WheelPickerCaller");
        }
    }
}
