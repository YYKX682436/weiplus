package n;

/* loaded from: classes16.dex */
public final class n extends qz5.l implements yz5.p {
    public java.lang.Object L;
    public int M;
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo N;
    public final /* synthetic */ bw5.nk0 P;
    public final /* synthetic */ long Q;
    public final /* synthetic */ int R;
    public final /* synthetic */ android.content.Context S;
    public final /* synthetic */ o.q0 T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, bw5.nk0 nk0Var, long j17, int i17, android.content.Context context, o.q0 q0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.N = snsInfo;
        this.P = nk0Var;
        this.Q = j17;
        this.R = i17;
        this.S = context;
        this.T = q0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new n.n(this.N, this.P, this.Q, this.R, this.S, this.T, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((n.n) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pi0.l1 l1Var;
        java.lang.Object s17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.M;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ((u71.f) ((e70.q) i95.n0.c(e70.q.class))).wi();
            l1Var = new pi0.l1(((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Ui(), "sns", null, false, null, 28, null);
            o.p0 p0Var = new o.p0();
            p0Var.f341779d = this.T;
            l1Var.a(kz5.c0.i(new si0.n1(), new si0.o1(), new si0.t0(), new si0.m1(), p0Var, new si0.s0(this.N)));
            jz5.l[] lVarArr = new jz5.l[6];
            lVarArr[0] = new jz5.l("user_name", c01.z1.r());
            lVarArr[1] = new jz5.l("client_version", new java.lang.Integer(com.tencent.mm.sdk.platformtools.z.f193112h));
            lVarArr[2] = new jz5.l("local_sns_visibility", this.P.toByteArray());
            lVarArr[3] = new jz5.l("sns_id", new java.lang.Long(this.Q));
            int i18 = this.R;
            lVarArr[4] = new jz5.l("from_platform_scene", new java.lang.Integer(i18));
            lVarArr[5] = new jz5.l("post_session_id", i18 == 1 ? ca4.z0.l() : "");
            java.util.Map l17 = kz5.c1.l(lVarArr);
            this.L = l1Var;
            this.M = 1;
            if (l1Var.o("visibilityShow", l17, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            l1Var = (pi0.l1) this.L;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.flutter.ui.FlutterPageStyle flutterPageStyle = new com.tencent.mm.flutter.ui.FlutterPageStyle(0, 0, null, false, false, false, null, 0, false, false, false, null, 4095, null);
        flutterPageStyle.f68125o = false;
        flutterPageStyle.f68117d = 1;
        flutterPageStyle.f68118e = -1;
        android.content.Context context = this.S;
        this.L = null;
        this.M = 2;
        s17 = l1Var.s(context, flutterPageStyle, (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, this);
        if (s17 == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
