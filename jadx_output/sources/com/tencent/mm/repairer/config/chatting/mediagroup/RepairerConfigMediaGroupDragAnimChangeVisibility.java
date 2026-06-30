package com.tencent.mm.repairer.config.chatting.mediagroup;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/chatting/mediagroup/RepairerConfigMediaGroupDragAnimChangeVisibility;", "Lq55/i;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class RepairerConfigMediaGroupDragAnimChangeVisibility extends q55.i {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_MediaGroup_DragAnimChangeVisibility";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "MediaGroup - 下滑返回动画隐藏 Chatting 缩略图 View";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.tencent.mm.repairer.group.RepairerGroupMediaGroup.class;
    }

    @Override // q55.e
    public java.lang.Object i() {
        int i17 = com.tencent.mm.sdk.platformtools.z.f193112h;
        return java.lang.Integer.valueOf(((i17 == 788529167 || i17 == 788529166) || z65.c.a()) ? 1 : 0);
    }

    @Override // q55.e
    public java.lang.String k() {
        return "clicfg_mediagroup_drag_anim_change_visibility";
    }
}
