package dz4;

/* loaded from: classes8.dex */
public final class k3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f245321d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dn.m f245322e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dz4.o0 f245323f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f245324g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.favorites.n f245325h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(dn.m mVar, dz4.o0 o0Var, boolean z17, com.tencent.wechat.aff.favorites.n nVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f245322e = mVar;
        this.f245323f = o0Var;
        this.f245324g = z17;
        this.f245325h = nVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dz4.k3(this.f245322e, this.f245323f, this.f245324g, this.f245325h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((dz4.k3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f245321d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            i95.m c17 = i95.n0.c(sx.b0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            dn.m mVar = this.f245322e;
            this.f245321d = 1;
            obj = sx.b0.Be((sx.b0) c17, mVar, 0L, null, this, 6, null);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.modelcdntran.n1 n1Var = (com.tencent.mm.modelcdntran.n1) obj;
        if (n1Var != null) {
            int ordinal = n1Var.f71103a.ordinal();
            boolean z17 = this.f245324g;
            dz4.o0 o0Var = this.f245323f;
            com.tencent.wechat.aff.favorites.n nVar = this.f245325h;
            if (ordinal == 0) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MsgCdnDownloadListener err callback[");
                sb6.append(o0Var != null ? new java.lang.Integer(o0Var.hashCode()) : null);
                sb6.append("], ret ");
                sb6.append(n1Var.f71105c);
                sb6.append(", isThumb ");
                sb6.append(z17);
                sb6.append(", data_id ");
                sb6.append(nVar.b().b());
                sb6.append(", msg_id ");
                sb6.append(nVar.b().c().f216828e);
                com.tencent.mars.xlog.Log.i("MicroMsg.WeNoteFlutterMsgDownloadHelper", sb6.toString());
                nVar.f216839d = n1Var.f71105c;
                nVar.f216842g[1] = true;
                if (o0Var != null) {
                    ((dz4.p) o0Var).a(nVar);
                }
            } else if (ordinal == 1) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("MsgCdnDownloadListener success callback[");
                sb7.append(o0Var != null ? new java.lang.Integer(o0Var.hashCode()) : null);
                sb7.append("], ret ");
                sb7.append(n1Var.f71105c);
                sb7.append(", isThumb ");
                sb7.append(z17);
                sb7.append(", data_id ");
                sb7.append(nVar.b().b());
                sb7.append(", msg_id ");
                sb7.append(nVar.b().c().f216828e);
                com.tencent.mars.xlog.Log.i("MicroMsg.WeNoteFlutterMsgDownloadHelper", sb7.toString());
                nVar.f216839d = 0;
                nVar.f216842g[1] = true;
                if (o0Var != null) {
                    ((dz4.p) o0Var).a(nVar);
                }
            } else if (ordinal == 2) {
                if (o0Var != null) {
                    new java.lang.Integer(o0Var.hashCode());
                }
                nVar.b().b();
                long j17 = nVar.b().c().f216828e;
            }
        }
        return jz5.f0.f302826a;
    }
}
