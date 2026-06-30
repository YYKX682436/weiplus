package r45;

/* loaded from: classes2.dex */
public class q3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f383615d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f383616e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.q3)) {
            return false;
        }
        r45.q3 q3Var = (r45.q3) fVar;
        return n51.f.a(this.BaseResponse, q3Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f383615d), java.lang.Integer.valueOf(q3Var.f383615d)) && n51.f.a(this.f383616e, q3Var.f383616e);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058 A[SYNTHETIC] */
    @Override // com.tencent.mm.protobuf.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.protobuf.f fromJson(java.lang.String r7) {
        /*
            r6 = this;
            if (r7 == 0) goto L8f
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto Lc
            goto L8f
        Lc:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L8f
            r0.<init>(r7)     // Catch: java.lang.Exception -> L8f
            java.util.Iterator r7 = r0.keys()     // Catch: java.lang.Exception -> L8f
        L15:
            boolean r1 = r7.hasNext()     // Catch: java.lang.Exception -> L8f
            if (r1 == 0) goto L8f
            java.lang.Object r1 = r7.next()     // Catch: java.lang.Exception -> L8f
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L8f
            int r2 = r1.hashCode()     // Catch: java.lang.Exception -> L8f
            r3 = -1845267886(0xffffffff92037252, float:-4.147722E-28)
            r4 = 2
            r5 = 1
            if (r2 == r3) goto L4b
            r3 = 108417(0x1a781, float:1.51925E-40)
            if (r2 == r3) goto L41
            r3 = 112801(0x1b8a1, float:1.58068E-40)
            if (r2 == r3) goto L37
            goto L55
        L37:
            java.lang.String r2 = "ret"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L8f
            if (r2 == 0) goto L55
            r2 = r5
            goto L56
        L41:
            java.lang.String r2 = "msg"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L8f
            if (r2 == 0) goto L55
            r2 = r4
            goto L56
        L4b:
            java.lang.String r2 = "BaseResponse"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L8f
            if (r2 == 0) goto L55
            r2 = 0
            goto L56
        L55:
            r2 = -1
        L56:
            if (r2 == 0) goto L73
            if (r2 == r5) goto L66
            if (r2 == r4) goto L5d
            goto L15
        L5d:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L8f
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L8f
            r6.f383616e = r1     // Catch: java.lang.Exception -> L8f
            goto L15
        L66:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L8f
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Exception -> L8f
            int r1 = r1.intValue()     // Catch: java.lang.Exception -> L8f
            r6.f383615d = r1     // Catch: java.lang.Exception -> L8f
            goto L15
        L73:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L8f
            boolean r2 = r1 instanceof org.json.JSONObject     // Catch: java.lang.Exception -> L8f
            if (r2 == 0) goto L15
            r45.ie r2 = new r45.ie     // Catch: java.lang.Exception -> L8f
            r2.<init>()     // Catch: java.lang.Exception -> L8f
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch: java.lang.Exception -> L8f
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L8f
            com.tencent.mm.protobuf.f r1 = r2.fromJson(r1)     // Catch: java.lang.Exception -> L8f
            r45.ie r1 = (r45.ie) r1     // Catch: java.lang.Exception -> L8f
            r6.BaseResponse = r1     // Catch: java.lang.Exception -> L8f
            goto L15
        L8f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: r45.q3.fromJson(java.lang.String):com.tencent.mm.protobuf.f");
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f383615d);
            java.lang.String str = this.f383616e;
            if (str != null) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f383615d);
            java.lang.String str2 = this.f383616e;
            return str2 != null ? i18 + b36.f.j(3, str2) : i18;
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
        r45.q3 q3Var = (r45.q3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                q3Var.f383615d = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            q3Var.f383616e = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            r45.ie ieVar3 = new r45.ie();
            if (bArr != null && bArr.length > 0) {
                ieVar3.parseFrom(bArr);
            }
            q3Var.BaseResponse = ieVar3;
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.ie ieVar = this.BaseResponse;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "BaseResponse", ieVar, false);
            eVar.d(jSONObject, "ret", java.lang.Integer.valueOf(this.f383615d), false);
            eVar.d(jSONObject, "msg", this.f383616e, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
