package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public final class jh extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f199289d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.nh f199290e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f199291f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jh(com.tencent.mm.storage.f9 f9Var, com.tencent.mm.ui.chatting.component.nh nhVar, com.tencent.mm.ui.widget.dialog.u3 u3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f199289d = f9Var;
        this.f199290e = nhVar;
        this.f199291f = u3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.ui.chatting.component.jh(this.f199289d, this.f199290e, this.f199291f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.ui.chatting.component.jh jhVar = (com.tencent.mm.ui.chatting.component.jh) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        jhVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        cd0.b0.f40525a.c(this.f199289d, "", this.f199290e.f199592a, this.f199291f, false);
        return jz5.f0.f302826a;
    }
}
