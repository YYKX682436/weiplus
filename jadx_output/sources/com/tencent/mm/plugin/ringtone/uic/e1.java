package com.tencent.mm.plugin.ringtone.uic;

/* loaded from: classes10.dex */
public final class e1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f158391d;

    /* renamed from: e, reason: collision with root package name */
    public int f158392e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ringtone.uic.k1 f158393f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f158394g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(com.tencent.mm.plugin.ringtone.uic.k1 k1Var, kotlin.coroutines.Continuation continuation, kotlin.coroutines.Continuation continuation2) {
        super(2, continuation2);
        this.f158393f = k1Var;
        this.f158394g = continuation;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.ringtone.uic.e1(this.f158393f, this.f158394g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.ringtone.uic.e1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        vx3.i f17;
        java.lang.Object e17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f158392e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            f17 = mx3.i0.f();
            this.f158391d = f17;
            this.f158392e = 1;
            e17 = xx3.h.f458024a.e(2, 1, 0, 0L, "", 0, 0, 0, "", this);
            if (e17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vx3.i iVar = (vx3.i) this.f158391d;
            kotlin.ResultKt.throwOnFailure(obj);
            f17 = iVar;
            e17 = obj;
        }
        boolean z17 = ((rm0.i) e17).f397421a;
        kotlin.coroutines.Continuation continuation = this.f158394g;
        if (z17) {
            mx3.i0.k("", null);
            boolean z18 = (f17.f441301r == null || f17.i().f257604b == null || !co4.c.b(f17.i())) ? false : true;
            androidx.appcompat.app.AppCompatActivity activity = this.f158393f.getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            ((com.tencent.mm.plugin.ringtone.uic.d3) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.ringtone.uic.d3.class)).P6(f17, null, z18);
            java.lang.String r17 = c01.z1.r();
            kotlin.jvm.internal.o.f(r17, "getUsernameFromUserInfo(...)");
            mx3.i0.m(r17, null, 0L, 4, null);
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE));
        } else {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE));
        }
        return jz5.f0.f302826a;
    }
}
