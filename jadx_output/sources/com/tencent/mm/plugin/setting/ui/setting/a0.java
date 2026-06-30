package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public final class a0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.i0 f160789d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f160790e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.tencent.mm.plugin.setting.ui.setting.i0 i0Var, kotlin.jvm.internal.c0 c0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f160789d = i0Var;
        this.f160790e = c0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.setting.ui.setting.a0(this.f160789d, this.f160790e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.setting.ui.setting.a0 a0Var = (com.tencent.mm.plugin.setting.ui.setting.a0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        a0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        boolean z17 = this.f160790e.f310112d;
        com.tencent.mm.plugin.setting.ui.setting.o oVar = com.tencent.mm.plugin.setting.ui.setting.i0.B;
        this.f160789d.X6(z17, false);
        return jz5.f0.f302826a;
    }
}
