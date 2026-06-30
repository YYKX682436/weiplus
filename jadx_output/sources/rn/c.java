package rn;

/* loaded from: classes13.dex */
public class c extends dm.d6 {
    public static final l75.e0 T = dm.d6.initAutoDBInfo(rn.c.class);
    public final java.util.List S = new java.util.ArrayList();

    @Override // dm.d6, l75.f0
    public void convertFrom(android.database.Cursor cursor) {
        super.convertFrom(cursor);
        java.util.ArrayList arrayList = (java.util.ArrayList) this.S;
        arrayList.clear();
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.field_related_msgids)) {
            return;
        }
        for (java.lang.String str : this.field_related_msgids.split(",")) {
            arrayList.add(java.lang.Long.valueOf(java.lang.Long.parseLong(str)));
        }
    }

    public boolean equals(java.lang.Object obj) {
        rn.c cVar = (rn.c) obj;
        return com.tencent.mm.sdk.platformtools.t8.D0(cVar.field_todoid, this.field_todoid) && com.tencent.mm.sdk.platformtools.t8.D0(cVar.field_roomname, this.field_roomname);
    }

    @Override // dm.d6, l75.f0
    public l75.e0 getDBInfo() {
        return T;
    }

    public void t0(long j17) {
        java.util.List list = this.S;
        if (((java.util.ArrayList) list).contains(java.lang.Long.valueOf(j17))) {
            return;
        }
        ((java.util.ArrayList) list).add(java.lang.Long.valueOf(j17));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        while (it.hasNext()) {
            sb6.append(((java.lang.Long) it.next()).longValue());
            sb6.append(",");
        }
        if (sb6.length() - 1 >= 0) {
            sb6.deleteCharAt(sb6.length() - 1);
        }
        this.field_related_msgids = sb6.toString();
    }

    public long u0() {
        java.util.List list = this.S;
        if (((java.util.ArrayList) list).size() > 0) {
            return ((java.lang.Long) ((java.util.ArrayList) list).get(0)).longValue();
        }
        return 0L;
    }

    public boolean v0() {
        return com.tencent.mm.sdk.platformtools.t8.D0("roomannouncement@app.origin", this.field_username);
    }
}
