package com.tencent.mm.repairer.config.mjpublisher.shoot_composing;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/mjpublisher/shoot_composing/RepairerConfigShootComposingAutoFlashDarkThreshold;", "Lq55/f;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class RepairerConfigShootComposingAutoFlashDarkThreshold extends q55.f {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_ShootComposingAutoFlashDarkThreshold";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "自动补光暗色占比阈值";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.tencent.mm.repairer.config.mjpublisher.RepairerGroupMJPublisherShootComposing.class;
    }

    @Override // q55.f, q55.e
    public java.lang.String h() {
        return "Float";
    }

    @Override // q55.e
    public java.lang.Object i() {
        return java.lang.Float.valueOf(0.2f);
    }

    @Override // q55.e
    public java.lang.String k() {
        return "clicfg_finder_maas_cam_auto_flash_dark_threshold";
    }
}
