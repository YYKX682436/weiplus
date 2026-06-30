package j00;

/* loaded from: classes.dex */
public final class c0 implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j00.d0 f296727d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f296728e;

    public c0(j00.d0 d0Var, yz5.l lVar) {
        this.f296727d = d0Var;
        this.f296728e = lVar;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.pigeon.ecs.EcsAddressStruct ecsAddressStruct;
        if (i17 == this.f296727d.f296741e && i18 == -1) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            org.json.JSONObject wi6 = ((b30.k) ((c00.w2) i95.n0.c(c00.w2.class))).wi(intent);
            if (wi6 == null) {
                ecsAddressStruct = null;
            } else {
                java.lang.String optString = wi6.optString("nationalCode");
                java.lang.String optString2 = wi6.optString("userName");
                java.lang.String optString3 = wi6.optString("telNumber");
                java.lang.String optString4 = wi6.optString("addressPostalCode");
                java.lang.String optString5 = wi6.optString("proviceFirstStageName");
                java.lang.String optString6 = wi6.optString("addressCitySecondStageName");
                java.lang.String optString7 = wi6.optString("addressCountiesThirdStageName");
                java.lang.String optString8 = wi6.optString("addressDetailInfo");
                java.lang.String optString9 = wi6.optString("addressID");
                kotlin.jvm.internal.o.f(optString9, "optString(...)");
                ecsAddressStruct = new com.tencent.pigeon.ecs.EcsAddressStruct(optString2, optString4, optString, optString3, optString5, optString6, optString7, null, optString8, null, java.lang.Long.valueOf(java.lang.Long.parseLong(optString9)), null, 2688, null);
            }
            this.f296728e.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(ecsAddressStruct)));
        }
    }
}
