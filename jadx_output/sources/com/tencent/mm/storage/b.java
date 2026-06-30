package com.tencent.mm.storage;

/* loaded from: classes8.dex */
public class b extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f193752e = {l75.n0.getCreateSQLs(com.tencent.mm.storage.a.B, "ABTestInfo")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f193753d;

    public b(l75.k0 k0Var) {
        super(k0Var, com.tencent.mm.storage.a.B, "ABTestInfo", null);
        this.f193753d = k0Var;
    }

    public java.lang.String y0() {
        android.database.Cursor all = getAll();
        if (all == null) {
            return "null cursor!!";
        }
        if (!all.moveToFirst()) {
            all.close();
            return "cursor empty!!";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.tencent.mm.storage.a aVar = new com.tencent.mm.storage.a();
        do {
            sb6.append("============\nabtestkey = ");
            aVar.convertFrom(all);
            sb6.append(aVar.field_abtestkey);
            sb6.append("\nsequence = ");
            sb6.append(aVar.field_sequence);
            sb6.append("\npriorityLV = ");
            sb6.append(aVar.field_prioritylevel);
            sb6.append("\nexpId = ");
            sb6.append(aVar.field_expId);
            sb6.append("\n");
        } while (all.moveToNext());
        all.close();
        return sb6.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void z0(java.util.List r13, int r14) {
        /*
            r12 = this;
            long r0 = com.tencent.mm.sdk.platformtools.t8.i1()
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r3 = "endTime"
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r3, r0}
            java.lang.String r1 = "%s<>0 and %s<%d"
            java.lang.String r0 = java.lang.String.format(r2, r1, r0)
            l75.k0 r1 = r12.f193753d
            java.lang.String r2 = "ABTestInfo"
            r3 = 0
            r1.delete(r2, r0, r3)
            r0 = 1
            r1 = 0
            if (r0 != r14) goto L32
            com.tencent.mm.storage.a r14 = new com.tencent.mm.storage.a
            r14.<init>()
            r14.field_prioritylevel = r0
            java.lang.String r2 = "prioritylevel"
            java.lang.String[] r2 = new java.lang.String[]{r2}
            r12.delete(r14, r1, r2)
        L32:
            java.util.Iterator r13 = r13.iterator()
            r14 = r1
        L37:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto Le6
            java.lang.Object r2 = r13.next()
            com.tencent.mm.storage.a r2 = (com.tencent.mm.storage.a) r2
            java.lang.String r3 = "MicroMsg.ABTestInfoStorage"
            if (r2 == 0) goto Ldb
            java.lang.String r4 = r2.field_abtestkey
            boolean r4 = com.tencent.mm.sdk.platformtools.t8.K0(r4)
            if (r4 == 0) goto L51
            goto Ldb
        L51:
            com.tencent.mm.storage.a r4 = new com.tencent.mm.storage.a
            r4.<init>()
            java.lang.String r5 = r2.field_abtestkey
            r4.field_abtestkey = r5
            java.lang.String[] r5 = new java.lang.String[r1]
            boolean r5 = super.get(r4, r5)
            if (r5 != 0) goto L76
            boolean r4 = super.insertNotify(r2, r1)
            java.lang.String r2 = r2.field_abtestkey
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r5}
            java.lang.String r5 = "Inserted: %s, Result: %b"
            com.tencent.mars.xlog.Log.i(r3, r5, r2)
            goto Le1
        L76:
            long r5 = r2.field_sequence
            long r7 = r4.field_sequence
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 <= 0) goto L84
            int r5 = r2.field_prioritylevel
            int r6 = r4.field_prioritylevel
            if (r5 == r6) goto L8a
        L84:
            int r5 = r2.field_prioritylevel
            int r6 = r4.field_prioritylevel
            if (r5 <= r6) goto Lb9
        L8a:
            java.lang.String[] r5 = new java.lang.String[r1]
            boolean r5 = super.updateNotify(r2, r1, r5)
            java.lang.String r6 = r2.field_abtestkey
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)
            long r8 = r4.field_sequence
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            long r9 = r2.field_sequence
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            int r4 = r4.field_prioritylevel
            java.lang.Integer r10 = java.lang.Integer.valueOf(r4)
            int r2 = r2.field_prioritylevel
            java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r6, r7, r8, r9, r10, r11}
            java.lang.String r4 = "Updated: %s, Result: %b, Seq: %d, %d, PriorityLV: %d, %d"
            com.tencent.mars.xlog.Log.i(r3, r4, r2)
            r4 = r5
            goto Le1
        Lb9:
            java.lang.String r5 = r2.field_abtestkey
            java.lang.Long r6 = java.lang.Long.valueOf(r7)
            long r7 = r2.field_sequence
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            int r4 = r4.field_prioritylevel
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            int r2 = r2.field_prioritylevel
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r5, r6, r7, r4, r2}
            java.lang.String r4 = "Ignored: %s, Seq: %d, %d, PriorityLV: %d, %d"
            com.tencent.mars.xlog.Log.i(r3, r4, r2)
            goto Le0
        Ldb:
            java.lang.String r2 = "saveIfNecessary, Invalid item"
            com.tencent.mars.xlog.Log.e(r3, r2)
        Le0:
            r4 = r1
        Le1:
            if (r4 == 0) goto L37
            r14 = r0
            goto L37
        Le6:
            if (r14 == 0) goto Led
            java.lang.String r13 = "event_updated"
            r12.doNotify(r13)
        Led:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.storage.b.z0(java.util.List, int):void");
    }
}
