package com.tencent.mm.repairer.config.search;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/search/RepairerConfigWebSearchFindMoreStartLiteApp;", "Lq55/i;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class RepairerConfigWebSearchFindMoreStartLiteApp extends q55.i {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_WebSearchFindMoreStartLiteApp";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "发现页进入搜一搜是否使用LiteApp版本";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.tencent.mm.repairer.group.RepairerGroupSearch.class;
    }

    @Override // q55.e
    public java.lang.Object i() {
        return 0;
    }

    @Override // q55.e
    public java.lang.String k() {
        return "clicfg_discover_search_use_liteapp";
    }

    @Override // q55.i, q55.d
    public java.util.List n() {
        return kz5.c0.i("强制关闭（使用H5）", "默认（跟随实验）", "强制使用LiteApp");
    }

    @Override // q55.i, q55.d
    public java.util.List o() {
        return kz5.c0.i("-1", "0", "1");
    }
}
