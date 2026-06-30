package r45;

/* loaded from: classes8.dex */
public class cr4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f371800d = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof r45.cr4) && n51.f.a(this.f371800d, ((r45.cr4) fVar).f371800d);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0039 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0038 A[SYNTHETIC] */
    @Override // com.tencent.mm.protobuf.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.protobuf.f fromJson(java.lang.String r7) {
        /*
            r6 = this;
            if (r7 == 0) goto L67
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto Lb
            goto L67
        Lb:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L67
            r0.<init>(r7)     // Catch: java.lang.Exception -> L67
            java.util.Iterator r7 = r0.keys()     // Catch: java.lang.Exception -> L67
        L14:
            boolean r1 = r7.hasNext()     // Catch: java.lang.Exception -> L67
            if (r1 == 0) goto L67
            java.lang.Object r1 = r7.next()     // Catch: java.lang.Exception -> L67
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L67
            int r2 = r1.hashCode()     // Catch: java.lang.Exception -> L67
            r3 = -1627881444(0xffffffff9ef8801c, float:-2.6311006E-20)
            r4 = 0
            if (r2 == r3) goto L2b
            goto L35
        L2b:
            java.lang.String r2 = "render_item"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L67
            if (r2 == 0) goto L35
            r2 = r4
            goto L36
        L35:
            r2 = -1
        L36:
            if (r2 == 0) goto L39
            goto L14
        L39:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L67
            boolean r2 = r1 instanceof org.json.JSONArray     // Catch: java.lang.Exception -> L67
            if (r2 == 0) goto L14
            org.json.JSONArray r1 = (org.json.JSONArray) r1     // Catch: java.lang.Exception -> L67
        L43:
            int r2 = r1.length()     // Catch: java.lang.Exception -> L67
            if (r4 >= r2) goto L14
            java.lang.Object r2 = r1.get(r4)     // Catch: java.lang.Exception -> L67
            boolean r3 = r2 instanceof org.json.JSONObject     // Catch: java.lang.Exception -> L67
            if (r3 == 0) goto L64
            java.util.LinkedList r3 = r6.f371800d     // Catch: java.lang.Exception -> L67
            r45.bp5 r5 = new r45.bp5     // Catch: java.lang.Exception -> L67
            r5.<init>()     // Catch: java.lang.Exception -> L67
            org.json.JSONObject r2 = (org.json.JSONObject) r2     // Catch: java.lang.Exception -> L67
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L67
            r5.fromJson(r2)     // Catch: java.lang.Exception -> L67
            r3.add(r5)     // Catch: java.lang.Exception -> L67
        L64:
            int r4 = r4 + 1
            goto L43
        L67:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: r45.cr4.fromJson(java.lang.String):com.tencent.mm.protobuf.f");
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f371800d;
        if (i17 == 0) {
            ((g36.f) objArr[0]).g(1, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, linkedList) + 0;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.cr4 cr4Var = (r45.cr4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.bp5 bp5Var = new r45.bp5();
            if (bArr2 != null && bArr2.length > 0) {
                bp5Var.parseFrom(bArr2);
            }
            cr4Var.f371800d.add(bp5Var);
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            n51.f.f335114a.d(jSONObject, "render_item", this.f371800d, true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
