package com.tencent.mm.repairer.config.textstatus.v4;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/textstatus/v4/RepairerConfigTextStatusCardDialogStrokeWidth;", "Le65/a;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class RepairerConfigTextStatusCardDialogStrokeWidth extends e65.a {
    @Override // q55.h
    public java.lang.String c() {
        return "状态卡片弹窗描边粗度";
    }

    @Override // q55.e
    public java.lang.Object i() {
        return "0.5";
    }

    @Override // e65.a, q55.d
    public java.util.List n() {
        return kz5.c0.i("0.5dp", "1.0dp", "1.5dp", "2dp");
    }

    @Override // e65.a, q55.d
    public java.util.List o() {
        return kz5.c0.i("0.5", "1.0", "1.5", "2");
    }
}
