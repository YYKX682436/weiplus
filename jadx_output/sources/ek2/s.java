package ek2;

/* loaded from: classes2.dex */
public final class s extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final ek2.r f253528u;

    /* renamed from: v, reason: collision with root package name */
    public final r45.ox0 f253529v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(java.lang.String url, long j17, ek2.r rVar) {
        super(null, 1, null);
        kotlin.jvm.internal.o.g(url, "url");
        this.f253528u = rVar;
        r45.ox0 ox0Var = new r45.ox0();
        this.f253529v = ox0Var;
        ox0Var.f382591d = db2.t4.f228171a.a(19706);
        ox0Var.f382592e = url;
        ox0Var.f382593f = j17;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = ox0Var;
        r45.px0 px0Var = new r45.px0();
        r45.ie ieVar = new r45.ie();
        px0Var.BaseResponse = ieVar;
        ieVar.f376960e = new r45.du5();
        lVar.f70665b = px0Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findercolivemergeavatars";
        lVar.f70667d = 19706;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiCoLiveMergeAvatars", "init objectId=" + j17 + ", url=" + r26.p0.E0(url, 80));
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.px0 resp = (r45.px0) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("Finder.CgiCoLiveMergeAvatars", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + ", objectId=" + this.f253529v.f382593f);
        ek2.r rVar = this.f253528u;
        if (rVar != null) {
            re2.c1 c1Var = (re2.c1) rVar;
            long j17 = c1Var.f394373a;
            if (i17 == 0 && i18 == 0) {
                com.tencent.mars.xlog.Log.i("Finder.CoLiveRequestHelper", "mergeAvatars success: objectId=" + j17);
                yz5.l lVar = c1Var.f394374b;
                if (lVar != null) {
                    lVar.invoke(resp);
                    return;
                }
                return;
            }
            com.tencent.mars.xlog.Log.e("Finder.CoLiveRequestHelper", "mergeAvatars failed: objectId=" + j17 + ", errType=" + i17 + ", errCode=" + i18 + ", errMsg=" + str);
            yz5.p pVar = c1Var.f394375c;
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
