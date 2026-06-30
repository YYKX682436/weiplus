package ev2;

/* loaded from: classes10.dex */
public final class d extends fp0.d implements com.tencent.mm.modelbase.u0 {

    /* renamed from: f, reason: collision with root package name */
    public final jv2.a f256903f;

    /* renamed from: g, reason: collision with root package name */
    public final iv2.a f256904g;

    /* renamed from: h, reason: collision with root package name */
    public fv2.h f256905h;

    public d(jv2.a action, iv2.a aVar) {
        kotlin.jvm.internal.o.g(action, "action");
        this.f256903f = action;
        this.f256904g = aVar;
    }

    @Override // fp0.d
    public void a() {
        iv2.a aVar = this.f256904g;
        if (aVar == null) {
            return;
        }
        jv2.a aVar2 = this.f256903f;
        this.f256905h = new fv2.h(aVar2, aVar);
        long a17 = c01.id.a() - (aVar2.u0().getCreatetime() * 1000);
        long j17 = aVar2.field_tryCount;
        if (j17 < 2 && a17 < 1200000) {
            aVar2.field_tryCount = j17 + 1;
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusActionTask", "doAction " + aVar2 + ' ' + aVar2 + ".field_tryCount");
            defpackage.y.f458297f.a().D0(aVar2.field_localCommentId, aVar2, false);
            com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
            fv2.h hVar = this.f256905h;
            if (hVar == null) {
                kotlin.jvm.internal.o.o("curScene");
                throw null;
            }
            d17.g(hVar);
            gm0.j1.d().a(9704, this);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusActionTask", "make fail tryNext " + aVar2.t0() + " tryCount " + aVar2.field_tryCount + " createTime: " + aVar2.u0().getCreatetime());
        aVar2.field_state = -1;
        defpackage.y.f458297f.a().D0(aVar2.field_localCommentId, aVar2, true);
        b(fp0.u.f265290f);
        boolean b17 = kotlin.jvm.internal.o.b(aVar2.D0(), en1.a.a());
        xe0.i0 i0Var = (xe0.i0) i95.n0.c(xe0.i0.class);
        java.lang.String D0 = aVar2.D0();
        ((we0.l1) i0Var).getClass();
        mj4.h M = ai4.m0.f5173a.M(D0);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("view_clk", null, kz5.c1.k(new jz5.l("textstatusid", M != null ? ((mj4.k) M).l() : ""), new jz5.l("s_self_textstatus", java.lang.Boolean.valueOf(b17))), 28809);
    }

    @Override // fp0.d
    public java.lang.String d() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        jv2.a aVar = this.f256903f;
        sb6.append(aVar.field_actionType);
        sb6.append('_');
        sb6.append(aVar.field_feedId);
        sb6.append('_');
        sb6.append(aVar.field_localCommentId);
        return sb6.toString();
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        fv2.h hVar = this.f256905h;
        if (hVar == null) {
            kotlin.jvm.internal.o.o("curScene");
            throw null;
        }
        if (kotlin.jvm.internal.o.b(m1Var, hVar)) {
            gm0.j1.d().q(9704, this);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSceneEnd ");
            sb6.append(i17);
            sb6.append(", ");
            sb6.append(i18);
            sb6.append(", ");
            sb6.append(str);
            sb6.append(", ");
            jv2.a aVar = this.f256903f;
            sb6.append(aVar != null ? java.lang.Long.valueOf(aVar.field_localCommentId) : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusActionTask", sb6.toString());
            if (aVar != null) {
                if (i17 == 0 && i18 == 0) {
                    defpackage.y.f458297f.a().z0(aVar.field_localCommentId);
                    b(fp0.u.f265290f);
                    return;
                }
                if (i17 == 4 && (i18 == -5002 || i18 == -5001 || i18 == -4007 || i18 == -4006)) {
                    defpackage.y.f458297f.a().z0(aVar.field_localCommentId);
                } else {
                    if (i17 >= 4) {
                        aVar.field_state = -1;
                        if (i18 == -4010) {
                            aVar.field_failedFlag = 1;
                        }
                    } else {
                        aVar.field_postTime = c01.id.a();
                    }
                    defpackage.y.f458297f.a().D0(aVar.field_localCommentId, aVar, false);
                }
                b(fp0.u.f265291g);
            }
        }
    }
}
