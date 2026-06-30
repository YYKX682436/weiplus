package com.tencent.mm.plugin.finder.playlist;

/* loaded from: classes2.dex */
public final class g0 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.playlist.l0 f122307a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.vx0 f122308b;

    public g0(com.tencent.mm.plugin.finder.playlist.l0 l0Var, r45.vx0 vx0Var) {
        this.f122307a = l0Var;
        this.f122308b = vx0Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        com.tencent.mm.plugin.finder.playlist.l0 l0Var = this.f122307a;
        java.util.Map s17 = com.tencent.mm.plugin.finder.playlist.l0.s(l0Var, null, 1, null);
        if (s17 == null) {
            return null;
        }
        r45.vx0 vx0Var = this.f122308b;
        s17.put("collection_type", vx0Var != null ? java.lang.Integer.valueOf(vx0Var.getInteger(9)) : null);
        s17.put("feed_id", pm0.v.u(l0Var.f122338d.h().f122281a));
        return s17;
    }
}
