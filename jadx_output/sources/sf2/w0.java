package sf2;

/* loaded from: classes10.dex */
public final class w0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f407328d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sf2.e1 f407329e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.z22 f407330f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f407331g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f407332h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f407333i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f407334m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(sf2.e1 e1Var, r45.z22 z22Var, boolean z17, boolean z18, yz5.l lVar, boolean z19, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f407329e = e1Var;
        this.f407330f = z22Var;
        this.f407331g = z17;
        this.f407332h = z18;
        this.f407333i = lVar;
        this.f407334m = z19;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sf2.w0(this.f407329e, this.f407330f, this.f407331g, this.f407332h, this.f407333i, this.f407334m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((sf2.w0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f407328d;
        r45.z22 z22Var = this.f407330f;
        sf2.e1 e1Var = this.f407329e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f407328d = 1;
            obj = sf2.e1.a7(e1Var, z22Var, this.f407331g, this.f407332h, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (booleanValue) {
            yz5.l lVar = this.f407333i;
            if (lVar != null) {
                lVar.invoke(java.lang.Boolean.TRUE);
            }
            return f0Var;
        }
        if (z22Var == null) {
            java.lang.String string = e1Var.O6().getString(com.tencent.mm.R.string.oro);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, string, 0).show();
            return f0Var;
        }
        java.lang.String string2 = e1Var.O6().getString(com.tencent.mm.R.string.nqp);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, string2, 0).show();
        if (!this.f407334m) {
            return f0Var;
        }
        com.tencent.mars.xlog.Log.i("FinderLiveNormalRoomSingController", "performSingJob: will skip to next song");
        r45.z22 P6 = e1Var.g7().P6(z22Var);
        if (P6 != null) {
            sf2.e1.m7(this.f407329e, P6, false, true, true, null, 18, null);
        }
        return f0Var;
    }
}
