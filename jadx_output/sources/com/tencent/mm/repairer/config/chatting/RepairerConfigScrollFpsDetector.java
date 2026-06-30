package com.tencent.mm.repairer.config.chatting;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/chatting/RepairerConfigScrollFpsDetector;", "Lq55/i;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class RepairerConfigScrollFpsDetector extends q55.i {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_ScrollFpsDetector";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "滑动帧率检测";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.tencent.mm.repairer.group.RepairerGroupChatting.class;
    }

    @Override // q55.e
    public java.lang.Object i() {
        return j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigSensitiveUser()) == 1 ? 0 : 0;
    }

    @Override // q55.e
    public java.lang.String k() {
        return "clicfg_chattinglist_enable_fps_rpt";
    }
}
