package com.tencent.mm.storage;

/* loaded from: classes8.dex */
public class c3 extends dm.z1 {

    /* renamed from: x, reason: collision with root package name */
    public static final l75.e0 f193810x = dm.z1.initAutoDBInfo(com.tencent.mm.storage.c3.class);

    @Override // dm.z1, l75.f0
    public l75.e0 getDBInfo() {
        return f193810x;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("username:");
        sb6.append(this.field_username);
        sb6.append(" lastLocalSeq:");
        sb6.append(this.field_lastLocalSeq);
        sb6.append(" lastPushSeq:");
        sb6.append(this.field_lastPushSeq);
        sb6.append(" ");
        if (this.field_seqBlockInfo != null) {
            sb6.append("block:");
            java.util.Iterator it = this.field_seqBlockInfo.f330255d.iterator();
            while (it.hasNext()) {
                mo.c cVar = (mo.c) it.next();
                sb6.append("[");
                sb6.append(cVar.f330251d);
                sb6.append(":");
                sb6.append(cVar.f330252e);
                sb6.append("][");
                sb6.append(cVar.f330253f);
                sb6.append(":");
                sb6.append(cVar.f330254g);
                sb6.append("] | ");
            }
        }
        return sb6.toString();
    }
}
