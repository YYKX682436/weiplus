package com.tencent.mm.repairer.config.search;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/search/RepairerConfigWebSearchTemplateUseUdr;", "Lq55/d;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RepairerConfigWebSearchTemplateUseUdr extends q55.d {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_WebSearchTemplateUseUdr";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "搜一搜模板使用UDR资源";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.tencent.mm.repairer.group.RepairerGroupSearch.class;
    }

    @Override // q55.e
    public java.lang.Object i() {
        return 1;
    }

    @Override // q55.e
    public java.lang.String k() {
        return "clicfg_websearch_template_use_udr";
    }

    @Override // q55.d
    public java.util.List n() {
        return kz5.c0.i("关闭(使用Assets)", "替换兜底包(UDR)", "替换checkResUpdate(UDR)");
    }

    @Override // q55.d
    public java.util.List o() {
        return kz5.c0.i("0", "1", "2");
    }
}
