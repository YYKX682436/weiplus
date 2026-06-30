package r45;

/* loaded from: classes4.dex */
public class dl4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.ey5 f372551d;

    /* renamed from: e, reason: collision with root package name */
    public r45.u50 f372552e;

    /* renamed from: f, reason: collision with root package name */
    public float f372553f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dl4)) {
            return false;
        }
        r45.dl4 dl4Var = (r45.dl4) fVar;
        return n51.f.a(this.f372551d, dl4Var.f372551d) && n51.f.a(this.f372552e, dl4Var.f372552e) && n51.f.a(java.lang.Float.valueOf(this.f372553f), java.lang.Float.valueOf(dl4Var.f372553f));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0059 A[SYNTHETIC] */
    @Override // com.tencent.mm.protobuf.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.protobuf.f fromJson(java.lang.String r7) {
        /*
            r6 = this;
            if (r7 == 0) goto L99
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto Lc
            goto L99
        Lc:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L99
            r0.<init>(r7)     // Catch: java.lang.Exception -> L99
            java.util.Iterator r7 = r0.keys()     // Catch: java.lang.Exception -> L99
        L15:
            boolean r1 = r7.hasNext()     // Catch: java.lang.Exception -> L99
            if (r1 == 0) goto L99
            java.lang.Object r1 = r7.next()     // Catch: java.lang.Exception -> L99
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L99
            int r2 = r1.hashCode()     // Catch: java.lang.Exception -> L99
            r3 = -938578798(0xffffffffc80e6c92, float:-145842.28)
            r4 = 2
            r5 = 1
            if (r2 == r3) goto L4b
            r3 = -351767064(0xffffffffeb0875e8, float:-1.649707E26)
            if (r2 == r3) goto L41
            r3 = 94842723(0x5a72f63, float:1.5722012E-35)
            if (r2 == r3) goto L37
            goto L56
        L37:
            java.lang.String r2 = "color"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L99
            if (r2 == 0) goto L56
            r2 = r5
            goto L57
        L41:
            java.lang.String r2 = "coverage"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L99
            if (r2 == 0) goto L56
            r2 = 0
            goto L57
        L4b:
            java.lang.String r2 = "radius"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L99
            if (r2 == 0) goto L56
            r2 = r4
            goto L57
        L56:
            r2 = -1
        L57:
            if (r2 == 0) goto L7f
            if (r2 == r5) goto L66
            if (r2 == r4) goto L5e
            goto L15
        L5e:
            double r1 = r0.optDouble(r1)     // Catch: java.lang.Exception -> L99
            float r1 = (float) r1     // Catch: java.lang.Exception -> L99
            r6.f372553f = r1     // Catch: java.lang.Exception -> L99
            goto L15
        L66:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L99
            boolean r2 = r1 instanceof org.json.JSONObject     // Catch: java.lang.Exception -> L99
            if (r2 == 0) goto L15
            r45.u50 r2 = new r45.u50     // Catch: java.lang.Exception -> L99
            r2.<init>()     // Catch: java.lang.Exception -> L99
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch: java.lang.Exception -> L99
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L99
            r2.fromJson(r1)     // Catch: java.lang.Exception -> L99
            r6.f372552e = r2     // Catch: java.lang.Exception -> L99
            goto L15
        L7f:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L99
            boolean r2 = r1 instanceof org.json.JSONObject     // Catch: java.lang.Exception -> L99
            if (r2 == 0) goto L15
            r45.ey5 r2 = new r45.ey5     // Catch: java.lang.Exception -> L99
            r2.<init>()     // Catch: java.lang.Exception -> L99
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch: java.lang.Exception -> L99
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L99
            r2.fromJson(r1)     // Catch: java.lang.Exception -> L99
            r6.f372551d = r2     // Catch: java.lang.Exception -> L99
            goto L15
        L99:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: r45.dl4.fromJson(java.lang.String):com.tencent.mm.protobuf.f");
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ey5 ey5Var = this.f372551d;
            if (ey5Var != null) {
                fVar.i(1, ey5Var.computeSize());
                this.f372551d.writeFields(fVar);
            }
            r45.u50 u50Var = this.f372552e;
            if (u50Var != null) {
                fVar.i(2, u50Var.computeSize());
                this.f372552e.writeFields(fVar);
            }
            fVar.d(3, this.f372553f);
            return 0;
        }
        if (i17 == 1) {
            r45.ey5 ey5Var2 = this.f372551d;
            int i18 = ey5Var2 != null ? 0 + b36.f.i(1, ey5Var2.computeSize()) : 0;
            r45.u50 u50Var2 = this.f372552e;
            if (u50Var2 != null) {
                i18 += b36.f.i(2, u50Var2.computeSize());
            }
            return i18 + b36.f.d(3, this.f372553f);
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
        r45.dl4 dl4Var = (r45.dl4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.ey5 ey5Var3 = new r45.ey5();
                if (bArr != null && bArr.length > 0) {
                    ey5Var3.parseFrom(bArr);
                }
                dl4Var.f372551d = ey5Var3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            dl4Var.f372553f = aVar2.f(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.u50 u50Var3 = new r45.u50();
            if (bArr2 != null && bArr2.length > 0) {
                u50Var3.parseFrom(bArr2);
            }
            dl4Var.f372552e = u50Var3;
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.ey5 ey5Var = this.f372551d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "coverage", ey5Var, true);
            eVar.d(jSONObject, "color", this.f372552e, true);
            eVar.d(jSONObject, "radius", java.lang.Float.valueOf(this.f372553f), true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
