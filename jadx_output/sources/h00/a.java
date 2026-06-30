package h00;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f277809b = {kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(h00.a.class, "orderEntranceInfo", "getOrderEntranceInfo()Lcom/tencent/wechat/aff/proto/EcsCardHolderEntranceInfo;", 0)), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(h00.a.class, "ecsConfigInfo", "getEcsConfigInfo()Lcom/tencent/wechat/aff/proto/EcsConfig;", 0))};

    /* renamed from: a, reason: collision with root package name */
    public static final h00.a f277808a = new h00.a();

    /* renamed from: c, reason: collision with root package name */
    public static final b30.c f277810c = new b30.c(new bw5.c6(), "key_ecs_card_holder_entrance_info");

    /* renamed from: d, reason: collision with root package name */
    public static final b30.c f277811d = new b30.c(new bw5.i6(), "key_ecs_config_info");

    public final bw5.i6 a() {
        return (bw5.i6) f277811d.b(this, f277809b[1]);
    }

    public final void b(int i17, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsConfigRepository", "setInitCmdNextRequestTime initCmd:" + i17 + ", nextRequestTime:" + j17);
        jz5.g gVar = b30.p.f17574a;
        java.lang.Object value = ((jz5.n) b30.p.f17574a).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        java.lang.String format = java.lang.String.format("key_ecs_init_cmd_next_request_time_%s", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17)}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        ((com.tencent.mm.sdk.platformtools.o4) value).B(format, j17);
    }
}
