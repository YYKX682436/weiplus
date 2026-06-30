package g43;

/* loaded from: classes5.dex */
public final class v extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g43.x f268790d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f268791e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f268792f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(g43.x xVar, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f268790d = xVar;
        this.f268791e = str;
        this.f268792f = str2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new g43.v(this.f268790d, this.f268791e, this.f268792f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        g43.v vVar = (g43.v) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        vVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        g43.x xVar = this.f268790d;
        java.util.List Wd = ((y33.h) xVar.f268798h.getValue()).Wd(this.f268791e, this.f268792f);
        androidx.lifecycle.j0 j0Var = xVar.f268795e;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(Wd, 10));
        java.util.Iterator it = Wd.iterator();
        while (it.hasNext()) {
            arrayList.add(new w33.c(null, ((y33.g) it.next()).t0(), false, 701, 5, null));
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            java.lang.Object next = it6.next();
            if (hashSet.add(((w33.c) next).f442710b.f442715a)) {
                arrayList2.add(next);
            }
        }
        j0Var.postValue(arrayList2);
        return jz5.f0.f302826a;
    }
}
