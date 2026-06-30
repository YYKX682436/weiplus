package com.tencent.mm.repairer.config.voip.setting;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/voip/setting/RepairerConfigVoIPProfileReport;", "Lq55/d;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class RepairerConfigVoIPProfileReport extends q55.d {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_VOIP_ProfileGranularity_Int";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "VoIP温度采集粒度";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.tencent.mm.repairer.group.voip.RepairerGroupVoIP.class;
    }

    @Override // q55.e
    public java.lang.Object i() {
        return 60;
    }

    @Override // q55.e
    public java.lang.String k() {
        return "clicfg_xsetting_battery_capture_granularity";
    }

    @Override // q55.d
    public java.util.List n() {
        return kz5.c0.i("细粒度", "实验配置", "粗粒度");
    }

    @Override // q55.d
    public java.util.List o() {
        return kz5.c0.i(com.tenpay.android.wechat.PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT, "0", "60");
    }
}
