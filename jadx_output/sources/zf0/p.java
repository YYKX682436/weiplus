package zf0;

/* loaded from: classes12.dex */
public final class p extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zf0.v0 f472497d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vf0.j1 f472498e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f472499f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(zf0.v0 v0Var, vf0.j1 j1Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f472497d = v0Var;
        this.f472498e = j1Var;
        this.f472499f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new zf0.p(this.f472497d, this.f472498e, this.f472499f, continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return ((zf0.p) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        zf0.v0 v0Var = this.f472497d;
        oi3.h hVar = v0Var.f472563i.f436178e;
        jz5.f0 f0Var = jz5.f0.f302826a;
        vf0.j1 j1Var = this.f472498e;
        if (hVar == null) {
            j1Var.f436197a = -520002;
            return f0Var;
        }
        t21.v2 e17 = vf0.m3.e(hVar);
        if (e17 == null) {
            j1Var.f436197a = -540010;
            return f0Var;
        }
        java.lang.Integer d17 = v0Var.d(false);
        if (d17 != null) {
            j1Var.f436197a = d17.intValue();
            return f0Var;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(e17.S)) {
            j1Var.getClass();
            return f0Var;
        }
        t21.v2 f17 = vf0.m3.f(hVar);
        if (f17 == null) {
            j1Var.f436197a = -540011;
            return f0Var;
        }
        java.util.Map map = j1Var.f436198b;
        v0Var.getClass();
        java.lang.String sj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).sj(hVar, bm5.f0.f22570r, f17.d(), true);
        java.lang.String str = this.f472499f;
        if (com.tencent.mm.vfs.w6.j(str)) {
            if (com.tencent.mm.vfs.w6.d(str, sj6, false) < 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.VideoMsg.SendVideoTask", "copy video file failed.target file path :{" + str + '}');
                if (map != null) {
                    map.put("prepare_origin_video_res", "error_copy_video");
                }
            } else {
                long k17 = com.tencent.mm.vfs.w6.k(sj6);
                boolean optimizeMP4VFS = ((com.tencent.mm.feature.sight.api.ISightJNIService) i95.n0.c(com.tencent.mm.feature.sight.api.ISightJNIService.class)).optimizeMP4VFS(sj6);
                long abs = java.lang.Math.abs(com.tencent.mm.vfs.w6.k(sj6) - k17);
                if (abs > 1048576) {
                    com.tencent.mm.vfs.w6.h(sj6);
                    com.tencent.mm.vfs.w6.c(str, sj6);
                    if (map != null) {
                        map.put("optimizedMP4VFSFailed", "1");
                    }
                    if (map != null) {
                        map.put("optimizedMP4VFSDiff", java.lang.Long.valueOf(abs));
                    }
                    com.tencent.mars.xlog.Log.e("MicroMsg.VideoMsg.SendVideoTask", "optimizeMP4VFS result:" + optimizeMP4VFS + ",fileLengthDiff:" + abs);
                }
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_remove_video_metadata_before_send, 1) == 1) {
                    ((com.tencent.mm.feature.sight.api.ISightJNIService) i95.n0.c(com.tencent.mm.feature.sight.api.ISightJNIService.class)).removeVideoMetadata(sj6, true, true);
                }
                vf0.m3.n(f17, sj6);
            }
        } else if (map != null) {
            map.put("prepare_origin_video_res", "error_no_origin");
        }
        return f0Var;
    }
}
