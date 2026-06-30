package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class m8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f204566d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f204567e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f204568f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m8(yb5.d dVar, com.tencent.mm.storage.f9 f9Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f204567e = dVar;
        this.f204568f = f9Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.ui.chatting.viewitems.m8(this.f204567e, this.f204568f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.ui.chatting.viewitems.m8) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f204566d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            c00.z2 z2Var = (c00.z2) i95.n0.c(c00.z2.class);
            yb5.d dVar = this.f204567e;
            android.app.Activity g17 = dVar.g();
            kotlin.jvm.internal.o.f(g17, "getContext(...)");
            java.lang.String d17 = dVar.u().d1();
            kotlin.jvm.internal.o.f(d17, "getUsername(...)");
            com.tencent.mm.storage.f9 f9Var = this.f204568f;
            bw5.x8 x8Var = bw5.x8.ECS_REQ_SCENE_CONVERSATION;
            this.f204566d = 1;
            if (((b00.r) z2Var).oj(g17, d17, f9Var, x8Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
