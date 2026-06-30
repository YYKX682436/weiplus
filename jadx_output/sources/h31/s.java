package h31;

/* loaded from: classes9.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final h31.s f278446a = new h31.s();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f278447b = kz5.c1.i(new jz5.l(1, 0), new jz5.l(3, 2), new jz5.l(2, 0));

    public static final int b(int i17) {
        java.lang.Integer num = (java.lang.Integer) f278447b.get(java.lang.Integer.valueOf(i17));
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public void a(h31.r rVar) {
        if (rVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BrandSubscribeMsgRequestController", "cancel SubscribeMsgRequestTask bizUsername: %s, appId: %s, mRunningTaskId: %s", rVar.f278429c, rVar.f278430d, java.lang.Long.valueOf(rVar.f278441o));
            rVar.f278434h = null;
            rVar.f278427a = null;
            e31.k kVar = rVar.f278440n;
            if (kVar != null) {
                long j17 = rVar.f278441o;
                ((g31.l) kVar).f268089b.getClass();
                k31.o oVar = k31.o.f303850a;
                ((ku5.t0) ku5.t0.f312615d).h(new k31.j(j17), "manager_thread");
            }
        }
    }

    public void c(h31.r requestTask) {
        kotlin.jvm.internal.o.g(requestTask, "requestTask");
        requestTask.c();
    }
}
