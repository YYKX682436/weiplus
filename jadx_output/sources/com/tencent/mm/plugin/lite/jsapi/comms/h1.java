package com.tencent.mm.plugin.lite.jsapi.comms;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/h1;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class h1 extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        java.lang.String pid = jSONObject != null ? jSONObject.optString("pid") : null;
        java.lang.String detailBufStr = jSONObject != null ? jSONObject.optString("detailBufStr") : null;
        boolean z18 = true;
        if (!(pid == null || pid.length() == 0)) {
            if (detailBufStr != null && detailBufStr.length() != 0) {
                z18 = false;
            }
            if (!z18) {
                com.tencent.mm.feature.emoji.api.o6 o6Var = (com.tencent.mm.feature.emoji.api.o6) i95.n0.c(com.tencent.mm.feature.emoji.api.o6.class);
                android.content.Context c17 = c();
                kotlin.jvm.internal.o.f(c17, "getContext(...)");
                com.tencent.mm.feature.emoji.c4 c4Var = (com.tencent.mm.feature.emoji.c4) o6Var;
                c4Var.getClass();
                kotlin.jvm.internal.o.g(pid, "pid");
                kotlin.jvm.internal.o.g(detailBufStr, "detailBufStr");
                byte[] decode = android.util.Base64.decode(detailBufStr, 2);
                com.tencent.mars.xlog.Log.i(c4Var.f66207d, "openRewardCharts, pid=".concat(pid));
                r45.qj0 qj0Var = new r45.qj0();
                if (decode != null) {
                    try {
                        qj0Var.parseFrom(decode);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                    }
                }
                android.content.Intent intent = new android.content.Intent(c17, (java.lang.Class<?>) com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2RewardDetailUI.class);
                intent.putExtra("extra_id", pid);
                intent.putExtra("extra_iconurl", qj0Var.f384033e);
                intent.putExtra("extra_name", qj0Var.f384034f);
                r45.v75 v75Var = qj0Var.E;
                if (v75Var != null) {
                    intent.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, v75Var.f387965e);
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(c17, arrayList.toArray(), "com/tencent/mm/feature/emoji/EmoticonJsApiService", "openRewardCharts", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                c17.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(c17, "com/tencent/mm/feature/emoji/EmoticonJsApiService", "openRewardCharts", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                this.f143443f.d(false);
                return;
            }
        }
        this.f143443f.a("emoticonOpenRewardCharts:fail_missing arguments");
    }
}
