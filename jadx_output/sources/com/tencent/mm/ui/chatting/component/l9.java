package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public final class l9 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.f f199403d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f199404e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f199405f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f199406g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l9(com.tencent.mm.ui.widget.dialog.f fVar, kotlin.jvm.internal.c0 c0Var, yz5.l lVar, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f199403d = fVar;
        this.f199404e = c0Var;
        this.f199405f = lVar;
        this.f199406g = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.ui.chatting.component.l9(this.f199403d, this.f199404e, this.f199405f, this.f199406g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.ui.chatting.component.l9 l9Var = (com.tencent.mm.ui.chatting.component.l9) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        l9Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f199403d.a();
        if (!this.f199404e.f310112d) {
            this.f199405f.invoke(java.lang.Boolean.valueOf(this.f199406g));
        }
        return jz5.f0.f302826a;
    }
}
