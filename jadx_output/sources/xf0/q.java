package xf0;

/* loaded from: classes12.dex */
public final class q extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xf0.i f454211d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dn.o f454212e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f454213f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xf0.s f454214g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(xf0.i iVar, dn.o oVar, java.lang.String str, xf0.s sVar, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f454211d = iVar;
        this.f454212e = oVar;
        this.f454213f = str;
        this.f454214g = sVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new xf0.q(this.f454211d, this.f454212e, this.f454213f, this.f454214g, continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return ((xf0.q) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.storage.f9 k17;
        java.lang.String str;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        xf0.i iVar = this.f454211d;
        iVar.f454184l.put("down_file_size", new java.lang.Long(com.tencent.mm.vfs.w6.k(this.f454212e.field_fullpath)));
        if (iVar.f454181i) {
            if (!com.tencent.mm.vfs.w6.x(this.f454213f, iVar.f454178f, true)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.VideoMsg.Receive.MsgVideoSyncDownloadFSC", "downloadMsgVideo[" + iVar.f454182j + "] move file error " + iVar.f454177e);
                xf0.j jVar = new xf0.j(xf0.k.f454197g);
                jVar.f454193b = -9999;
                return jVar;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoMsg.Receive.MsgVideoSyncDownloadFSC", "downloadMsgVideo[" + iVar.f454182j + "] move file success " + iVar.f454177e + ",or no need move,downloadToTmp:" + iVar.f454181i);
        this.f454214g.getClass();
        java.lang.String str2 = iVar.f454178f;
        t21.v2 v2Var = iVar.f454179g;
        if (v2Var != null && (k17 = pt0.f0.f358209b1.k(v2Var.f415020r, v2Var.f415016n)) != null) {
            boolean j17 = com.tencent.mm.vfs.w6.j(str2);
            java.lang.String str3 = iVar.f454182j;
            if (j17) {
                zz.b bj6 = ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).bj(str2, k17.getType(), com.tencent.mm.vfs.w6.p(str2), null);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkDupVideo[");
                sb6.append(str3);
                sb6.append("] video path=");
                sb6.append(str2);
                sb6.append(", fileName=");
                sb6.append(v2Var.d());
                sb6.append(", ret=");
                sb6.append(bj6.f477691a);
                sb6.append(", hitCache=");
                sb6.append(bj6.f477692b);
                sb6.append(", copyResult=");
                sb6.append(bj6.f477694d);
                sb6.append(", replaceResult=");
                str = ", copyResult=";
                sb6.append(bj6.f477695e);
                com.tencent.mars.xlog.Log.i("MicroMsg.VideoMsg.Receive.MsgVideoSyncDownloadFSC", sb6.toString());
            } else {
                str = ", copyResult=";
            }
            if (iVar.f454174b == xf0.f.f454163d) {
                java.lang.String tj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(null, v2Var.d(), false);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(tj6) && com.tencent.mm.vfs.w6.j(tj6)) {
                    zz.b bj7 = ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).bj(tj6, k17.getType(), com.tencent.mm.vfs.w6.p(tj6), null);
                    com.tencent.mars.xlog.Log.i("MicroMsg.VideoMsg.Receive.MsgVideoSyncDownloadFSC", "checkDupVideo[" + str3 + "] thumb path=" + tj6 + ", fileName=" + v2Var.d() + ", ret=" + bj7.f477691a + ", hitCache=" + bj7.f477692b + str + bj7.f477694d);
                }
            }
        }
        return new xf0.j(xf0.k.f454194d);
    }
}
