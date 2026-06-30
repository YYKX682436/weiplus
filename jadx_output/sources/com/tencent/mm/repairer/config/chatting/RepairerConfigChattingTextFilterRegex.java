package com.tencent.mm.repairer.config.chatting;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/chatting/RepairerConfigChattingTextFilterRegex;", "Lq55/f;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class RepairerConfigChattingTextFilterRegex extends q55.f {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_FilterSpecialTextRegex";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "特殊字符正则";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.tencent.mm.repairer.group.RepairerGroupChatting.class;
    }

    @Override // q55.e
    public java.lang.Object i() {
        return "[ܶ-ܷ\u202e]";
    }

    @Override // q55.e
    public java.lang.String k() {
        return "clicfg_filter_special_text_regex_and";
    }
}
