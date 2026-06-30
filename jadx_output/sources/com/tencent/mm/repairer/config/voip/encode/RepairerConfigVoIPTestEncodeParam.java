package com.tencent.mm.repairer.config.voip.encode;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/voip/encode/RepairerConfigVoIPTestEncodeParam;", "Lq55/d;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class RepairerConfigVoIPTestEncodeParam extends q55.d {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_VOIP_TestEncodeParam_Int";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "指定QoS参数配置";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.tencent.mm.repairer.group.voip.RepairerGroupVoIPEncode.class;
    }

    @Override // q55.d
    public java.util.List n() {
        return kz5.c0.i("关闭", "固定配置", "生成数组", "自定义编码序列");
    }

    @Override // q55.d
    public java.util.List o() {
        return kz5.c0.i("0", "1", "2", "3");
    }
}
