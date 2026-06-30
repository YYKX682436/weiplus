package r45;

/* loaded from: classes4.dex */
public class g2 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f374831d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f374832e = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.g2)) {
            return false;
        }
        r45.g2 g2Var = (r45.g2) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f374831d), java.lang.Long.valueOf(g2Var.f374831d)) && n51.f.a(this.f374832e, g2Var.f374832e);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b A[SYNTHETIC] */
    @Override // com.tencent.mm.protobuf.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.protobuf.f fromJson(java.lang.String r8) {
        /*
            r7 = this;
            if (r8 == 0) goto L7b
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto Lc
            goto L7b
        Lc:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L7b
            r0.<init>(r8)     // Catch: java.lang.Exception -> L7b
            java.util.Iterator r8 = r0.keys()     // Catch: java.lang.Exception -> L7b
        L15:
            boolean r1 = r8.hasNext()     // Catch: java.lang.Exception -> L7b
            if (r1 == 0) goto L7b
            java.lang.Object r1 = r8.next()     // Catch: java.lang.Exception -> L7b
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L7b
            int r2 = r1.hashCode()     // Catch: java.lang.Exception -> L7b
            r3 = 420524750(0x1910b2ce, float:7.480735E-24)
            r4 = 0
            r5 = 1
            if (r2 == r3) goto L3d
            r3 = 801419952(0x2fc4b2b0, float:3.5779157E-10)
            if (r2 == r3) goto L32
            goto L48
        L32:
            java.lang.String r2 = "showTimeMs"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L7b
            if (r2 == 0) goto L48
            r2 = r5
            goto L49
        L3d:
            java.lang.String r2 = "maasEventType"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L7b
            if (r2 == 0) goto L48
            r2 = r4
            goto L49
        L48:
            r2 = -1
        L49:
            if (r2 == 0) goto L74
            if (r2 == r5) goto L4e
            goto L15
        L4e:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L7b
            boolean r2 = r1 instanceof org.json.JSONArray     // Catch: java.lang.Exception -> L7b
            if (r2 == 0) goto L15
            org.json.JSONArray r1 = (org.json.JSONArray) r1     // Catch: java.lang.Exception -> L7b
        L58:
            int r2 = r1.length()     // Catch: java.lang.Exception -> L7b
            if (r4 >= r2) goto L15
            java.util.LinkedList r2 = r7.f374832e     // Catch: java.lang.Exception -> L7b
            java.lang.Object r3 = r1.get(r4)     // Catch: java.lang.Exception -> L7b
            java.lang.Long r3 = (java.lang.Long) r3     // Catch: java.lang.Exception -> L7b
            long r5 = r3.longValue()     // Catch: java.lang.Exception -> L7b
            java.lang.Long r3 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Exception -> L7b
            r2.add(r3)     // Catch: java.lang.Exception -> L7b
            int r4 = r4 + 1
            goto L58
        L74:
            long r1 = r0.optLong(r1)     // Catch: java.lang.Exception -> L7b
            r7.f374831d = r1     // Catch: java.lang.Exception -> L7b
            goto L15
        L7b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: r45.g2.fromJson(java.lang.String):com.tencent.mm.protobuf.f");
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f374832e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f374831d);
            fVar.g(2, 3, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.f374831d) + 0 + b36.f.g(2, 3, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        r45.g2 g2Var = (r45.g2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            g2Var.f374831d = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        g2Var.f374832e.add(java.lang.Long.valueOf(aVar2.i(intValue)));
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Long valueOf = java.lang.Long.valueOf(this.f374831d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "maasEventType", valueOf, false);
            eVar.d(jSONObject, "showTimeMs", this.f374832e, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
