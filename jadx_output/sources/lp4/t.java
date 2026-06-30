package lp4;

/* loaded from: classes10.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f320421d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f320422e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f320423f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f320424g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ lp4.u f320425h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(long j17, long j18, java.lang.Long l17, lp4.u uVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f320422e = j17;
        this.f320423f = j18;
        this.f320424g = l17;
        this.f320425h = uVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new lp4.t(this.f320422e, this.f320423f, this.f320424g, this.f320425h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((lp4.t) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.ArrayList<rm5.j> arrayList;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f320421d;
        lp4.u uVar = this.f320425h;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateTrackDuration startMs:");
            long j17 = this.f320422e;
            sb6.append(j17);
            sb6.append(" endMs:");
            long j18 = this.f320423f;
            sb6.append(j18);
            com.tencent.mars.xlog.Log.i("MicroMsg.TimelineEditorCorePlugin", sb6.toString());
            java.lang.Long l17 = this.f320424g;
            if (l17 != null) {
                l17.longValue();
                rm5.v vVar = uVar.f320429h;
                if (vVar != null && (arrayList = vVar.f397584l) != null) {
                    for (rm5.j jVar : arrayList) {
                        long j19 = jVar.f397501c;
                        if (l17 != null && j19 == l17.longValue()) {
                            jVar.e(j17);
                            jVar.d(j18);
                            uVar.A(uVar.f320428g.u(r95.a.c(jVar)));
                        }
                    }
                }
            }
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            lp4.s sVar = new lp4.s(uVar, null);
            this.f320421d = 1;
            if (kotlinx.coroutines.l.g(g3Var, sVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return uVar.f320429h;
    }
}
