package com.tencent.mm.plugin.finder.live.wish.view;

/* loaded from: classes3.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.wish.view.x f120633d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f120634e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.tencent.mm.plugin.finder.live.wish.view.x xVar, android.view.View view) {
        super(0);
        this.f120633d = xVar;
        this.f120634e = view;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo;
        r45.zv1 zv1Var = this.f120633d.f120674k;
        if (zv1Var != null && (finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) zv1Var.getCustom(5)) != null) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.e1 e1Var = ya2.e1.f460472a;
            android.content.Context context = this.f120634e.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            zy2.ta.g(e1Var, context, finderJumpInfo, null, null, false, 28, null);
        }
        return jz5.f0.f302826a;
    }
}
