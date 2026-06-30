package sf2;

/* loaded from: classes10.dex */
public final class v0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f407316d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f407317e;

    /* renamed from: f, reason: collision with root package name */
    public int f407318f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sf2.e1 f407319g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.z22 f407320h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.by1 f407321i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(sf2.e1 e1Var, r45.z22 z22Var, r45.by1 by1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f407319g = e1Var;
        this.f407320h = z22Var;
        this.f407321i = by1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sf2.v0(this.f407319g, this.f407320h, this.f407321i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((sf2.v0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        om2.p pVar;
        r45.yx1 yx1Var;
        om2.p pVar2;
        sf2.e1 e1Var = this.f407319g;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f407318f;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                r45.yx1 yx1Var2 = new r45.yx1();
                r45.z22 z22Var = this.f407320h;
                r45.by1 by1Var = this.f407321i;
                java.lang.String str = z22Var.f391627d;
                yx1Var2.f391458d = str;
                yx1Var2.f391459e = str;
                yx1Var2.f391466o = by1Var;
                yx1Var2.f391469r = ((mm2.c1) ((jz5.n) e1Var.f407118o).getValue()).m8();
                com.tencent.mars.xlog.Log.i("FinderLiveNormalRoomSingController", "1. getBaseResourceSongInfo");
                om2.t c17 = com.tencent.mm.plugin.finder.live.util.d2.c(yx1Var2, false);
                if (c17 != null && (pVar = c17.f346382b) != null) {
                    com.tencent.mars.xlog.Log.i("FinderLiveNormalRoomSingController", "baseInfo: hasNote=" + pVar.f346369c);
                    com.tencent.mars.xlog.Log.i("FinderLiveNormalRoomSingController", "2. checkDecodeSongMusicRes");
                    gk2.e liveRoomData = e1Var.getStore().getLiveRoomData();
                    this.f407316d = yx1Var2;
                    this.f407317e = pVar;
                    this.f407318f = 1;
                    java.lang.Object a17 = com.tencent.mm.plugin.finder.live.util.d2.a(liveRoomData, yx1Var2, this);
                    if (a17 == aVar) {
                        return aVar;
                    }
                    yx1Var = yx1Var2;
                    obj = a17;
                    pVar2 = pVar;
                }
                com.tencent.mars.xlog.Log.e("FinderLiveNormalRoomSingController", "getBaseResourceSongInfo failed");
                return null;
            }
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pVar2 = (om2.p) this.f407317e;
            yx1Var = (r45.yx1) this.f407316d;
            kotlin.ResultKt.throwOnFailure(obj);
            om2.r rVar = (om2.r) obj;
            om2.q qVar = rVar.f346377c;
            if (qVar == null) {
                com.tencent.mars.xlog.Log.e("FinderLiveNormalRoomSingController", "checkDecodeSongMusicRes failed: " + rVar.f346375a);
                return null;
            }
            com.tencent.mars.xlog.Log.i("FinderLiveNormalRoomSingController", "musicResourceInfo: hasOriginal=" + qVar.f346372a + ", accompanyPath=" + qVar.f346373b);
            om2.s sVar = new om2.s(yx1Var, pVar2, qVar);
            com.tencent.mars.xlog.Log.i("FinderLiveNormalRoomSingController", "loadSongResource success");
            return sVar;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("FinderLiveNormalRoomSingController", "loadSongResource error: " + e17.getMessage(), e17);
            return null;
        }
    }
}
