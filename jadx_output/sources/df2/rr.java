package df2;

/* loaded from: classes3.dex */
public final class rr implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public static final df2.rr f231264a = new df2.rr();

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        if (i17 != 0 || fVar.f70616b != 0) {
            java.lang.String str = df2.lt.W;
            com.tencent.mars.xlog.Log.e("Finder.LivePromoteBannerController", "ljd do CgiFinderLiveDislikeBanner fail errType:%d, errCode:%d, errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(fVar.f70616b), fVar.f70617c);
        }
        return jz5.f0.f302826a;
    }
}
