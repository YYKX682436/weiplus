package lr1;

@j95.b
/* loaded from: classes5.dex */
public final class t extends i95.w implements ww.e {
    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("BrandServiceTimelineResortService", "onAccountInitialized, uin: " + gm0.j1.b().h());
        if (wi().i("ReSortBizMsgMigrationCompleted", false)) {
            com.tencent.mars.xlog.Log.i("BrandServiceTimelineResortService", "Migration already completed, skip");
            return;
        }
        com.tencent.mars.xlog.Log.i("BrandServiceTimelineResortService", "Starting migration from old MMKV");
        com.tencent.mm.sdk.platformtools.o4 R = com.tencent.mm.sdk.platformtools.o4.R("brandService_accounts");
        kotlin.jvm.internal.o.f(R, "getSingleMMKV(...)");
        if (R.contains("ReSortBizMsgRedDotSample")) {
            boolean i17 = R.i("ReSortBizMsgRedDotSample", false);
            wi().G("ReSortBizMsgRedDotSample", i17);
            com.tencent.mars.xlog.Log.i("BrandServiceTimelineResortService", "Migrated ReSortBizMsgRedDotSample: " + i17);
            R.W("ReSortBizMsgRedDotSample");
            com.tencent.mars.xlog.Log.i("BrandServiceTimelineResortService", "Removed ReSortBizMsgRedDotSample from old MMKV");
        } else {
            com.tencent.mars.xlog.Log.i("BrandServiceTimelineResortService", "No ReSortBizMsgRedDotSample found in old MMKV");
        }
        wi().G("ReSortBizMsgMigrationCompleted", true);
        com.tencent.mars.xlog.Log.i("BrandServiceTimelineResortService", "Migration completed");
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("BrandServiceTimelineResortService", "onAccountReleased");
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("BrandServiceTimelineResortService", "onCreate");
    }

    public final com.tencent.mm.sdk.platformtools.o4 wi() {
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M(gm0.j1.b().h() + "_brandService_accounts");
        kotlin.jvm.internal.o.f(M, "getMMKV(...)");
        return M;
    }
}
