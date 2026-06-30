package x70;

/* loaded from: classes12.dex */
public final class c extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f452406d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l70.d f452407e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(java.lang.String str, l70.d dVar, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f452406d = str;
        this.f452407e = dVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new x70.c(this.f452406d, this.f452407e, continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return ((x70.c) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.String str = this.f452406d;
        boolean g17 = com.tencent.mm.sdk.platformtools.y1.g(str);
        l70.d dVar = this.f452407e;
        dVar.f316809j.put("down_file_size", new java.lang.Long(com.tencent.mm.vfs.w6.k(str)));
        dVar.f316809j.put("down_file_type", g17 ? "wxam" : "jpg");
        if (!dVar.f316811l || !g17) {
            if (com.tencent.mm.vfs.w6.x(str, dVar.f316805f, true)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ImgDownload.MsgImgSyncDownloadFSC", "downloadMsgImg[" + dVar.f316806g + "] move file success " + dVar.f316804e + " imgType:" + dVar.f316801b + " isTp:" + dVar.f316800a);
                return new l70.e(l70.f.f316820d);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ImgDownload.MsgImgSyncDownloadFSC", "downloadMsgImg[" + dVar.f316806g + "] move file error " + dVar.f316804e + " imgType:" + dVar.f316801b + " isTp:" + dVar.f316800a);
            l70.e eVar = new l70.e(l70.f.f316823g);
            eVar.f316819b = -9999;
            return eVar;
        }
        int aj6 = ((h12.z) ((k12.u) i95.n0.c(k12.u.class))).aj(str, dVar.f316805f, 1);
        if (aj6 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImgDownload.MsgImgSyncDownloadFSC", "downloadMsgImg[" + dVar.f316806g + "] convert hevc file success " + dVar.f316804e + " imgType:" + dVar.f316801b + " isTp:" + dVar.f316800a);
            return new l70.e(l70.f.f316820d);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ImgDownload.MsgImgSyncDownloadFSC", "downloadMsgImg[" + dVar.f316806g + "] convert hevc file error " + dVar.f316804e + " imgType:" + dVar.f316801b + " isTp:" + dVar.f316800a + " ret:" + aj6);
        l70.e eVar2 = new l70.e(l70.f.f316824h);
        eVar2.f316819b = aj6;
        return eVar2;
    }
}
