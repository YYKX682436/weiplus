package com.tencent.mm.repairer.config.fundation;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/fundation/RepairerConfigVideoCompressHardEncodeMaxValue;", "Lq55/f;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class RepairerConfigVideoCompressHardEncodeMaxValue extends q55.f {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_VideoCompressHardEncodeMaxValue";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "硬编时认为合法的目标码率最大倍数 (by realhe)";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.tencent.mm.repairer.group.RepairerGroupMedia.class;
    }

    @Override // q55.f, q55.e
    public java.lang.String h() {
        return "Float";
    }

    @Override // q55.e
    public java.lang.Object i() {
        return java.lang.Float.valueOf(3.0f);
    }

    @Override // q55.e
    public java.lang.String k() {
        return "clicfg_video_compress_hard_encode_check_max";
    }
}
