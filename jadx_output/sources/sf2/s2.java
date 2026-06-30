package sf2;

/* loaded from: classes10.dex */
public final class s2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f407273d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f407274e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407275f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407276g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ sf2.d3 f407277h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f407278i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(xg2.h hVar, kotlin.coroutines.Continuation continuation, int i17, java.lang.String str, java.lang.String str2, sf2.d3 d3Var, kotlin.jvm.internal.h0 h0Var) {
        super(2, continuation);
        this.f407273d = hVar;
        this.f407274e = i17;
        this.f407275f = str;
        this.f407276g = str2;
        this.f407277h = d3Var;
        this.f407278i = h0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sf2.s2(this.f407273d, continuation, this.f407274e, this.f407275f, this.f407276g, this.f407277h, this.f407278i);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        sf2.s2 s2Var = (sf2.s2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        s2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.mx1 mx1Var = (r45.mx1) ((xg2.i) this.f407273d).f454393b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FinderLiveKtvModSongListRequest success, modType: ");
        int i17 = this.f407274e;
        sb6.append(i17);
        sb6.append(", mid: ");
        sb6.append(this.f407275f);
        sb6.append(", uniqueId ");
        sb6.append(this.f407276g);
        com.tencent.mars.xlog.Log.i("FinderLiveRequestSongController", sb6.toString());
        if (i17 != 4) {
            kotlin.jvm.internal.o.d(mx1Var);
            sf2.d3.Z6(this.f407277h, i17, mx1Var, "modSong");
        }
        this.f407278i.f310123d = mx1Var;
        return jz5.f0.f302826a;
    }
}
