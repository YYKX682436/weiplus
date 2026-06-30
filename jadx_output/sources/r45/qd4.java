package r45;

/* loaded from: classes4.dex */
public class qd4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.cu5 f383857d;

    /* renamed from: e, reason: collision with root package name */
    public int f383858e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qd4)) {
            return false;
        }
        r45.qd4 qd4Var = (r45.qd4) fVar;
        return n51.f.a(this.f383857d, qd4Var.f383857d) && n51.f.a(java.lang.Integer.valueOf(this.f383858e), java.lang.Integer.valueOf(qd4Var.f383858e));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0058 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0048 A[SYNTHETIC] */
    @Override // com.tencent.mm.protobuf.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.protobuf.f fromJson(java.lang.String r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L74
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto Lc
            goto L74
        Lc:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L74
            r0.<init>(r6)     // Catch: java.lang.Exception -> L74
            java.util.Iterator r6 = r0.keys()     // Catch: java.lang.Exception -> L74
        L15:
            boolean r1 = r6.hasNext()     // Catch: java.lang.Exception -> L74
            if (r1 == 0) goto L74
            java.lang.Object r1 = r6.next()     // Catch: java.lang.Exception -> L74
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L74
            int r2 = r1.hashCode()     // Catch: java.lang.Exception -> L74
            r3 = -1957276818(0xffffffff8b56536e, float:-4.1277666E-32)
            r4 = 1
            if (r2 == r3) goto L3b
            r3 = 828050099(0x315b0ab3, float:3.1874776E-9)
            if (r2 == r3) goto L31
            goto L45
        L31:
            java.lang.String r2 = "NotifyData"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L74
            if (r2 == 0) goto L45
            r2 = 0
            goto L46
        L3b:
            java.lang.String r2 = "OPCode"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L74
            if (r2 == 0) goto L45
            r2 = r4
            goto L46
        L45:
            r2 = -1
        L46:
            if (r2 == 0) goto L58
            if (r2 == r4) goto L4b
            goto L15
        L4b:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L74
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Exception -> L74
            int r1 = r1.intValue()     // Catch: java.lang.Exception -> L74
            r5.f383858e = r1     // Catch: java.lang.Exception -> L74
            goto L15
        L58:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L74
            boolean r2 = r1 instanceof org.json.JSONObject     // Catch: java.lang.Exception -> L74
            if (r2 == 0) goto L15
            r45.cu5 r2 = new r45.cu5     // Catch: java.lang.Exception -> L74
            r2.<init>()     // Catch: java.lang.Exception -> L74
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch: java.lang.Exception -> L74
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L74
            com.tencent.mm.protobuf.f r1 = r2.fromJson(r1)     // Catch: java.lang.Exception -> L74
            r45.cu5 r1 = (r45.cu5) r1     // Catch: java.lang.Exception -> L74
            r5.f383857d = r1     // Catch: java.lang.Exception -> L74
            goto L15
        L74:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: r45.qd4.fromJson(java.lang.String):com.tencent.mm.protobuf.f");
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.cu5 cu5Var = this.f383857d;
            if (cu5Var != null) {
                fVar.i(1, cu5Var.computeSize());
                this.f383857d.writeFields(fVar);
            }
            fVar.e(2, this.f383858e);
            return 0;
        }
        if (i17 == 1) {
            r45.cu5 cu5Var2 = this.f383857d;
            return (cu5Var2 != null ? 0 + b36.f.i(1, cu5Var2.computeSize()) : 0) + b36.f.e(2, this.f383858e);
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
        r45.qd4 qd4Var = (r45.qd4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                return -1;
            }
            qd4Var.f383858e = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.cu5 cu5Var3 = new r45.cu5();
            if (bArr != null && bArr.length > 0) {
                cu5Var3.b(bArr);
            }
            qd4Var.f383857d = cu5Var3;
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.cu5 cu5Var = this.f383857d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "NotifyData", cu5Var, false);
            eVar.d(jSONObject, "OPCode", java.lang.Integer.valueOf(this.f383858e), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
