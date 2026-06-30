package ek2;

/* loaded from: classes.dex */
public final class w0 extends ek2.g0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(java.lang.String finder_username, com.tencent.mm.protobuf.g gVar, long j17, long j18, java.lang.String str, int i17, r45.ss1 reqBuffer) {
        super(null, 1, null);
        kotlin.jvm.internal.o.g(finder_username, "finder_username");
        kotlin.jvm.internal.o.g(reqBuffer, "reqBuffer");
        r45.cs1 cs1Var = new r45.cs1();
        cs1Var.set(1, db2.t4.f228171a.b(4119, this.f16135n));
        cs1Var.set(2, finder_username);
        cs1Var.set(3, gVar);
        cs1Var.set(4, java.lang.Long.valueOf(j17));
        cs1Var.set(5, java.lang.Long.valueOf(j18));
        cs1Var.set(6, str);
        cs1Var.set(7, java.lang.Integer.valueOf(i17));
        cs1Var.set(8, hc2.b.a(reqBuffer));
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderLiveGetDeliveryDetail", "#init objectId=" + j17 + " liveId=" + j18 + " objectNonceId=" + str + " cmdId=" + i17 + " reqBuffer.package_id=" + reqBuffer.getString(0));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = cs1Var;
        r45.ds1 ds1Var = new r45.ds1();
        ds1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) ds1Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = ds1Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivegetdeliverydetail";
        lVar.f70667d = 4119;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.ds1 resp = (r45.ds1) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#onCgiEnd errType=");
        sb6.append(i17);
        sb6.append(" errCode=");
        sb6.append(i18);
        sb6.append(" errMsg=");
        sb6.append(str);
        sb6.append(", cmd_id:");
        sb6.append(resp.getInteger(1));
        sb6.append(" resp_buffer:");
        com.tencent.mm.protobuf.g byteString = resp.getByteString(2);
        sb6.append(byteString != null ? byteString.i() : null);
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderLiveGetDeliveryDetail", sb6.toString());
    }
}
