package sf2;

/* loaded from: classes5.dex */
public final class y2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f407369d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407370e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sf2.d3 f407371f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407372g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f407373h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(xg2.h hVar, kotlin.coroutines.Continuation continuation, java.lang.String str, sf2.d3 d3Var, java.lang.String str2, kotlin.jvm.internal.h0 h0Var) {
        super(2, continuation);
        this.f407369d = hVar;
        this.f407370e = str;
        this.f407371f = d3Var;
        this.f407372g = str2;
        this.f407373h = h0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sf2.y2(this.f407369d, continuation, this.f407370e, this.f407371f, this.f407372g, this.f407373h);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        sf2.y2 y2Var = (sf2.y2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        y2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.ux1 ux1Var = (r45.ux1) ((xg2.i) this.f407369d).f454393b;
        sf2.d3 d3Var = this.f407371f;
        java.lang.String str = d3Var.f407105o;
        java.lang.String str2 = this.f407370e;
        if (kotlin.jvm.internal.o.b(str2, str)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FinderLiveKtvSearchMusicRequest success, realKey ");
            sb6.append(str2);
            sb6.append(", ID ");
            sb6.append(this.f407372g);
            sb6.append(", result continueFlag ");
            sb6.append(ux1Var.f387715f);
            sb6.append(' ');
            java.util.LinkedList play_basic_info_list = ux1Var.f387713d;
            kotlin.jvm.internal.o.f(play_basic_info_list, "play_basic_info_list");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(play_basic_info_list, 10));
            java.util.Iterator it = play_basic_info_list.iterator();
            while (it.hasNext()) {
                arrayList.add(((r45.ay1) it.next()).f370351e);
            }
            sb6.append(arrayList);
            com.tencent.mars.xlog.Log.i("FinderLiveRequestSongController", sb6.toString());
            this.f407373h.f310123d = ux1Var;
        } else {
            com.tencent.mars.xlog.Log.i("FinderLiveRequestSongController", "FinderLiveKtvSearchMusicRequest: Search for key:" + str2 + " has outdated. Drop search result and wait for " + d3Var.f407105o + "'s result back");
        }
        return jz5.f0.f302826a;
    }
}
