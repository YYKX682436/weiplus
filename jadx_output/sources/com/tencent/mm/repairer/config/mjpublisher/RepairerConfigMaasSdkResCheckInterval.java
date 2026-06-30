package com.tencent.mm.repairer.config.mjpublisher;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/mjpublisher/RepairerConfigMaasSdkResCheckInterval;", "Lq55/d;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class RepairerConfigMaasSdkResCheckInterval extends q55.d {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_MaasSdkResCheckInterval";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "maas sdk下载检查请求间隔(分钟)";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.tencent.mm.repairer.group.RepairerGroupMJPublisher.class;
    }

    @Override // q55.e
    public java.lang.Object i() {
        return 60;
    }

    @Override // q55.e
    public java.lang.String k() {
        return "clicfg_finder_maas_res_check_interval";
    }

    @Override // q55.d
    public java.util.List n() {
        return kz5.c0.k("默认(60分钟)", "1分钟", "5分钟");
    }

    @Override // q55.d
    public java.util.List o() {
        return kz5.c0.k("60", "1", "5");
    }
}
