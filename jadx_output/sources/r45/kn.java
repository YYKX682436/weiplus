package r45;

/* loaded from: classes2.dex */
public class kn extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f378841d;

    /* renamed from: e, reason: collision with root package name */
    public r45.zo5 f378842e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.kn)) {
            return false;
        }
        r45.kn knVar = (r45.kn) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f378841d), java.lang.Integer.valueOf(knVar.f378841d)) && n51.f.a(this.f378842e, knVar.f378842e);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047 A[SYNTHETIC] */
    @Override // com.tencent.mm.protobuf.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.protobuf.f fromJson(java.lang.String r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L70
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto Lb
            goto L70
        Lb:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L70
            r0.<init>(r6)     // Catch: java.lang.Exception -> L70
            java.util.Iterator r6 = r0.keys()     // Catch: java.lang.Exception -> L70
        L14:
            boolean r1 = r6.hasNext()     // Catch: java.lang.Exception -> L70
            if (r1 == 0) goto L70
            java.lang.Object r1 = r6.next()     // Catch: java.lang.Exception -> L70
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L70
            int r2 = r1.hashCode()     // Catch: java.lang.Exception -> L70
            r3 = 3530753(0x35e001, float:4.947639E-39)
            r4 = 1
            if (r2 == r3) goto L3a
            r3 = 94842723(0x5a72f63, float:1.5722012E-35)
            if (r2 == r3) goto L30
            goto L44
        L30:
            java.lang.String r2 = "color"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L70
            if (r2 == 0) goto L44
            r2 = r4
            goto L45
        L3a:
            java.lang.String r2 = "size"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L70
            if (r2 == 0) goto L44
            r2 = 0
            goto L45
        L44:
            r2 = -1
        L45:
            if (r2 == 0) goto L63
            if (r2 == r4) goto L4a
            goto L14
        L4a:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L70
            boolean r2 = r1 instanceof org.json.JSONObject     // Catch: java.lang.Exception -> L70
            if (r2 == 0) goto L14
            r45.zo5 r2 = new r45.zo5     // Catch: java.lang.Exception -> L70
            r2.<init>()     // Catch: java.lang.Exception -> L70
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch: java.lang.Exception -> L70
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L70
            r2.fromJson(r1)     // Catch: java.lang.Exception -> L70
            r5.f378842e = r2     // Catch: java.lang.Exception -> L70
            goto L14
        L63:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L70
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Exception -> L70
            int r1 = r1.intValue()     // Catch: java.lang.Exception -> L70
            r5.f378841d = r1     // Catch: java.lang.Exception -> L70
            goto L14
        L70:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: r45.kn.fromJson(java.lang.String):com.tencent.mm.protobuf.f");
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f378841d);
            r45.zo5 zo5Var = this.f378842e;
            if (zo5Var != null) {
                fVar.i(2, zo5Var.computeSize());
                this.f378842e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f378841d) + 0;
            r45.zo5 zo5Var2 = this.f378842e;
            return zo5Var2 != null ? e17 + b36.f.i(2, zo5Var2.computeSize()) : e17;
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
        r45.kn knVar = (r45.kn) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            knVar.f378841d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.zo5 zo5Var3 = new r45.zo5();
            if (bArr != null && bArr.length > 0) {
                zo5Var3.parseFrom(bArr);
            }
            knVar.f378842e = zo5Var3;
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f378841d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "size", valueOf, true);
            eVar.d(jSONObject, "color", this.f378842e, true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
