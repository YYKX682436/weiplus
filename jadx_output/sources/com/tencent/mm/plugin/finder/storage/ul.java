package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class ul extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.ul f128145d = new com.tencent.mm.plugin.finder.storage.ul();

    public ul() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        lb2.j jVar = new lb2.j("7,3", "发表页面好友收入绿字展示次数");
        jVar.a("FINDER_ORIGINAL_RECOMMEND_CONFIG_SET", kz5.c0.i("0,0", "0,3", "7,3", "1,0"), kz5.c0.i("无限次", "展示3次", " 7天展示3次", "不展示"));
        jVar.c(e42.c0.clicfg_finder_original_recommend_config_set, false);
        return jVar;
    }
}
