package com.tencent.mm.repairer.config.chatbot;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/chatbot/RepairerConfigWeClawShortcutCommandLimits;", "Lq55/f;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class RepairerConfigWeClawShortcutCommandLimits extends q55.f {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_WeClaw_ShortcutCmdLimits";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "WeClaw 快捷指令参数上限";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.tencent.mm.repairer.group.RepairerGroupChatBot.class;
    }

    @Override // q55.e
    public java.lang.Object i() {
        return "{\"maxTitleLength\":32,\"maxContentLength\":600,\"maxCommandCount\":100}";
    }

    @Override // q55.e
    public java.lang.String k() {
        return "clicfg_weclaw_shortcut_cmd_limits";
    }
}
