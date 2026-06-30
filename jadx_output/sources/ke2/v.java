package ke2;

/* loaded from: classes.dex */
public final class v extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f306991t;

    public /* synthetic */ v(long j17, long j18, int i17, java.lang.String str, byte[] bArr, java.lang.String str2, com.tencent.mm.protobuf.g gVar, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i18, kotlin.jvm.internal.i iVar) {
        this(j17, j18, i17, (i18 & 8) != 0 ? "" : str, (i18 & 16) != 0 ? null : bArr, str2, gVar, str3, str4, (i18 & 512) != 0 ? "" : str5);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.zs1 resp = (r45.zs1) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f306991t, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(long j17, long j18, int i17, java.lang.String finderUsername, byte[] bArr, java.lang.String jumpId, com.tencent.mm.protobuf.g gVar, java.lang.String str, java.lang.String str2, java.lang.String ecSource) {
        super(null, null, 2, null);
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        kotlin.jvm.internal.o.g(jumpId, "jumpId");
        kotlin.jvm.internal.o.g(ecSource, "ecSource");
        this.f306991t = "Finder.CgiFinderLiveGetJumpInfo";
        r45.ys1 ys1Var = new r45.ys1();
        ys1Var.set(1, db2.t4.f228171a.a(6283));
        ys1Var.set(2, java.lang.Long.valueOf(j17));
        ys1Var.set(3, java.lang.Long.valueOf(j18));
        ys1Var.set(4, java.lang.Integer.valueOf(i17));
        ys1Var.set(5, jumpId);
        ys1Var.set(6, gVar);
        ys1Var.set(7, ecSource);
        ys1Var.set(8, finderUsername);
        ys1Var.set(9, bArr != null ? com.tencent.mm.protobuf.g.b(bArr) : null);
        if (str != null) {
            ys1Var.set(10, com.tencent.mm.protobuf.g.c(str));
        }
        if (str2 != null) {
            ys1Var.set(11, com.tencent.mm.protobuf.g.c(str2));
        }
        ys1Var.set(12, 1);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = ys1Var;
        r45.zs1 zs1Var = new r45.zs1();
        zs1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) zs1Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = zs1Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivegetjumpinfo";
        lVar.f70667d = 6283;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderLiveGetJumpInfo", "init liveId:" + j18 + ", objectId:" + j17 + '}');
    }
}
