package rm;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lrm/i;", "Lcom/tencent/mm/ipcinvoker/i;", "Lcom/tencent/mm/brandService/CheckCanCreatePhotoAccountRequest;", "Lcom/tencent/mm/brandService/CheckCanCreatePhotoAccountResponse;", "<init>", "()V", "biz-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class i implements com.tencent.mm.ipcinvoker.i<com.tencent.mm.brandService.CheckCanCreatePhotoAccountRequest, com.tencent.mm.brandService.CheckCanCreatePhotoAccountResponse> {

    /* renamed from: d, reason: collision with root package name */
    public static final kotlinx.coroutines.y0 f397383d = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c.plus(kotlinx.coroutines.t3.a(null, 1, null)));

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.brandService.CheckCanCreatePhotoAccountRequest request = (com.tencent.mm.brandService.CheckCanCreatePhotoAccountRequest) obj;
        kotlin.jvm.internal.o.g(request, "request");
        int i17 = request.f63610d;
        boolean wi6 = ((ox.r) ((rm.d0) i95.n0.c(rm.d0.class))).wi();
        com.tencent.wechat.mm.biz.b bVar = ((r01.l1) i95.n0.c(r01.l1.class)).f368147i.f368154b;
        boolean z17 = bVar != null && bVar.f217901t == 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.CheckCanCreatePhotoAccountTask", "checkCanCreatePhotoAccount scene=" + i17 + ", canCreatePhotoAcct=" + wi6 + ", canCreateBizAcct=" + z17);
        if (i17 != 0) {
            kotlinx.coroutines.l.d(f397383d, null, null, new rm.h(i17, rVar, wi6, z17, com.tencent.wechat.iam.biz.g.f217742b, i17 == 1 ? com.tencent.wechat.iam.biz.v1.INTERACTIVE_GUIDE_SCENE_AFTER_FOLLOW : com.tencent.wechat.iam.biz.v1.INTERACTIVE_GUIDE_SCENE_COMMENT_INPUT, null), 3, null);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.CheckCanCreatePhotoAccountTask", "checkCanCreatePhotoAccount done, scene=0, skip sceneEnabled/wording");
            if (rVar != null) {
                rVar.a(new com.tencent.mm.brandService.CheckCanCreatePhotoAccountResponse(true, wi6, z17, false, "", "", ""));
            }
        }
    }
}
