package r45;

/* loaded from: classes4.dex */
public class st3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.dl4 f385973d;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof r45.st3) && n51.f.a(this.f385973d, ((r45.st3) fVar).f385973d);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0039 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038 A[SYNTHETIC] */
    @Override // com.tencent.mm.protobuf.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.protobuf.f fromJson(java.lang.String r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L52
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto Lb
            goto L52
        Lb:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L52
            r0.<init>(r5)     // Catch: java.lang.Exception -> L52
            java.util.Iterator r5 = r0.keys()     // Catch: java.lang.Exception -> L52
        L14:
            boolean r1 = r5.hasNext()     // Catch: java.lang.Exception -> L52
            if (r1 == 0) goto L52
            java.lang.Object r1 = r5.next()     // Catch: java.lang.Exception -> L52
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L52
            int r2 = r1.hashCode()     // Catch: java.lang.Exception -> L52
            r3 = 1497932534(0x5948a2f6, float:3.5296358E15)
            if (r2 == r3) goto L2a
            goto L35
        L2a:
            java.lang.String r2 = "merged_capsule_attr"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L52
            if (r2 == 0) goto L35
            r2 = 0
            goto L36
        L35:
            r2 = -1
        L36:
            if (r2 == 0) goto L39
            goto L14
        L39:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L52
            boolean r2 = r1 instanceof org.json.JSONObject     // Catch: java.lang.Exception -> L52
            if (r2 == 0) goto L14
            r45.dl4 r2 = new r45.dl4     // Catch: java.lang.Exception -> L52
            r2.<init>()     // Catch: java.lang.Exception -> L52
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch: java.lang.Exception -> L52
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L52
            r2.fromJson(r1)     // Catch: java.lang.Exception -> L52
            r4.f385973d = r2     // Catch: java.lang.Exception -> L52
            goto L14
        L52:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: r45.st3.fromJson(java.lang.String):com.tencent.mm.protobuf.f");
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.dl4 dl4Var = this.f385973d;
            if (dl4Var != null) {
                fVar.i(1, dl4Var.computeSize());
                this.f385973d.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.dl4 dl4Var2 = this.f385973d;
            if (dl4Var2 != null) {
                return 0 + b36.f.i(1, dl4Var2.computeSize());
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
        r45.st3 st3Var = (r45.st3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.dl4 dl4Var3 = new r45.dl4();
            if (bArr != null && bArr.length > 0) {
                dl4Var3.parseFrom(bArr);
            }
            st3Var.f385973d = dl4Var3;
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            n51.f.f335114a.d(jSONObject, "merged_capsule_attr", this.f385973d, true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
