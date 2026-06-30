package rb2;

/* loaded from: classes3.dex */
public final class k1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gd2.n f393670d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f393671e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(gd2.n nVar, java.lang.String str) {
        super(0);
        this.f393670d = nVar;
        this.f393671e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17;
        gd2.n nVar = this.f393670d;
        nVar.getClass();
        java.lang.String curFilename = this.f393671e;
        kotlin.jvm.internal.o.g(curFilename, "curFilename");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = nVar.f270547c;
        try {
        } catch (java.lang.Exception e17) {
            com.tencent.mm.sdk.platformtools.Log.a("FinderCommentImageMenuData", "", e17);
        }
        if (concurrentHashMap.containsKey(curFilename)) {
            java.lang.Object obj = concurrentHashMap.get(curFilename);
            kotlin.jvm.internal.o.d(obj);
            z17 = ((java.lang.Boolean) obj).booleanValue();
            com.tencent.mars.xlog.Log.i("FinderCommentImageMenuData", "isCurrentImgCanShowTransEntrance:" + z17);
            return java.lang.Boolean.valueOf(z17);
        }
        z17 = false;
        com.tencent.mars.xlog.Log.i("FinderCommentImageMenuData", "isCurrentImgCanShowTransEntrance:" + z17);
        return java.lang.Boolean.valueOf(z17);
    }
}
