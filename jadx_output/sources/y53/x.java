package y53;

@j95.b
/* loaded from: classes8.dex */
public final class x extends i95.w implements u53.y {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f459511d = new java.util.concurrent.ConcurrentHashMap();

    public void Ai(java.lang.String username, u53.x callback) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(callback, "callback");
        Bi(kz5.c0.k(username), callback);
    }

    public void Bi(java.util.List list, u53.x callback) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        java.lang.String sb6;
        kotlin.jvm.internal.o.g(callback, "callback");
        if (list == null || list.isEmpty()) {
            callback.a(kz5.q0.f314001d);
            return;
        }
        y53.t tVar = new y53.t(list, callback);
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            concurrentHashMap = this.f459511d;
            if (!hasNext) {
                break;
            }
            java.lang.String str = (java.lang.String) it.next();
            if (str.length() == 0) {
                hashMap.put("", new y53.m());
            } else {
                y53.m mVar = (y53.m) concurrentHashMap.get(str);
                if (mVar != null) {
                    hashMap.put(str, mVar);
                } else {
                    linkedList.add(str);
                }
            }
        }
        if (linkedList.isEmpty()) {
            tVar.a(hashMap);
            return;
        }
        y53.s sVar = new y53.s(hashMap, this, tVar);
        y53.a0 Ri = ((t53.m0) i95.n0.c(t53.m0.class)).Ri();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("SELECT *, rowid FROM GameLifeContact WHERE username IN ");
        if (linkedList.isEmpty()) {
            sb6 = "()";
        } else {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("(");
            int size = linkedList.size() - 1;
            for (int i17 = 0; i17 < size; i17++) {
                sb8.append("'");
                sb8.append((java.lang.String) linkedList.get(i17));
                sb8.append("',");
            }
            sb8.append("'");
            sb8.append((java.lang.String) linkedList.get(linkedList.size() - 1));
            sb8.append("')");
            sb6 = sb8.toString();
            kotlin.jvm.internal.o.f(sb6, "toString(...)");
        }
        sb7.append(sb6);
        java.lang.String sb9 = sb7.toString();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        android.database.Cursor f17 = Ri.f459469d.f(sb9, null, 2);
        try {
            if (f17.moveToFirst()) {
                while (!f17.isAfterLast()) {
                    y53.m mVar2 = new y53.m();
                    mVar2.convertFrom(f17);
                    java.lang.String field_username = mVar2.field_username;
                    kotlin.jvm.internal.o.f(field_username, "field_username");
                    hashMap2.put(field_username, mVar2);
                    f17.moveToNext();
                }
            }
            vz5.b.a(f17, null);
            for (y53.m mVar3 : hashMap2.values()) {
                java.lang.String t07 = mVar3.t0();
                concurrentHashMap.put(t07, mVar3);
                ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().k0(t07);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : linkedList) {
                if (!hashMap2.containsKey((java.lang.String) obj)) {
                    arrayList.add(obj);
                }
            }
            sVar.invoke(hashMap2, arrayList);
        } finally {
        }
    }

    public y53.m Di(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f459511d;
        y53.m mVar = (y53.m) concurrentHashMap.get(str);
        if (mVar != null) {
            return mVar;
        }
        y53.m y07 = ((t53.m0) i95.n0.c(t53.m0.class)).Ri().y0(str);
        if (y07 == null) {
            return null;
        }
        java.lang.String t07 = y07.t0();
        concurrentHashMap.put(t07, y07);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().k0(t07);
        return y07;
    }

    public void Ni(java.lang.String username, u53.v callback) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(callback, "callback");
        if (username.length() == 0) {
            com.tencent.mars.xlog.Log.e("GameLife.ContactService", "isBlackListAssociateWithWAGame username null!");
            callback.a(false, false);
        }
        com.tencent.mars.xlog.Log.i("GameLife.ContactService", "isBlackListAssociateWithWAGame username:%s", username);
        new w53.a(username).l().H(new y53.v(username, callback));
    }

    public void Ri(java.lang.String str, boolean z17, boolean z18, u53.w wVar) {
        if (!(str == null || str.length() == 0)) {
            com.tencent.mars.xlog.Log.i("GameLife.ContactService", "setBlackListAssociateWithWAGame username:%s,setBlack:%b,isAssociate:%b", str, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
            new w53.e(str, z17, z18).l().H(new y53.w(wVar));
        } else {
            com.tencent.mars.xlog.Log.e("GameLife.ContactService", "setBlackListAssociateWithWAGame username null!");
            if (wVar != null) {
                wVar.a(false);
            }
        }
    }

    public void wi(java.lang.String str) {
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("GameLife.ContactService", "checkContactExpired userName empty");
            return;
        }
        y53.m Di = Di(str);
        if (Di == null) {
            com.tencent.mars.xlog.Log.e("GameLife.ContactService", "checkContactExpired contact null username:%s", str);
            return;
        }
        long c17 = c01.id.c() - Di.field_updateTime;
        if (c17 >= 86400000) {
            com.tencent.mars.xlog.Log.i("GameLife.ContactService", "[checkContactExpired] diff:" + c17 + " limit:86400000 username:" + str);
            java.util.List c18 = kz5.b0.c(str);
            new w53.d(new java.util.LinkedList(c18)).l().H(new y53.u(c18, y53.q.f459496a, new java.util.HashMap(), this));
        }
    }
}
