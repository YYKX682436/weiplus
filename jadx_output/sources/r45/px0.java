package r45;

/* loaded from: classes2.dex */
public class px0 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f383451d;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.px0)) {
            return false;
        }
        r45.px0 px0Var = (r45.px0) fVar;
        return n51.f.a(this.BaseResponse, px0Var.BaseResponse) && n51.f.a(this.f383451d, px0Var.f383451d);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0047 A[SYNTHETIC] */
    @Override // com.tencent.mm.protobuf.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.protobuf.f fromJson(java.lang.String r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L6f
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto Lb
            goto L6f
        Lb:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L6f
            r0.<init>(r6)     // Catch: java.lang.Exception -> L6f
            java.util.Iterator r6 = r0.keys()     // Catch: java.lang.Exception -> L6f
        L14:
            boolean r1 = r6.hasNext()     // Catch: java.lang.Exception -> L6f
            if (r1 == 0) goto L6f
            java.lang.Object r1 = r6.next()     // Catch: java.lang.Exception -> L6f
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L6f
            int r2 = r1.hashCode()     // Catch: java.lang.Exception -> L6f
            r3 = -1845267886(0xffffffff92037252, float:-4.147722E-28)
            r4 = 1
            if (r2 == r3) goto L3a
            r3 = -161305484(0xfffffffff662ac74, float:-1.1493719E33)
            if (r2 == r3) goto L30
            goto L44
        L30:
            java.lang.String r2 = "encrypted_url"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L6f
            if (r2 == 0) goto L44
            r2 = r4
            goto L45
        L3a:
            java.lang.String r2 = "BaseResponse"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L6f
            if (r2 == 0) goto L44
            r2 = 0
            goto L45
        L44:
            r2 = -1
        L45:
            if (r2 == 0) goto L53
            if (r2 == r4) goto L4a
            goto L14
        L4a:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L6f
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L6f
            r5.f383451d = r1     // Catch: java.lang.Exception -> L6f
            goto L14
        L53:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L6f
            boolean r2 = r1 instanceof org.json.JSONObject     // Catch: java.lang.Exception -> L6f
            if (r2 == 0) goto L14
            r45.ie r2 = new r45.ie     // Catch: java.lang.Exception -> L6f
            r2.<init>()     // Catch: java.lang.Exception -> L6f
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch: java.lang.Exception -> L6f
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L6f
            com.tencent.mm.protobuf.f r1 = r2.fromJson(r1)     // Catch: java.lang.Exception -> L6f
            r45.ie r1 = (r45.ie) r1     // Catch: java.lang.Exception -> L6f
            r5.BaseResponse = r1     // Catch: java.lang.Exception -> L6f
            goto L14
        L6f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: r45.px0.fromJson(java.lang.String):com.tencent.mm.protobuf.f");
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
            java.lang.String str = this.f383451d;
            if (str != null) {
                fVar.j(2, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str2 = this.f383451d;
            return str2 != null ? i18 + b36.f.j(2, str2) : i18;
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
        r45.px0 px0Var = (r45.px0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                return -1;
            }
            px0Var.f383451d = aVar2.k(intValue);
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
            px0Var.BaseResponse = ieVar3;
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.ie ieVar = this.BaseResponse;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "BaseResponse", ieVar, true);
            eVar.d(jSONObject, "encrypted_url", this.f383451d, true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
