package mm2;

/* loaded from: classes3.dex */
public final class v5 extends mm2.e {

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData f329483f;

    /* renamed from: g, reason: collision with root package name */
    public float f329484g;

    /* renamed from: h, reason: collision with root package name */
    public float f329485h;

    /* renamed from: i, reason: collision with root package name */
    public r45.f82 f329486i;

    /* renamed from: m, reason: collision with root package name */
    public km2.j f329487m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData f329488n;

    /* renamed from: o, reason: collision with root package name */
    public long f329489o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f329483f = new com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData();
        this.f329488n = new com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData();
    }

    public final void N6(r45.f82 f82Var) {
        java.lang.String str;
        java.util.LinkedList list;
        java.util.LinkedList list2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("restrictConsume defaultQuotas: ");
        java.lang.String str2 = null;
        if (f82Var == null || (list2 = f82Var.getList(1)) == null) {
            str = null;
        } else {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            int i17 = 0;
            for (java.lang.Object obj : list2) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                r45.uw4 uw4Var = (r45.uw4) obj;
                sb7.append("index: " + i17 + " threshold: " + uw4Var.getLong(0) + " needFace: " + uw4Var.getBoolean(1) + " ;");
                i17 = i18;
            }
            str = sb7.toString();
            kotlin.jvm.internal.o.f(str, "toString(...)");
        }
        sb6.append(str);
        sb6.append(" \nhistoryQuotas: ");
        if (f82Var != null && (list = f82Var.getList(4)) != null) {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            int i19 = 0;
            for (java.lang.Object obj2 : list) {
                int i27 = i19 + 1;
                if (i19 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                sb8.append("index: " + i19 + " history_quota_amount: " + ((r45.hl1) obj2).getLong(0) + " ;");
                i19 = i27;
            }
            str2 = sb8.toString();
            kotlin.jvm.internal.o.f(str2, "toString(...)");
        }
        sb6.append(str2);
        com.tencent.mars.xlog.Log.i("LiveRestrictConsumeSlice", sb6.toString());
        this.f329486i = f82Var;
    }

    public final void O6(float f17) {
        com.tencent.mars.xlog.Log.i("LiveRestrictConsumeSlice", "updateConsumeBalanceCNY giftCNY: " + f17 + " curConsumeBalanceCNY: " + this.f329484g + " curHistoryConsumeBalanceCNY: " + this.f329485h);
        float f18 = this.f329484g + f17;
        this.f329484g = f18;
        this.f329484g = ((float) a06.d.b(f18 * ((float) 10))) / 10.0f;
        this.f329485h = this.f329485h + f17;
        this.f329485h = a06.d.b(r0 * r3) / 10.0f;
        com.tencent.mars.xlog.Log.i("LiveRestrictConsumeSlice", "updateConsumeBalanceCNY result curConsumeBalanceCNY: " + this.f329484g + " curHistoryConsumeBalanceCNY: " + this.f329485h);
    }
}
