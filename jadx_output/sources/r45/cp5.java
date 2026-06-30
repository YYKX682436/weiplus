package r45;

/* loaded from: classes8.dex */
public class cp5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f371768d;

    /* renamed from: e, reason: collision with root package name */
    public r45.ap5 f371769e;

    /* renamed from: f, reason: collision with root package name */
    public r45.yo5 f371770f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.cp5)) {
            return false;
        }
        r45.cp5 cp5Var = (r45.cp5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f371768d), java.lang.Integer.valueOf(cp5Var.f371768d)) && n51.f.a(this.f371769e, cp5Var.f371769e) && n51.f.a(this.f371770f, cp5Var.f371770f);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059 A[SYNTHETIC] */
    @Override // com.tencent.mm.protobuf.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.protobuf.f fromJson(java.lang.String r7) {
        /*
            r6 = this;
            if (r7 == 0) goto L9e
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto Lc
            goto L9e
        Lc:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L9e
            r0.<init>(r7)     // Catch: java.lang.Exception -> L9e
            java.util.Iterator r7 = r0.keys()     // Catch: java.lang.Exception -> L9e
        L15:
            boolean r1 = r7.hasNext()     // Catch: java.lang.Exception -> L9e
            if (r1 == 0) goto L9e
            java.lang.Object r1 = r7.next()     // Catch: java.lang.Exception -> L9e
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L9e
            int r2 = r1.hashCode()     // Catch: java.lang.Exception -> L9e
            r3 = 3004913(0x2dd9f1, float:4.21078E-39)
            r4 = 2
            r5 = 1
            if (r2 == r3) goto L4c
            r3 = 109780401(0x68b1db1, float:5.2329616E-35)
            if (r2 == r3) goto L41
            r3 = 951530617(0x38b73479, float:8.735894E-5)
            if (r2 == r3) goto L37
            goto L56
        L37:
            java.lang.String r2 = "content"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L9e
            if (r2 == 0) goto L56
            r2 = r5
            goto L57
        L41:
            java.lang.String r2 = "style"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L9e
            if (r2 == 0) goto L56
            r2 = 0
            goto L57
        L4c:
            java.lang.String r2 = "attr"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L9e
            if (r2 == 0) goto L56
            r2 = r4
            goto L57
        L56:
            r2 = -1
        L57:
            if (r2 == 0) goto L90
            if (r2 == r5) goto L77
            if (r2 == r4) goto L5e
            goto L15
        L5e:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L9e
            boolean r2 = r1 instanceof org.json.JSONObject     // Catch: java.lang.Exception -> L9e
            if (r2 == 0) goto L15
            r45.yo5 r2 = new r45.yo5     // Catch: java.lang.Exception -> L9e
            r2.<init>()     // Catch: java.lang.Exception -> L9e
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch: java.lang.Exception -> L9e
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L9e
            r2.fromJson(r1)     // Catch: java.lang.Exception -> L9e
            r6.f371770f = r2     // Catch: java.lang.Exception -> L9e
            goto L15
        L77:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L9e
            boolean r2 = r1 instanceof org.json.JSONObject     // Catch: java.lang.Exception -> L9e
            if (r2 == 0) goto L15
            r45.ap5 r2 = new r45.ap5     // Catch: java.lang.Exception -> L9e
            r2.<init>()     // Catch: java.lang.Exception -> L9e
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch: java.lang.Exception -> L9e
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L9e
            r2.fromJson(r1)     // Catch: java.lang.Exception -> L9e
            r6.f371769e = r2     // Catch: java.lang.Exception -> L9e
            goto L15
        L90:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L9e
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Exception -> L9e
            int r1 = r1.intValue()     // Catch: java.lang.Exception -> L9e
            r6.f371768d = r1     // Catch: java.lang.Exception -> L9e
            goto L15
        L9e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: r45.cp5.fromJson(java.lang.String):com.tencent.mm.protobuf.f");
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f371768d);
            r45.ap5 ap5Var = this.f371769e;
            if (ap5Var != null) {
                fVar.i(2, ap5Var.computeSize());
                this.f371769e.writeFields(fVar);
            }
            r45.yo5 yo5Var = this.f371770f;
            if (yo5Var != null) {
                fVar.i(3, yo5Var.computeSize());
                this.f371770f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f371768d) + 0;
            r45.ap5 ap5Var2 = this.f371769e;
            if (ap5Var2 != null) {
                e17 += b36.f.i(2, ap5Var2.computeSize());
            }
            r45.yo5 yo5Var2 = this.f371770f;
            return yo5Var2 != null ? e17 + b36.f.i(3, yo5Var2.computeSize()) : e17;
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
        r45.cp5 cp5Var = (r45.cp5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            cp5Var.f371768d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.ap5 ap5Var3 = new r45.ap5();
                if (bArr != null && bArr.length > 0) {
                    ap5Var3.parseFrom(bArr);
                }
                cp5Var.f371769e = ap5Var3;
            }
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            r45.yo5 yo5Var3 = new r45.yo5();
            if (bArr2 != null && bArr2.length > 0) {
                yo5Var3.parseFrom(bArr2);
            }
            cp5Var.f371770f = yo5Var3;
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public org.json.JSONObject toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f371768d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "style", valueOf, true);
            eVar.d(jSONObject, "content", this.f371769e, true);
            eVar.d(jSONObject, "attr", this.f371770f, true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
