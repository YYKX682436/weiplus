package com.tencent.mm.repairer.config.chatting.mediagroup;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/chatting/mediagroup/RepairerConfigMediaGroupUiVisibility;", "Lq55/d;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class RepairerConfigMediaGroupUiVisibility extends q55.d {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_MediaGroup_SenderUiVisibility";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "MediaGroup - UI 展示";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.tencent.mm.repairer.group.RepairerGroupMediaGroup.class;
    }

    @Override // q55.e
    public java.lang.Object i() {
        int i17 = com.tencent.mm.sdk.platformtools.z.f193112h;
        boolean z17 = true;
        if (!(i17 == 788529167 || i17 == 788529166) && !z65.c.a()) {
            z17 = false;
        }
        return java.lang.Integer.valueOf(z17 ? 2 : 0);
    }

    @Override // q55.e
    public java.lang.String k() {
        return "clicfg_mediagroup_sender_ui_visibility_2";
    }

    @Override // q55.d
    public java.util.List n() {
        return kz5.c0.i("关闭", "仅接收", "打开");
    }

    @Override // q55.d
    public java.util.List o() {
        java.util.List i17 = kz5.c0.i(0, 1, 2);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(i17, 10));
        java.util.Iterator it = i17.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.String.valueOf(((java.lang.Number) it.next()).intValue()));
        }
        return arrayList;
    }
}
