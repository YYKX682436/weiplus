package yo4;

/* loaded from: classes10.dex */
public final class e0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f464197d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout f464198e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f464199f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f464200g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer[] f464201h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout, java.util.List list, java.util.List list2, java.lang.Integer[] numArr, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f464198e = multiVideoFullScreenPluginLayout;
        this.f464199f = list;
        this.f464200g = list2;
        this.f464201h = numArr;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yo4.e0(this.f464198e, this.f464199f, this.f464200g, this.f464201h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yo4.e0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f464197d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.vlog.model.u0 u0Var = this.f464198e.H;
            java.util.List z07 = kz5.z.z0(this.f464201h);
            this.f464197d = 1;
            java.util.List list = this.f464199f;
            java.util.List list2 = this.f464200g;
            u0Var.getClass();
            obj = kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new com.tencent.mm.plugin.vlog.model.t0(u0Var, list, list2, z07, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
