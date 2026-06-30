package sc2;

/* loaded from: classes2.dex */
public final class m implements gy1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sc2.n f406060a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f406061b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f406062c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f406063d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f406064e;

    public m(sc2.n nVar, long j17, boolean z17, java.lang.Object obj, r45.qt2 qt2Var) {
        this.f406060a = nVar;
        this.f406061b = j17;
        this.f406062c = z17;
        this.f406063d = obj;
        this.f406064e = qt2Var;
    }

    @Override // gy1.b
    public final void a(long j17, java.lang.String str, java.util.Map map) {
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo;
        com.tencent.mm.protocal.protobuf.NativeInfo native_info;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo2;
        sc2.n nVar = this.f406060a;
        xc2.p0 p0Var = nVar.f3147h;
        boolean z17 = (p0Var == null || (finderJumpInfo2 = p0Var.f453234a) == null || finderJumpInfo2.getRed_packet_type() != 1) ? false : true;
        java.lang.Object obj = this.f406063d;
        long j18 = this.f406061b;
        if (z17) {
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l[] lVarArr = new jz5.l[3];
            lVarArr[0] = new jz5.l("feed_id", pm0.v.u(j18));
            lVarArr[1] = new jz5.l("get_red_button_type", java.lang.Integer.valueOf(this.f406062c ? 2 : 1));
            lVarArr[2] = new jz5.l("report_extra_data", obj);
            ((cy1.a) rVar).Cj("get_red_button", str, kz5.c1.k(lVarArr), 25496);
            return;
        }
        xc2.p0 p0Var2 = nVar.f3147h;
        if ((p0Var2 == null || (finderJumpInfo = p0Var2.f453234a) == null || (native_info = finderJumpInfo.getNative_info()) == null || native_info.getNative_type() != 50) ? false : true) {
            dy1.r rVar2 = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l[] lVarArr2 = new jz5.l[5];
            r45.qt2 qt2Var = this.f406064e;
            lVarArr2[0] = new jz5.l("finder_tab_context_id", qt2Var != null ? qt2Var.getString(2) : null);
            lVarArr2[1] = new jz5.l("finder_context_id", qt2Var != null ? qt2Var.getString(1) : null);
            lVarArr2[2] = new jz5.l("comment_scene", qt2Var != null ? java.lang.Integer.valueOf(qt2Var.getInteger(5)) : null);
            lVarArr2[3] = new jz5.l("feed_id", pm0.v.u(j18));
            lVarArr2[4] = new jz5.l("report_extra_data", obj);
            ((cy1.a) rVar2).Cj("finder_set_state", str, kz5.c1.k(lVarArr2), 25496);
        }
    }
}
