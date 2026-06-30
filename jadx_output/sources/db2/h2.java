package db2;

/* loaded from: classes2.dex */
public final class h2 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f228003t;

    /* renamed from: u, reason: collision with root package name */
    public final int f228004u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f228005v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.LinkedList f228006w;

    /* renamed from: x, reason: collision with root package name */
    public final int f228007x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(com.tencent.mm.plugin.finder.storage.FinderItem finderItem, bw5.ps0 scene, java.lang.String str, java.util.LinkedList linkedList, java.lang.String str2, java.lang.String str3, java.util.LinkedList linkedList2, int i17, java.lang.String str4, java.util.LinkedList linkedList3, int i18, r45.ze2 ze2Var) {
        super(null, null, 3, null);
        char c17;
        bw5.sp spVar;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        bw5.aw awVar;
        kotlin.jvm.internal.o.g(finderItem, "finderItem");
        kotlin.jvm.internal.o.g(scene, "scene");
        this.f228003t = str3;
        this.f228004u = i17;
        this.f228005v = str4;
        this.f228006w = linkedList3;
        this.f228007x = i18;
        bw5.zq zqVar = new bw5.zq();
        zqVar.f36116f = finderItem.getId();
        boolean[] zArr = zqVar.f36129v;
        zArr[3] = true;
        zqVar.f36117g = finderItem.getUserName();
        zArr[4] = true;
        zqVar.f36118h = 1;
        zArr[5] = true;
        zqVar.f36119i = str;
        zArr[6] = true;
        zqVar.f36120m = str2;
        zArr[7] = true;
        zqVar.f36121n = linkedList2;
        zArr[8] = true;
        zqVar.f36127t = i17;
        zArr[14] = true;
        zqVar.f36122o = str3;
        zArr[9] = true;
        zqVar.f36123p = linkedList;
        zArr[10] = true;
        zqVar.f36124q = str4;
        zArr[11] = true;
        zqVar.f36125r = linkedList3;
        zArr[12] = true;
        zqVar.f36126s = i18;
        zArr[13] = true;
        if (ze2Var != null) {
            spVar = new bw5.sp();
            spVar.f33087d = ze2Var.getFloat(0);
            boolean[] zArr2 = spVar.f33104x;
            zArr2[1] = true;
            spVar.f33088e = ze2Var.getFloat(1);
            zArr2[2] = true;
            spVar.f33089f = ze2Var.getString(2);
            zArr2[3] = true;
            spVar.f33090g = ze2Var.getString(3);
            zArr2[4] = true;
            spVar.f33091h = ze2Var.getString(4);
            zArr2[5] = true;
            spVar.f33092i = ze2Var.getString(5);
            zArr2[6] = true;
            spVar.f33097q = ze2Var.getInteger(10);
            zArr2[11] = true;
            c17 = 15;
            spVar.f33102v = ze2Var.getList(15);
            zArr2[16] = true;
            spVar.f33103w = ze2Var.getInteger(16);
            zArr2[17] = true;
        } else {
            c17 = 15;
            spVar = null;
        }
        zqVar.f36128u = spVar;
        zArr[c17] = true;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = zqVar;
        lVar.f70665b = new bw5.ar();
        lVar.f70667d = 22561;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findermodfeed";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        p(lVar.a());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("feedId:");
        sb6.append(pm0.v.u(zqVar.f36116f));
        sb6.append(" description:");
        sb6.append(str);
        sb6.append(" shortTitle:");
        sb6.append((linkedList == null || (awVar = (bw5.aw) kz5.n0.Z(linkedList)) == null) ? null : awVar.f25443e[1] ? awVar.f25442d : "");
        sb6.append(" coverUrl:");
        sb6.append(str2);
        sb6.append(" coverUrlWord:[");
        if (linkedList2 != null) {
            arrayList = new java.util.ArrayList(kz5.d0.q(linkedList2, 10));
            java.util.Iterator it = linkedList2.iterator();
            while (it.hasNext()) {
                arrayList.add(((java.lang.String) it.next()) + '#');
            }
        } else {
            arrayList = null;
        }
        sb6.append(arrayList);
        sb6.append("] cardShowStyle:");
        sb6.append(this.f228004u);
        sb6.append(" fullCoverUrl:");
        sb6.append(this.f228003t);
        sb6.append(" shareCoverUrl:");
        sb6.append(this.f228005v);
        sb6.append(" shareCoverUrlWord:[");
        java.util.LinkedList linkedList4 = this.f228006w;
        if (linkedList4 != null) {
            arrayList2 = new java.util.ArrayList(kz5.d0.q(linkedList4, 10));
            java.util.Iterator it6 = linkedList4.iterator();
            while (it6.hasNext()) {
                arrayList2.add(((java.lang.String) it6.next()) + '#');
            }
        } else {
            arrayList2 = null;
        }
        sb6.append(arrayList2);
        sb6.append("] shareCoverShowStyle:");
        sb6.append(this.f228007x);
        com.tencent.mars.xlog.Log.i("CgiFinderModFeed", sb6.toString());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        bw5.ar resp = (bw5.ar) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("CgiFinderModFeed", "[onCgiEnd] " + i17 + ":errType errCode:" + i18 + " errMsg:" + str);
    }
}
