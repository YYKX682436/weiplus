package du3;

/* loaded from: classes3.dex */
public final class c1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f243548d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ du3.i1 f243549e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(java.util.ArrayList arrayList, du3.i1 i1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f243548d = arrayList;
        this.f243549e = i1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new du3.c1(this.f243548d, this.f243549e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        du3.c1 c1Var = (du3.c1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        c1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        for (hk0.j jVar : this.f243548d) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoCropPlugin", "collect event >> " + jVar.f281752a);
            if (jVar.f281752a == 3) {
                this.f243549e.z(jVar.f281753b.getBoolean("BUNDLE_KEY_BOOLEAN_1", false));
            }
        }
        return jz5.f0.f302826a;
    }
}
