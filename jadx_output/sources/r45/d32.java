package r45;

/* loaded from: classes4.dex */
public class d32 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f372032d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.FinderJumpInfo f372033e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.d32)) {
            return false;
        }
        r45.d32 d32Var = (r45.d32) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f372032d), java.lang.Integer.valueOf(d32Var.f372032d)) && n51.f.a(this.f372033e, d32Var.f372033e);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049 A[SYNTHETIC] */
    @Override // com.tencent.mm.protobuf.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.protobuf.f fromJson(java.lang.String r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L75
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto Lc
            goto L75
        Lc:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L75
            r0.<init>(r6)     // Catch: java.lang.Exception -> L75
            java.util.Iterator r6 = r0.keys()     // Catch: java.lang.Exception -> L75
        L15:
            boolean r1 = r6.hasNext()     // Catch: java.lang.Exception -> L75
            if (r1 == 0) goto L75
            java.lang.Object r1 = r6.next()     // Catch: java.lang.Exception -> L75
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L75
            int r2 = r1.hashCode()     // Catch: java.lang.Exception -> L75
            r3 = -751469324(0xffffffffd3357cf4, float:-7.7948545E11)
            r4 = 1
            if (r2 == r3) goto L3c
            r3 = 684824095(0x28d1961f, float:2.3268766E-14)
            if (r2 == r3) goto L31
            goto L46
        L31:
            java.lang.String r2 = "jump_info"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L75
            if (r2 == 0) goto L46
            r2 = r4
            goto L47
        L3c:
            java.lang.String r2 = "attach_type"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L75
            if (r2 == 0) goto L46
            r2 = 0
            goto L47
        L46:
            r2 = -1
        L47:
            if (r2 == 0) goto L68
            if (r2 == r4) goto L4c
            goto L15
        L4c:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L75
            boolean r2 = r1 instanceof org.json.JSONObject     // Catch: java.lang.Exception -> L75
            if (r2 == 0) goto L15
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r2 = new com.tencent.mm.protocal.protobuf.FinderJumpInfo     // Catch: java.lang.Exception -> L75
            r2.<init>()     // Catch: java.lang.Exception -> L75
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch: java.lang.Exception -> L75
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L75
            com.tencent.mm.protobuf.e r1 = r2.fromJson(r1)     // Catch: java.lang.Exception -> L75
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r1 = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) r1     // Catch: java.lang.Exception -> L75
            r5.f372033e = r1     // Catch: java.lang.Exception -> L75
            goto L15
        L68:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L75
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Exception -> L75
            int r1 = r1.intValue()     // Catch: java.lang.Exception -> L75
            r5.f372032d = r1     // Catch: java.lang.Exception -> L75
            goto L15
        L75:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: r45.d32.fromJson(java.lang.String):com.tencent.mm.protobuf.f");
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f372032d);
            com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = this.f372033e;
            if (finderJumpInfo != null) {
                fVar.i(2, finderJumpInfo.computeSize());
                this.f372033e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f372032d) + 0;
            com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo2 = this.f372033e;
            return finderJumpInfo2 != null ? e17 + b36.f.i(2, finderJumpInfo2.computeSize()) : e17;
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
        r45.d32 d32Var = (r45.d32) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            d32Var.f372032d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo3 = new com.tencent.mm.protocal.protobuf.FinderJumpInfo();
            if (bArr != null && bArr.length > 0) {
                finderJumpInfo3.parseFrom(bArr);
            }
            d32Var.f372033e = finderJumpInfo3;
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f372032d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "attach_type", valueOf, true);
            eVar.d(jSONObject, "jump_info", this.f372033e, true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
