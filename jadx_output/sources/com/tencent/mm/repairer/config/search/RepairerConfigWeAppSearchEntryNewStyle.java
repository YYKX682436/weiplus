package com.tencent.mm.repairer.config.search;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/search/RepairerConfigWeAppSearchEntryNewStyle;", "Lq55/d;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class RepairerConfigWeAppSearchEntryNewStyle extends q55.d {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_WeAppSearchEntryNewStyle";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "下拉小程序搜索入口强化";
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
        return "clicfg_weapp_search_entry_enhancement";
    }

    @Override // q55.d
    public java.util.List n() {
        return kz5.c0.i("关闭", "启用");
    }

    @Override // q55.d
    public java.util.List o() {
        return kz5.c0.i("0", "1");
    }
}
