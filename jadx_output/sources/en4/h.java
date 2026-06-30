package en4;

/* loaded from: classes8.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.uic.TopStorySearchUIC f255342d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.mm.plugin.topstory.ui.uic.TopStorySearchUIC topStorySearchUIC) {
        super(1);
        this.f255342d = topStorySearchUIC;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wm4.y yVar;
        pm4.z state = (pm4.z) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        if (dVar != null && (dVar instanceof vm4.b) && (yVar = ((vm4.b) dVar).f438146b) != null) {
            int i17 = yVar.f447320d;
            int i18 = yVar.f447319c;
            com.tencent.mm.plugin.topstory.ui.uic.TopStorySearchUIC topStorySearchUIC = this.f255342d;
            topStorySearchUIC.getClass();
            ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
            android.content.Intent a17 = su4.r2.a();
            a17.putExtra("ftsneedkeyboard", true);
            a17.putExtra("ftsbizscene", i18);
            a17.putExtra("ftsType", i17);
            a17.putExtra("key_change_search_icon", true);
            java.util.Map b17 = su4.r2.b(i18, false, i17);
            ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).getClass();
            long g17 = o13.n.g(1005);
            java.util.HashMap hashMap = (java.util.HashMap) b17;
            hashMap.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, java.lang.String.valueOf(g17));
            hashMap.put("subSessionId", java.lang.String.valueOf(g17));
            hashMap.put("isSug", "1");
            a17.putExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, java.lang.String.valueOf(g17));
            a17.putExtra("subSessionId", java.lang.String.valueOf(g17));
            java.lang.String e17 = su4.r2.e(b17, 0);
            a17.putExtra("rawUrl", e17);
            a17.putExtra("key_load_js_without_delay", true);
            a17.putExtra("key_search_icon_and_hint_fix_default", true);
            a17.putExtra("key_preload_biz", 4);
            a17.putExtra("key_back_and_clear_query", true);
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStorySearchUIC", "openSearchPage searchType:" + i17 + " searchScene:" + i18 + " url:" + e17);
            j45.l.z(topStorySearchUIC.getActivity(), a17, null);
        }
        return jz5.f0.f302826a;
    }
}
