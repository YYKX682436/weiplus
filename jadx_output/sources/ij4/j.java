package ij4;

/* loaded from: classes8.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f291732d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ej4.e0 f291733e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f291734f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ej4.e0 e0Var, java.util.ArrayList arrayList, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f291733e = e0Var;
        this.f291734f = arrayList;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ij4.j(this.f291733e, this.f291734f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ij4.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f291732d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f291732d = 1;
            obj = kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new gj4.a(2L, 0L, 50L, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.util.LinkedList linkedList = (java.util.LinkedList) obj;
        if (linkedList == null) {
            return null;
        }
        ej4.e0 e0Var = this.f291733e;
        e0Var.getClass();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            linkedList2.add(fj4.b.a((pj4.n1) it.next()));
        }
        java.util.ArrayList a17 = e0Var.a(linkedList2);
        ej4.d0 d0Var = ej4.e0.f253344c;
        com.tencent.mars.xlog.Log.i("MicroMsg.TopicSelfItemHelper", "setTopicHistoryIconTextStatusHistory >> " + linkedList2.size());
        java.util.LinkedList linkedList3 = ej4.e0.f253346e;
        linkedList3.clear();
        linkedList3.addAll(linkedList2);
        return java.lang.Boolean.valueOf(this.f291734f.addAll(a17));
    }
}
