package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes8.dex */
public final class f3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f137539d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wd0.y1 f137540e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p13.v f137541f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(wd0.y1 y1Var, p13.v vVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f137540e = y1Var;
        this.f137541f = vVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.fts.logic.f3(this.f137540e, this.f137541f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.fts.logic.f3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f137539d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String originQuery = this.f137541f.f351159d.f351129a;
            kotlin.jvm.internal.o.f(originQuery, "originQuery");
            this.f137539d = 1;
            vd0.l3 l3Var = (vd0.l3) this.f137540e;
            l3Var.getClass();
            obj = kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310568a, new vd0.k3(originQuery, l3Var, "SettingSearch_Local", null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
