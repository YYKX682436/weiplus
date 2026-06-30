package ke2;

/* loaded from: classes.dex */
public final class g0 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final ke2.f0 f306951t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f306952u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(byte[] bArr, long j17, long j18, java.lang.String objectNonceId, java.lang.String finderUserName, int i17, int i18, ke2.f0 f0Var) {
        super(null, null, 3, null);
        kotlin.jvm.internal.o.g(objectNonceId, "objectNonceId");
        kotlin.jvm.internal.o.g(finderUserName, "finderUserName");
        this.f306951t = f0Var;
        this.f306952u = "Finder.CgiFinderLiveRandomMic";
        r45.g62 g62Var = new r45.g62();
        g62Var.set(2, com.tencent.mm.protobuf.g.b(bArr));
        g62Var.set(3, java.lang.Long.valueOf(j17));
        g62Var.set(4, java.lang.Long.valueOf(j18));
        g62Var.set(5, objectNonceId);
        g62Var.set(6, finderUserName);
        g62Var.set(1, db2.t4.f228171a.a(4136));
        g62Var.set(7, java.lang.Integer.valueOf(i17));
        g62Var.set(8, java.lang.Integer.valueOf(i18));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = g62Var;
        r45.h62 h62Var = new r45.h62();
        h62Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) h62Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = h62Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderliverandommic";
        lVar.f70667d = 4136;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderLiveRandomMic", "init: liveId:" + g62Var.getLong(3) + ", objectId:" + g62Var.getLong(4) + ", objectNonceId:" + g62Var.getString(5) + ", finderUserName:" + g62Var.getString(6) + ", opCode:" + g62Var.getInteger(7) + ", applyPos:" + g62Var.getInteger(8));
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.h62 resp = (r45.h62) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f306952u, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
        ke2.f0 f0Var = this.f306951t;
        if (f0Var != null) {
            f0Var.a(i17, i18, str, resp);
        }
    }
}
