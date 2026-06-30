package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes15.dex */
public class ra implements com.tencent.mm.pluginsdk.ui.chat.g8 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f190610a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f190611b;

    /* renamed from: c, reason: collision with root package name */
    public int f190612c;

    /* renamed from: d, reason: collision with root package name */
    public int f190613d;

    /* renamed from: e, reason: collision with root package name */
    public db5.d5 f190614e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f190615f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.chat.v9 f190616g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.chat.e8 f190617h;

    /* renamed from: k, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f190620k;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.chat.oa f190622m;

    /* renamed from: n, reason: collision with root package name */
    public im5.c f190623n;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.chat.f8 f190628s;

    /* renamed from: t, reason: collision with root package name */
    public final int f190629t;

    /* renamed from: u, reason: collision with root package name */
    public java.util.HashMap f190630u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.HashMap f190631v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f190632w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.chat.d8 f190633x;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f190618i = "";

    /* renamed from: j, reason: collision with root package name */
    public boolean f190619j = true;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.ArrayList f190621l = new java.util.ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.autogen.mmdata.rpt.SuggestEmoiconStruct f190624o = new com.tencent.mm.autogen.mmdata.rpt.SuggestEmoiconStruct();

    /* renamed from: p, reason: collision with root package name */
    public int f190625p = 0;

    /* renamed from: q, reason: collision with root package name */
    public long f190626q = 0;

    /* renamed from: r, reason: collision with root package name */
    public boolean f190627r = false;

    /* renamed from: y, reason: collision with root package name */
    public boolean f190634y = false;

    /* renamed from: z, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f190635z = new com.tencent.mm.pluginsdk.ui.chat.fa(this);
    public final com.tencent.mm.pluginsdk.ui.chat.la A = new com.tencent.mm.pluginsdk.ui.chat.ga(this);

    public ra(android.content.Context context, android.view.View view, android.view.View view2, android.view.View view3) {
        this.f190629t = 0;
        com.tencent.mm.pluginsdk.ui.chat.ha haVar = new com.tencent.mm.pluginsdk.ui.chat.ha(this);
        com.tencent.mm.pluginsdk.ui.chat.ia iaVar = new com.tencent.mm.pluginsdk.ui.chat.ia(this);
        this.f190610a = context;
        this.f190623n = new im5.c();
        this.f190633x = com.tencent.mm.pluginsdk.ui.chat.d8.kDefault;
        this.f190631v = new java.util.HashMap();
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.f488441te, null);
        this.f190611b = inflate;
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) inflate.findViewById(com.tencent.mm.R.id.f487175ns2);
        this.f190620k = recyclerView;
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context, 0, false));
        com.tencent.mm.pluginsdk.ui.chat.oa oaVar = new com.tencent.mm.pluginsdk.ui.chat.oa(this);
        this.f190622m = oaVar;
        this.f190620k.setAdapter(oaVar);
        this.f190620k.P(haVar);
        this.f190620k.i(iaVar);
        this.f190612c = i65.a.h(context, com.tencent.mm.R.dimen.f479738dv) + i65.a.h(context, com.tencent.mm.R.dimen.f480388wj);
        this.f190613d = i65.a.h(context, com.tencent.mm.R.dimen.f479672c9);
        android.view.View view4 = this.f190611b;
        int i17 = (this.f190613d * 2) + this.f190612c;
        db5.d5 d5Var = new db5.d5(view4, i17, i17, true);
        this.f190614e = d5Var;
        d5Var.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        this.f190614e.setOutsideTouchable(true);
        this.f190614e.setFocusable(false);
        this.f190614e.setAnimationStyle(com.tencent.mm.R.style.f494462np);
        this.f190614e.setOnDismissListener(new com.tencent.mm.pluginsdk.ui.chat.ja(this));
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
            return;
        }
        this.f190629t = 1;
    }

    public void a(java.lang.String str, java.lang.String str2) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.sdk.platformtools.n3 n3Var = this.f190635z;
            n3Var.removeMessages(20003);
            n3Var.sendEmptyMessage(20001);
            this.f190618i = str;
            im5.c cVar = this.f190623n;
            if (cVar != null) {
                cVar.dead();
                this.f190623n = null;
                return;
            }
            return;
        }
        if (!str.equals(this.f190618i)) {
            d();
            im5.c cVar2 = this.f190623n;
            if (cVar2 != null) {
                cVar2.dead();
                this.f190623n = null;
            }
            this.f190623n = new im5.c();
            java.lang.String sessionId = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
            com.tencent.mm.autogen.mmdata.rpt.SuggestEmoiconStruct suggestEmoiconStruct = this.f190624o;
            suggestEmoiconStruct.f61005k = suggestEmoiconStruct.b("SessionId", sessionId, true);
            suggestEmoiconStruct.f61011q = suggestEmoiconStruct.b("ChatId", str2, true);
            this.f190621l.clear();
            this.f190625p = 0;
            jr.d dVar = new jr.d(this.f190623n);
            kotlin.jvm.internal.o.g(sessionId, "sessionId");
            jr.i iVar = dVar.f301294g;
            iVar.getClass();
            iVar.f301302b = str2;
            iVar.f301303c = sessionId;
            com.tencent.mm.pluginsdk.ui.chat.ka kaVar = new com.tencent.mm.pluginsdk.ui.chat.ka(this, sessionId, str2, str, java.lang.System.currentTimeMillis());
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1418L, 0, 1L);
            pm0.v.L("EmojiSuggest_searchSuggest", true, new jr.c(dVar, str, kaVar));
        }
        this.f190618i = str;
    }

    public final void b(java.util.HashMap hashMap, jr.p pVar, int i17) {
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = pVar.f301316a;
        java.lang.String str = emojiInfo.field_groupId;
        hashMap.put("md5", emojiInfo.field_md5);
        hashMap.put("md5_index", java.lang.Integer.valueOf(i17));
        hashMap.put("md5_type", java.lang.Integer.valueOf((str == null || str.isEmpty()) ? 2 : 1));
        jr.o oVar = pVar.f301317b;
        hashMap.put("md5_source", java.lang.Integer.valueOf(oVar.f301312a != 0 ? 0 : 1));
        hashMap.put("emoji_from", java.lang.Integer.valueOf(oVar.f301313b));
    }

    public final java.util.HashMap c() {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.util.Map.Entry entry : this.f190630u.entrySet()) {
            hashMap.put((java.lang.String) entry.getKey(), entry.getValue());
        }
        return hashMap;
    }

    public void d() {
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.SuggestEmoticonBubble", "hide: ");
        db5.d5 d5Var = this.f190614e;
        if (d5Var == null) {
            return;
        }
        if (d5Var.isShowing()) {
            this.f190614e.dismiss();
        }
        this.f190631v.clear();
        this.f190634y = false;
        this.f190635z.removeCallbacksAndMessages(null);
        im5.c cVar = this.f190623n;
        if (cVar != null) {
            cVar.dead();
            this.f190623n = null;
        }
    }

    public final void e(java.lang.String str, java.lang.String str2, java.util.HashMap hashMap) {
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_emoticon_enable_chat_bubble_recommend_report, false)) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Bj(str, str2, hashMap, 10, false);
        }
    }

    public final void f(java.util.List list, int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        if (list != null) {
            for (int i18 = i17; i18 < list.size(); i18++) {
                jr.p pVar = (jr.p) list.get(i18);
                if (i18 != i17) {
                    sb6.append("#");
                    sb7.append("#");
                    sb8.append("#");
                }
                sb6.append(pVar.f301316a.field_md5);
                jr.o oVar = pVar.f301317b;
                sb7.append(oVar.f301312a);
                sb8.append(oVar.f301315d);
            }
        }
        java.lang.String sb9 = sb6.toString();
        com.tencent.mm.autogen.mmdata.rpt.SuggestEmoiconStruct suggestEmoiconStruct = this.f190624o;
        suggestEmoiconStruct.f61002h = suggestEmoiconStruct.b("md5", sb9, true);
        suggestEmoiconStruct.f61006l = suggestEmoiconStruct.b("IsLocalSearch", sb7.toString(), true);
        suggestEmoiconStruct.f61004j = suggestEmoiconStruct.b("Index", sb8.toString(), true);
        suggestEmoiconStruct.f60999e = suggestEmoiconStruct.b("Word", this.f190618i.replace(",", ""), true);
    }
}
