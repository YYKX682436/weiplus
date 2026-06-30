package ge2;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final ge2.a f270955a = new ge2.a();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f270956b;

    public final void a(boolean z17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String str = f270956b;
        if (str == null) {
            str = "";
        }
        hashMap.put("group_box_number", str);
        com.tencent.mars.xlog.Log.i("FinderLiveBoxReportUtils", "boxBtnReport reportMap: " + hashMap + " isSwitch: " + z17);
        if (z17) {
            i95.m c17 = i95.n0.c(zy2.zb.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.T8((zy2.zb) c17, ml2.t1.D1, hashMap, null, null, null, null, false, 124, null);
        } else {
            i95.m c18 = i95.n0.c(zy2.zb.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            zy2.zb.I8((zy2.zb) c18, ml2.u1.f328106z1, hashMap, null, null, null, null, false, 124, null);
        }
    }
}
