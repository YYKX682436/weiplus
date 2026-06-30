package so2;

/* loaded from: classes2.dex */
public final class p2 {
    public p2(kotlin.jvm.internal.i iVar) {
    }

    public static /* synthetic */ r45.mt2 b(so2.p2 p2Var, java.util.List list, com.tencent.mm.protobuf.g gVar, int i17, int i18, int i19, java.lang.Object obj) {
        if ((i19 & 2) != 0) {
            gVar = null;
        }
        if ((i19 & 4) != 0) {
            i17 = 0;
        }
        if ((i19 & 8) != 0) {
            i18 = 0;
        }
        return p2Var.a(list, gVar, i17, i18);
    }

    public final r45.mt2 a(java.util.List feeds, com.tencent.mm.protobuf.g gVar, int i17, int i18) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(feeds, "feeds");
        r45.mt2 mt2Var = new r45.mt2();
        dk2.l lVar = dk2.l.f233709a;
        if (!feeds.isEmpty()) {
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(feeds, 10));
            java.util.Iterator it = feeds.iterator();
            while (it.hasNext()) {
                arrayList.add(((so2.q2) it.next()).f410549n);
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(java.lang.System.currentTimeMillis());
            sb6.append('-');
            sb6.append(arrayList.hashCode());
            str = sb6.toString();
            com.tencent.mars.xlog.Log.i("FinderLiveActivityDataTransaction", "storeReplayFeedList " + str + ",size:" + arrayList.size() + '!');
            java.util.HashMap hashMap = dk2.l.f233710b;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                arrayList2.add(((com.tencent.mm.protocal.protobuf.FinderObject) it6.next()).toByteArray());
            }
            hashMap.put(str, arrayList2);
        } else {
            com.tencent.mars.xlog.Log.e("FinderLiveActivityDataTransaction", "storeReplayFeedList feeds is empty!");
            str = null;
        }
        mt2Var.set(0, str);
        mt2Var.set(2, gVar);
        mt2Var.set(3, java.lang.Integer.valueOf(i17));
        mt2Var.set(4, java.lang.Integer.valueOf(i18));
        return mt2Var;
    }
}
