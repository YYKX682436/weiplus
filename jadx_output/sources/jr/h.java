package jr;

/* loaded from: classes4.dex */
public final class h implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jr.i f301298a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.mmdata.rpt.SuggestEmoiconPreloadStruct f301299b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f301300c;

    public h(jr.i iVar, com.tencent.mm.autogen.mmdata.rpt.SuggestEmoiconPreloadStruct suggestEmoiconPreloadStruct, java.lang.String str) {
        this.f301298a = iVar;
        this.f301299b = suggestEmoiconPreloadStruct;
        this.f301300c = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.util.LinkedList linkedList;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        int i18 = fVar.f70616b;
        r45.hl5 hl5Var = (r45.hl5) fVar.f70618d;
        this.f301298a.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkUpdate: cgi result: ");
        sb6.append(i17);
        sb6.append(", ");
        sb6.append(i18);
        sb6.append(", ");
        sb6.append((hl5Var == null || (linkedList = hl5Var.f376267d) == null) ? null : java.lang.Integer.valueOf(linkedList.size()));
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiSuggestMatchWord", sb6.toString());
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.autogen.mmdata.rpt.SuggestEmoiconPreloadStruct suggestEmoiconPreloadStruct = this.f301299b;
        suggestEmoiconPreloadStruct.f60995f = currentTimeMillis;
        suggestEmoiconPreloadStruct.f60997h = i18;
        if (i17 == 0 && i18 == 0) {
            suggestEmoiconPreloadStruct.f60996g = 1L;
            z85.n nVar = com.tencent.mm.storage.n5.f().f195178p;
            jr.e eVar = new jr.e();
            eVar.field_desc = this.f301300c;
            eVar.field_updateTime = (int) com.tencent.mm.sdk.platformtools.t8.i1();
            eVar.field_content = hl5Var.toByteArray();
            nVar.z0(eVar);
            java.util.LinkedList<r45.yk5> linkedList2 = hl5Var.f376267d;
            if (linkedList2 != null && (linkedList2.isEmpty() ^ true)) {
                int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_emoji_suggest_remote_prefetch, 0);
                boolean isWifi = com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a);
                com.tencent.mars.xlog.Log.i("MicroMsg.EmojiSuggestMatchWord", "checkPrefetch: config: " + Ni + ", isWifi: " + isWifi);
                if (((Ni == 1 && isWifi) || Ni == 2) && linkedList2 != null) {
                    for (r45.yk5 yk5Var : linkedList2) {
                        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = new com.tencent.mm.storage.emotion.EmojiInfo();
                        n22.m.a(yk5Var.f391180d, emojiInfo);
                        emojiInfo.field_catalog = 65;
                        zq.h.f474972a.e(emojiInfo, null);
                    }
                }
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1418L, 41, 1L);
        } else {
            suggestEmoiconPreloadStruct.f60996g = 2L;
        }
        return java.lang.Boolean.valueOf(suggestEmoiconPreloadStruct.k());
    }
}
