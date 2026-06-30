package so2;

/* loaded from: classes2.dex */
public final class n {
    public n(kotlin.jvm.internal.i iVar) {
    }

    public final so2.o a(java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        so2.o oVar = new so2.o();
        if (arrayList == null && arrayList2 == null) {
            return oVar;
        }
        if (arrayList == null && arrayList2 != null) {
            oVar.f410512a = arrayList2;
            oVar.f410514c = b(arrayList2);
            com.tencent.mars.xlog.Log.i("FinderFeedLiveList", "[updateLiveList]increment list:" + arrayList2);
            return oVar;
        }
        if (arrayList != null && arrayList2 == null) {
            oVar.f410513b = arrayList;
            oVar.f410515d = b(arrayList);
            com.tencent.mars.xlog.Log.i("FinderFeedLiveList", "[updateLiveList]remove list:" + arrayList);
            return oVar;
        }
        kotlin.jvm.internal.o.d(arrayList);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(arrayList);
        java.util.ArrayList arrayList4 = new java.util.ArrayList(arrayList);
        kotlin.jvm.internal.o.d(arrayList2);
        java.util.ArrayList arrayList5 = new java.util.ArrayList(arrayList2);
        arrayList3.retainAll(arrayList5);
        arrayList4.removeAll(arrayList3);
        arrayList5.removeAll(arrayList3);
        com.tencent.mars.xlog.Log.i("FinderFeedLiveList", "[updateLiveList]mix list:" + arrayList3);
        com.tencent.mars.xlog.Log.i("FinderFeedLiveList", "[updateLiveList]remove list:" + arrayList4);
        com.tencent.mars.xlog.Log.i("FinderFeedLiveList", "[updateLiveList]increment list:" + arrayList5);
        oVar.f410513b = arrayList4;
        oVar.f410512a = arrayList5;
        oVar.f410515d = b(arrayList4);
        oVar.f410514c = b(arrayList5);
        return oVar;
    }

    public final java.lang.String b(java.util.ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            so2.j1 j1Var = (so2.j1) it.next();
            if (j1Var instanceof so2.j1) {
                com.tencent.mm.protocal.protobuf.FinderContact contact = j1Var.f410439d.getContact();
                jSONArray.put(contact != null ? contact.getUsername() : null);
            }
        }
        java.lang.String jSONArray2 = jSONArray.toString();
        kotlin.jvm.internal.o.f(jSONArray2, "toString(...)");
        return jSONArray2;
    }
}
