package sf2;

/* loaded from: classes10.dex */
public final class r1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f407257d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sf2.w1 f407258e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407259f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407260g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(sf2.w1 w1Var, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f407258e = w1Var;
        this.f407259f = str;
        this.f407260g = str2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sf2.r1(this.f407258e, this.f407259f, this.f407260g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((sf2.r1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f407257d;
        java.lang.String str = this.f407259f;
        sf2.w1 w1Var = this.f407258e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f407257d = 1;
            obj = sf2.w1.Z6(w1Var, str, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        r45.by1 by1Var = (r45.by1) obj;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (by1Var == null) {
            com.tencent.mars.xlog.Log.e("FinderLiveNormalRoomVisitorSingController", "downloadLyricsResource: playInfo is null");
            return f0Var;
        }
        r45.ay1 ay1Var = by1Var.f371143d;
        java.lang.String str2 = ay1Var != null ? ay1Var.f370350d : null;
        if (str2 == null) {
            str2 = "";
        }
        if (str2.length() == 0) {
            com.tencent.mars.xlog.Log.e("FinderLiveNormalRoomVisitorSingController", "downloadLyricsResource: song_mid is empty");
            return f0Var;
        }
        r45.z22 z22Var = new r45.z22();
        z22Var.f391627d = str2;
        z22Var.f391629f = str;
        java.lang.String str3 = this.f407260g;
        z22Var.f391632i = str3;
        z22Var.f391631h = by1Var;
        w1Var.b7().U6(new mm2.i6(z22Var, null, true));
        r45.yx1 yx1Var = new r45.yx1();
        yx1Var.f391458d = str2;
        yx1Var.f391459e = str2;
        yx1Var.f391466o = by1Var;
        om2.t c17 = com.tencent.mm.plugin.finder.live.util.d2.c(yx1Var, false);
        if ((c17 != null ? c17.f346382b : null) == null) {
            com.tencent.mars.xlog.Log.e("FinderLiveNormalRoomVisitorSingController", "downloadLyricsResource: resourceInfo is null");
            return f0Var;
        }
        if (!kotlin.jvm.internal.o.b(w1Var.b7().N6(), str3)) {
            return f0Var;
        }
        w1Var.b7().U6(new mm2.i6(z22Var, c17.f346382b, true));
        return f0Var;
    }
}
