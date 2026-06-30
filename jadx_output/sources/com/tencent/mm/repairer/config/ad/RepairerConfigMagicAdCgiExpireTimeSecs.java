package com.tencent.mm.repairer.config.ad;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/ad/RepairerConfigMagicAdCgiExpireTimeSecs;", "Lq55/f;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class RepairerConfigMagicAdCgiExpireTimeSecs extends q55.f {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_MagicAdCgiExpireTimeSecs";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "统一广告组件CGI请求失败过期时间(秒)";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.tencent.mm.repairer.group.RepairerGroupAd.class;
    }

    @Override // q55.e
    public java.lang.Object i() {
        return 21600L;
    }

    @Override // q55.e
    public java.lang.String k() {
        return "clicfg_magic_ad_cgi_expire_time_secs_android";
    }
}
