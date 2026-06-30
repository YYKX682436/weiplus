package y53;

/* loaded from: classes8.dex */
public final class u implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f459504a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u53.x f459505b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f459506c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y53.x f459507d;

    public u(java.util.List list, u53.x xVar, java.util.HashMap hashMap, y53.x xVar2) {
        this.f459504a = list;
        this.f459505b = xVar;
        this.f459506c = hashMap;
        this.f459507d = xVar2;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.util.LinkedList linkedList;
        int p17;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        java.util.HashMap hashMap = this.f459506c;
        if (i17 == 0 && fVar.f70616b == 0 && (linkedList = ((v53.k) fVar.f70618d).f433345d) != null) {
            com.tencent.mars.xlog.Log.i("GameLife.ContactService", "get contact from server success, count %d", java.lang.Integer.valueOf(linkedList.size()));
            java.util.LinkedList<v53.b> chat_user_info_list = ((v53.k) fVar.f70618d).f433345d;
            kotlin.jvm.internal.o.f(chat_user_info_list, "chat_user_info_list");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(chat_user_info_list, 10));
            for (v53.b bVar : chat_user_info_list) {
                kotlin.jvm.internal.o.d(bVar);
                y53.m mVar = new y53.m();
                mVar.field_username = bVar.f433323d;
                mVar.field_nickname = bVar.f433324e;
                mVar.field_avatarURL = bVar.f433325f;
                mVar.field_sex = bVar.f433326g;
                mVar.field_tag = bVar.f433327h;
                mVar.field_jumpInfo = bVar.f433328i;
                mVar.field_accountType = bVar.f433329m;
                arrayList.add(mVar);
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                y53.m mVar2 = (y53.m) it.next();
                mVar2.u0();
                y53.x xVar = this.f459507d;
                xVar.getClass();
                java.lang.String t07 = mVar2.t0();
                xVar.f459511d.put(t07, mVar2);
                ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().k0(t07);
                y53.a0 Ri = ((t53.m0) i95.n0.c(t53.m0.class)).Ri();
                mVar2.field_updateTime = c01.id.c();
                java.lang.String field_username = mVar2.field_username;
                kotlin.jvm.internal.o.f(field_username, "field_username");
                y53.m y07 = Ri.y0(field_username);
                l75.k0 k0Var = Ri.f459469d;
                if (y07 == null) {
                    p17 = (int) k0Var.l("GameLifeContact", dm.i4.COL_USERNAME, mVar2.convertTo());
                    com.tencent.mars.xlog.Log.i("GameLife.ContactStorage", "insertContact[" + p17 + "] " + mVar2.u0());
                } else {
                    android.content.ContentValues convertTo = mVar2.convertTo();
                    convertTo.remove("rowid");
                    java.lang.String field_username2 = mVar2.field_username;
                    kotlin.jvm.internal.o.f(field_username2, "field_username");
                    p17 = k0Var.p("GameLifeContact", convertTo, "username=?", new java.lang.String[]{field_username2});
                    com.tencent.mars.xlog.Log.i("GameLife.ContactStorage", "updateContact[" + p17 + "] " + mVar2.u0());
                }
                if (p17 > 0) {
                    Ri.doNotify("GameLifeContact", 3, mVar2.t0());
                }
                hashMap.put(mVar2.t0(), mVar2);
            }
        } else {
            com.tencent.mars.xlog.Log.e("GameLife.ContactService", "get contact from server failed " + fVar.f70615a + ' ' + fVar.f70616b + ' ' + fVar.f70617c);
        }
        for (java.lang.String str : this.f459504a) {
            if (!hashMap.containsKey(str)) {
                y53.m mVar3 = new y53.m();
                mVar3.field_username = str;
                mVar3.B = false;
                hashMap.put(str, mVar3);
            }
        }
        kotlin.jvm.internal.o.e(hashMap, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, com.tencent.mm.plugin.gamelife.api.IGameLifeContact>");
        this.f459505b.a(hashMap);
        return jz5.f0.f302826a;
    }
}
