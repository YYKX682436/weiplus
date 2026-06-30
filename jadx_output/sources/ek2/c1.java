package ek2;

/* loaded from: classes.dex */
public final class c1 extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f253426u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(long j17, long j18, java.lang.String nonceId, byte[] bArr, int i17, java.util.List sendIdList) {
        super(null, 1, null);
        kotlin.jvm.internal.o.g(nonceId, "nonceId");
        kotlin.jvm.internal.o.g(sendIdList, "sendIdList");
        this.f253426u = "Finder.CgiFinderLiveGetRedPacketInfo";
        r45.ou1 ou1Var = new r45.ou1();
        ou1Var.set(5, java.lang.Long.valueOf(j17));
        ou1Var.set(4, java.lang.Long.valueOf(j18));
        ou1Var.set(6, nonceId);
        ou1Var.set(1, db2.t4.f228171a.a(6271));
        ou1Var.set(2, com.tencent.mm.protobuf.g.b(bArr));
        ou1Var.set(7, xy2.c.f(this.f16135n));
        ou1Var.set(8, java.lang.Integer.valueOf(i17));
        java.util.LinkedList list = ou1Var.getList(3);
        if (list != null) {
            list.addAll(sendIdList);
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = ou1Var;
        r45.pu1 pu1Var = new r45.pu1();
        pu1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) pu1Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = pu1Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivegetredpacketinfo";
        lVar.f70667d = 6271;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderLiveGetRedPacketInfo", "CgiFinderLiveGetRedPacketInfo, init liveId:" + ou1Var.getLong(5) + ", objectId:" + ou1Var.getLong(4) + ", nonceId:" + ou1Var.getString(6) + ", send_id_list:" + ou1Var.getList(3));
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.pu1 resp = (r45.pu1) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f253426u, "CgiFinderLiveGetRedPacketInfo [onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ",result:" + pm0.b0.g(resp));
    }

    @Override // az2.j, cz2.j
    public cz2.f v() {
        return cz2.f.f225003e;
    }
}
