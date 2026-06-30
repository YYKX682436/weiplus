package com.tencent.mm.repairer.config.chatting;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/chatting/RepairerConfigYuanBaoAnalyzeChatRecordsWebViewBaseUrl;", "Lq55/f;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class RepairerConfigYuanBaoAnalyzeChatRecordsWebViewBaseUrl extends q55.f {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_YuanBaoAnalyzeChatRecordsWebViewBaseUrl";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "「元宝分析聊天记录」WebView base URL";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.tencent.mm.repairer.group.RepairerGroupChatting.class;
    }

    @Override // q55.e
    public java.lang.Object i() {
        return "https://yuanbao.tencent.com/chat/naQivTmsDa?from=WeixinMessage&tridChannel=wxltjlzj.lqybh5xzrk.app&login=1";
    }

    @Override // q55.e
    public java.lang.String k() {
        return "clicfg_yuanbao_analyze_chat_records_base_url";
    }
}
