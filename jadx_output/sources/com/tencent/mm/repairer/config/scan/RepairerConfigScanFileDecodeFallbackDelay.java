package com.tencent.mm.repairer.config.scan;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/scan/RepairerConfigScanFileDecodeFallbackDelay;", "Lq55/i;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class RepairerConfigScanFileDecodeFallbackDelay extends q55.i {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_ScanFileDecodeFallbackDelay";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "扫码使用File模式解码启动延迟时长";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.tencent.mm.repairer.group.RepairerGroupScan.class;
    }

    @Override // q55.e
    public java.lang.Object i() {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return 0;
    }

    @Override // q55.e
    public java.lang.String k() {
        return "clicfg_scan_file_decode_fallback_delay_ms";
    }

    @Override // q55.i, q55.d
    public java.util.List n() {
        return kz5.c0.i("0(关闭)", "2500ms", "3000ms");
    }

    @Override // q55.i, q55.d
    public java.util.List o() {
        return kz5.c0.i("0", "2500", "3000");
    }
}
