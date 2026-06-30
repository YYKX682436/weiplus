package g43;

/* loaded from: classes5.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f268758d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f268759e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(java.lang.String str, java.util.List list, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f268758d = str;
        this.f268759e = list;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new g43.h(this.f268758d, this.f268759e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((g43.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        u33.m mVar = (u33.m) g43.m.f268766d.c().get(this.f268758d);
        if (mVar == null) {
            return null;
        }
        g43.u uVar = (g43.u) mVar;
        java.util.List users = this.f268759e;
        kotlin.jvm.internal.o.g(users, "users");
        boolean b17 = kotlin.jvm.internal.o.b(uVar.f268788b, uVar.f268789c.owner_username);
        g43.x xVar = uVar.f268787a;
        w33.b O6 = xVar.O6();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(users, 10));
        int i17 = 0;
        for (java.lang.Object obj2 : users) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            y33.g gVar = (y33.g) obj2;
            arrayList.add(i17 == 0 ? new w33.c(new jz5.l(java.lang.Boolean.TRUE, b17 ? com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492200fl2) : com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492201fl3)), gVar.t0(), false, 101, 4, null) : new w33.c(null, gVar.t0(), false, 101, 5, null));
            i17 = i18;
        }
        xVar.f268794d.postValue(w33.b.a(O6, null, null, new jz5.l(bool, arrayList), null, 11, null));
        return jz5.f0.f302826a;
    }
}
