package com.tencent.mm.repairer.config.livephoto;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/livephoto/RCSnsSupportSaveLivePhoto;", "Lq55/i;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RCSnsSupportSaveLivePhoto extends q55.i {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_SnsSaveLivePhoto";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "朋友圈支持保存LivePhoto";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.tencent.mm.repairer.group.RepairerGroupLivePhoto.class;
    }

    @Override // q55.e
    public java.lang.Object i() {
        return 1;
    }

    @Override // q55.e
    public java.lang.String k() {
        return "clicfg_sns_save_live_photo";
    }
}
