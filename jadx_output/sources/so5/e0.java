package so5;

/* loaded from: classes14.dex */
public final class e0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f410817d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f410818e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so5.k0 f410819f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f410820g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f410821h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(so5.k0 k0Var, int i17, int i18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f410819f = k0Var;
        this.f410820g = i17;
        this.f410821h = i18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        so5.e0 e0Var = new so5.e0(this.f410819f, this.f410820g, this.f410821h, continuation);
        e0Var.f410818e = obj;
        return e0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((so5.e0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f410817d;
        so5.k0 k0Var = this.f410819f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f410818e;
            boolean z17 = k0Var.f410866p;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCameraPreviewApply: ");
            int i18 = this.f410820g;
            sb6.append(i18);
            sb6.append(", ");
            int i19 = this.f410821h;
            sb6.append(i19);
            sb6.append(", fromResolutionSwitch=");
            sb6.append(z17);
            com.tencent.mars.xlog.Log.i("MicroMsg.ILinkVoIPCameraHelper", sb6.toString());
            yz5.v vVar = k0Var.f410864n;
            if (vVar != null) {
                java.lang.Integer num = new java.lang.Integer(k0Var.f410861h);
                java.lang.Integer num2 = new java.lang.Integer(i18);
                java.lang.Integer num3 = new java.lang.Integer(i19);
                zq4.b bVar = k0Var.f410859f;
                java.lang.Integer num4 = new java.lang.Integer(bVar != null ? bVar.f475042b : 0);
                zq4.b bVar2 = k0Var.f410859f;
                java.lang.Boolean valueOf = java.lang.Boolean.valueOf(bVar2 == null || bVar2.f475041a);
                java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(z17);
                this.f410817d = 1;
                if (vVar.D(y0Var, num, num2, num3, num4, valueOf, valueOf2, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        k0Var.f410866p = false;
        return jz5.f0.f302826a;
    }
}
