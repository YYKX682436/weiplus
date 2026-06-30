package com.tencent.mm.repairer.config.chatting;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/chatting/RepairerConfigVoiceInputStopFlush;", "Lq55/f;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class RepairerConfigVoiceInputStopFlush extends q55.f {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_VoiceInput_StopFlush";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "语音输入拉尾包结果(0=关闭, >0=开启)";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.tencent.mm.repairer.group.RepairerGroupChatting.class;
    }

    @Override // q55.f, q55.e
    public java.lang.String h() {
        return "String";
    }

    @Override // q55.e
    public java.lang.Object i() {
        int i17 = com.tencent.mm.sdk.platformtools.z.f193112h;
        return (i17 == 788529167 || i17 == 788529166) || z65.c.a() ? "500" : "0";
    }

    @Override // q55.e
    public java.lang.String k() {
        return "clicfg_chatting_voice_input_stop_flush";
    }
}
