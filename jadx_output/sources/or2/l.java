package or2;

/* loaded from: classes10.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f347659d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(java.util.ArrayList arrayList) {
        super(0);
        this.f347659d = arrayList;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        or2.o oVar = or2.o.f347664a;
        java.util.HashMap hashMap = new java.util.HashMap();
        for (or2.h hVar : this.f347659d) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(hVar.f347628a);
            sb6.append('#');
            int i17 = hVar.f347629b;
            sb6.append(i17);
            java.lang.String sb7 = sb6.toString();
            java.lang.Object obj = hashMap.get(sb7);
            if (obj == null) {
                obj = new or2.h(hVar.f347628a, i17);
                hashMap.put(sb7, obj);
            }
            or2.h hVar2 = (or2.h) obj;
            hVar2.f347640m += hVar.b();
            hVar2.f347639l += hVar.f347639l;
            hVar2.f347638k.addAll(hVar.f347638k);
        }
        java.util.Collection<or2.h> values = hashMap.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        for (or2.h hVar3 : values) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, hVar3.f347628a);
            jSONObject.put(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_FPS, hVar3.a());
            int[] iArr = new int[5];
            int[] iArr2 = new int[5];
            java.util.Iterator it = hVar3.f347638k.iterator();
            while (it.hasNext()) {
                int intValue = ((java.lang.Number) it.next()).intValue();
                if (intValue >= 42) {
                    iArr[4] = iArr[4] + 1;
                    iArr2[4] = iArr2[4] + intValue;
                } else if (intValue >= 24) {
                    iArr[3] = iArr[3] + 1;
                    iArr2[3] = iArr2[3] + intValue;
                } else if (intValue >= 9) {
                    iArr[2] = iArr[2] + 1;
                    iArr2[2] = iArr2[2] + intValue;
                } else if (intValue >= 2) {
                    iArr[1] = iArr[1] + 1;
                    iArr2[1] = iArr2[1] + intValue;
                } else {
                    iArr[0] = iArr[0] + 1;
                    int i18 = iArr2[0];
                    if (intValue < 0) {
                        intValue = 0;
                    }
                    iArr2[0] = i18 + intValue;
                }
            }
            int i19 = iArr2[1];
            int i27 = iArr2[2];
            int i28 = iArr2[3];
            int i29 = iArr2[4];
            int i37 = i19 + i27 + i28 + i29;
            float f17 = i37 <= 0 ? 0.0f : (i29 * 80.0f) / i37;
            float f18 = i37 <= 0 ? 0.0f : (i28 * 60.0f) / i37;
            float f19 = i37 <= 0 ? 0.0f : (i27 * 40.0f) / i37;
            float f27 = i37 <= 0 ? 0.0f : (i19 * 20.0f) / i37;
            int i38 = iArr[4] + iArr[3] + iArr[2] + iArr[1] + iArr[0];
            float f28 = f17 + f18 + f19 + f27;
            int i39 = hVar3.f347629b;
            float b17 = 1.0f - (hVar3.f347639l / (((float) hVar3.b()) / (1000.0f / i39)));
            jSONObject.put(ya.b.SCORE, a06.d.b(f28));
            java.lang.String format = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(b17)}, 1));
            kotlin.jvm.internal.o.f(format, "format(...)");
            jSONObject.put("dropRate", format);
            jSONObject.put("frameCnt", hVar3.f347639l);
            jSONObject.put("durationMS", hVar3.b());
            jSONObject.put("indexCnt", i38);
            jSONObject.put("frozenIndexCnt", iArr[4]);
            jSONObject.put("highIndexCnt", iArr[3]);
            jSONObject.put("middleIndexCnt", iArr[2]);
            jSONObject.put("normalIndexCnt", iArr[1]);
            jSONObject.put("bestIndexCnt", iArr[0]);
            jSONObject.put("refreshRate", i39);
            jSONObject.put("deviceLevel", or2.o.f347665b);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("batteryPercentage", com.tencent.mm.plugin.finder.viewmodel.component.aa.f133757e);
            jSONObject2.put("isPowerSaveMode", com.tencent.mm.plugin.finder.viewmodel.component.aa.f133758f);
            jSONObject2.put("isLowBattery", com.tencent.mm.plugin.finder.viewmodel.component.aa.f133759g);
            jSONObject.put("battery", jSONObject2);
            jSONObject.put("isBatteryEnough", (com.tencent.mm.plugin.finder.viewmodel.component.aa.f133759g || com.tencent.mm.plugin.finder.viewmodel.component.aa.f133758f || com.tencent.mm.plugin.finder.viewmodel.component.aa.f133757e < 30) ? false : true);
            or2.o.f347664a.a(hVar3.f347628a, jSONObject);
        }
        return jz5.f0.f302826a;
    }
}
