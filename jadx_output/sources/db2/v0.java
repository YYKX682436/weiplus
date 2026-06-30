package db2;

/* loaded from: classes.dex */
public final class v0 extends az2.o {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public v0(com.tencent.mm.protobuf.g r4, r45.qt2 r5, int r6, boolean r7, int r8, kotlin.jvm.internal.i r9) {
        /*
            r3 = this;
            r9 = r8 & 2
            r0 = 0
            if (r9 == 0) goto L6
            r5 = r0
        L6:
            r9 = r8 & 4
            r1 = 0
            if (r9 == 0) goto Lc
            r6 = r1
        Lc:
            r8 = r8 & 8
            if (r8 == 0) goto L11
            r7 = r1
        L11:
            r8 = 2
            r3.<init>(r5, r0, r8, r0)
            r45.q61 r9 = new r45.q61
            r9.<init>()
            r0 = 11452(0x2cbc, float:1.6048E-41)
            if (r7 != 0) goto L25
            db2.t4 r7 = db2.t4.f228171a
            r45.kv0 r7 = r7.a(r0)
            goto L2b
        L25:
            db2.t4 r7 = db2.t4.f228171a
            r45.kv0 r7 = r7.b(r0, r5)
        L2b:
            r2 = 1
            r9.set(r2, r7)
            java.lang.String r5 = xy2.c.f(r5)
            r9.set(r8, r5)
            r5 = 3
            r9.set(r5, r4)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r6 = 4
            r9.set(r6, r5)
            r45.r61 r5 = new r45.r61
            r5.<init>()
            r45.ie r6 = new r45.ie
            r6.<init>()
            r5.set(r1, r6)
            com.tencent.mm.protobuf.f r6 = r5.getCustom(r1)
            r45.ie r6 = (r45.ie) r6
            if (r6 != 0) goto L58
            goto L5f
        L58:
            r45.du5 r7 = new r45.du5
            r7.<init>()
            r6.f376960e = r7
        L5f:
            com.tencent.mm.modelbase.l r6 = new com.tencent.mm.modelbase.l
            r6.<init>()
            r6.f70664a = r9
            r6.f70665b = r5
            java.lang.String r5 = "/cgi-bin/micromsg-bin/findergetglobalfavlist"
            r6.f70666c = r5
            r6.f70667d = r0
            com.tencent.mm.modelbase.o r5 = r6.a()
            r3.p(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "init, lastBuffer:"
            r5.<init>(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "Finder.CgiFinderGetCollectionList"
            com.tencent.mars.xlog.Log.i(r5, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: db2.v0.<init>(com.tencent.mm.protobuf.g, r45.qt2, int, boolean, int, kotlin.jvm.internal.i):void");
    }

    @Override // az2.o, az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.r61 resp = (r45.r61) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        super.A(i17, i18, str, resp, m1Var);
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderGetCollectionList", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
    }

    @Override // az2.o
    public java.util.List C(com.tencent.mm.protobuf.f fVar) {
        r45.r61 resp = (r45.r61) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> list = resp.getList(1);
        kotlin.jvm.internal.o.f(list, "getObject(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (com.tencent.mm.protocal.protobuf.FinderObject finderObject : list) {
            com.tencent.mm.plugin.finder.storage.h90 h90Var = com.tencent.mm.plugin.finder.storage.FinderItem.Companion;
            kotlin.jvm.internal.o.d(finderObject);
            arrayList.add(h90Var.a(finderObject, 0));
        }
        return arrayList;
    }

    @Override // az2.o
    public long D() {
        com.tencent.mm.protobuf.f fVar = this.f70646f.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetGlobalFavListRequest");
        r45.kv0 kv0Var = (r45.kv0) ((r45.q61) fVar).getCustom(1);
        if (kv0Var != null) {
            return kv0Var.getLong(5);
        }
        return 0L;
    }
}
