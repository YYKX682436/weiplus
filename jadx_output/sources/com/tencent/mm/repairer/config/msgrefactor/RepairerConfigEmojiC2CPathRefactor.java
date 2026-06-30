package com.tencent.mm.repairer.config.msgrefactor;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/msgrefactor/RepairerConfigEmojiC2CPathRefactor;", "Lq55/i;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class RepairerConfigEmojiC2CPathRefactor extends q55.i {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_EmojiC2CPathRefactor";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "启用表情C2CPath";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.tencent.mm.repairer.group.RepairerGroupMsgRefactor.class;
    }

    @Override // q55.e
    public java.lang.Object i() {
        int i17 = com.tencent.mm.sdk.platformtools.z.f193112h;
        int i18 = 1;
        if (!((i17 == 788529167 || i17 == 788529166) || z65.c.a()) && !com.tencent.mm.sdk.platformtools.v8.b(com.tencent.mm.sdk.platformtools.z.f193112h)) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            i18 = 0;
        }
        return java.lang.Integer.valueOf(i18);
    }

    @Override // q55.e
    public java.lang.String k() {
        return "clicfg_msg_refactor_emoji_c2c_path";
    }
}
