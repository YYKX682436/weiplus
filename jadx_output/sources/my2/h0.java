package my2;

/* loaded from: classes.dex */
public final class h0 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ my2.k0 f332734a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.me2 f332735b;

    public h0(my2.k0 k0Var, r45.me2 me2Var) {
        this.f332734a = k0Var;
        this.f332735b = me2Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        if (z17) {
            my2.k0 k0Var = this.f332734a;
            k0Var.getClass();
            r45.me2 me2Var = this.f332735b;
            if (!((me2Var != null ? me2Var.getInteger(13) : 0) == 1)) {
                com.tencent.mars.xlog.Log.w("FinderLiveVoteCardPlugin", "setStopVoteSpan: can_cancel revoked, skip stop voting");
                return;
            }
            r45.le2 le2Var = new r45.le2();
            le2Var.set(4, me2Var != null ? me2Var.getString(5) : null);
            le2Var.set(1, me2Var != null ? me2Var.getString(1) : null);
            le2Var.set(0, java.lang.Integer.valueOf(me2Var != null ? me2Var.getInteger(0) : 0));
            le2Var.set(3, java.lang.Integer.valueOf(me2Var != null ? me2Var.getInteger(7) : 0));
            k0Var.A.a();
            mm2.e1 e1Var = (mm2.e1) k0Var.P0(mm2.e1.class);
            pq5.g l17 = new ly2.b(e1Var.f328988r.getLong(0), e1Var.f328983m, e1Var.f328992v, le2Var, 1).l();
            l17.K(new my2.g0(k0Var, me2Var));
            android.content.Context context = k0Var.f365323d.getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            l17.f((com.tencent.mm.ui.MMActivity) context);
        }
    }
}
