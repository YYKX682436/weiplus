package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class t7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f117423d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.z53 f117424e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.b8 f117425f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7(r45.z53 z53Var, com.tencent.mm.plugin.finder.live.viewmodel.b8 b8Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f117424e = z53Var;
        this.f117425f = b8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.viewmodel.t7(this.f117424e, this.f117425f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.viewmodel.t7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        yf2.z zVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f117423d;
        com.tencent.mm.plugin.finder.live.viewmodel.b8 b8Var = this.f117425f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (in0.q.f292769b2 == null) {
                in0.q.f292769b2 = new in0.q(rn0.a.f397609a.a());
            }
            in0.q qVar = in0.q.f292769b2;
            kotlin.jvm.internal.o.d(qVar);
            boolean z17 = this.f117424e.getInteger(18) != 1;
            androidx.appcompat.app.AppCompatActivity activity = b8Var.getActivity();
            this.f117423d = 1;
            obj = qVar.E0(z17, activity, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (((un0.h) obj) != null) {
            com.tencent.mm.plugin.finder.live.viewmodel.b8.f7(b8Var, true, false);
        } else {
            com.tencent.mm.plugin.finder.live.plugin.l lVar = b8Var.f116937e;
            if (lVar != null && (zVar = (yf2.z) lVar.U0(yf2.z.class)) != null) {
                zVar.a7(true);
            }
        }
        return jz5.f0.f302826a;
    }
}
