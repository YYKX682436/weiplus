package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes15.dex */
public class ka implements jr.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f190452a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f190453b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f190454c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f190455d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ra f190456e;

    public ka(com.tencent.mm.pluginsdk.ui.chat.ra raVar, java.lang.String str, java.lang.String str2, java.lang.String str3, long j17) {
        this.f190456e = raVar;
        this.f190452a = str;
        this.f190453b = str2;
        this.f190454c = str3;
        this.f190455d = j17;
    }

    @Override // jr.n
    public void a(java.util.List list, jr.q qVar) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.pluginsdk.ui.chat.ra raVar = this.f190456e;
        raVar.f190626q = currentTimeMillis;
        raVar.f190621l.clear();
        raVar.f190621l.addAll(list);
        raVar.f190624o.f61003i = raVar.f190621l.size();
        com.tencent.mm.autogen.mmdata.rpt.SuggestEmoiconStruct suggestEmoiconStruct = raVar.f190624o;
        suggestEmoiconStruct.f61007m = suggestEmoiconStruct.b("WordVersion", java.lang.String.valueOf(qVar.f301318a), true);
        com.tencent.mm.autogen.mmdata.rpt.SuggestEmoiconStruct suggestEmoiconStruct2 = raVar.f190624o;
        suggestEmoiconStruct2.f61008n = qVar.f301319b;
        suggestEmoiconStruct2.f61009o = qVar.f301320c;
        suggestEmoiconStruct2.f61010p = suggestEmoiconStruct2.b("RecSessionId", qVar.f301321d, true);
        com.tencent.mm.autogen.mmdata.rpt.SuggestEmoiconStruct suggestEmoiconStruct3 = raVar.f190624o;
        kotlin.jvm.internal.o.g(list, "<this>");
        suggestEmoiconStruct3.f61012r = suggestEmoiconStruct3.b("md5Type", kz5.n0.g0(list, "#", null, null, 0, null, n22.a.f334281d, 30, null), true);
        if (list.isEmpty()) {
            raVar.f190635z.removeMessages(20003);
            raVar.f190635z.sendEmptyMessage(20001);
            return;
        }
        raVar.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        raVar.f190630u = hashMap;
        hashMap.put("bubble_sessionid", this.f190452a);
        raVar.f190630u.put("chatid", this.f190453b);
        raVar.f190630u.put("word", this.f190454c);
        raVar.f190630u.put("bubble_scene", java.lang.Integer.valueOf(raVar.f190633x.f190270d));
        raVar.f190630u.put("Iscache", 1);
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_emoji_suggest_show_delay, 250);
        long j17 = this.f190455d;
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.SuggestEmoticonBubble", "onResult: delay show %s, %s", java.lang.Long.valueOf(currentTimeMillis2 - j17), java.lang.Integer.valueOf(Ni));
        long j18 = Ni;
        if (currentTimeMillis2 - j17 <= j18) {
            raVar.f190635z.sendEmptyMessageDelayed(20003, j18 - (currentTimeMillis2 - j17));
        } else {
            raVar.f190635z.sendEmptyMessage(20003);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1418L, 23, 1L);
        }
    }
}
