package qf2;

/* loaded from: classes.dex */
public final class j0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f362415d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ km2.q f362416e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qf2.v0 f362417f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f362418g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f362419h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(xg2.h hVar, kotlin.coroutines.Continuation continuation, km2.q qVar, qf2.v0 v0Var, yz5.l lVar, boolean z17) {
        super(2, continuation);
        this.f362415d = hVar;
        this.f362416e = qVar;
        this.f362417f = v0Var;
        this.f362418g = lVar;
        this.f362419h = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qf2.j0(this.f362415d, continuation, this.f362416e, this.f362417f, this.f362418g, this.f362419h);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        qf2.j0 j0Var = (qf2.j0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        j0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        rm0.j jVar = ((xg2.a) ((xg2.b) this.f362415d).f454381b).f454379a;
        if (jVar == null || (str = jVar.f397426g) == null) {
            str = "";
        }
        int i17 = jVar != null ? jVar.f397425f : 0;
        int i18 = jVar != null ? jVar.f397424e : 0;
        km2.q qVar = this.f362416e;
        if (qVar != null) {
            qVar.f309181l = 0;
        }
        if (str.length() > 0) {
            db5.t7.g(this.f362417f.O6(), str);
        }
        yz5.l lVar = this.f362418g;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.FALSE);
        }
        if (qVar != null) {
            mk2.h.f327133a.d(qVar.f309172c);
        }
        com.tencent.mars.xlog.Log.i("AnchorMicTRTCController", "close pk response fail, errCode: " + i17 + " errMsg: " + str + " errType: " + i18 + " isAnchorSelfExit: " + this.f362419h);
        return jz5.f0.f302826a;
    }
}
