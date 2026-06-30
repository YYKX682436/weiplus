package ty0;

/* loaded from: classes5.dex */
public final class e0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e0.f1 f422824d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f422825e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ty0.b1 f422826f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(e0.f1 f1Var, n0.e5 e5Var, ty0.b1 b1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f422824d = f1Var;
        this.f422825e = e5Var;
        this.f422826f = b1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ty0.e0(this.f422824d, this.f422825e, this.f422826f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ty0.e0 e0Var = (ty0.e0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        e0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        ty0.c cVar;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        n0.h3 h3Var = ty0.z0.f423042a;
        e0.f1 f1Var = this.f422824d;
        java.util.List b17 = f1Var.f().b();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : b17) {
            e0.q0 q0Var = (e0.q0) ((e0.n) obj2);
            int max = java.lang.Math.max(0, f1Var.f().d() - q0Var.f245678a);
            int i17 = q0Var.f245678a;
            int i18 = q0Var.f245681d;
            if (java.lang.Math.max(0.0f, 100.0f - ((((float) (max + java.lang.Math.max(0, (i17 + i18) - f1Var.f().f()))) * 100.0f) / ((float) i18))) >= 30.0f) {
                arrayList.add(obj2);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((com.tencent.maas.model.MJMusicInfo) kz5.n0.a0(ty0.z0.h(this.f422825e), ((e0.q0) ((e0.n) it.next())).f245679b));
        }
        java.util.Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            com.tencent.maas.model.MJMusicInfo mJMusicInfo = (com.tencent.maas.model.MJMusicInfo) it6.next();
            if (mJMusicInfo != null && (cVar = this.f422826f.f422800j) != null) {
                java.lang.String musicID = mJMusicInfo.getMusicID();
                kotlin.jvm.internal.o.f(musicID, "getMusicID(...)");
                bz0.j.f36750a.a(((mz0.q2) cVar).f333029a.o7().a(), musicID);
            }
        }
        return jz5.f0.f302826a;
    }
}
