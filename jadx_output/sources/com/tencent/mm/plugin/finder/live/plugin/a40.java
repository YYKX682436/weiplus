package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class a40 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cm2.b0 f111793a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f111794b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.c40 f111795c;

    public a40(cm2.b0 b0Var, boolean z17, com.tencent.mm.plugin.finder.live.plugin.c40 c40Var) {
        this.f111793a = b0Var;
        this.f111794b = z17;
        this.f111795c = c40Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.live.plugin.r60 r60Var;
        com.tencent.mm.protobuf.g byteString;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        cm2.b0 b0Var = this.f111793a;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = b0Var.f43331v;
        int i17 = fVar.f70615a;
        com.tencent.mm.plugin.finder.live.plugin.c40 c40Var = this.f111795c;
        if (i17 == 0 && fVar.f70616b == 0 && (byteString = ((r45.zs1) fVar.f70618d).getByteString(1)) != null) {
            com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo2 = new com.tencent.mm.protocal.protobuf.FinderJumpInfo();
            finderJumpInfo2.parseFrom(byteString.g());
            if (((mm2.f6) c40Var.f112109e.a(mm2.f6.class)).f329049w instanceof cm2.b0) {
                gk2.e eVar = c40Var.f112109e;
                so2.j5 j5Var = ((mm2.f6) eVar.a(mm2.f6.class)).f329049w;
                kotlin.jvm.internal.o.e(j5Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.convert.PromoteOtherItem");
                if (((cm2.b0) j5Var).f43385d == b0Var.f43385d) {
                    b0Var.f43331v = finderJumpInfo2;
                    ((mm2.f6) eVar.a(mm2.f6.class)).c7(b0Var);
                }
            }
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (!this.f111794b) {
            com.tencent.mm.plugin.finder.live.plugin.c40.f112107m.a(c40Var.f112108d, b0Var);
            return f0Var;
        }
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        if (k0Var == null || (r60Var = (com.tencent.mm.plugin.finder.live.plugin.r60) k0Var.getPlugin(com.tencent.mm.plugin.finder.live.plugin.r60.class)) == null) {
            return null;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putByteArray("POST_PORTRAIT_DATA", b0Var.f43331v.toByteArray());
        bundle.putInt("POST_PORTRAIT_DATA_TYPE", b0Var.f43332w);
        r60Var.p1("POST_PORTRAIT", bundle);
        return f0Var;
    }
}
