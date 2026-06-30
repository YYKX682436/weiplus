package ts1;

/* loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ts1.r f421615d = new ts1.r();

    public r() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("channels-aladin.wxqcloud.qq.com");
        arrayList.add("channels.weixin.qq.com");
        com.tencent.mars.xlog.Log.i("MicroMsg.WebPrefetcherUrlQueryManager", "hostWhiteList: %s", kz5.n0.g0(arrayList, ",", null, null, 0, null, null, 62, null));
        return arrayList;
    }
}
