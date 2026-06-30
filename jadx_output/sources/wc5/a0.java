package wc5;

/* loaded from: classes4.dex */
public final class a0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f444529d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wc5.c0 f444530e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(java.util.List list, wc5.c0 c0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f444529d = list;
        this.f444530e = c0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new wc5.a0(this.f444529d, this.f444530e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        wc5.a0 a0Var = (wc5.a0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        a0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.util.List list = this.f444529d;
        boolean z17 = !list.isEmpty();
        wc5.c0 c0Var = this.f444530e;
        if (z17) {
            c0Var.f444543g = list;
            c0Var.U6(list);
        } else {
            java.util.List list2 = wc5.c0.f444539h;
            c0Var.W6();
            c0Var.f444543g = kz5.p0.f313996d;
        }
        return jz5.f0.f302826a;
    }
}
