package n12;

/* loaded from: classes5.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f334087d;

    /* renamed from: e, reason: collision with root package name */
    public int f334088e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n12.n f334089f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f334090g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f334091h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f334092i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n12.n nVar, kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.f0 f0Var, kotlin.jvm.internal.f0 f0Var2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f334089f = nVar;
        this.f334090g = h0Var;
        this.f334091h = f0Var;
        this.f334092i = f0Var2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new n12.k(this.f334089f, this.f334090g, this.f334091h, this.f334092i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((n12.k) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f334088e;
        kotlin.jvm.internal.h0 h0Var = this.f334090g;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String c17 = com.tencent.mm.vfs.q7.c("emoji-editor");
            if (!com.tencent.mm.vfs.w6.j(c17) && !com.tencent.mm.vfs.w6.u(c17)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.EmoticonCustomCreatePreprocessLogic", "Failed to create emoji temp directory: " + c17);
                return f0Var;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(c17);
            sb6.append('/');
            n12.n nVar = this.f334089f;
            sb6.append(com.tencent.mm.sdk.platformtools.w2.a(nVar.f334101a));
            sb6.append("-preprocessd-");
            n12.g gVar = nVar.f334102b;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(gVar.f334076a.left);
            sb7.append('-');
            sb7.append(gVar.f334076a.right);
            sb7.append('-');
            sb7.append(gVar.f334076a.top);
            sb7.append('-');
            sb7.append(gVar.f334076a.bottom);
            sb7.append('-');
            sb7.append(gVar.f334077b);
            sb6.append(sb7.toString());
            java.lang.String sb8 = sb6.toString();
            if (com.tencent.mm.vfs.w6.j(sb8)) {
                h0Var.f310123d = sb8;
                return f0Var;
            }
            if (!com.tencent.mm.vfs.w6.e(sb8)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.EmoticonCustomCreatePreprocessLogic", "Failed to create emoji output file: " + sb8);
                return f0Var;
            }
            n12.n nVar2 = this.f334089f;
            java.lang.String str2 = nVar2.f334101a;
            android.util.Size size = new android.util.Size(this.f334091h.f310116d, this.f334092i.f310116d);
            android.graphics.Rect rect = nVar.f334102b.f334076a;
            android.util.Range range = new android.util.Range(new java.lang.Integer(0), new java.lang.Integer(nVar.f334103c));
            this.f334087d = sb8;
            this.f334088e = 1;
            obj = n12.n.a(nVar2, str2, sb8, size, rect, range, this);
            if (obj == aVar) {
                return aVar;
            }
            str = sb8;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) this.f334087d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (!((java.lang.Boolean) obj).booleanValue()) {
            return f0Var;
        }
        h0Var.f310123d = str;
        return f0Var;
    }
}
