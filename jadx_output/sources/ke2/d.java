package ke2;

/* loaded from: classes.dex */
public final class d extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f306941t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(java.lang.String activityId) {
        super(null, null, 3, null);
        kotlin.jvm.internal.o.g(activityId, "activityId");
        this.f306941t = "Finder.CgiFinderLiveActivitiyClickReport";
        r45.w52 w52Var = new r45.w52();
        w52Var.set(3, activityId);
        w52Var.set(4, 1);
        w52Var.set(2, xy2.c.f(this.f16135n));
        w52Var.set(1, db2.t4.f228171a.a(5246));
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderLiveActivitiyClickReport", "CgiFinderLiveActivitiyClickReport init " + activityId + '}');
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = w52Var;
        r45.x52 x52Var = new r45.x52();
        x52Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) x52Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = x52Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivequestactivityclickreport";
        lVar.f70667d = 5246;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.x52 resp = (r45.x52) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f306941t, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
    }
}
