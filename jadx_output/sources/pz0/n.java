package pz0;

/* loaded from: classes5.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f359153d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f359154e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f359154e = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pz0.n(this.f359154e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pz0.n) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object m521constructorimpl;
        jz5.f0 f0Var = jz5.f0.f302826a;
        yz5.l lVar = this.f359154e;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f359153d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f359153d = 1;
            obj = kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new pz0.u(null), this);
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
        r45.cl6 cl6Var = new r45.cl6();
        cl6Var.f371659d = linkedList;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(cl6Var.toByteArray())));
            com.tencent.mars.xlog.Log.i("MicroMsg.MJTemplateApiFlutterPlugin", "getResourceList: " + linkedList.size());
            m521constructorimpl = kotlin.Result.m521constructorimpl(f0Var);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(new byte[0])));
            com.tencent.mars.xlog.Log.e("MicroMsg.MJTemplateApiFlutterPlugin", "getResourceList", m524exceptionOrNullimpl);
        }
        return f0Var;
    }
}
