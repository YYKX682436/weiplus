package com.tencent.mm.repairer.config.mjtemplate;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/mjtemplate/RepairerConfigFinderTemplateListType;", "Lq55/d;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class RepairerConfigFinderTemplateListType extends q55.d {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_FinderTemplateListType";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "视频号相册模板页-列表类型";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.tencent.mm.repairer.group.RepairerGroupMJTemplate.class;
    }

    @Override // q55.e
    public java.lang.Object i() {
        return 0;
    }

    @Override // q55.d
    public java.util.List n() {
        return kz5.c0.k("推荐", "全部");
    }

    @Override // q55.d
    public java.util.List o() {
        return kz5.c0.k("0", "1");
    }
}
