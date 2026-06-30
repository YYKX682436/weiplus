package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class p implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cm2.h0 f113806a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.r f113807b;

    public p(cm2.h0 h0Var, com.tencent.mm.plugin.finder.live.plugin.r rVar) {
        this.f113806a = h0Var;
        this.f113807b = rVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.lang.String string;
        com.tencent.mm.protobuf.g byteString;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        cm2.h0 h0Var = this.f113806a;
        r45.k92 k92Var = h0Var.f43348v;
        int i17 = fVar.f70615a;
        com.tencent.mm.plugin.finder.live.plugin.r rVar = this.f113807b;
        if (i17 == 0 && fVar.f70616b == 0 && (byteString = ((r45.zs1) fVar.f70618d).getByteString(1)) != null) {
            k92Var = new r45.k92();
            k92Var.parseFrom(byteString.g());
            com.tencent.mars.xlog.Log.i(rVar.f114065i, "getJumpInfo uxinfo = " + k92Var.getString(8));
            h0Var.f43348v = k92Var;
            h0Var.f43349w = k92Var.getLong(0);
            h0Var.f43350x = (r45.n3) k92Var.getCustom(1);
            h0Var.f43351y = k92Var.getString(2);
            h0Var.f43352z = k92Var.getString(3);
            h0Var.A = k92Var.getString(4);
            k92Var.getString(5);
            h0Var.B = k92Var.getString(6);
            k92Var.getInteger(7);
            h0Var.getClass();
            java.lang.String string2 = k92Var.getString(8);
            if (string2 == null) {
                string2 = "";
            }
            h0Var.C = string2;
            h0Var.D = k92Var.getInteger(10);
            h0Var.E = k92Var.getLong(11);
            gk2.e eVar = rVar.f114061e;
            if (((mm2.f6) eVar.a(mm2.f6.class)).f329049w instanceof cm2.h0) {
                so2.j5 j5Var = ((mm2.f6) eVar.a(mm2.f6.class)).f329049w;
                kotlin.jvm.internal.o.e(j5Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.convert.ShopWindowAdItem");
                if (((cm2.h0) j5Var).f43349w == h0Var.f43349w) {
                    ((mm2.f6) eVar.a(mm2.f6.class)).c7(h0Var);
                }
            }
        }
        com.tencent.mm.plugin.finder.live.plugin.m mVar = com.tencent.mm.plugin.finder.live.plugin.r.f114059n;
        android.view.ViewGroup viewGroup = rVar.f114066m;
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        android.content.Context context = viewGroup.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        mVar.a(context, rVar.f114061e, rVar.f114065i, h0Var);
        if (rVar.f114062f.getLiveRole() == 0) {
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.r0 r0Var = (ml2.r0) c17;
            ml2.f4 f4Var = ml2.f4.f327432f;
            java.lang.String valueOf = java.lang.String.valueOf(k92Var.getLong(0));
            r45.n3 n3Var = (r45.n3) k92Var.getCustom(1);
            java.lang.String str = (n3Var == null || (string = n3Var.getString(3)) == null) ? "" : string;
            java.lang.String valueOf2 = java.lang.String.valueOf(k92Var.getLong(0));
            java.lang.String string3 = k92Var.getString(8);
            ml2.r0.Dj(r0Var, f4Var, null, valueOf, str, valueOf2, string3 == null ? "" : string3, k92Var.getInteger(10), k92Var.getLong(11), null, null, null, null, false, null, 16128, null);
        }
        return jz5.f0.f302826a;
    }
}
