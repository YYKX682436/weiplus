package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class gs extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f118474d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.et f118475e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.vv1 f118476f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gs(com.tencent.mm.plugin.finder.live.widget.et etVar, r45.vv1 vv1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f118475e = etVar;
        this.f118476f = vv1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.gs(this.f118475e, this.f118476f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.widget.gs) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f118474d;
        com.tencent.mm.plugin.finder.live.widget.et etVar = this.f118475e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            int integer = this.f118476f.getInteger(0);
            this.f118474d = 1;
            obj = etVar.j0(integer, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
            com.tencent.mm.plugin.finder.live.widget.e0.t(etVar, false, 1, null);
        }
        return jz5.f0.f302826a;
    }
}
