package com.tencent.mm.repairer.config.remark;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/repairer/config/remark/RepairerConfigRecommendNickname;", "Lq55/i;", "<init>", "()V", "a65/a", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class RepairerConfigRecommendNickname extends q55.i {
    static {
        new a65.a(null);
    }

    public static final boolean p() {
        return j62.e.g().c(new com.tencent.mm.repairer.config.remark.RepairerConfigRecommendNickname()) == 1;
    }

    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_RecommendNickname";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "昵称收归至推荐";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.tencent.mm.repairer.config.remark.RepairerGroupRemarkRecommendExpt.class;
    }

    @Override // q55.e
    public java.lang.Object i() {
        return 0;
    }

    @Override // q55.e
    public java.lang.String k() {
        return "clicfg_recommend_nickname";
    }
}
