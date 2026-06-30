package dk2;

/* loaded from: classes3.dex */
public final class oc extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f233854d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.rc f233855e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.MMFinderUI f233856f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oc(dk2.rc rcVar, com.tencent.mm.plugin.finder.ui.MMFinderUI mMFinderUI, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f233855e = rcVar;
        this.f233856f = mMFinderUI;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dk2.oc(this.f233855e, this.f233856f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((dk2.oc) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f233854d;
        dk2.rc rcVar = this.f233855e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.finder.ui.MMFinderUI this_apply = this.f233856f;
            kotlin.jvm.internal.o.f(this_apply, "$this_apply");
            this.f233854d = 1;
            obj = dk2.rc.a(rcVar, this_apply, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (!booleanValue) {
            com.tencent.mars.xlog.Log.i(rcVar.f234033b, "changeScreenToLandscape failed, no permission");
        }
        return f0Var;
    }
}
