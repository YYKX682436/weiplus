package kj5;

/* loaded from: classes.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kj5.f f308458d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(kj5.f fVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f308458d = fVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new kj5.d(this.f308458d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        kj5.d dVar = (kj5.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        dVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.sdk.coroutines.LifecycleScope O6;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.storage.g9 cj6 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
        kj5.f fVar = this.f308458d;
        java.lang.String stringExtra = fVar.getIntent().getStringExtra("key_create_chatroom_from_username");
        if (stringExtra == null) {
            stringExtra = "";
        }
        if (cj6.D2(stringExtra) > 0 && (O6 = fVar.O6()) != null) {
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.d(O6, kotlinx.coroutines.internal.b0.f310484a, null, new kj5.c(fVar, null), 2, null);
        }
        return jz5.f0.f302826a;
    }
}
