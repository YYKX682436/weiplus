package sx3;

/* loaded from: classes10.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f413561d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f413562e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(java.util.LinkedList linkedList, androidx.appcompat.app.AppCompatActivity appCompatActivity, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f413561d = linkedList;
        this.f413562e = appCompatActivity;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sx3.k(this.f413561d, this.f413562e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        sx3.k kVar = (sx3.k) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        kVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        for (in5.x0 x0Var : this.f413561d) {
            androidx.appcompat.app.AppCompatActivity activity = this.f413562e;
            kotlin.jvm.internal.o.g(activity, "activity");
            java.lang.Object a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.ringtone.uic.c3.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            ed0.z0 z0Var = (ed0.z0) a17;
            int i17 = x0Var.f293160c;
            in5.c cVar = x0Var.f293158a;
            ed0.z0.i1(z0Var, 1L, i17, cVar instanceof ox3.g ? (ox3.g) cVar : null, 0L, 8, null);
        }
        return jz5.f0.f302826a;
    }
}
