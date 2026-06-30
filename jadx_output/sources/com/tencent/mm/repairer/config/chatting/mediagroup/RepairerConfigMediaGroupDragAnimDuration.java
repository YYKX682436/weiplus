package com.tencent.mm.repairer.config.chatting.mediagroup;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/chatting/mediagroup/RepairerConfigMediaGroupDragAnimDuration;", "Lq55/f;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class RepairerConfigMediaGroupDragAnimDuration extends q55.f {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_MediaGroup_DragAnimDuration";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "MediaGroup - 下滑返回动画时长";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.tencent.mm.repairer.group.RepairerGroupMediaGroup.class;
    }

    @Override // q55.f, q55.e
    public java.lang.String h() {
        return "Long";
    }

    @Override // q55.e
    public java.lang.Object i() {
        return 200L;
    }
}
