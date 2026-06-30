package com.tencent.mm.plugin.finder.playlist;

/* loaded from: classes2.dex */
public final class k {
    public k(kotlin.jvm.internal.i iVar) {
    }

    public static final void a(com.tencent.mm.plugin.finder.playlist.k kVar, com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawer finderPlayListDrawer) {
        kVar.getClass();
        com.tencent.mm.plugin.finder.assist.g2.a(com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawer.H, 100L, null, new com.tencent.mm.plugin.finder.playlist.j(finderPlayListDrawer), com.tencent.mm.plugin.finder.assist.h2.f102216e, null, 18, null);
    }

    public final java.lang.Integer b(java.util.List list, int i17) {
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject2;
        r45.dm2 object_extend;
        r45.vx0 vx0Var;
        java.lang.Object a07 = list != null ? kz5.n0.a0(list, i17) : null;
        com.tencent.mm.plugin.finder.playlist.z1 z1Var = a07 instanceof com.tencent.mm.plugin.finder.playlist.z1 ? (com.tencent.mm.plugin.finder.playlist.z1) a07 : null;
        if (z1Var == null || (feedObject = z1Var.getFeedObject()) == null || (feedObject2 = feedObject.getFeedObject()) == null || (object_extend = feedObject2.getObject_extend()) == null || (vx0Var = (r45.vx0) object_extend.getCustom(0)) == null) {
            return null;
        }
        return java.lang.Integer.valueOf(vx0Var.getInteger(6));
    }
}
