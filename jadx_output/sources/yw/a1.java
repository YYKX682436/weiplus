package yw;

/* loaded from: classes4.dex */
public final class a1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public static final yw.a1 f466262a = new yw.a1();

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            com.tencent.mm.protobuf.f fVar2 = fVar.f70618d;
            kotlin.jvm.internal.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetBizLatestItemListResp");
            r45.ob3 ob3Var = (r45.ob3) fVar2;
            java.util.LinkedList list = ob3Var.f382130d;
            kotlin.jvm.internal.o.f(list, "list");
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(java.lang.Long.valueOf(((r45.zk) it.next()).f392156f));
            }
            int hashCode = kz5.n0.D0(arrayList2).hashCode();
            android.database.Cursor E = yq1.u0.Ri().f311303d.E("BizFollowedContactDigest", new java.lang.String[]{dm.i4.COL_UPDATETIME}, null, null, null, null, dm.i4.COL_UPDATETIME);
            if (E != null) {
                try {
                    arrayList = new java.util.ArrayList();
                    while (E.moveToNext()) {
                        arrayList.add(java.lang.Long.valueOf(E.getLong(0)));
                    }
                    vz5.b.a(E, null);
                } finally {
                }
            } else {
                arrayList = new java.util.ArrayList();
            }
            if (hashCode == kz5.n0.D0(arrayList).hashCode()) {
                yw.h1 h1Var = yw.h1.f466332a;
                com.tencent.mars.xlog.Log.i("MicroMsg.BizFlutterHelper", "there is no difference between saved and current data.");
            } else {
                java.util.LinkedList<r45.zk> list2 = ob3Var.f382130d;
                kotlin.jvm.internal.o.f(list2, "list");
                for (r45.zk zkVar : list2) {
                    kr1.a aVar = new kr1.a();
                    kotlin.jvm.internal.o.d(zkVar);
                    aVar.field_bizUsername = zkVar.f392154d;
                    aVar.field_updateTime = zkVar.f392156f;
                    aVar.field_digest = zkVar.f392155e;
                    kr1.b Ri = yq1.u0.Ri();
                    Ri.getClass();
                    kr1.a aVar2 = new kr1.a();
                    java.lang.String str = aVar.field_bizUsername;
                    aVar2.field_bizUsername = str;
                    p75.i0 i17 = dm.g1.f237015g.i();
                    i17.f352657d = dm.g1.f237016h.j(str);
                    i17.f352656c = "MicroMsg.SDK.BaseBizFollowedContactDigest";
                    kr1.a aVar3 = (kr1.a) i17.a().o(Ri.f311303d, kr1.a.class);
                    if (aVar3 == null) {
                        Ri.insert(aVar);
                    } else if (aVar3.field_updateTime != aVar.field_updateTime) {
                        if (com.tencent.mm.sdk.platformtools.t8.K0(aVar.field_digest)) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.BizFollowedContactDigestStorage", "replaceOrAdd: new digest is empty, keep old digest for " + aVar.field_bizUsername);
                            aVar.field_digest = aVar3.field_digest;
                        }
                        Ri.replace(aVar);
                    }
                }
            }
        } else {
            yw.h1 h1Var2 = yw.h1.f466332a;
            com.tencent.mars.xlog.Log.e("MicroMsg.BizFlutterHelper", "fetchContactMsgDigest error:" + fVar.f70615a + ' ' + fVar.f70616b);
        }
        return jz5.f0.f302826a;
    }
}
