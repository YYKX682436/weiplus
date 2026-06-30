package sf2;

/* loaded from: classes5.dex */
public final class b3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f407056d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407057e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sf2.d3 f407058f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407059g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f407060h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(xg2.h hVar, kotlin.coroutines.Continuation continuation, java.lang.String str, sf2.d3 d3Var, java.lang.String str2, kotlin.jvm.internal.h0 h0Var) {
        super(2, continuation);
        this.f407056d = hVar;
        this.f407057e = str;
        this.f407058f = d3Var;
        this.f407059g = str2;
        this.f407060h = h0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sf2.b3(this.f407056d, continuation, this.f407057e, this.f407058f, this.f407059g, this.f407060h);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        sf2.b3 b3Var = (sf2.b3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        b3Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.wx1 wx1Var = (r45.wx1) ((xg2.i) this.f407056d).f454393b;
        sf2.d3 d3Var = this.f407058f;
        java.lang.String str = d3Var.f407104n;
        java.lang.String str2 = this.f407057e;
        if (kotlin.jvm.internal.o.b(str2, str)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FinderLiveKtvSearchMusicSmartBoxRequest success, content ");
            sb6.append(str2);
            sb6.append(", ID ");
            sb6.append(this.f407059g);
            sb6.append(", ");
            java.util.LinkedList<r45.hy1> item_list = wx1Var.f389552d;
            kotlin.jvm.internal.o.f(item_list, "item_list");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(item_list, 10));
            for (r45.hy1 hy1Var : item_list) {
                arrayList.add(hy1Var.f376553f + ' ' + hy1Var.f376554g);
            }
            sb6.append(arrayList);
            com.tencent.mars.xlog.Log.i("FinderLiveRequestSongController", sb6.toString());
            this.f407060h.f310123d = wx1Var;
        } else {
            com.tencent.mars.xlog.Log.i("FinderLiveRequestSongController", "FinderLiveKtvSearchMusicSmartBoxRequest: Search for:" + str2 + " has outdated. Drop search result and wait for " + d3Var.f407104n + "'s result back");
        }
        return jz5.f0.f302826a;
    }
}
