package com.tencent.mm.repairer.config.scan;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/scan/RepairerConfigScanProductSensorSkipStableMs;", "Lq55/d;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class RepairerConfigScanProductSensorSkipStableMs extends q55.d {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_ScanProductSensorSkipStableMs";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "识物传感器防抖稳定时长";
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
        return "clicfg_scan_product_sensor_skip_stable_ms";
    }

    @Override // q55.d
    public java.util.List n() {
        return kz5.c0.i("关闭", "500ms", "1000ms");
    }

    @Override // q55.d
    public java.util.List o() {
        return kz5.c0.i("0", "500", "1000");
    }
}
