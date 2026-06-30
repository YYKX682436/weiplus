package ho1;

/* loaded from: classes9.dex */
public final class c1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f282639d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f282640e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f282641f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f282642g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f282643h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f282644i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ho1.q1 f282645m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(long j17, java.lang.String str, long j18, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, java.util.ArrayList arrayList3, ho1.q1 q1Var) {
        super(0);
        this.f282639d = j17;
        this.f282640e = str;
        this.f282641f = j18;
        this.f282642g = arrayList;
        this.f282643h = arrayList2;
        this.f282644i = arrayList3;
        this.f282645m = q1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("filterRestoreMediaAsync taskId = ");
        long j17 = this.f282639d;
        sb6.append(j17);
        sb6.append(", conversationId = ");
        java.lang.String str = this.f282640e;
        sb6.append(str);
        sb6.append(", wait thread pool duration = ");
        sb6.append(java.lang.System.currentTimeMillis() - this.f282641f);
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.RoamProviderImpl", sb6.toString());
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        jz5.l f17 = co1.g.f43768a.f(str, this.f282642g, this.f282643h, this.f282644i);
        long longValue = ((java.lang.Number) f17.f302833d).longValue();
        java.util.ArrayList arrayList = (java.util.ArrayList) f17.f302834e;
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.RoamProviderImpl", "filterRestoreMediaAsync taskId = " + j17 + ", conversationId = " + str + ", filterRestoreMediaIDs duration = " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        com.tencent.wechat.aff.affroam.g0 g0Var = this.f282645m.f282787a;
        if (g0Var != null) {
            g0Var.m(this.f282639d, longValue, arrayList);
        }
        return jz5.f0.f302826a;
    }
}
