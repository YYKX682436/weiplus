package vd2;

/* loaded from: classes10.dex */
public final class j2 {

    /* renamed from: e, reason: collision with root package name */
    public static volatile java.util.LinkedList f435776e;

    /* renamed from: f, reason: collision with root package name */
    public static volatile boolean f435777f;

    /* renamed from: h, reason: collision with root package name */
    public static zy2.i8 f435779h;

    /* renamed from: a, reason: collision with root package name */
    public static final vd2.j2 f435772a = new vd2.j2();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f435773b = java.util.Collections.synchronizedMap(new java.util.HashMap());

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f435774c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final int f435775d = 1;

    /* renamed from: g, reason: collision with root package name */
    public static final int f435778g = 60;

    /* renamed from: i, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.n3 f435780i = new com.tencent.mm.sdk.platformtools.n3("FinderLiveNotifyRefreshManager", vd2.g2.f435735d);

    public synchronized void a(java.util.LinkedList data) {
        kotlin.jvm.internal.o.g(data, "data");
        if (!data.isEmpty() && f435777f) {
            f435776e = data;
            com.tencent.mars.xlog.Log.i("FinderLiveNotifyRefreshManager", "allow to request,size = " + data.size());
            com.tencent.mm.sdk.platformtools.n3 n3Var = f435780i;
            int i17 = f435775d;
            n3Var.removeMessages(i17);
            n3Var.sendMessage(n3Var.obtainMessage(i17, data));
        }
    }

    public void b(r45.l71 l71Var) {
        r45.nw1 nw1Var;
        java.util.LinkedList list;
        if (l71Var == null || (nw1Var = (r45.nw1) l71Var.getCustom(1)) == null) {
            com.tencent.mars.xlog.Log.i("FinderLiveNotifyRefreshManager", "updateLiveInfoResp liveInfo null");
            return;
        }
        r45.n94 n94Var = (r45.n94) l71Var.getCustom(29);
        if (n94Var == null) {
            com.tencent.mars.xlog.Log.i("FinderLiveNotifyRefreshManager", "updateLiveInfoResp notification_dynamic_display_info null");
            return;
        }
        f435774c.put(java.lang.Long.valueOf(nw1Var.getLong(0)), (r45.zj5) n94Var.getCustom(0));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateLiveInfoResp liveId:");
        sb6.append(nw1Var.getLong(0));
        sb6.append(", reason isvalid:");
        r45.zj5 zj5Var = (r45.zj5) n94Var.getCustom(0);
        java.lang.String str = null;
        sb6.append(zj5Var != null ? java.lang.Boolean.valueOf(zj5Var.getBoolean(0)) : null);
        sb6.append(", string:");
        r45.zj5 zj5Var2 = (r45.zj5) n94Var.getCustom(0);
        if (zj5Var2 != null && (list = zj5Var2.getList(1)) != null) {
            str = kz5.n0.g0(list, null, null, null, 0, null, vd2.i2.f435763d, 31, null);
        }
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("FinderLiveNotifyRefreshManager", sb6.toString());
    }
}
