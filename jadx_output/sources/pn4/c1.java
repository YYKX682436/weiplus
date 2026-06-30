package pn4;

/* loaded from: classes14.dex */
public final class c1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f357061d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pn4.e1 f357062e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(pn4.e1 e1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f357062e = e1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pn4.c1(this.f357062e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pn4.c1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f357061d;
        pn4.e1 e1Var = this.f357062e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f357061d = 1;
            obj = pn4.e1.d(e1Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        r45.ih6 ih6Var = (r45.ih6) obj;
        if (ih6Var != null) {
            if (ih6Var.getBoolean(1)) {
                e1Var.i("has_unknow_character");
            } else {
                com.tencent.mm.vfs.w6.h(e1Var.g());
                com.tencent.mm.vfs.w6.f(e1Var.g());
                this.f357061d = 2;
                if (pn4.e1.c(e1Var, ih6Var, this) == aVar) {
                    return aVar;
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
