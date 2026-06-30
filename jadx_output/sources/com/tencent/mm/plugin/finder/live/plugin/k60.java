package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class k60 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cm2.t f113198d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.r60 f113199e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k60(cm2.t tVar, com.tencent.mm.plugin.finder.live.plugin.r60 r60Var) {
        super(0);
        this.f113198d = tVar;
        this.f113199e = r60Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        cm2.t tVar = this.f113198d;
        cm2.t tVar2 = tVar instanceof cm2.t ? tVar : null;
        if (tVar2 != null) {
            tVar2.f43389h = 0;
        }
        com.tencent.mm.plugin.finder.live.plugin.r60 r60Var = this.f113199e;
        com.tencent.mm.plugin.finder.live.plugin.r60.t1(r60Var, tVar);
        com.tencent.mm.plugin.finder.live.plugin.r60.u1(r60Var);
        return jz5.f0.f302826a;
    }
}
