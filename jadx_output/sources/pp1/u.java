package pp1;

/* loaded from: classes11.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pp1.z f357441d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(pp1.z zVar) {
        super(0);
        this.f357441d = zVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        pp1.z zVar = this.f357441d;
        return new com.tencent.mm.plugin.ball.ui.floatball.FloatBallLiveList((com.tencent.mm.plugin.ball.ui.floatball.FloatBallLiveDataSource) ((jz5.n) zVar.f357456q).getValue(), zVar.f357454o, new xm3.n0(), zVar);
    }
}
