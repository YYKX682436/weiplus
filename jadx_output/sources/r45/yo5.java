package r45;

/* loaded from: classes2.dex */
public class yo5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.t60 f391261d;

    /* renamed from: e, reason: collision with root package name */
    public r45.lp f391262e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yo5)) {
            return false;
        }
        r45.yo5 yo5Var = (r45.yo5) fVar;
        return n51.f.a(this.f391261d, yo5Var.f391261d) && n51.f.a(this.f391262e, yo5Var.f391262e);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0048 A[SYNTHETIC] */
    @Override // com.tencent.mm.protobuf.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.protobuf.f fromJson(java.lang.String r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L7d
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto Lc
            goto L7d
        Lc:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L7d
            r0.<init>(r6)     // Catch: java.lang.Exception -> L7d
            java.util.Iterator r6 = r0.keys()     // Catch: java.lang.Exception -> L7d
        L15:
            boolean r1 = r6.hasNext()     // Catch: java.lang.Exception -> L7d
            if (r1 == 0) goto L7d
            java.lang.Object r1 = r6.next()     // Catch: java.lang.Exception -> L7d
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L7d
            int r2 = r1.hashCode()     // Catch: java.lang.Exception -> L7d
            r3 = -1354814997(0xffffffffaf3f29eb, float:-1.7386241E-10)
            r4 = 1
            if (r2 == r3) goto L3b
            r3 = -1146830912(0xffffffffbba4bfc0, float:-0.005027741)
            if (r2 == r3) goto L31
            goto L45
        L31:
            java.lang.String r2 = "business"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L7d
            if (r2 == 0) goto L45
            r2 = r4
            goto L46
        L3b:
            java.lang.String r2 = "common"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L7d
            if (r2 == 0) goto L45
            r2 = 0
            goto L46
        L45:
            r2 = -1
        L46:
            if (r2 == 0) goto L64
            if (r2 == r4) goto L4b
            goto L15
        L4b:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L7d
            boolean r2 = r1 instanceof org.json.JSONObject     // Catch: java.lang.Exception -> L7d
            if (r2 == 0) goto L15
            r45.lp r2 = new r45.lp     // Catch: java.lang.Exception -> L7d
            r2.<init>()     // Catch: java.lang.Exception -> L7d
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch: java.lang.Exception -> L7d
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L7d
            r2.fromJson(r1)     // Catch: java.lang.Exception -> L7d
            r5.f391262e = r2     // Catch: java.lang.Exception -> L7d
            goto L15
        L64:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L7d
            boolean r2 = r1 instanceof org.json.JSONObject     // Catch: java.lang.Exception -> L7d
            if (r2 == 0) goto L15
            r45.t60 r2 = new r45.t60     // Catch: java.lang.Exception -> L7d
            r2.<init>()     // Catch: java.lang.Exception -> L7d
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch: java.lang.Exception -> L7d
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L7d
            r2.fromJson(r1)     // Catch: java.lang.Exception -> L7d
            r5.f391261d = r2     // Catch: java.lang.Exception -> L7d
            goto L15
        L7d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: r45.yo5.fromJson(java.lang.String):com.tencent.mm.protobuf.f");
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.t60 t60Var = this.f391261d;
            if (t60Var != null) {
                fVar.i(1, t60Var.computeSize());
                this.f391261d.writeFields(fVar);
            }
            r45.lp lpVar = this.f391262e;
            if (lpVar != null) {
                fVar.i(2, lpVar.computeSize());
                this.f391262e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.t60 t60Var2 = this.f391261d;
            int i18 = t60Var2 != null ? 0 + b36.f.i(1, t60Var2.computeSize()) : 0;
            r45.lp lpVar2 = this.f391262e;
            return lpVar2 != null ? i18 + b36.f.i(2, lpVar2.computeSize()) : i18;
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
        r45.yo5 yo5Var = (r45.yo5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.t60 t60Var3 = new r45.t60();
                if (bArr != null && bArr.length > 0) {
                    t60Var3.parseFrom(bArr);
                }
                yo5Var.f391261d = t60Var3;
            }
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.lp lpVar3 = new r45.lp();
            if (bArr2 != null && bArr2.length > 0) {
                lpVar3.parseFrom(bArr2);
            }
            yo5Var.f391262e = lpVar3;
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.t60 t60Var = this.f391261d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "common", t60Var, true);
            eVar.d(jSONObject, "business", this.f391262e, true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
