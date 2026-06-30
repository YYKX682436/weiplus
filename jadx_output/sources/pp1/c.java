package pp1;

/* loaded from: classes11.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pp1.z f357400d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(pp1.z zVar) {
        super(0);
        this.f357400d = zVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        xm3.t0 t0Var = new xm3.t0((com.tencent.mm.plugin.ball.ui.floatball.FloatBallLiveList) ((jz5.n) this.f357400d.f357457r).getValue(), new in5.s() { // from class: com.tencent.mm.plugin.ball.ui.floatball.FloatBallRecyclerViewHelperV2$buildItemConvertFactory$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FloatBall.FloatBallRecyclerViewHelperV2", "type: " + type);
                return new lp1.a();
            }
        }, false, 4, null);
        t0Var.setHasStableIds(true);
        return t0Var;
    }
}
