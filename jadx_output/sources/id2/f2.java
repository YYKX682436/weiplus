package id2;

/* loaded from: classes.dex */
public final class f2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f290563d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ id2.u3 f290564e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(xg2.h hVar, kotlin.coroutines.Continuation continuation, id2.u3 u3Var) {
        super(2, continuation);
        this.f290563d = hVar;
        this.f290564e = u3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new id2.f2(this.f290563d, continuation, this.f290564e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        id2.f2 f2Var = (id2.f2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        f2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String string;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f290563d).f454381b;
        com.tencent.mars.xlog.Log.i("AnchorMoreLiveNoticeOption", "createNotice: getLivePrepare error: " + aVar2);
        rm0.j jVar = aVar2.f454379a;
        id2.u3 u3Var = this.f290564e;
        if (jVar == null || (string = jVar.f397426g) == null) {
            string = u3Var.getContext().getString(com.tencent.mm.R.string.msg_net_error);
            kotlin.jvm.internal.o.f(string, "getString(...)");
        }
        db5.t7.g(u3Var.getContext(), string);
        return jz5.f0.f302826a;
    }
}
