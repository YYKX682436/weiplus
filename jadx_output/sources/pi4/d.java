package pi4;

/* loaded from: classes11.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f354826d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.convert.topic.error.TopicErrorLayout f354827e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.mm.plugin.textstatus.convert.topic.error.TopicErrorLayout topicErrorLayout, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f354827e = topicErrorLayout;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pi4.d(this.f354827e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pi4.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f354826d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (mj4.h hVar : ai4.m0.f5173a.G().q(en1.a.a())) {
                if (((mj4.k) hVar).f327067b.field_state == 5 || ((mj4.k) hVar).f327067b.field_state == 6) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.TopicErrorLayout", "index:" + arrayList.size() + " info:" + hVar);
                    arrayList.add(hVar);
                }
            }
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            pi4.c cVar = new pi4.c(this.f354827e, arrayList, null);
            this.f354826d = 1;
            if (kotlinx.coroutines.l.g(g3Var, cVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
