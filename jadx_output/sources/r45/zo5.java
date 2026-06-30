package r45;

/* loaded from: classes2.dex */
public class zo5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f392253d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f392254e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zo5)) {
            return false;
        }
        r45.zo5 zo5Var = (r45.zo5) fVar;
        return n51.f.a(this.f392253d, zo5Var.f392253d) && n51.f.a(this.f392254e, zo5Var.f392254e);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047 A[SYNTHETIC] */
    @Override // com.tencent.mm.protobuf.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.protobuf.f fromJson(java.lang.String r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L5c
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto Lb
            goto L5c
        Lb:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L5c
            r0.<init>(r6)     // Catch: java.lang.Exception -> L5c
            java.util.Iterator r6 = r0.keys()     // Catch: java.lang.Exception -> L5c
        L14:
            boolean r1 = r6.hasNext()     // Catch: java.lang.Exception -> L5c
            if (r1 == 0) goto L5c
            java.lang.Object r1 = r6.next()     // Catch: java.lang.Exception -> L5c
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L5c
            int r2 = r1.hashCode()     // Catch: java.lang.Exception -> L5c
            r3 = 3075958(0x2eef76, float:4.310335E-39)
            r4 = 1
            if (r2 == r3) goto L3a
            r3 = 102970646(0x6233516, float:3.0695894E-35)
            if (r2 == r3) goto L30
            goto L44
        L30:
            java.lang.String r2 = "light"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L5c
            if (r2 == 0) goto L44
            r2 = 0
            goto L45
        L3a:
            java.lang.String r2 = "dark"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L5c
            if (r2 == 0) goto L44
            r2 = r4
            goto L45
        L44:
            r2 = -1
        L45:
            if (r2 == 0) goto L53
            if (r2 == r4) goto L4a
            goto L14
        L4a:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L5c
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L5c
            r5.f392254e = r1     // Catch: java.lang.Exception -> L5c
            goto L14
        L53:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L5c
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L5c
            r5.f392253d = r1     // Catch: java.lang.Exception -> L5c
            goto L14
        L5c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: r45.zo5.fromJson(java.lang.String):com.tencent.mm.protobuf.f");
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f392253d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f392254e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f392253d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f392254e;
            return str4 != null ? j17 + b36.f.j(2, str4) : j17;
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
        r45.zo5 zo5Var = (r45.zo5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            zo5Var.f392253d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        zo5Var.f392254e = aVar2.k(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f392253d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "light", str, true);
            eVar.d(jSONObject, "dark", this.f392254e, true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
