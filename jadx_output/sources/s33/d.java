package s33;

@j95.b
/* loaded from: classes15.dex */
public class d extends i95.w implements u33.g {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f402483d = new java.util.concurrent.ConcurrentHashMap();

    public void Ai(java.util.List list, u33.f fVar) {
        java.util.Map map;
        s33.a aVar = new s33.a(this, fVar);
        java.util.HashMap hashMap = new java.util.HashMap();
        if (com.tencent.mm.sdk.platformtools.t8.L0(list)) {
            aVar.a(hashMap);
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            map = this.f402483d;
            if (!hasNext) {
                break;
            }
            java.lang.String str = (java.lang.String) it.next();
            u33.h hVar = (u33.h) ((java.util.concurrent.ConcurrentHashMap) map).get(str);
            if (hVar != null) {
                hashMap.put(str, hVar);
            } else {
                linkedList.add(str);
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
            aVar.a(hashMap);
            return;
        }
        y33.f wi6 = ((s33.j0) i95.n0.c(s33.j0.class)).wi();
        wi6.getClass();
        java.lang.String str2 = "SELECT * FROM GameChatRoomContact WHERE userName IN " + s33.y.d(linkedList);
        java.util.HashMap hashMap2 = new java.util.HashMap();
        android.database.Cursor f17 = wi6.f459177d.f(str2, null, 2);
        try {
            if (f17.moveToFirst()) {
                while (!f17.isAfterLast()) {
                    y33.e eVar = new y33.e();
                    eVar.convertFrom(f17);
                    java.lang.String field_userName = eVar.field_userName;
                    kotlin.jvm.internal.o.f(field_userName, "field_userName");
                    hashMap2.put(field_userName, eVar);
                    f17.moveToNext();
                }
            }
            vz5.b.a(f17, null);
            hashMap.putAll(hashMap2);
            for (java.util.Map.Entry entry : hashMap2.entrySet()) {
                java.lang.String str3 = (java.lang.String) entry.getKey();
                if (linkedList.contains(str3)) {
                    linkedList.remove(str3);
                    ((java.util.concurrent.ConcurrentHashMap) map).put(str3, (u33.h) entry.getValue());
                }
            }
            if (com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
                aVar.a(hashMap);
            } else {
                Di(linkedList, new s33.b(this, hashMap, aVar));
            }
        } finally {
        }
    }

    public u33.h Bi(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        java.util.Map map = this.f402483d;
        u33.h hVar = (u33.h) ((java.util.concurrent.ConcurrentHashMap) map).get(str);
        if (hVar != null) {
            return hVar;
        }
        u33.h y07 = ((s33.j0) i95.n0.c(s33.j0.class)).wi().y0(str);
        if (y07 != null) {
            ((java.util.concurrent.ConcurrentHashMap) map).put(str, y07);
        }
        return y07;
    }

    public final void Di(java.util.List list, u33.f fVar) {
        if (!com.tencent.mm.sdk.platformtools.t8.L0(list)) {
            new v33.d(new java.util.LinkedList(list)).l().H(new s33.c(this, new java.util.HashMap(), list, fVar));
        } else if (fVar != null) {
            fVar.a(null);
        }
    }

    public void Ni(com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData chatroomUserData) {
        if (((s33.j0) i95.n0.c(s33.j0.class)).wi().z0(s33.w.a(chatroomUserData))) {
            ((java.util.concurrent.ConcurrentHashMap) this.f402483d).put(chatroomUserData.username, ((s33.j0) i95.n0.c(s33.j0.class)).wi().y0(chatroomUserData.username));
        }
    }

    public void wi(java.lang.String str, u33.f fVar) {
        Ai(java.util.Arrays.asList(str), fVar);
    }
}
