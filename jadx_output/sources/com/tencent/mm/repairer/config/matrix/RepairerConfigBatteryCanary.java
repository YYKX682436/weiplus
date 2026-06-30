package com.tencent.mm.repairer.config.matrix;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/matrix/RepairerConfigBatteryCanary;", "Lq55/d;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class RepairerConfigBatteryCanary extends q55.d {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_Matrix_Battery_Top_Thread_Int";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "功耗浮窗（刷新周期）";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.tencent.mm.repairer.group.RepairerGroupMatrix.class;
    }

    @Override // q55.e
    public java.lang.Object i() {
        return 0;
    }

    @Override // q55.d
    public java.util.List n() {
        return kz5.c0.i("关闭浮窗", "1 s", "5 s", "10 s", "30 s", "1 min");
    }

    @Override // q55.d
    public java.util.List o() {
        return kz5.c0.i("0", "1", "5", com.tenpay.android.wechat.PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT, com.tenpay.android.wechat.PayuSecureEncrypt.ENCRYPT_VERSION_HASH, "60");
    }
}
