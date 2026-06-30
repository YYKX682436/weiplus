package sm2;

/* loaded from: classes3.dex */
public final class j implements ke2.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409512a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f409513b;

    public j(sm2.o4 o4Var, yz5.l lVar) {
        this.f409512a = o4Var;
        this.f409513b = lVar;
    }

    @Override // ke2.f0
    public void a(int i17, int i18, java.lang.String str, r45.h62 resp) {
        kotlin.jvm.internal.o.g(resp, "resp");
        sm2.o4 o4Var = this.f409512a;
        com.tencent.mars.xlog.Log.i(o4Var.f409610f, "cancel random match: errType=" + i17 + ", errCode=" + i18 + ", errMsg=" + str);
        yz5.l lVar = this.f409513b;
        if (i17 == 0 && i18 == 0) {
            ((mm2.o4) o4Var.c(mm2.o4.class)).R7(false);
            zn0.x.f474414a.i(null);
            com.tencent.mm.plugin.finder.live.plugin.c4 c4Var = o4Var.N;
            if (c4Var != null) {
                c4Var.E1();
            }
            if (lVar != null) {
                lVar.invoke(java.lang.Boolean.TRUE);
                return;
            }
            return;
        }
        ((mm2.o4) o4Var.c(mm2.o4.class)).R7(false);
        long j17 = ((mm2.e1) o4Var.c(mm2.e1.class)).f328988r.getLong(0);
        com.tencent.mars.xlog.Log.i("FinderLiveMicWatcher", "onCloseRandomMatchMicFail errCode: " + i18 + " errType: " + i17 + " liveId: " + j17);
        pm0.z.b(xy2.b.f458155b, "micpk_anchorCloseRandomMatchMicFail", false, null, null, false, false, new dk2.ra(i18, i17, j17), 60, null);
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.FALSE);
        }
    }
}
