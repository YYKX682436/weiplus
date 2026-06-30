package com.tencent.mm.ui.chatting.utils;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/ui/chatting/utils/ServiceNotifyFoldTest;", "Lq55/i;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ServiceNotifyFoldTest extends q55.i {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_ServiceNotifyABTest";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "是否开启服务通知折叠优化";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.tencent.mm.repairer.config.chatting.RepairerGroupChatListAsyncBind.class;
    }

    @Override // q55.e
    public java.lang.Object i() {
        return 0;
    }

    @Override // q55.e
    public java.lang.String k() {
        return "clicfg_service_notice_template_message_fold_switch";
    }

    @Override // q55.i, q55.d
    public java.util.List n() {
        return kz5.c0.i("关闭", "启用");
    }

    @Override // q55.i, q55.d
    public java.util.List o() {
        return kz5.c0.i("0", "1");
    }
}
