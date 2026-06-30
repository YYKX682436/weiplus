package r45;

/* loaded from: classes2.dex */
public class xm5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f390242d;

    /* renamed from: e, reason: collision with root package name */
    public int f390243e;

    /* renamed from: f, reason: collision with root package name */
    public int f390244f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xm5)) {
            return false;
        }
        r45.xm5 xm5Var = (r45.xm5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f390242d), java.lang.Integer.valueOf(xm5Var.f390242d)) && n51.f.a(java.lang.Integer.valueOf(this.f390243e), java.lang.Integer.valueOf(xm5Var.f390243e)) && n51.f.a(java.lang.Integer.valueOf(this.f390244f), java.lang.Integer.valueOf(xm5Var.f390244f));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058 A[SYNTHETIC] */
    @Override // com.tencent.mm.protobuf.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.protobuf.f fromJson(java.lang.String r7) {
        /*
            r6 = this;
            if (r7 == 0) goto L84
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto Lc
            goto L84
        Lc:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L84
            r0.<init>(r7)     // Catch: java.lang.Exception -> L84
            java.util.Iterator r7 = r0.keys()     // Catch: java.lang.Exception -> L84
        L15:
            boolean r1 = r7.hasNext()     // Catch: java.lang.Exception -> L84
            if (r1 == 0) goto L84
            java.lang.Object r1 = r7.next()     // Catch: java.lang.Exception -> L84
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L84
            int r2 = r1.hashCode()     // Catch: java.lang.Exception -> L84
            r3 = -175850537(0xfffffffff584bbd7, float:-3.3652003E32)
            r4 = 2
            r5 = 1
            if (r2 == r3) goto L4b
            r3 = 747804969(0x2c929929, float:4.1665738E-12)
            if (r2 == r3) goto L41
            r3 = 1635238684(0x6177c31c, float:2.856503E20)
            if (r2 == r3) goto L37
            goto L55
        L37:
            java.lang.String r2 = "thumbnail_position"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L84
            if (r2 == 0) goto L55
            r2 = r5
            goto L56
        L41:
            java.lang.String r2 = "position"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L84
            if (r2 == 0) goto L55
            r2 = r4
            goto L56
        L4b:
            java.lang.String r2 = "original_position"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L84
            if (r2 == 0) goto L55
            r2 = 0
            goto L56
        L55:
            r2 = -1
        L56:
            if (r2 == 0) goto L77
            if (r2 == r5) goto L6a
            if (r2 == r4) goto L5d
            goto L15
        L5d:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L84
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Exception -> L84
            int r1 = r1.intValue()     // Catch: java.lang.Exception -> L84
            r6.f390244f = r1     // Catch: java.lang.Exception -> L84
            goto L15
        L6a:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L84
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Exception -> L84
            int r1 = r1.intValue()     // Catch: java.lang.Exception -> L84
            r6.f390243e = r1     // Catch: java.lang.Exception -> L84
            goto L15
        L77:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L84
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Exception -> L84
            int r1 = r1.intValue()     // Catch: java.lang.Exception -> L84
            r6.f390242d = r1     // Catch: java.lang.Exception -> L84
            goto L15
        L84:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: r45.xm5.fromJson(java.lang.String):com.tencent.mm.protobuf.f");
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f390242d);
            fVar.e(2, this.f390243e);
            fVar.e(3, this.f390244f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f390242d) + 0 + b36.f.e(2, this.f390243e) + b36.f.e(3, this.f390244f);
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
        r45.xm5 xm5Var = (r45.xm5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            xm5Var.f390242d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            xm5Var.f390243e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        xm5Var.f390244f = aVar2.g(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f390242d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "original_position", valueOf, true);
            eVar.d(jSONObject, "thumbnail_position", java.lang.Integer.valueOf(this.f390243e), true);
            eVar.d(jSONObject, "position", java.lang.Integer.valueOf(this.f390244f), true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
