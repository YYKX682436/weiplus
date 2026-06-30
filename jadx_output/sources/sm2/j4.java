package sm2;

/* loaded from: classes3.dex */
public final class j4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f409518d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f409519e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409520f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(java.util.LinkedList linkedList, sm2.o4 o4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f409519e = linkedList;
        this.f409520f = o4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sm2.j4(this.f409519e, this.f409520f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((sm2.j4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object obj2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f409518d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f409518d = 1;
            if (kotlinx.coroutines.k1.b(15000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.util.LinkedList<km2.q> linkedList = this.f409519e;
        sm2.o4 o4Var = this.f409520f;
        for (km2.q qVar : linkedList) {
            java.util.ArrayList arrayList = zn0.x.f474414a.f474415a;
            kotlin.jvm.internal.o.f(arrayList, "getRemoteUserConfigList(...)");
            synchronized (arrayList) {
                java.util.Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (kotlin.jvm.internal.o.b(((zn0.v) obj2).f474406d, qVar.f309170a)) {
                        break;
                    }
                }
            }
            if (obj2 == null) {
                com.tencent.mars.xlog.Log.i(o4Var.f409610f, "startCloseLinkCheck, start close link mic, id: " + qVar.f309170a);
                sm2.o4.H(o4Var, qVar, 1, true, true, null, 16, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
