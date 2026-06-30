package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public final class kh extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.nh f199367d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f199368e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kh(com.tencent.mm.ui.chatting.component.nh nhVar, com.tencent.mm.storage.f9 f9Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f199367d = nhVar;
        this.f199368e = f9Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.ui.chatting.component.kh(this.f199367d, this.f199368e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.ui.chatting.component.kh khVar = (com.tencent.mm.ui.chatting.component.kh) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        khVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.ui.chatting.component.nh nhVar = this.f199367d;
        db5.t7.i(nhVar.f199592a.g(), nhVar.f199592a.s().getString(com.tencent.mm.R.string.b5r), com.tencent.mm.R.raw.icons_filled_error);
        cd0.c0.f40528a.a(this.f199368e, 3);
        return jz5.f0.f302826a;
    }
}
