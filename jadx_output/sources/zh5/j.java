package zh5;

/* loaded from: classes12.dex */
public final class j extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f473034d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f473035e;

    /* renamed from: f, reason: collision with root package name */
    public int f473036f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zh5.l f473037g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(zh5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f473037g = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new zh5.j(this.f473037g, continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return ((zh5.j) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        dn.m mVar;
        java.lang.String str;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f473036f;
        zh5.l lVar = this.f473037g;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mVar = lVar.f473040c;
            java.lang.String str2 = lVar.f473039b + "_temp}";
            mVar.field_fullpath = str2;
            i95.m c17 = i95.n0.c(sx.b0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            java.lang.ref.WeakReference weakReference = lVar.f473041d;
            this.f473034d = mVar;
            this.f473035e = str2;
            this.f473036f = 1;
            java.lang.Object Be = sx.b0.Be((sx.b0) c17, mVar, 0L, weakReference, this, 2, null);
            if (Be == aVar) {
                return aVar;
            }
            str = str2;
            obj = Be;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) this.f473035e;
            mVar = (dn.m) this.f473034d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.modelcdntran.n1 n1Var = (com.tencent.mm.modelcdntran.n1) obj;
        if ((n1Var != null ? n1Var.f71103a : null) != com.tencent.mm.modelcdntran.m1.f71076e) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("downloadData file error ");
            sb6.append(mVar.field_mediaId);
            sb6.append(" ret:");
            sb6.append(n1Var != null ? new java.lang.Integer(n1Var.f71105c) : null);
            sb6.append(" action:");
            sb6.append(n1Var != null ? n1Var.f71103a : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppMsg.AppMsgAttachSyncDownloadFSC", sb6.toString());
            return zh5.f.f473022e;
        }
        if (com.tencent.mm.vfs.w6.x(str, lVar.f473039b, true)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppMsg.AppMsgAttachSyncDownloadFSC", "downloadData file success " + mVar.field_mediaId);
            return zh5.f.f473021d;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppMsg.AppMsgAttachSyncDownloadFSC", "downloadData file error " + mVar.field_mediaId);
        return zh5.f.f473022e;
    }
}
