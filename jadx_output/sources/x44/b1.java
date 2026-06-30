package x44;

/* loaded from: classes4.dex */
public final class b1 extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenEmojiStore");
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String optString = data.optString("emojiProductId");
        int optInt = data.optInt("precedingScene", 22);
        int optInt2 = data.optInt("entranceScene", 33);
        java.lang.String a17 = a54.h.a(env.b());
        if (env.a() == null) {
            b(g("activity is null!"));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenEmojiStore");
            return;
        }
        if (optString == null || r26.n0.N(optString)) {
            com.tencent.mars.xlog.Log.e("SnsAdJs.EmojiStore", "the emoji id is empty!");
            b(w44.d.k(this, 6, ": emoji id is empty!", null, 4, null));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenEmojiStore");
            return;
        }
        kotlin.jvm.internal.o.d(optString);
        qk.c0 c0Var = new qk.c0(optString);
        c0Var.f364198g = optInt;
        c0Var.f364155a = optInt2;
        c0Var.f364206o = a17;
        com.tencent.mm.feature.emoji.api.p6 p6Var = (com.tencent.mm.feature.emoji.api.p6) i95.n0.c(com.tencent.mm.feature.emoji.api.p6.class);
        if (p6Var == null) {
            com.tencent.mars.xlog.Log.e("SnsAdJs.EmojiStore", "emoticon liteapp service not found");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenEmojiStore");
            return;
        }
        ((com.tencent.mm.feature.emoji.f4) p6Var).wi(env.a(), c0Var);
        android.app.Activity a18 = env.a();
        if (a18 != null) {
            a18.overridePendingTransition(com.tencent.mm.R.anim.f477886ea, com.tencent.mm.R.anim.f477882e6);
        }
        b(l());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenEmojiStore");
    }
}
