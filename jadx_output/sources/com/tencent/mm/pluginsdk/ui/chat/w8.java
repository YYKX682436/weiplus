package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes3.dex */
public final class w8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f190709d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f190710e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.h9 f190711f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w8(com.tencent.mm.pluginsdk.ui.chat.h9 h9Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f190711f = h9Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.pluginsdk.ui.chat.w8 w8Var = new com.tencent.mm.pluginsdk.ui.chat.w8(this.f190711f, continuation);
        w8Var.f190710e = obj;
        return w8Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.pluginsdk.ui.chat.w8) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.y0 y0Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f190709d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var2 = (kotlinx.coroutines.y0) this.f190710e;
            this.f190710e = y0Var2;
            this.f190709d = 1;
            if (kotlinx.coroutines.k1.b(100L, this) == aVar) {
                return aVar;
            }
            y0Var = y0Var2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y0Var = (kotlinx.coroutines.y0) this.f190710e;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (kotlinx.coroutines.z0.h(y0Var)) {
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            com.tencent.mm.pluginsdk.ui.chat.h9 h9Var = this.f190711f;
            animatorSet.playTogether(h9Var.f190378x, h9Var.f190379y, h9Var.f190380z, h9Var.A, h9Var.B);
            animatorSet.addListener(new com.tencent.mm.pluginsdk.ui.chat.v8(h9Var, animatorSet));
            h9Var.O = animatorSet;
            animatorSet.start();
        }
        return jz5.f0.f302826a;
    }
}
