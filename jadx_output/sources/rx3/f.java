package rx3;

/* loaded from: classes10.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f401023d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f401024e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.k f401025f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rx3.h f401026g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f401027h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(java.util.List list, kotlinx.coroutines.flow.k kVar, rx3.h hVar, java.util.ArrayList arrayList, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f401024e = list;
        this.f401025f = kVar;
        this.f401026g = hVar;
        this.f401027h = arrayList;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rx3.f(this.f401024e, this.f401025f, this.f401026g, this.f401027h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rx3.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f401023d;
        java.util.ArrayList arrayList = this.f401027h;
        java.util.List<ox3.a> list = this.f401024e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.j m17 = kotlinx.coroutines.flow.l.m(new kotlinx.coroutines.flow.n(list), 0, new rx3.d(this.f401026g, null), 1, null);
            rx3.e eVar = new rx3.e(arrayList);
            this.f401023d = 1;
            if (m17.a(eVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (ox3.a aVar2 : list) {
            if (arrayList.contains(aVar2)) {
                arrayList2.add(aVar2);
                com.tencent.mars.xlog.Log.i("MicroMsg.ExclusiveRemoteDataSource", "avail data receive " + aVar2.f349721d.f415588d);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.ExclusiveRemoteDataSource", "no avail data receive");
            }
        }
        this.f401023d = 2;
        if (this.f401025f.emit(arrayList2, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
