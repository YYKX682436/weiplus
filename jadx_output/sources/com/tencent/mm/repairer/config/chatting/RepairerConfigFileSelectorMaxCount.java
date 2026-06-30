package com.tencent.mm.repairer.config.chatting;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/chatting/RepairerConfigFileSelectorMaxCount;", "Lq55/i;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class RepairerConfigFileSelectorMaxCount extends q55.i {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_FileSelectorMaxCount";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "文件选择器一次最多可以发送的数量";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.tencent.mm.repairer.group.RepairerGroupChatting.class;
    }

    @Override // q55.e
    public java.lang.Object i() {
        return 99;
    }

    @Override // q55.e
    public java.lang.String k() {
        return "clicfg_file_selector_max_count_and";
    }
}
