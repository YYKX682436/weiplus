package com.tencent.mm.repairer.config.scan;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/scan/RepairerConfigScanProductRotationThreshold;", "Lq55/d;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class RepairerConfigScanProductRotationThreshold extends q55.d {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_ScanProductRotationThreshold";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "识物旋转检测阈值";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.tencent.mm.repairer.group.RepairerGroupScan.class;
    }

    @Override // q55.e
    public java.lang.String h() {
        return "Float";
    }

    @Override // q55.e
    public java.lang.Object i() {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return java.lang.Float.valueOf(0.0f);
    }

    @Override // q55.e
    public java.lang.String k() {
        return "clicfg_scan_product_rotation_threshold";
    }

    @Override // q55.d
    public java.util.List o() {
        return kz5.c0.i("0f", "0.5f", "0.8f", "1.0f");
    }
}
