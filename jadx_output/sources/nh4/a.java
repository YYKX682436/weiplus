package nh4;

/* loaded from: classes2.dex */
public final class a implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f337121a;

    public a(com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        this.f337121a = finderObject;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        jz5.l[] lVarArr = new jz5.l[5];
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        jz5.l lVar = new jz5.l("behaviour_session_id", Ri);
        boolean z17 = false;
        lVarArr[0] = lVar;
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        lVarArr[1] = new jz5.l("finder_context_id", b52.b.b());
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        lVarArr[2] = new jz5.l("finder_tab_context_id", b52.b.c());
        r45.nw1 liveInfo = this.f337121a.getLiveInfo();
        if (liveInfo != null && liveInfo.getInteger(2) == 1) {
            z17 = true;
        }
        lVarArr[3] = new jz5.l("live_enter_status", java.lang.Integer.valueOf(z17 ? 1 : 2));
        lVarArr[4] = new jz5.l("share_username", "");
        return kz5.c1.k(lVarArr);
    }
}
