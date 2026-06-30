package gx0;

/* loaded from: classes5.dex */
public final class mb extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f276717d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f276718e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f276719f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gx0.ac f276720g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mb(java.util.List list, gx0.ac acVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f276719f = list;
        this.f276720g = acVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        gx0.mb mbVar = new gx0.mb(this.f276719f, this.f276720g, continuation);
        mbVar.f276718e = obj;
        return mbVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.mb) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f276717d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f276718e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = this.f276719f.iterator();
            while (it.hasNext()) {
                arrayList.add(kotlinx.coroutines.l.b(y0Var, null, null, new gx0.lb(this.f276720g, (com.tencent.maas.base.MJID) it.next(), null), 3, null));
            }
            this.f276717d = 1;
            obj = kotlinx.coroutines.h.a(arrayList, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
