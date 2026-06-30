package r45;

/* loaded from: classes2.dex */
public class ii6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f377086d;

    /* renamed from: e, reason: collision with root package name */
    public int f377087e;

    /* renamed from: f, reason: collision with root package name */
    public int f377088f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ii6)) {
            return false;
        }
        r45.ii6 ii6Var = (r45.ii6) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f377086d), java.lang.Boolean.valueOf(ii6Var.f377086d)) && n51.f.a(java.lang.Integer.valueOf(this.f377087e), java.lang.Integer.valueOf(ii6Var.f377087e)) && n51.f.a(java.lang.Integer.valueOf(this.f377088f), java.lang.Integer.valueOf(ii6Var.f377088f));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058 A[SYNTHETIC] */
    @Override // com.tencent.mm.protobuf.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.protobuf.f fromJson(java.lang.String r7) {
        /*
            r6 = this;
            if (r7 == 0) goto L84
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto Lc
            goto L84
        Lc:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L84
            r0.<init>(r7)     // Catch: java.lang.Exception -> L84
            java.util.Iterator r7 = r0.keys()     // Catch: java.lang.Exception -> L84
        L15:
            boolean r1 = r7.hasNext()     // Catch: java.lang.Exception -> L84
            if (r1 == 0) goto L84
            java.lang.Object r1 = r7.next()     // Catch: java.lang.Exception -> L84
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L84
            int r2 = r1.hashCode()     // Catch: java.lang.Exception -> L84
            r3 = -1298848381(0xffffffffb2952583, float:-1.7362941E-8)
            r4 = 2
            r5 = 1
            if (r2 == r3) goto L4b
            r3 = -906953308(0xffffffffc9f0fda4, float:-1974196.5)
            if (r2 == r3) goto L41
            r3 = 100346066(0x5fb28d2, float:2.3618922E-35)
            if (r2 == r3) goto L37
            goto L55
        L37:
            java.lang.String r2 = "index"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L84
            if (r2 == 0) goto L55
            r2 = r4
            goto L56
        L41:
            java.lang.String r2 = "tab_type"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L84
            if (r2 == 0) goto L55
            r2 = r5
            goto L56
        L4b:
            java.lang.String r2 = "enable"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L84
            if (r2 == 0) goto L55
            r2 = 0
            goto L56
        L55:
            r2 = -1
        L56:
            if (r2 == 0) goto L77
            if (r2 == r5) goto L6a
            if (r2 == r4) goto L5d
            goto L15
        L5d:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L84
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Exception -> L84
            int r1 = r1.intValue()     // Catch: java.lang.Exception -> L84
            r6.f377088f = r1     // Catch: java.lang.Exception -> L84
            goto L15
        L6a:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L84
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Exception -> L84
            int r1 = r1.intValue()     // Catch: java.lang.Exception -> L84
            r6.f377087e = r1     // Catch: java.lang.Exception -> L84
            goto L15
        L77:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L84
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Exception -> L84
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Exception -> L84
            r6.f377086d = r1     // Catch: java.lang.Exception -> L84
            goto L15
        L84:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: r45.ii6.fromJson(java.lang.String):com.tencent.mm.protobuf.f");
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f377086d);
            fVar.e(2, this.f377087e);
            fVar.e(3, this.f377088f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.a(1, this.f377086d) + 0 + b36.f.e(2, this.f377087e) + b36.f.e(3, this.f377088f);
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.ii6 ii6Var = (r45.ii6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ii6Var.f377086d = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 2) {
            ii6Var.f377087e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        ii6Var.f377088f = aVar2.g(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(this.f377086d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "enable", valueOf, true);
            eVar.d(jSONObject, "tab_type", java.lang.Integer.valueOf(this.f377087e), true);
            eVar.d(jSONObject, ya.b.INDEX, java.lang.Integer.valueOf(this.f377088f), true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
