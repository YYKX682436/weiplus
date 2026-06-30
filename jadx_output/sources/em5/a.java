package em5;

/* loaded from: classes9.dex */
public class a extends com.tencent.mm.vending.base.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ em5.f f255215d;

    public a(em5.f fVar) {
        this.f255215d = fVar;
    }

    @Override // com.tencent.mm.vending.base.Vending
    public java.lang.Object resolveAsynchronous(java.lang.Object obj) {
        em5.d dVar = (em5.d) ((java.util.concurrent.ConcurrentHashMap) this.f255215d.f255219f).get((java.lang.Class) obj);
        if (dVar == null) {
            return null;
        }
        k61.g gVar = ((k61.e) dVar).f304493a;
        int a17 = gVar.f255224n.a("enter_scene", 1);
        int a18 = gVar.f255224n.a("group_solitatire_flag", 0);
        android.os.Bundle bundle = gVar.f255224n.f282296a;
        java.util.ArrayList<java.lang.String> stringArrayList = bundle == null ? null : bundle.getStringArrayList("oldAmountData");
        com.tencent.mars.xlog.Log.i("MicroMsg.LaunchAAByPersonAmountSelectInteractor", "getSelectMembers scene:%s oldDataList: %s", java.lang.Integer.valueOf(a17), stringArrayList);
        k61.f fVar = new k61.f(gVar);
        if (stringArrayList != null) {
            try {
                if (stringArrayList.size() > 0) {
                    java.util.Iterator<java.lang.String> it = stringArrayList.iterator();
                    while (it.hasNext()) {
                        java.lang.String[] split = it.next().split(",");
                        if (split != null && split.length == 2) {
                            fVar.f304495b.put(split[0], java.lang.Double.valueOf(com.tencent.mm.sdk.platformtools.t8.F(split[1], 0.0d)));
                        }
                    }
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LaunchAAByPersonAmountSelectInteractor", "getSelectMembers parse old data error: %s", e17.getMessage());
            }
        }
        if (a17 == 6) {
            android.os.Bundle bundle2 = gVar.f255224n.f282296a;
            java.util.ArrayList<java.lang.String> stringArrayList2 = bundle2 != null ? bundle2.getStringArrayList("third_party_usernamelist") : null;
            if (stringArrayList2 != null && stringArrayList2.size() > 0) {
                fVar.f304494a = new java.util.ArrayList();
                java.util.Iterator<java.lang.String> it6 = stringArrayList2.iterator();
                while (it6.hasNext()) {
                    fVar.f304494a.add(it6.next());
                }
            }
        } else {
            if (a18 == 1) {
                android.os.Bundle bundle3 = gVar.f255224n.f282296a;
                fVar.f304494a = bundle3 == null ? null : bundle3.getStringArrayList("group_solitatire_username_list");
                android.os.Bundle bundle4 = gVar.f255224n.f282296a;
                fVar.f304496c = bundle4 != null ? bundle4.getStringArrayList("group_solitatire_desc_list") : null;
            } else {
                java.lang.String b17 = gVar.f255224n.b("chatroom");
                if (!com.tencent.mm.sdk.platformtools.t8.K0(b17)) {
                    java.util.List i17 = h61.o.i(b17);
                    fVar.f304494a = i17;
                    if (i17.size() > 0) {
                        fVar.f304494a.remove(c01.z1.r());
                    }
                }
            }
        }
        return fVar;
    }
}
