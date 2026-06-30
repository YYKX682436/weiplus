package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class rv extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f114195d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ow f114196e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f114197f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f114198g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rv(com.tencent.mm.plugin.finder.live.plugin.ow owVar, int i17, int i18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f114196e = owVar;
        this.f114197f = i17;
        this.f114198g = i18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.rv(this.f114196e, this.f114197f, this.f114198g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.rv) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f114195d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.finder.live.plugin.ow owVar = this.f114196e;
            if (owVar.f113796w.size() <= 0) {
                com.tencent.mars.xlog.Log.e(owVar.f113787p, "emitLikeConfettiToOther: confettiBitmaps is empty");
                return f0Var;
            }
            java.util.ArrayList arrayList = owVar.f113796w;
            java.lang.Object obj2 = arrayList.get(owVar.F1(arrayList.size()));
            kotlin.jvm.internal.o.f(obj2, "get(...)");
            this.f114195d = 1;
            if (owVar.y1((android.graphics.Bitmap) obj2, this.f114197f, this.f114198g, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return f0Var;
    }
}
