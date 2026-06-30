package xx0;

/* loaded from: classes5.dex */
public final class x extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xx0.d0 f457952d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f457953e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(xx0.d0 d0Var, java.util.List list, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f457952d = d0Var;
        this.f457953e = list;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xx0.x(this.f457952d, this.f457953e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        xx0.x xVar = (xx0.x) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        xVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        xx0.d0 d0Var = this.f457952d;
        d0Var.f457880h.setVisibility(0);
        xx0.t tVar = d0Var.f457881i;
        tVar.getClass();
        java.util.List data = this.f457953e;
        kotlin.jvm.internal.o.g(data, "data");
        java.util.ArrayList arrayList = (java.util.ArrayList) tVar.f457941g;
        arrayList.clear();
        arrayList.addAll(data);
        tVar.notifyDataSetChanged();
        return jz5.f0.f302826a;
    }
}
