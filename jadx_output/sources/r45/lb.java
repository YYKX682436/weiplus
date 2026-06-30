package r45;

/* loaded from: classes2.dex */
public class lb extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.v80 f379284d;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof r45.lb) && n51.f.a(this.f379284d, ((r45.lb) fVar).f379284d);
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
            if (r5 == 0) goto L51
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto Lb
            goto L51
        Lb:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L51
            r0.<init>(r5)     // Catch: java.lang.Exception -> L51
            java.util.Iterator r5 = r0.keys()     // Catch: java.lang.Exception -> L51
        L14:
            boolean r1 = r5.hasNext()     // Catch: java.lang.Exception -> L51
            if (r1 == 0) goto L51
            java.lang.Object r1 = r5.next()     // Catch: java.lang.Exception -> L51
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L51
            int r2 = r1.hashCode()     // Catch: java.lang.Exception -> L51
            r3 = 951530617(0x38b73479, float:8.735894E-5)
            if (r2 == r3) goto L2a
            goto L34
        L2a:
            java.lang.String r2 = "content"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L51
            if (r2 == 0) goto L34
            r2 = 0
            goto L35
        L34:
            r2 = -1
        L35:
            if (r2 == 0) goto L38
            goto L14
        L38:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L51
            boolean r2 = r1 instanceof org.json.JSONObject     // Catch: java.lang.Exception -> L51
            if (r2 == 0) goto L14
            r45.v80 r2 = new r45.v80     // Catch: java.lang.Exception -> L51
            r2.<init>()     // Catch: java.lang.Exception -> L51
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch: java.lang.Exception -> L51
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L51
            r2.fromJson(r1)     // Catch: java.lang.Exception -> L51
            r4.f379284d = r2     // Catch: java.lang.Exception -> L51
            goto L14
        L51:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: r45.lb.fromJson(java.lang.String):com.tencent.mm.protobuf.f");
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.v80 v80Var = this.f379284d;
            if (v80Var != null) {
                fVar.i(1, v80Var.computeSize());
                this.f379284d.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.v80 v80Var2 = this.f379284d;
            if (v80Var2 != null) {
                return 0 + b36.f.i(1, v80Var2.computeSize());
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
        r45.lb lbVar = (r45.lb) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.v80 v80Var3 = new r45.v80();
            if (bArr != null && bArr.length > 0) {
                v80Var3.parseFrom(bArr);
            }
            lbVar.f379284d = v80Var3;
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            n51.f.f335114a.d(jSONObject, "content", this.f379284d, true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
