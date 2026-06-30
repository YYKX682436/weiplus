package xi0;

/* loaded from: classes4.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f454674d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f454675e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f454676f;

    /* renamed from: g, reason: collision with root package name */
    public int f454677g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f454678h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f454679i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f454680m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f454681n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f454678h = str;
        this.f454679i = str2;
        this.f454680m = str3;
        this.f454681n = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xi0.e(this.f454678h, this.f454679i, this.f454680m, this.f454681n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((xi0.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        r45.jj4 jj4Var;
        int i17;
        r45.a90 a90Var;
        java.util.LinkedList linkedList;
        java.lang.Object obj2;
        pz5.a aVar = pz5.a.f359186d;
        int i18 = this.f454677g;
        if (i18 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getImageFile(");
            java.lang.String str = this.f454678h;
            sb6.append(str);
            sb6.append(", ");
            java.lang.String str2 = this.f454679i;
            sb6.append(str2);
            sb6.append(", ");
            java.lang.String str3 = this.f454680m;
            sb6.append(str3);
            sb6.append("), requestThumb:");
            boolean z17 = this.f454681n;
            sb6.append(z17);
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsDataSource", sb6.toString());
            com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(str);
            if (k17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SnsDataSource", "Couldn't find SnsInfo, localId=" + str);
                return null;
            }
            com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = k17.getTimeLine();
            if (timeLine == null || (a90Var = timeLine.ContentObj) == null || (linkedList = a90Var.f369840h) == null) {
                jj4Var = null;
            } else {
                java.util.Iterator it = linkedList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (kotlin.jvm.internal.o.b(((r45.jj4) obj2).f377855d, str3)) {
                        break;
                    }
                }
                jj4Var = (r45.jj4) obj2;
            }
            if (jj4Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SnsDataSource", "Couldn't find media, localId=" + str + ", mediaId=" + str3);
                return null;
            }
            java.lang.String i19 = com.tencent.mm.vfs.w6.i(com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), jj4Var.f377855d) + (z17 ? ca4.z0.U(jj4Var) : ca4.z0.J(jj4Var)), false);
            if (com.tencent.mm.vfs.w6.j(i19) && ca4.z0.f(ca4.z0.o(i19))) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsDataSource", "photo has already been downloaded: " + i19);
                return i19;
            }
            ca4.s0 s0Var = new ca4.s0(jj4Var);
            if (z17) {
                s0Var.d(1);
                i17 = jj4Var.f377856e == 6 ? 5 : 1;
            } else {
                s0Var.d(3);
                i17 = 2;
            }
            s0Var.e(jj4Var.f377855d);
            com.tencent.mm.plugin.sns.model.m0 Cj = com.tencent.mm.plugin.sns.model.l4.Cj();
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsDataSource", "start downloading mediaId=" + jj4Var.f377855d + ", snsId=" + str2);
            Cj.d(jj4Var, i17, s0Var, com.tencent.mm.storage.s7.f195303g);
            this.f454674d = jj4Var;
            this.f454675e = i19;
            this.f454676f = Cj;
            this.f454677g = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            xi0.d dVar = new xi0.d(jj4Var, i19, Cj, rVar);
            Cj.c(dVar);
            rVar.m(new xi0.c(Cj, dVar));
            obj = rVar.j();
            pz5.a aVar2 = pz5.a.f359186d;
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i18 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
