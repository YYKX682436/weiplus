package g20;

/* loaded from: classes8.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g20.g f267764d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(g20.g gVar) {
        super(2);
        this.f267764d = gVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        bw5.j8 type = (bw5.j8) obj;
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g((bw5.i8) obj2, "<anonymous parameter 1>");
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsOrderService", "jumpOrderAndCardCenter eventAction type=" + type);
        if (type == bw5.j8.EcsOpenEventType_wxaDidExit) {
            b00.q2 q2Var = (b00.q2) ((c00.b4) i95.n0.c(c00.b4.class));
            q2Var.getClass();
            if (((g20.g) ((c00.x3) i95.n0.c(c00.x3.class))).Ri()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMEcsReportService", "exitOrderAndCardPage enterTime=" + q2Var.f16755f);
                if (q2Var.f16755f > 0) {
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("page_out", null, kz5.c1.k(new jz5.l("page_id", "my_page"), new jz5.l("element_id", "order_card"), new jz5.l("stay_time_ms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - q2Var.f16755f))), 12, false);
                    q2Var.f16755f = 0L;
                }
            }
            this.f267764d.aj(false);
        }
        return jz5.f0.f302826a;
    }
}
