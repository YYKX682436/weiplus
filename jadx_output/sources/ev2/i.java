package ev2;

/* loaded from: classes10.dex */
public final class i extends fp0.d implements com.tencent.mm.modelbase.u0 {

    /* renamed from: f, reason: collision with root package name */
    public final jv2.c f256913f;

    /* renamed from: g, reason: collision with root package name */
    public final iv2.b f256914g;

    /* renamed from: h, reason: collision with root package name */
    public fv2.i f256915h;

    public i(jv2.c action, iv2.b bVar) {
        kotlin.jvm.internal.o.g(action, "action");
        this.f256913f = action;
        this.f256914g = bVar;
    }

    @Override // fp0.d
    public void a() {
        iv2.b bVar = this.f256914g;
        if (bVar == null) {
            return;
        }
        jv2.c cVar = this.f256913f;
        this.f256915h = new fv2.i(cVar, bVar);
        long a17 = c01.id.a() - (cVar.u0().getCreatetime() * 1000);
        long j17 = cVar.field_tryCount;
        if (j17 >= 2 || a17 >= 1200000) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MusicUni.ActionTask", "make fail tryNext " + cVar.t0() + " tryCount " + cVar.field_tryCount + " createTime: " + cVar.u0().getCreatetime());
            cVar.field_state = -1;
            jv2.h.f302217f.a().D0(cVar.field_localCommentId, cVar, true);
            b(fp0.u.f265290f);
            return;
        }
        cVar.field_tryCount = j17 + 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.MusicUni.ActionTask", "doAction " + cVar + ' ' + cVar + ".field_tryCount");
        jv2.h.f302217f.a().D0(cVar.field_localCommentId, cVar, false);
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        fv2.i iVar = this.f256915h;
        if (iVar == null) {
            kotlin.jvm.internal.o.o("curScene");
            throw null;
        }
        d17.g(iVar);
        gm0.j1.d().a(6964, this);
    }

    @Override // fp0.d
    public java.lang.String d() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        jv2.c cVar = this.f256913f;
        sb6.append(cVar.field_actionType);
        sb6.append('_');
        sb6.append(cVar.field_feedId);
        sb6.append('_');
        sb6.append(cVar.field_localCommentId);
        return sb6.toString();
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        fv2.i iVar = this.f256915h;
        if (iVar == null) {
            kotlin.jvm.internal.o.o("curScene");
            throw null;
        }
        if (kotlin.jvm.internal.o.b(m1Var, iVar)) {
            gm0.j1.d().q(6964, this);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSceneEnd ");
            sb6.append(i17);
            sb6.append(", ");
            sb6.append(i18);
            sb6.append(", ");
            sb6.append(str);
            sb6.append(", ");
            jv2.c cVar = this.f256913f;
            sb6.append(cVar != null ? java.lang.Long.valueOf(cVar.field_localCommentId) : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.MusicUni.ActionTask", sb6.toString());
            if (cVar != null) {
                if (i17 == 0 && i18 == 0) {
                    jv2.h.f302217f.a().z0(cVar.field_localCommentId);
                    b(fp0.u.f265290f);
                    return;
                }
                if (i17 == 4 && (i18 == -5002 || i18 == -5001 || i18 == -4007 || i18 == -4006)) {
                    jv2.h.f302217f.a().z0(cVar.field_localCommentId);
                } else {
                    if (i17 >= 4) {
                        cVar.field_state = -1;
                        if (i18 == -4010) {
                            cVar.field_failedFlag = 1;
                        }
                    } else {
                        cVar.field_postTime = c01.id.a();
                    }
                    jv2.h.f302217f.a().D0(cVar.field_localCommentId, cVar, false);
                }
                b(fp0.u.f265291g);
            }
        }
    }
}
