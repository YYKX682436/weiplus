package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class z2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ew1 f120512d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.h3 f120513e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(r45.ew1 ew1Var, com.tencent.mm.plugin.finder.live.widget.h3 h3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f120512d = ew1Var;
        this.f120513e = h3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.z2(this.f120512d, this.f120513e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.widget.z2 z2Var = (com.tencent.mm.plugin.finder.live.widget.z2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        z2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.bw1 bw1Var = (r45.bw1) this.f120512d.getCustom(1);
        if (bw1Var != null) {
            this.f120513e.b(bw1Var);
        }
        return jz5.f0.f302826a;
    }
}
