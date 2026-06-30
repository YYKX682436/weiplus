package l44;

/* loaded from: classes4.dex */
public abstract class n5 {
    public static boolean a(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, java.util.List list, s34.l0 l0Var, int i17, int i18, int i19) {
        boolean z17;
        java.util.List f17;
        java.util.List d17;
        float e17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkGestureDraw", "com.tencent.mm.plugin.sns.ad.helper.GestureHelper");
        if (l0Var == null || a84.b0.b(list)) {
            com.tencent.mars.xlog.Log.e("GestureHelper", "gestureInfo is null or path is empty");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkGestureDraw", "com.tencent.mm.plugin.sns.ad.helper.GestureHelper");
            return false;
        }
        try {
            f17 = f(list);
            d17 = d(l0Var, i18, i19);
            e17 = e(l0Var, i19);
        } catch (java.lang.Exception e18) {
            e = e18;
            z17 = false;
        }
        if (a84.b0.b(d17)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkGestureDraw", "com.tencent.mm.plugin.sns.ad.helper.GestureHelper");
            return false;
        }
        if (l0Var.f402703e <= 0.0f) {
            l0Var.f402703e = 214.0f;
            ca4.e0.a("ad_gesture_monitor", "gestureInfo radius==0", 0, 0, "");
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.A(1612, 199);
        boolean c17 = c(f17, d17, e17);
        int i27 = 1;
        if (c17) {
            i27 = 2;
            z17 = true;
        } else {
            g0Var.A(1612, 201);
            com.tencent.mars.xlog.Log.i("GestureHelper", "intercepted by point pass");
            z17 = false;
        }
        if (snsInfo != null) {
            try {
                b(i27, snsInfo.getAdInfo().uxInfo, snsInfo.getTimeLine().Id, i17);
            } catch (java.lang.Exception e19) {
                e = e19;
                com.tencent.mars.xlog.Log.printErrStackTrace("GestureHelper", e, "recog gesture error!", new java.lang.Object[0]);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkGestureDraw", "com.tencent.mm.plugin.sns.ad.helper.GestureHelper");
                return z17;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkGestureDraw", "com.tencent.mm.plugin.sns.ad.helper.GestureHelper");
        return z17;
    }

    public static void b(int i17, java.lang.String str, java.lang.String str2, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("gestureRegCgiReport", "com.tencent.mm.plugin.sns.ad.helper.GestureHelper");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("result", i17);
            jSONObject.put("extInfo", jSONObject2);
            jSONObject.put("uxinfo", str);
            jSONObject.put("snsId", str2);
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, i18);
            ca4.m0.a(java.lang.String.valueOf(16552), jSONObject.toString());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("GestureHelper", "gestureCgiReport exp=" + e17.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("gestureRegCgiReport", "com.tencent.mm.plugin.sns.ad.helper.GestureHelper");
    }

    public static boolean c(java.util.List list, java.util.List list2, float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isPassedSamplePoints", "com.tencent.mm.plugin.sns.ad.helper.GestureHelper");
        if (a84.b0.b(list) || a84.b0.b(list2)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPassedSamplePoints", "com.tencent.mm.plugin.sns.ad.helper.GestureHelper");
            return false;
        }
        java.util.Iterator it = list.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            android.graphics.PointF pointF = (android.graphics.PointF) it.next();
            if (i17 >= list2.size()) {
                break;
            }
            float f18 = pointF.x - ((android.graphics.PointF) list2.get(i17)).x;
            float f19 = pointF.y - ((android.graphics.PointF) list2.get(i17)).y;
            if (((float) java.lang.Math.sqrt((f18 * f18) + (f19 * f19))) <= f17) {
                i17++;
            }
        }
        if (i17 >= list2.size()) {
            com.tencent.mars.xlog.Log.i("GestureHelper", "isPassedSamplePoints = true");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPassedSamplePoints", "com.tencent.mm.plugin.sns.ad.helper.GestureHelper");
            return true;
        }
        com.tencent.mars.xlog.Log.i("GestureHelper", "isPassedSamplePoints = false");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPassedSamplePoints", "com.tencent.mm.plugin.sns.ad.helper.GestureHelper");
        return false;
    }

    public static java.util.List d(s34.l0 l0Var, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parsePoints", "com.tencent.mm.plugin.sns.ad.helper.GestureHelper");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (l0Var != null && l0Var.f402704f > 0 && l0Var.f402705g > 0 && !com.tencent.mm.sdk.platformtools.t8.K0(l0Var.f402702d)) {
            java.lang.String[] split = l0Var.f402702d.split("[|]");
            int length = split.length;
            int i19 = 0;
            while (true) {
                if (i19 >= length) {
                    break;
                }
                java.lang.String[] split2 = split[i19].split("[_]");
                if (split2.length != 2) {
                    com.tencent.mars.xlog.Log.e("GestureHelper", "invalid gesture str! %s", l0Var.f402702d);
                    arrayList.clear();
                    break;
                }
                float L = com.tencent.mm.sdk.platformtools.t8.L(split2[0], -1.0f);
                float L2 = com.tencent.mm.sdk.platformtools.t8.L(split2[1], -1.0f);
                if (L == -1.0f || L2 == -1.0f) {
                    break;
                }
                arrayList.add(new android.graphics.PointF((L / l0Var.f402704f) * i17, (L2 / l0Var.f402705g) * i18));
                i19++;
            }
            com.tencent.mars.xlog.Log.e("GestureHelper", "invalid gesture str! %s", l0Var.f402702d);
            arrayList.clear();
        }
        com.tencent.mars.xlog.Log.i("GestureHelper", "parse Target:" + arrayList.toString());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parsePoints", "com.tencent.mm.plugin.sns.ad.helper.GestureHelper");
        return arrayList;
    }

    public static float e(s34.l0 l0Var, int i17) {
        int i18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseRadiusByBasicHeight", "com.tencent.mm.plugin.sns.ad.helper.GestureHelper");
        if (l0Var == null || (i18 = l0Var.f402705g) == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseRadiusByBasicHeight", "com.tencent.mm.plugin.sns.ad.helper.GestureHelper");
            return 0.0f;
        }
        float f17 = (l0Var.f402703e / i18) * i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseRadiusByBasicHeight", "com.tencent.mm.plugin.sns.ad.helper.GestureHelper");
        return f17;
    }

    public static java.util.List f(java.util.List list) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeListSameNeighbour", "com.tencent.mm.plugin.sns.ad.helper.GestureHelper");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (list == null || list.size() <= 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeListSameNeighbour", "com.tencent.mm.plugin.sns.ad.helper.GestureHelper");
            return arrayList;
        }
        int size = list.size();
        arrayList.add((android.graphics.PointF) list.get(0));
        int size2 = arrayList.size() - 1;
        for (int i17 = 1; i17 < size; i17++) {
            if (!((android.graphics.PointF) list.get(i17)).equals(arrayList.get(size2))) {
                arrayList.add((android.graphics.PointF) list.get(i17));
                size2 = arrayList.size() - 1;
            }
        }
        com.tencent.mars.xlog.Log.i("GestureHelper", "removeListSameNeighbour:" + arrayList.toString());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeListSameNeighbour", "com.tencent.mm.plugin.sns.ad.helper.GestureHelper");
        return arrayList;
    }
}
