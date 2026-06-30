package r45;

/* loaded from: classes4.dex */
public class w12 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f388781d;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof r45.w12) && n51.f.a(java.lang.Integer.valueOf(this.f388781d), java.lang.Integer.valueOf(((r45.w12) fVar).f388781d));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0038 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037 A[SYNTHETIC] */
    @Override // com.tencent.mm.protobuf.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.protobuf.f fromJson(java.lang.String r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L45
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto Lb
            goto L45
        Lb:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L45
            r0.<init>(r5)     // Catch: java.lang.Exception -> L45
            java.util.Iterator r5 = r0.keys()     // Catch: java.lang.Exception -> L45
        L14:
            boolean r1 = r5.hasNext()     // Catch: java.lang.Exception -> L45
            if (r1 == 0) goto L45
            java.lang.Object r1 = r5.next()     // Catch: java.lang.Exception -> L45
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L45
            int r2 = r1.hashCode()     // Catch: java.lang.Exception -> L45
            r3 = 1292368484(0x4d07fa64, float:1.4258336E8)
            if (r2 == r3) goto L2a
            goto L34
        L2a:
            java.lang.String r2 = "button_style"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L45
            if (r2 == 0) goto L34
            r2 = 0
            goto L35
        L34:
            r2 = -1
        L35:
            if (r2 == 0) goto L38
            goto L14
        L38:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L45
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Exception -> L45
            int r1 = r1.intValue()     // Catch: java.lang.Exception -> L45
            r4.f388781d = r1     // Catch: java.lang.Exception -> L45
            goto L14
        L45:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: r45.w12.fromJson(java.lang.String):com.tencent.mm.protobuf.f");
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            ((g36.f) objArr[0]).e(1, this.f388781d);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f388781d) + 0;
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
        r45.w12 w12Var = (r45.w12) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            return -1;
        }
        w12Var.f388781d = aVar2.g(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            n51.f.f335114a.d(jSONObject, "button_style", java.lang.Integer.valueOf(this.f388781d), true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
