package r45;

/* loaded from: classes4.dex */
public class bo extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f370903d;

    /* renamed from: e, reason: collision with root package name */
    public int f370904e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bo)) {
            return false;
        }
        r45.bo boVar = (r45.bo) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f370903d), java.lang.Integer.valueOf(boVar.f370903d)) && n51.f.a(java.lang.Integer.valueOf(this.f370904e), java.lang.Integer.valueOf(boVar.f370904e));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0058 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048 A[SYNTHETIC] */
    @Override // com.tencent.mm.protobuf.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.protobuf.f fromJson(java.lang.String r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L65
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto Lb
            goto L65
        Lb:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L65
            r0.<init>(r6)     // Catch: java.lang.Exception -> L65
            java.util.Iterator r6 = r0.keys()     // Catch: java.lang.Exception -> L65
        L14:
            boolean r1 = r6.hasNext()     // Catch: java.lang.Exception -> L65
            if (r1 == 0) goto L65
            java.lang.Object r1 = r6.next()     // Catch: java.lang.Exception -> L65
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L65
            int r2 = r1.hashCode()     // Catch: java.lang.Exception -> L65
            r3 = -1221029593(0xffffffffb7389127, float:-1.1001051E-5)
            r4 = 1
            if (r2 == r3) goto L3b
            r3 = 113126854(0x6be2dc6, float:7.1537315E-35)
            if (r2 == r3) goto L30
            goto L45
        L30:
            java.lang.String r2 = "width"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L65
            if (r2 == 0) goto L45
            r2 = 0
            goto L46
        L3b:
            java.lang.String r2 = "height"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L65
            if (r2 == 0) goto L45
            r2 = r4
            goto L46
        L45:
            r2 = -1
        L46:
            if (r2 == 0) goto L58
            if (r2 == r4) goto L4b
            goto L14
        L4b:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L65
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Exception -> L65
            int r1 = r1.intValue()     // Catch: java.lang.Exception -> L65
            r5.f370904e = r1     // Catch: java.lang.Exception -> L65
            goto L14
        L58:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L65
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Exception -> L65
            int r1 = r1.intValue()     // Catch: java.lang.Exception -> L65
            r5.f370903d = r1     // Catch: java.lang.Exception -> L65
            goto L14
        L65:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: r45.bo.fromJson(java.lang.String):com.tencent.mm.protobuf.f");
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f370903d);
            fVar.e(2, this.f370904e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f370903d) + 0 + b36.f.e(2, this.f370904e);
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
        r45.bo boVar = (r45.bo) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            boVar.f370903d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        boVar.f370904e = aVar2.g(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f370903d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "width", valueOf, false);
            eVar.d(jSONObject, "height", java.lang.Integer.valueOf(this.f370904e), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
