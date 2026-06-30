package hk0;

/* loaded from: classes3.dex */
public final class o0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f281784d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hk0.u0 f281785e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(hk0.u0 u0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f281785e = u0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hk0.o0(this.f281785e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((hk0.o0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f281784d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("BUNDLE_KEY_BOOLEAN_1", false);
            arrayList.add(new hk0.j(2, bundle));
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putBoolean("BUNDLE_KEY_BOOLEAN_1", false);
            arrayList.add(new hk0.j(1, bundle2));
            android.os.Bundle bundle3 = new android.os.Bundle();
            bundle3.putBoolean("BUNDLE_KEY_BOOLEAN_1", false);
            arrayList.add(new hk0.j(3, bundle3));
            kotlinx.coroutines.flow.j2 j2Var = this.f281785e.f281819m;
            this.f281784d = 1;
            ((kotlinx.coroutines.flow.h3) j2Var).emit(arrayList, this);
            if (f0Var == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return f0Var;
    }
}
