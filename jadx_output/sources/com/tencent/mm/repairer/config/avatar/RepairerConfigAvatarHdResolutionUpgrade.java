package com.tencent.mm.repairer.config.avatar;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/repairer/config/avatar/RepairerConfigAvatarHdResolutionUpgrade;", "Lq55/i;", "<init>", "()V", "r55/a", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class RepairerConfigAvatarHdResolutionUpgrade extends q55.i {
    static {
        new r55.a(null);
    }

    public static final int p() {
        return j62.e.g().c(new com.tencent.mm.repairer.config.avatar.RepairerConfigAvatarHdResolutionUpgrade()) == 1 ? 1440 : 940;
    }

    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_AvatarHdResolutionUpgrade";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "高清头像高分辨率开关";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.tencent.mm.repairer.group.RepairerGroupAvatar.class;
    }

    @Override // q55.e
    public java.lang.Object i() {
        int i17 = com.tencent.mm.sdk.platformtools.z.f193112h;
        return java.lang.Integer.valueOf(((i17 == 788529167 || i17 == 788529166) || z65.c.a()) ? 1 : 0);
    }

    @Override // q55.e
    public java.lang.String k() {
        return "clicfg_avatar_hd_resolution_upgrade";
    }
}
