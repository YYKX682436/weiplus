package dk2;

/* loaded from: classes3.dex */
public final class p6 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.nw1 f233903a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f233904b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f233905c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f233906d;

    public p6(r45.nw1 nw1Var, com.tencent.mm.protocal.protobuf.FinderObject finderObject, android.content.Context context, r45.qt2 qt2Var) {
        this.f233903a = nw1Var;
        this.f233904b = finderObject;
        this.f233905c = context;
        this.f233906d = qt2Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        int i18 = fVar.f70616b;
        r45.nw1 nw1Var = this.f233903a;
        if (i17 == 0 && i18 == 0) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveFeedFlowReporter", "[reportJoinLiveOnFeedFlow] success, liveid = " + nw1Var.getLong(0));
            long j17 = dk2.u6.f234180j;
            r45.nw1 nw1Var2 = (r45.nw1) ((r45.hc1) fVar.f70618d).getCustom(3);
            if (j17 != (nw1Var2 != null ? nw1Var2.getLong(0) : -1L)) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[jonLiveInternal]， return 。enterLiveId = ");
                sb6.append(dk2.u6.f234180j);
                sb6.append(", joinLiveId = ");
                r45.nw1 nw1Var3 = (r45.nw1) ((r45.hc1) fVar.f70618d).getCustom(3);
                sb6.append(nw1Var3 != null ? nw1Var3.getLong(0) : -1L);
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveFeedFlowReporter", sb6.toString());
                dk2.u6 u6Var = dk2.u6.f234171a;
                dk2.u6.f234177g = null;
                dk2.u6.f234178h = null;
                dk2.u6.f234176f = 0L;
                dk2.u6.f234180j = 0L;
                dk2.u6.f234179i = null;
            } else {
                r45.nw1 nw1Var4 = (r45.nw1) ((r45.hc1) fVar.f70618d).getCustom(3);
                dk2.u6.f234176f = nw1Var4 != null ? nw1Var4.getLong(0) : -1L;
                com.tencent.mm.protocal.protobuf.FinderObject finderObject = this.f233904b;
                dk2.u6.f234177g = finderObject;
                dk2.u6 u6Var2 = dk2.u6.f234171a;
                android.content.Context context = this.f233905c;
                com.tencent.mm.protobuf.f resp = fVar.f70618d;
                kotlin.jvm.internal.o.f(resp, "resp");
                u6Var2.b(context, finderObject, (r45.hc1) resp, this.f233906d, 0L, false, null);
                u6Var2.d((r45.hc1) fVar.f70618d, this.f233904b);
            }
        } else {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveFeedFlowReporter", "[reportJoinLiveOnFeedFlow] failed, liveid = " + nw1Var.getLong(0) + ", errCode = " + i18);
        }
        return jz5.f0.f302826a;
    }
}
