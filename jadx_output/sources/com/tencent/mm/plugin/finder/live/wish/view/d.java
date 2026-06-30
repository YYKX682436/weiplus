package com.tencent.mm.plugin.finder.live.wish.view;

/* loaded from: classes3.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ot3 f120625d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.wish.view.x f120626e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(r45.ot3 ot3Var, com.tencent.mm.plugin.finder.live.wish.view.x xVar) {
        super(0);
        this.f120625d = ot3Var;
        this.f120626e = xVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo;
        r45.ot3 ot3Var = this.f120625d;
        if (ot3Var != null && (finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) ot3Var.getCustom(3)) != null) {
            this.f120626e.j(finderJumpInfo);
        }
        return jz5.f0.f302826a;
    }
}
