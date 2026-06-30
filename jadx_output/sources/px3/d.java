package px3;

/* loaded from: classes10.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f358937d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f358938e;

    /* renamed from: f, reason: collision with root package name */
    public int f358939f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ px3.j f358940g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f358941h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(px3.j jVar, java.util.ArrayList arrayList, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f358940g = jVar;
        this.f358941h = arrayList;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new px3.d(this.f358940g, this.f358941h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((px3.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.Iterator it;
        px3.j jVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f358939f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            px3.j jVar2 = this.f358940g;
            int i18 = jVar2.f358952g;
            jVar2.getClass();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = this.f358941h;
            int size = arrayList2.size();
            int i19 = size / i18;
            if (i19 >= 0) {
                int i27 = 0;
                while (true) {
                    int i28 = i27 * i18;
                    int i29 = i27 + 1;
                    int i37 = i29 * i18;
                    if (i37 >= size) {
                        i37 = size;
                    }
                    arrayList.add(arrayList2.subList(i28, i37));
                    if (i27 == i19) {
                        break;
                    }
                    i27 = i29;
                }
            }
            it = arrayList.iterator();
            jVar = jVar2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (java.util.Iterator) this.f358938e;
            jVar = (px3.j) this.f358937d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        while (it.hasNext()) {
            java.util.List ringtone = (java.util.List) it.next();
            rx3.h hVar = jVar.f358949d;
            hVar.getClass();
            kotlin.jvm.internal.o.g(ringtone, "ringtone");
            kotlinx.coroutines.flow.m2 m2Var = new kotlinx.coroutines.flow.m2(new rx3.g(ringtone, hVar, null));
            px3.c cVar = new px3.c(jVar);
            this.f358937d = jVar;
            this.f358938e = it;
            this.f358939f = 1;
            if (m2Var.a(cVar, this) == aVar) {
                return aVar;
            }
        }
        return jz5.f0.f302826a;
    }
}
