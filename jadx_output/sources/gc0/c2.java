package gc0;

/* loaded from: classes5.dex */
public final class c2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f270113d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gc0.p2 f270114e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gc0.b0 f270115f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f270116g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.FlowLayout f270117h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.a f270118i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.l f270119m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(gc0.p2 p2Var, gc0.b0 b0Var, yz5.a aVar, com.tencent.mm.ui.base.FlowLayout flowLayout, yz5.a aVar2, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f270114e = p2Var;
        this.f270115f = b0Var;
        this.f270116g = aVar;
        this.f270117h = flowLayout;
        this.f270118i = aVar2;
        this.f270119m = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gc0.c2(this.f270114e, this.f270115f, this.f270116g, this.f270117h, this.f270118i, this.f270119m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gc0.c2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String obj2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f270113d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            gc0.p2 p2Var = this.f270114e;
            gc0.e1 e1Var = p2Var.f270248m;
            gc0.b0 b0Var = this.f270115f;
            java.lang.String str = b0Var.f270100b;
            java.lang.String str2 = "";
            if (str == null) {
                str = "";
            }
            e1Var.getClass();
            e1Var.f270152k = str;
            android.text.Editable text = ((android.widget.EditText) this.f270116g.invoke()).getText();
            if (text != null && (obj2 = text.toString()) != null) {
                str2 = obj2;
            }
            this.f270113d = 1;
            obj = p2Var.R6(b0Var, str2, this);
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
        jz5.l lVar = (jz5.l) obj;
        boolean booleanValue = ((java.lang.Boolean) lVar.f302833d).booleanValue();
        java.util.List list = (java.util.List) lVar.f302834e;
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        gc0.b2 b2Var = new gc0.b2(this.f270117h, list, this.f270114e, booleanValue, this.f270118i, this.f270115f, this.f270119m, this.f270116g, null);
        this.f270113d = 2;
        if (kotlinx.coroutines.l.g(g3Var, b2Var, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
