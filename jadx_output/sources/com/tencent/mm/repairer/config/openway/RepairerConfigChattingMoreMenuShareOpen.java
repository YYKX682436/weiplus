package com.tencent.mm.repairer.config.openway;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/openway/RepairerConfigChattingMoreMenuShareOpen;", "Lq55/i;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class RepairerConfigChattingMoreMenuShareOpen extends q55.i {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_ChattingMoreMenuShareOpen";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "消息多选分享至其他应用总开关";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.tencent.mm.repairer.group.RepairerGroupOpenWay.class;
    }

    @Override // q55.e
    public java.lang.Object i() {
        int i17 = com.tencent.mm.sdk.platformtools.z.f193112h;
        return java.lang.Integer.valueOf(((i17 == 788529167 || i17 == 788529166) || z65.c.a()) ? 1 : 0);
    }

    @Override // q55.e
    public java.lang.String k() {
        return "clicfg_chatting_more_share_open_android";
    }
}
