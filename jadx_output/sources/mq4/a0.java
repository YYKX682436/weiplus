package mq4;

/* loaded from: classes14.dex */
public class a0 extends mq4.e0 {
    public a0(int i17, long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String[] strArr, java.lang.String[] strArr2, java.lang.String[] strArr3, java.lang.String[] strArr4) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.t37();
        lVar.f70665b = new r45.u37();
        lVar.f70666c = "/cgi-bin/micromsg-bin/voipstatreport";
        lVar.f70667d = com.tencent.mapsdk.internal.km.f50100e;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f330793d = a17;
        com.tencent.mm.protobuf.f fVar = a17.f70710a.f70684a;
        r45.t37 t37Var = (r45.t37) fVar;
        r45.s37 s37Var = new r45.s37();
        r45.du5 du5Var = new r45.du5();
        du5Var.c(str2);
        s37Var.f385485d = du5Var;
        r45.s37 s37Var2 = new r45.s37();
        r45.du5 du5Var2 = new r45.du5();
        du5Var2.c(str3);
        s37Var2.f385485d = du5Var2;
        r45.s37 s37Var3 = new r45.s37();
        r45.du5 du5Var3 = new r45.du5();
        du5Var3.c(str4);
        s37Var3.f385485d = du5Var3;
        r45.s37 s37Var4 = new r45.s37();
        r45.du5 du5Var4 = new r45.du5();
        du5Var4.c(str5);
        s37Var4.f385485d = du5Var4;
        r45.s37 s37Var5 = new r45.s37();
        r45.du5 du5Var5 = new r45.du5();
        du5Var5.c(str6);
        s37Var5.f385485d = du5Var5;
        t37Var.f386112d = s37Var;
        t37Var.f386114f = s37Var2;
        t37Var.f386113e = s37Var3;
        t37Var.f386115g = s37Var4;
        t37Var.f386117i = s37Var5;
        vq4.d0.a("MicroMsg.NetSceneVoipStatReport", "natReportList length:" + strArr.length);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (int i18 = 0; i18 < strArr.length; i18++) {
            r45.du5 du5Var6 = new r45.du5();
            du5Var6.f372756d = strArr[i18];
            du5Var6.f372757e = true;
            linkedList.add(du5Var6);
        }
        t37Var.f386118m = linkedList.size();
        t37Var.f386119n = linkedList;
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        for (java.lang.String str7 : strArr2) {
            r45.du5 du5Var7 = new r45.du5();
            du5Var7.f372756d = str7;
            du5Var7.f372757e = true;
            linkedList2.add(du5Var7);
        }
        t37Var.f386120o = linkedList2.size();
        t37Var.f386121p = linkedList2;
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        for (java.lang.String str8 : strArr3) {
            r45.du5 du5Var8 = new r45.du5();
            du5Var8.f372756d = str8;
            du5Var8.f372757e = true;
            linkedList3.add(du5Var8);
        }
        t37Var.f386122q = linkedList3.size();
        t37Var.f386123r = linkedList3;
        java.util.LinkedList linkedList4 = new java.util.LinkedList();
        for (java.lang.String str9 : strArr4) {
            r45.du5 du5Var9 = new r45.du5();
            du5Var9.f372756d = str9;
            du5Var9.f372757e = true;
            linkedList4.add(du5Var9);
        }
        t37Var.f386124s = linkedList4.size();
        t37Var.f386125t = linkedList4;
    }

    @Override // mq4.e0
    public com.tencent.mm.modelbase.u0 J() {
        return new mq4.z(this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.mapsdk.internal.km.f50100e;
    }
}
