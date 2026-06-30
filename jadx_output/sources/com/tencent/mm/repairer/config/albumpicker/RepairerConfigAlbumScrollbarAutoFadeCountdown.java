package com.tencent.mm.repairer.config.albumpicker;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/albumpicker/RepairerConfigAlbumScrollbarAutoFadeCountdown;", "Lq55/f;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class RepairerConfigAlbumScrollbarAutoFadeCountdown extends q55.f {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_AlbumScrollbarAutoFadeCountdown";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "相册小滑块自动消失倒计时(ms)";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.tencent.mm.repairer.group.RepairerGroupAlbumPicker.class;
    }

    @Override // q55.e
    public java.lang.Object i() {
        return "3000";
    }
}
