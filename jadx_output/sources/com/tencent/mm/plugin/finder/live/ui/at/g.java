package com.tencent.mm.plugin.finder.live.ui.at;

/* loaded from: classes.dex */
public final class g extends com.tencent.mm.plugin.finder.live.ui.at.o {
    public final java.lang.String D;
    public final jz5.g E;
    public final jz5.g F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(java.lang.String groupId, android.content.Context context, java.lang.Boolean bool, com.tencent.mm.plugin.finder.ui.at.a callback) {
        super(context, bool, callback);
        kotlin.jvm.internal.o.g(groupId, "groupId");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.D = groupId;
        this.E = jz5.h.b(new com.tencent.mm.plugin.finder.live.ui.at.e(this));
        this.F = jz5.h.b(new com.tencent.mm.plugin.finder.live.ui.at.f(this));
    }

    @Override // com.tencent.mm.plugin.finder.live.ui.at.o, com.tencent.mm.plugin.finder.ui.at.l
    public in5.s K() {
        return new in5.s() { // from class: com.tencent.mm.plugin.finder.live.ui.at.FinderLiveAtGroupMemberDialog$buildItemConvertFactory$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                return type != 2 ? type != 4 ? new com.tencent.mm.plugin.finder.live.ui.at.j(com.tencent.mm.plugin.finder.live.ui.at.g.this.f128887r) : new com.tencent.mm.plugin.finder.live.ui.at.p(com.tencent.mm.plugin.finder.live.ui.at.g.this.f128887r) : new com.tencent.mm.plugin.finder.live.ui.at.t(com.tencent.mm.plugin.finder.live.ui.at.g.this.f128887r);
            }
        };
    }

    @Override // com.tencent.mm.plugin.finder.live.ui.at.o, com.tencent.mm.plugin.finder.ui.at.l
    public java.lang.String L(com.tencent.mm.storage.z3 ct6) {
        kotlin.jvm.internal.o.g(ct6, "ct");
        java.lang.String z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(this.D).z0(ct6.d1());
        if (z07.length() == 0) {
            z07 = ct6.f2();
        }
        kotlin.jvm.internal.o.d(z07);
        return z07;
    }

    @Override // com.tencent.mm.plugin.finder.live.ui.at.o, com.tencent.mm.plugin.finder.ui.at.l
    public ym3.a N() {
        return (ym3.a) ((jz5.n) this.E).getValue();
    }

    @Override // com.tencent.mm.plugin.finder.live.ui.at.o, com.tencent.mm.plugin.finder.ui.at.l
    public ym3.b O() {
        return (com.tencent.mm.plugin.finder.live.ui.at.FinderLiveAtGroupSearchDataSource) ((jz5.n) this.F).getValue();
    }
}
