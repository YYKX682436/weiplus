package r10;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lr10/f;", "Lr10/d;", "Lcom/tencent/mm/feature/ecs/open/EcsOpenAsyncInfo$EcsOpenAsyncInfoResult;", "<init>", "()V", "plugin-ecs_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes9.dex */
public final class f extends r10.d<com.tencent.mm.feature.ecs.open.EcsOpenAsyncInfo$EcsOpenAsyncInfoResult> {
    @Override // r10.d
    public android.os.Parcelable a() {
        uh4.c0 service = uh4.c0.getService();
        boolean isTeenMode = service != null ? service.isTeenMode() : false;
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsOpenAsyncInfo", "FetchAsyncInfoTask fetch isTeenMode: " + isTeenMode);
        return new com.tencent.mm.feature.ecs.open.EcsOpenAsyncInfo$EcsOpenAsyncInfoResult(true, isTeenMode);
    }
}
