package com.tencent.mm.ui.conversation;

/* loaded from: classes9.dex */
public final class f8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.n2 f207677d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f207678e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f207679f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f207680g;

    public f8(com.tencent.mm.ui.conversation.n2 n2Var, java.lang.String str, int i17, java.util.Map map) {
        this.f207677d = n2Var;
        this.f207678e = str;
        this.f207679f = i17;
        this.f207680g = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c00.u3 u3Var = (c00.u3) i95.n0.c(c00.u3.class);
        android.widget.LinearLayout linearLayout = this.f207677d.f207884a;
        b00.a0 a0Var = (b00.a0) u3Var;
        a0Var.getClass();
        java.lang.String str = this.f207678e;
        boolean z17 = false;
        if (linearLayout != null) {
            if (!(str == null || str.length() == 0)) {
                if (!(str == null || str.length() == 0)) {
                    z17 = k41.h1.c(str) != 0;
                }
                if (!z17) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.EcsKfReportService", "bindReportForListView ecs kf session, but type == 0");
                    return;
                }
                a0Var.wi(linearLayout, "ecs_kf_list_item", 32, "ecs_kf_list_item_" + this.f207679f, null, new b00.y(a0Var, str, this.f207680g));
                com.tencent.mars.xlog.Log.i("MicroMsg.EcsKfReportService", "bindReportForListView success, viewId:ecs_kf_list_item, kfUserName:" + str);
                return;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("bindReportForListView invalid params, view:");
        sb6.append(linearLayout != null);
        sb6.append(", kfUserName:");
        sb6.append(str);
        sb6.append(", viewId:ecs_kf_list_item");
        com.tencent.mars.xlog.Log.e("MicroMsg.EcsKfReportService", sb6.toString());
    }
}
