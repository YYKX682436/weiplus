package ek2;

/* loaded from: classes.dex */
public final class m1 extends ek2.g0 {
    public m1(byte[] bArr, long j17, long j18, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        super(null, 1, null);
        r45.oy1 oy1Var = new r45.oy1();
        oy1Var.set(1, db2.t4.f228171a.a(19408));
        oy1Var.set(2, com.tencent.mm.protobuf.g.b(bArr));
        oy1Var.set(3, java.lang.Long.valueOf(j17));
        oy1Var.set(4, java.lang.Long.valueOf(j18));
        oy1Var.set(5, str);
        oy1Var.set(6, str2);
        oy1Var.set(7, str3);
        oy1Var.set(8, java.lang.Integer.valueOf(i17));
        com.tencent.mars.xlog.Log.i("CgiFinderLiveLikeAudience", "CgiFinderLiveLikeAudience:liveCookies=" + bArr + ",liveId=" + j17 + ",objectId=" + j18 + ",objectNonceId=" + str + ",finderUserName=" + str2 + ",micId=" + str3 + ",count=" + i17);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = oy1Var;
        r45.py1 py1Var = new r45.py1();
        py1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) py1Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = py1Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivelikeaudience";
        lVar.f70667d = 19408;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.py1 resp = (r45.py1) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("CgiFinderLiveLikeAudience", "CgiFinderLiveLikeAudience onCgiEnd:errType=" + i17 + ",errCode=" + i18 + ",errMsg=" + str);
    }
}
