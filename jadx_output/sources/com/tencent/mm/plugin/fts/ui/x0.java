package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes8.dex */
public final class x0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f138371d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f138372e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f138373f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(androidx.appcompat.app.AppCompatActivity appCompatActivity, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f138372e = appCompatActivity;
        this.f138373f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.fts.ui.x0(this.f138372e, this.f138373f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.fts.ui.x0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f138371d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            wd0.y1 y1Var = (wd0.y1) i95.n0.c(wd0.y1.class);
            this.f138371d = 1;
            if (((vd0.l3) y1Var).Di(this.f138372e, this.f138373f, this) == aVar) {
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
