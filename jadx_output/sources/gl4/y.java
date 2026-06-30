package gl4;

/* loaded from: classes11.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f272894d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.api.TingMemberShipSubscribeRequest f272895e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gl4.z f272896f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f272897g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ qk.y8 f272898h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.tencent.mm.ui.widget.dialog.u3 u3Var, com.tencent.mm.api.TingMemberShipSubscribeRequest tingMemberShipSubscribeRequest, gl4.z zVar, android.content.Context context, qk.y8 y8Var) {
        super(1);
        this.f272894d = u3Var;
        this.f272895e = tingMemberShipSubscribeRequest;
        this.f272896f = zVar;
        this.f272897g = context;
        this.f272898h = y8Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        bw5.w80 w80Var = (bw5.w80) obj;
        this.f272894d.dismiss();
        qk.y8 y8Var = this.f272898h;
        if (w80Var != null) {
            com.tencent.mm.api.TingMemberShipSubscribeRequest tingMemberShipSubscribeRequest = this.f272895e;
            tingMemberShipSubscribeRequest.f53212e = w80Var;
            this.f272896f.e((androidx.fragment.app.FragmentActivity) this.f272897g, tingMemberShipSubscribeRequest, w80Var, y8Var);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.TingMembershipHelper", "startMembershipSubscribe fetchJoinInfo failed");
            if (y8Var != null) {
                y8Var.a(new qk.ea(qk.ga.f364136f, null));
            }
        }
        return jz5.f0.f302826a;
    }
}
