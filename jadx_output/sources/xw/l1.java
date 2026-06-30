package xw;

/* loaded from: classes11.dex */
public class l1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f457537d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.x1 f457538e;

    public l1(xw.m1 m1Var, java.lang.Object obj, com.tencent.mm.storage.x1 x1Var) {
        this.f457537d = obj;
        this.f457538e = x1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.storage.s1 s1Var;
        java.lang.Object obj = this.f457537d;
        if (!(obj instanceof com.tencent.mm.storage.h2)) {
            if (obj instanceof com.tencent.mm.storage.f1) {
                if (!((ox.g) ((tk.o) i95.n0.c(tk.o.class))).Ri()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.OnBizInfoChange", "onNotifyChange, not canViewBizPhoto");
                    return;
                }
                com.tencent.wechat.iam.biz.t1 t1Var = com.tencent.wechat.iam.biz.t1.f217792c;
                java.lang.String c17 = t1Var.f().a().c();
                int f17 = r01.q3.ij().f();
                t1Var.f().c().k(f17);
                com.tencent.mars.xlog.Log.i("MicroMsg.OnBizInfoChange", "onNotifyChange, biz=%s, unreadCount=%s", c17, java.lang.Integer.valueOf(f17));
                return;
            }
            return;
        }
        if (yw.h1.f466332a.n()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notifyInfo: eventType=");
            java.lang.Object obj2 = "null";
            com.tencent.mm.storage.x1 x1Var = this.f457538e;
            sb6.append(x1Var != null ? x1Var.f196321a : "null");
            sb6.append(", talker=");
            sb6.append(x1Var != null ? x1Var.f196323c : "null");
            sb6.append(", msgId=");
            if (x1Var != null && (s1Var = x1Var.f196322b) != null) {
                obj2 = java.lang.Long.valueOf(s1Var.field_msgId);
            }
            sb6.append(obj2);
            com.tencent.mars.xlog.Log.i("MicroMsg.OnBizInfoChange", sb6.toString());
            yw.q0.f466429a.a(yw.d0.f466291e, null);
        }
    }
}
