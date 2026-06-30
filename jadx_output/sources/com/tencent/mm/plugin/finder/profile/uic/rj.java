package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class rj extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.dk f124198d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bq.z1 f124199e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rj(com.tencent.mm.plugin.finder.profile.uic.dk dkVar, bq.z1 z1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f124198d = dkVar;
        this.f124199e = z1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.profile.uic.rj(this.f124198d, this.f124199e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.profile.uic.rj rjVar = (com.tencent.mm.plugin.finder.profile.uic.rj) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        rjVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        android.app.Activity context = this.f124198d.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.profile.uic.o0 o0Var = (com.tencent.mm.plugin.finder.profile.uic.o0) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.profile.uic.o0.class);
        if (o0Var != null) {
            bq.z1 userPageCgi = this.f124199e;
            kotlin.jvm.internal.o.g(userPageCgi, "userPageCgi");
            kotlinx.coroutines.y0 lifecycleScope = o0Var.getLifecycleScope();
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.d(lifecycleScope, kotlinx.coroutines.internal.b0.f310484a, null, new com.tencent.mm.plugin.finder.profile.uic.b0(userPageCgi, o0Var, null), 2, null);
        }
        return jz5.f0.f302826a;
    }
}
