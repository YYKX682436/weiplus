package pe3;

/* loaded from: classes7.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f353664d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pe3.o f353665e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(pe3.o oVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f353665e = oVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pe3.m(this.f353665e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pe3.m) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f353664d;
        pe3.o oVar = this.f353665e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            se3.e eVar = oVar.f353669e;
            androidx.appcompat.app.AppCompatActivity activity = oVar.getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            java.lang.String O6 = ((pe3.h) pf5.z.f353948a.a(activity).a(pe3.h.class)).O6();
            this.f353664d = 1;
            if (eVar.P6(O6, this) == aVar) {
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
        se3.e eVar2 = oVar.f353669e;
        com.tencent.mm.plugin.magicbrush.scldemo.view.MagicBrushSclDemoView magicBrushSclDemoView = oVar.f353668d;
        if (magicBrushSclDemoView == null) {
            kotlin.jvm.internal.o.o("frameSetView");
            throw null;
        }
        this.f353664d = 2;
        if (eVar2.N6(magicBrushSclDemoView, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
