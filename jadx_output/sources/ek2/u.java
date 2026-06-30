package ek2;

/* loaded from: classes2.dex */
public final class u extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final ek2.t f253548u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(long j17, long j18, java.lang.String initiatorFinderUsername, boolean z17, ek2.t tVar) {
        super(null, 1, null);
        kotlin.jvm.internal.o.g(initiatorFinderUsername, "initiatorFinderUsername");
        this.f253548u = tVar;
        r45.qx0 qx0Var = new r45.qx0();
        qx0Var.f384326d = db2.t4.f228171a.a(13601);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        qx0Var.f384327e = xy2.c.e(context);
        qx0Var.f384328f = j17;
        qx0Var.f384329g = j18;
        qx0Var.f384330h = z17;
        qx0Var.f384331i = initiatorFinderUsername;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = qx0Var;
        r45.rx0 rx0Var = new r45.rx0();
        r45.ie ieVar = new r45.ie();
        rx0Var.BaseResponse = ieVar;
        ieVar.f376960e = new r45.du5();
        lVar.f70665b = rx0Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findercolivepollinvitation";
        lVar.f70667d = 13601;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiCoLivePollInvitation", "init invitationId=" + j17 + ", version=" + j18 + ", screenshotDetected=" + z17);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.rx0 resp = (r45.rx0) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        r45.f50 f50Var = resp.f385266e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onCgiBack] errType=");
        sb6.append(i17);
        sb6.append(" errCode=");
        sb6.append(i18);
        sb6.append(" errMsg=");
        sb6.append(str);
        sb6.append(", hasUpdate=");
        sb6.append(resp.f385265d);
        sb6.append(", version=");
        sb6.append(resp.f385267f);
        sb6.append(", pollIntervalMs=");
        sb6.append(resp.f385268g);
        sb6.append(", status=");
        sb6.append(f50Var != null ? java.lang.Integer.valueOf(f50Var.f374014e) : null);
        sb6.append(", objectId=");
        sb6.append(resp.f385269h);
        sb6.append(", liveId=");
        sb6.append(resp.f385270i);
        com.tencent.mars.xlog.Log.i("Finder.CgiCoLivePollInvitation", sb6.toString());
        ek2.t tVar = this.f253548u;
        if (tVar != null) {
            re2.d1 d1Var = (re2.d1) tVar;
            if (i17 == 0 && i18 == 0) {
                com.tencent.mars.xlog.Log.i("Finder.CoLiveRequestHelper", "pollInvitation success: hasUpdate=" + resp.f385265d + ", version=" + resp.f385267f);
                yz5.l lVar = d1Var.f394378a;
                if (lVar != null) {
                    lVar.invoke(resp);
                    return;
                }
                return;
            }
            com.tencent.mars.xlog.Log.e("Finder.CoLiveRequestHelper", "pollInvitation failed: errType=" + i17 + ", errCode=" + i18 + ", errMsg=" + str);
            yz5.p pVar = d1Var.f394379b;
            if (pVar != null) {
                pVar.invoke(java.lang.Integer.valueOf(i18), str);
            }
        }
    }

    @Override // az2.j, cz2.j
    public cz2.f v() {
        return cz2.f.f225003e;
    }
}
