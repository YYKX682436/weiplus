package com.tencent.mm.repairer.config.ad;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/ad/RepairerConfigMagicAdForceDelayPull;", "Lq55/i;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RepairerConfigMagicAdForceDelayPull extends q55.i {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_MagicAdForceDelayPull";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "统一广告组件强制延迟拉取广告";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.tencent.mm.repairer.group.RepairerGroupAd.class;
    }

    @Override // q55.e
    public java.lang.Object i() {
        return 0;
    }

    @Override // q55.i, q55.d
    public java.util.List n() {
        return kz5.c0.i("默认", "关闭", "打开");
    }

    @Override // q55.i, q55.d
    public java.util.List o() {
        return kz5.c0.i("0", "1", "2");
    }
}
