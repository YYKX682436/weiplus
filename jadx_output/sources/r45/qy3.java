package r45;

/* loaded from: classes8.dex */
public class qy3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f384351d;

    /* renamed from: e, reason: collision with root package name */
    public r45.xy3 f384352e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qy3)) {
            return false;
        }
        r45.qy3 qy3Var = (r45.qy3) fVar;
        return n51.f.a(this.f384351d, qy3Var.f384351d) && n51.f.a(this.f384352e, qy3Var.f384352e);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047 A[SYNTHETIC] */
    @Override // com.tencent.mm.protobuf.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.protobuf.f fromJson(java.lang.String r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L6c
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto Lb
            goto L6c
        Lb:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L6c
            r0.<init>(r6)     // Catch: java.lang.Exception -> L6c
            java.util.Iterator r6 = r0.keys()     // Catch: java.lang.Exception -> L6c
        L14:
            boolean r1 = r6.hasNext()     // Catch: java.lang.Exception -> L6c
            if (r1 == 0) goto L6c
            java.lang.Object r1 = r6.next()     // Catch: java.lang.Exception -> L6c
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L6c
            int r2 = r1.hashCode()     // Catch: java.lang.Exception -> L6c
            r3 = -1545796299(0xffffffffa3dd0535, float:-2.3963073E-17)
            r4 = 1
            if (r2 == r3) goto L3a
            r3 = -737588055(0xffffffffd4094ca9, float:-2.3587867E12)
            if (r2 == r3) goto L30
            goto L44
        L30:
            java.lang.String r2 = "icon_url"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L6c
            if (r2 == 0) goto L44
            r2 = r4
            goto L45
        L3a:
            java.lang.String r2 = "icon_image_key"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L6c
            if (r2 == 0) goto L44
            r2 = 0
            goto L45
        L44:
            r2 = -1
        L45:
            if (r2 == 0) goto L63
            if (r2 == r4) goto L4a
            goto L14
        L4a:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L6c
            boolean r2 = r1 instanceof org.json.JSONObject     // Catch: java.lang.Exception -> L6c
            if (r2 == 0) goto L14
            r45.xy3 r2 = new r45.xy3     // Catch: java.lang.Exception -> L6c
            r2.<init>()     // Catch: java.lang.Exception -> L6c
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch: java.lang.Exception -> L6c
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L6c
            r2.fromJson(r1)     // Catch: java.lang.Exception -> L6c
            r5.f384352e = r2     // Catch: java.lang.Exception -> L6c
            goto L14
        L63:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L6c
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L6c
            r5.f384351d = r1     // Catch: java.lang.Exception -> L6c
            goto L14
        L6c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: r45.qy3.fromJson(java.lang.String):com.tencent.mm.protobuf.f");
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f384351d;
            if (str != null) {
                fVar.j(1, str);
            }
            r45.xy3 xy3Var = this.f384352e;
            if (xy3Var != null) {
                fVar.i(2, xy3Var.computeSize());
                this.f384352e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f384351d;
            int j17 = str2 != null ? 0 + b36.f.j(1, str2) : 0;
            r45.xy3 xy3Var2 = this.f384352e;
            return xy3Var2 != null ? j17 + b36.f.i(2, xy3Var2.computeSize()) : j17;
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
        r45.qy3 qy3Var = (r45.qy3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            qy3Var.f384351d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            r45.xy3 xy3Var3 = new r45.xy3();
            if (bArr != null && bArr.length > 0) {
                xy3Var3.parseFrom(bArr);
            }
            qy3Var.f384352e = xy3Var3;
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f384351d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "icon_image_key", str, true);
            eVar.d(jSONObject, "icon_url", this.f384352e, true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
