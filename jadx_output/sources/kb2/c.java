package kb2;

/* loaded from: classes5.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final lb2.j f306226a;

    /* renamed from: b, reason: collision with root package name */
    public static final lb2.j f306227b;

    /* renamed from: c, reason: collision with root package name */
    public static final lb2.j f306228c;

    /* renamed from: d, reason: collision with root package name */
    public static final lb2.j f306229d;

    static {
        ob2.a aVar = new ob2.a(0, "是否打开发现页直播入口", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_support_find_page_live, false, 2, null);
        aVar.a("FINDER_SUPPORT_FIND_PAGE_LIVE", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        aVar.f317745p = "2021T2";
        f306226a = aVar;
        ob2.a aVar2 = new ob2.a(1, "卡片插入是否感知(是否开启动画)", null, null, 12, null);
        lb2.j.d(aVar2, e42.d0.clicfg_finder_recom_card_replace_anim_switch, false, 2, null);
        aVar2.a("FINDER_RECOM_CARD_REPLAEC_ANIM_SWITCH", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        aVar2.f317745p = "2021T2";
        f306227b = aVar2;
        ob2.a aVar3 = new ob2.a(0, "直播独立入口在看一看上方", null, null, 12, null);
        lb2.j.d(aVar3, e42.d0.clicfg_finder_live_above_look, false, 2, null);
        aVar3.a("FINDER_LIVE_ABOVE_LOOK", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        aVar3.f317745p = "2021T2";
        f306228c = aVar3;
        ob2.a aVar4 = new ob2.a(300000, "新广场二级tab缓存时间", null, null, 12, null);
        lb2.j.d(aVar4, e42.d0.clicfg_finder_live_sub_tab_cache_time, false, 2, null);
        aVar4.a("FINDER_LIVE_SUB_TAB_CACHE_TIME", kz5.c0.i(300000, 30000), kz5.c0.i("5分钟", "30秒"));
        f306229d = aVar4;
    }
}
