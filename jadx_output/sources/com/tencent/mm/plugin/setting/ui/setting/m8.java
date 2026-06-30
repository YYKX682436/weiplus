package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public final class m8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f161319d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.p8 f161320e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m8(com.tencent.mm.plugin.setting.ui.setting.p8 p8Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f161320e = p8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.setting.ui.setting.m8(this.f161320e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.setting.ui.setting.m8) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f161319d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            xg3.o0 fj6 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj();
            kotlin.jvm.internal.o.f(fj6, "getOpLogService(...)");
            kotlinx.coroutines.flow.n2 b17 = e21.a1.b(fj6);
            if (b17 == null) {
                return jz5.f0.f302826a;
            }
            com.tencent.mm.plugin.setting.ui.setting.l8 l8Var = new com.tencent.mm.plugin.setting.ui.setting.l8(this.f161320e);
            this.f161319d = 1;
            if (((kotlinx.coroutines.flow.k2) b17).a(l8Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        throw new jz5.d();
    }
}
