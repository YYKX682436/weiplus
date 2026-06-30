package hn;

@j95.b
/* loaded from: classes11.dex */
public class k0 extends i95.w implements vg3.i4 {
    public void Ai() {
        java.util.ArrayList<rn.h> arrayList;
        com.tencent.mars.xlog.Log.i("MicroMsg.roomtools.RoomToolsHelp", "resetAllGroupToolsRecentUse");
        android.database.Cursor E = ((nn.j) i95.n0.c(nn.j.class)).Di().f397608d.E("GroupTools", rn.h.f397603v.f316954c, null, null, null, null, null);
        if (E == null) {
            arrayList = null;
        } else {
            try {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                while (E.moveToNext()) {
                    rn.h hVar = new rn.h();
                    hVar.convertFrom(E);
                    arrayList2.add(hVar);
                }
                E.close();
                arrayList = arrayList2;
            } catch (java.lang.Throwable th6) {
                E.close();
                throw th6;
            }
        }
        if (arrayList != null) {
            for (rn.h hVar2 : arrayList) {
                hVar2.field_queryState = 0;
                ((nn.j) i95.n0.c(nn.j.class)).Di().update(hVar2, new java.lang.String[0]);
            }
        }
    }

    public void wi(java.lang.String str) {
        rn.h c17;
        if (!com.tencent.mm.storage.z3.N4(str) || (c17 = kn.l0.c(str)) == null || c17.field_queryState == 0) {
            return;
        }
        c17.t0(new com.tencent.mm.chatroom.storage.GroupToolItem("roomaa@app.origin", "", c01.id.a()));
        com.tencent.mars.xlog.Log.i("MicroMsg.roomtools.RoomTodoService", "handleGroupToolByLaunchAA room:%s result:%s", str, java.lang.Boolean.valueOf(((nn.j) i95.n0.c(nn.j.class)).Di().update(c17, new java.lang.String[0])));
    }
}
