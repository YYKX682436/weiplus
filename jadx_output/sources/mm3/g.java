package mm3;

/* loaded from: classes10.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f329630d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.h6 f329631e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mm3.h f329632f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.mm.plugin.mv.ui.uic.h6 h6Var, mm3.h hVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f329631e = h6Var;
        this.f329632f = hVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mm3.g(this.f329631e, this.f329632f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mm3.g) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f329630d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f329630d = 1;
            if (kotlinx.coroutines.k1.b(100L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        pk4.c cVar = this.f329631e.f151186n;
        if (cVar != null) {
            mm3.h hVar = this.f329632f;
            int i18 = hVar.f329636d;
            long j17 = hVar.f329637e;
            gk4.r rVar = ((com.tencent.mm.plugin.thumbplayer.view.MultiMediaEffectVideoLayout) cVar).f174566f;
            java.lang.String str = rVar.f272602g;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("seekToIndexTime, index:");
            sb6.append(i18);
            sb6.append(", seekTo:");
            sb6.append(j17);
            sb6.append(", renderPts:");
            sb6.append(rVar.f272612q);
            sb6.append(", playingPlayers.size:");
            sb6.append(rVar.f272606k.size());
            sb6.append(", status:");
            sb6.append(rVar.f272611p);
            sb6.append(", trackList.size:");
            gk4.t tVar = rVar.f272609n;
            sb6.append((tVar == null || (arrayList2 = tVar.f272630a) == null) ? null : java.lang.Integer.valueOf(arrayList2.size()));
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
            gk4.t tVar2 = rVar.f272609n;
            if (tVar2 != null && (arrayList = tVar2.f272630a) != null && i18 <= arrayList.size()) {
                java.lang.Object obj2 = arrayList.get(i18);
                kotlin.jvm.internal.o.f(obj2, "get(...)");
                gk4.s sVar = (gk4.s) obj2;
                rVar.f272619x = sVar.f272623b + j17;
                rVar.g(sVar, j17);
            }
        }
        this.f329632f.f329638f = null;
        return jz5.f0.f302826a;
    }
}
