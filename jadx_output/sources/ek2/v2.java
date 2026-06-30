package ek2;

/* loaded from: classes.dex */
public final class v2 extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f253552u;

    public v2(long j17, long j18, java.lang.String str, byte[] bArr, java.lang.String str2) {
        super(null, 1, null);
        this.f253552u = "Finder.CgiFinderLuckyMoneyRewardNotify";
        r45.w62 w62Var = new r45.w62();
        w62Var.set(1, db2.t4.f228171a.a(6671));
        w62Var.set(5, java.lang.Long.valueOf(j17));
        w62Var.set(4, java.lang.Long.valueOf(j18));
        w62Var.set(6, str);
        w62Var.set(2, com.tencent.mm.protobuf.g.b(bArr));
        w62Var.set(3, str2);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = w62Var;
        r45.x62 x62Var = new r45.x62();
        x62Var.set(0, new r45.ie());
        lVar.f70665b = x62Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderliveredpacketrewardnotify";
        lVar.f70667d = 6671;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderLuckyMoneyRewardNotify", "CgiFinderLuckyMoneyRewardNotify init liveId:" + w62Var.getLong(5) + " sendId:" + w62Var.getString(3));
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.x62 resp = (r45.x62) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f253552u, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
    }

    @Override // az2.j, cz2.j
    public cz2.f v() {
        return cz2.f.f225003e;
    }
}
