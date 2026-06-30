package ni2;

/* loaded from: classes3.dex */
public final class r2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f337460d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sf2.d3 f337461e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ni2.u2 f337462f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(sf2.d3 d3Var, ni2.u2 u2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f337461e = d3Var;
        this.f337462f = u2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ni2.r2(this.f337461e, this.f337462f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ni2.r2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f337460d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f337460d = 1;
            obj = this.f337461e.a7(13, null, true, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mars.xlog.Log.i("FinderLiveVoiceRoomModePanel", "clearSong res: " + ((r45.mx1) obj));
        this.f337462f.y();
        return jz5.f0.f302826a;
    }
}
