package qe5;

/* loaded from: classes12.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qe5.z f362180d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(qe5.z zVar) {
        super(1);
        this.f362180d = zVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ot0.q v17;
        com.tencent.mm.pluginsdk.model.app.d o17;
        kd5.e state = (kd5.e) obj;
        kotlin.jvm.internal.o.g(state, "state");
        kd5.m mVar = (kd5.m) state.a(kd5.m.class);
        qe5.z zVar = this.f362180d;
        if (mVar != null && zVar.b7()) {
            kd5.e V6 = zVar.V6();
            java.lang.String str = V6 != null ? V6.f306893x : null;
            kd5.e V62 = zVar.V6();
            java.lang.String str2 = V62 != null ? V62.F : null;
            kd5.e V63 = zVar.V6();
            java.lang.String str3 = V63 != null ? V63.f306892w : null;
            ((ht.s) ((jt.a0) i95.n0.c(jt.a0.class))).getClass();
            if (com.tencent.mm.pluginsdk.model.t3.l(str)) {
                ((ht.a) ((jt.v) i95.n0.c(jt.v.class))).getClass();
                if (!((java.util.ArrayList) com.tencent.mm.pluginsdk.ui.tools.f.f191612a).contains(str2)) {
                    zVar.d7(true);
                }
            }
            kd5.e V64 = zVar.V6();
            if (V64 != null) {
                V64.f306876J = true;
            }
            kd5.e V65 = zVar.V6();
            ((jb0.g) ((jt.x) i95.n0.c(jt.x.class))).Ri(zVar.getContext(), 3, new qe5.s(zVar, str2, str, V65 != null && V65.f306884o ? 5 : 1, str3));
        }
        if (((kd5.d) state.a(kd5.d.class)) != null) {
            kd5.e V66 = zVar.V6();
            com.tencent.mm.storage.f9 f9Var = V66 != null ? V66.f306877e : null;
            if (f9Var != null) {
                kd5.e V67 = zVar.V6();
                if ((V67 != null ? V67.G : false) || !f9Var.k2() || (v17 = ot0.q.v(f9Var.j())) == null || !ez.v0.f257777a.j(java.lang.Integer.valueOf(v17.f348666i)) || com.tencent.mm.sdk.platformtools.t8.K0(v17.A) || (o17 = com.tencent.mm.pluginsdk.model.app.k0.o(f9Var, v17.f348694p)) == null || (com.tencent.mm.vfs.w6.j(o17.field_fileFullPath) && com.tencent.mm.vfs.w6.k(o17.field_fileFullPath) == o17.field_totalLen)) {
                    kd5.e V68 = zVar.V6();
                    com.tencent.mm.storage.f9 f9Var2 = V68 != null ? V68.f306877e : null;
                    com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
                    com.tencent.mm.pluginsdk.model.a2.j(doFavoriteEvent, f9Var2, false);
                    androidx.appcompat.app.AppCompatActivity activity = zVar.getActivity();
                    am.c4 c4Var = doFavoriteEvent.f54090g;
                    c4Var.f6323i = activity;
                    c4Var.f6327m = 39;
                    doFavoriteEvent.e();
                } else {
                    zVar.f362224f = true;
                    com.tencent.mars.xlog.Log.i("MicroMsg.FilePreviewUtil", "getFileSendStatus: isSend = false, stack = " + new com.tencent.mm.sdk.platformtools.z3());
                    o17.field_status = (long) 101;
                    o17.field_lastModifyTime = (long) c01.id.e();
                    com.tencent.mm.pluginsdk.model.app.u5.wi().update(o17, new java.lang.String[0]);
                    j75.f Q6 = zVar.Q6();
                    if (Q6 != null) {
                        Q6.B3(new kd5.y());
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
