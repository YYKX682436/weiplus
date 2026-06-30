package com.tencent.mm.repairer.config.global;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/global/RepairerConfigXiaomiNotificationHalfScreenChat;", "Lq55/f;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class RepairerConfigXiaomiNotificationHalfScreenChat extends q55.f {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_NotificationHalfScreenChat";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "微信内消息通知半屏(xiaomi)";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.tencent.mm.repairer.group.RepairerGroupChatting.class;
    }

    @Override // q55.e
    public java.lang.Object i() {
        int i17 = com.tencent.mm.sdk.platformtools.z.f193112h;
        return (i17 == 788529167 || i17 == 788529166) || z65.c.a() ? "xiaomi&31" : "";
    }

    @Override // q55.e
    public java.lang.String k() {
        return "clicfg_xiaomi_notification_half_screen_chat_enable";
    }
}
