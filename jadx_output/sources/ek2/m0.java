package ek2;

/* loaded from: classes.dex */
public final class m0 extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f253502u;

    /* renamed from: v, reason: collision with root package name */
    public final ek2.l0 f253503v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(long j17, byte[] bArr, java.lang.String str, long j18, int i17, java.util.List songInfoList, ek2.l0 l0Var) {
        super(null, 1, null);
        kotlin.jvm.internal.o.g(songInfoList, "songInfoList");
        this.f253502u = "Finder.CgiFinderLiveBatchGetMusicInfo";
        this.f253503v = l0Var;
        r45.fm1 fm1Var = new r45.fm1();
        fm1Var.set(1, db2.t4.f228171a.a(6887));
        fm1Var.set(6, java.lang.Long.valueOf(j17));
        fm1Var.set(5, com.tencent.mm.protobuf.g.b(bArr));
        fm1Var.set(2, str);
        fm1Var.set(7, java.lang.Long.valueOf(j18));
        fm1Var.set(4, java.lang.Integer.valueOf(i17));
        fm1Var.set(3, new java.util.LinkedList());
        fm1Var.set(8, new java.util.LinkedList(songInfoList));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = fm1Var;
        r45.gm1 gm1Var = new r45.gm1();
        gm1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) gm1Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = gm1Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivebatchgetmusicinfo";
        lVar.f70667d = 6887;
        p(lVar.a());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CgiFinderLiveBatchGetMusicInfo init ");
        sb6.append(fm1Var.getLong(6));
        sb6.append(',');
        sb6.append(fm1Var.getString(2));
        sb6.append(',');
        sb6.append(fm1Var.getInteger(4));
        sb6.append(",liveCookies is null:");
        sb6.append(fm1Var.getByteString(5) == null);
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderLiveBatchGetMusicInfo", sb6.toString());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.gm1 resp = (r45.gm1) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        java.lang.String str2 = "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread();
        java.lang.String str3 = this.f253502u;
        com.tencent.mars.xlog.Log.i(str3, str2);
        ek2.l0 l0Var = this.f253503v;
        if (l0Var != null) {
            l0Var.a(i17, i18, str, resp);
        }
        if (i17 == 0 && i18 == 0) {
            com.tencent.mars.xlog.Log.i(str3, "FinderLiveBatchGetMusicInfoResponse:" + pm0.b0.g(resp));
        }
    }

    @Override // az2.j, cz2.j
    public cz2.f v() {
        return cz2.f.f225003e;
    }
}
