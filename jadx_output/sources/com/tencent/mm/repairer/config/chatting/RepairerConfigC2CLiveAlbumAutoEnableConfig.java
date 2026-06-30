package com.tencent.mm.repairer.config.chatting;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/chatting/RepairerConfigC2CLiveAlbumAutoEnableConfig;", "Lq55/i;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class RepairerConfigC2CLiveAlbumAutoEnableConfig extends q55.i {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_Chatting_C2C_Live_Album_Auto_Enable";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "聊天发送Live时是否自动打开 (单位毫秒, by realhe)";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.tencent.mm.repairer.group.RepairerGroupChatting.class;
    }

    @Override // q55.e
    public java.lang.String h() {
        return "Int";
    }

    @Override // q55.e
    public java.lang.Object i() {
        return 0;
    }

    @Override // q55.e
    public java.lang.String k() {
        return "clicfg_chatting_c2c_live_album_auto_enable";
    }
}
