package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class ab extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.ob f123532d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ya2.b2 f123533e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab(com.tencent.mm.plugin.finder.profile.uic.ob obVar, ya2.b2 b2Var) {
        super(1);
        this.f123532d = obVar;
        this.f123533e = b2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String nickname = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(nickname, "nickname");
        com.tencent.mars.xlog.Log.i("Finder.FinderProfileHeaderUIC", "jumpAtProfileUIOfAtContact nickname:".concat(nickname));
        com.tencent.mm.plugin.finder.profile.uic.ob obVar = this.f123532d;
        if (!obVar.B7()) {
            ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).uj(obVar.getContext(), nickname, this.f123533e.D0(), false, null, null);
        }
        return jz5.f0.f302826a;
    }
}
