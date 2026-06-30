package zw;

/* loaded from: classes.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f476515d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qc0.m1 f476516e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f476517f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f476518g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(boolean z17, qc0.m1 m1Var, yz5.l lVar, android.content.Context context, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f476515d = z17;
        this.f476516e = m1Var;
        this.f476517f = lVar;
        this.f476518g = context;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new zw.i(this.f476515d, this.f476516e, this.f476517f, this.f476518g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        zw.i iVar = (zw.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        iVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        if (this.f476515d) {
            zw.o oVar = zw.o.f476536a;
            qc0.m1 m1Var = this.f476516e;
            kotlinx.coroutines.l.d(zw.o.f476537b, null, null, new zw.d(m1Var.f361413d, this.f476518g, this.f476517f, m1Var, m1Var.f361416g, null), 3, null);
        } else {
            java.util.List list = this.f476516e.f361413d;
            if (list != null) {
                arrayList = new java.util.ArrayList();
                for (java.lang.Object obj2 : list) {
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(((qc0.l1) obj2).f361396b)) {
                        arrayList.add(obj2);
                    }
                }
            } else {
                arrayList = null;
            }
            zw.o oVar2 = zw.o.f476536a;
            kotlinx.coroutines.l.d(zw.o.f476537b, null, null, new zw.g(arrayList, this.f476516e, this.f476518g, this.f476517f, null), 3, null);
        }
        return jz5.f0.f302826a;
    }
}
