package lf0;

@j95.b
/* loaded from: classes.dex */
public class h0 extends i95.w implements mf0.g0 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f318215d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f318216e = false;

    public boolean Ai() {
        return Bi(false, -1);
    }

    public boolean Bi(boolean z17, int i17) {
        if (this.f318215d) {
            return true;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStoryUIService", "Check tab count %d", java.lang.Integer.valueOf(i17));
            return i17 >= 2;
        }
        java.lang.String aj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).aj("clicfg_appmsg_friendseenlist_card", com.tencent.mm.plugin.lite.LiteAppCenter.FRAMEWORK_TYPE_NONE);
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStoryUIService", "Expt val for %s is %s", "clicfg_appmsg_friendseenlist_card", aj6);
        return "2".equals(aj6);
    }

    public void Di(int i17, int i18, android.content.Context context) {
        su4.k3.c("", 0, 0, i17);
        java.lang.String f17 = su4.r2.f(i17);
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            hashMap.put("topStoryScene", java.lang.String.valueOf(21));
            hashMap.put("deviceName", java.net.URLEncoder.encode(o45.wf.f343026d, "utf8"));
            hashMap.put("deviceBrand", java.net.URLEncoder.encode(android.os.Build.BRAND, "utf8"));
            hashMap.put("deviceModel", java.net.URLEncoder.encode(wo.w0.m(), "utf8"));
            try {
                hashMap.put("from", java.net.URLEncoder.encode(context.getString(com.tencent.mm.R.string.jzs), "utf8"));
                hashMap.put("uin", gm0.j1.b().j());
                hashMap.put("timeZone", java.net.URLEncoder.encode("" + com.tencent.mm.sdk.platformtools.t8.k0(), "utf8"));
                hashMap.put("ostype", wo.q.f447784e);
                hashMap.put("subScene", "" + i18);
                hashMap.put("extInfo", ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().y());
                hashMap.put("needCameraIcon", "0");
            } catch (java.lang.Exception unused) {
            }
        } catch (java.lang.Exception unused2) {
        }
        ((com.tencent.mm.plugin.websearch.h2) ((su4.a1) i95.n0.c(su4.a1.class))).Ni(context, i17, "", f17, true, hashMap, context.getResources().getString(com.tencent.mm.R.string.k09), context.getResources().getColor(com.tencent.mm.R.color.BW_93), true);
    }

    public boolean Ni() {
        boolean D = ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().D();
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStoryUIService", "[isShowTopStoryEntrance] show:%s ", java.lang.Boolean.valueOf(D));
        return D;
    }

    public void Ri(long j17, java.lang.String str, org.json.JSONObject jSONObject) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[TopStoryLiteApp]notifyLiteAppJSEvent, liteAppUuid: ");
        sb6.append(j17);
        sb6.append(", funcName: ");
        sb6.append(str);
        sb6.append(", paramsJson: ");
        sb6.append(jSONObject == null ? "" : jSONObject.toString());
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStoryUIService", sb6.toString());
        try {
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Vj(j17, str, jSONObject);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TopStoryUIService", e17, "notifyLiteAppJSEvent", new java.lang.Object[0]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x013a A[Catch: all -> 0x01be, TryCatch #5 {all -> 0x01be, blocks: (B:21:0x00bb, B:23:0x013a, B:24:0x0140, B:26:0x0146, B:28:0x016f, B:49:0x017e), top: B:5:0x0036 }] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Ui(android.content.Context r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lf0.h0.Ui(android.content.Context, java.lang.String):void");
    }

    public void Vi(android.content.Context context, int i17, android.os.Bundle bundle) {
        if (bundle == null) {
            bundle = new android.os.Bundle();
        }
        bundle.putInt("key_forceEnterTabCategory", 20002);
        bundle.putBoolean("key_is_jump_tab_find_when_back", true);
        bundle.putBoolean("key_isfromfinderseelater", true);
        o11.g gVar = wm4.u.f447309a;
        wm4.u.u(context, i17, bundle, "", new java.util.HashMap());
    }

    public java.lang.CharSequence wi(android.content.Context context, java.lang.String str, java.lang.String str2, int i17, mf0.f0 f0Var, int i18) {
        if (!str.contains(str2)) {
            return str;
        }
        java.lang.String[] split = str.split(str2);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        int ordinal = f0Var.ordinal();
        int i19 = ordinal != 1 ? ordinal != 2 ? com.tencent.mm.R.raw.top_story_wow_heart_normal : com.tencent.mm.R.raw.top_story_wow_heart_heavy : com.tencent.mm.R.drawable.d_4;
        for (int i27 = 0; i27 < split.length; i27++) {
            spannableStringBuilder.append((java.lang.CharSequence) split[i27]);
            if (i27 != split.length - 1 || (i27 == split.length - 1 && str.endsWith(str2))) {
                android.graphics.drawable.Drawable e17 = com.tencent.mm.ui.uk.e(context, i19, i18);
                e17.setBounds(0, 0, i17, i17);
                al5.w wVar = new al5.w(e17, 1);
                android.text.SpannableString spannableString = new android.text.SpannableString("#");
                spannableString.setSpan(wVar, 0, 1, 33);
                spannableStringBuilder.append((java.lang.CharSequence) spannableString);
            }
        }
        return spannableStringBuilder;
    }
}
