package r45;

/* loaded from: classes2.dex */
public class d05 extends r45.js5 {
    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof r45.d05) && n51.f.a(this.BaseResponse, ((r45.d05) fVar).BaseResponse);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0038 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037 A[SYNTHETIC] */
    @Override // com.tencent.mm.protobuf.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.protobuf.f fromJson(java.lang.String r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L54
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto Lb
            goto L54
        Lb:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L54
            r0.<init>(r5)     // Catch: java.lang.Exception -> L54
            java.util.Iterator r5 = r0.keys()     // Catch: java.lang.Exception -> L54
        L14:
            boolean r1 = r5.hasNext()     // Catch: java.lang.Exception -> L54
            if (r1 == 0) goto L54
            java.lang.Object r1 = r5.next()     // Catch: java.lang.Exception -> L54
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L54
            int r2 = r1.hashCode()     // Catch: java.lang.Exception -> L54
            r3 = -1845267886(0xffffffff92037252, float:-4.147722E-28)
            if (r2 == r3) goto L2a
            goto L34
        L2a:
            java.lang.String r2 = "BaseResponse"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L54
            if (r2 == 0) goto L34
            r2 = 0
            goto L35
        L34:
            r2 = -1
        L35:
            if (r2 == 0) goto L38
            goto L14
        L38:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L54
            boolean r2 = r1 instanceof org.json.JSONObject     // Catch: java.lang.Exception -> L54
            if (r2 == 0) goto L14
            r45.ie r2 = new r45.ie     // Catch: java.lang.Exception -> L54
            r2.<init>()     // Catch: java.lang.Exception -> L54
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch: java.lang.Exception -> L54
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L54
            com.tencent.mm.protobuf.f r1 = r2.fromJson(r1)     // Catch: java.lang.Exception -> L54
            r45.ie r1 = (r45.ie) r1     // Catch: java.lang.Exception -> L54
            r4.BaseResponse = r1     // Catch: java.lang.Exception -> L54
            goto L14
        L54:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: r45.d05.fromJson(java.lang.String):com.tencent.mm.protobuf.f");
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
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            if (ieVar2 != null) {
                return 0 + b36.f.i(1, ieVar2.computeSize());
            }
            return 0;
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
        r45.d05 d05Var = (r45.d05) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.ie ieVar3 = new r45.ie();
            if (bArr != null && bArr.length > 0) {
                ieVar3.parseFrom(bArr);
            }
            d05Var.BaseResponse = ieVar3;
        }
        return 0;
    }
}
