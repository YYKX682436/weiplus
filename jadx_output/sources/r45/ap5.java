package r45;

/* loaded from: classes8.dex */
public class ap5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.x80 f370176d;

    /* renamed from: e, reason: collision with root package name */
    public r45.x80 f370177e;

    /* renamed from: f, reason: collision with root package name */
    public r45.x80 f370178f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ap5)) {
            return false;
        }
        r45.ap5 ap5Var = (r45.ap5) fVar;
        return n51.f.a(this.f370176d, ap5Var.f370176d) && n51.f.a(this.f370177e, ap5Var.f370177e) && n51.f.a(this.f370178f, ap5Var.f370178f);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0059 A[SYNTHETIC] */
    @Override // com.tencent.mm.protobuf.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.protobuf.f fromJson(java.lang.String r7) {
        /*
            r6 = this;
            if (r7 == 0) goto Laa
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto Lc
            goto Laa
        Lc:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> Laa
            r0.<init>(r7)     // Catch: java.lang.Exception -> Laa
            java.util.Iterator r7 = r0.keys()     // Catch: java.lang.Exception -> Laa
        L15:
            boolean r1 = r7.hasNext()     // Catch: java.lang.Exception -> Laa
            if (r1 == 0) goto Laa
            java.lang.Object r1 = r7.next()     // Catch: java.lang.Exception -> Laa
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> Laa
            int r2 = r1.hashCode()     // Catch: java.lang.Exception -> Laa
            r3 = -1335224239(0xffffffffb06a1851, float:-8.516326E-10)
            r4 = 2
            r5 = 1
            if (r2 == r3) goto L4c
            r3 = 1330532588(0x4f4e50ec, float:3.4614098E9)
            if (r2 == r3) goto L41
            r3 = 1379043793(0x523289d1, float:1.9170409E11)
            if (r2 == r3) goto L37
            goto L56
        L37:
            java.lang.String r2 = "original"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> Laa
            if (r2 == 0) goto L56
            r2 = 0
            goto L57
        L41:
            java.lang.String r2 = "thumbnail"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> Laa
            if (r2 == 0) goto L56
            r2 = r5
            goto L57
        L4c:
            java.lang.String r2 = "detail"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> Laa
            if (r2 == 0) goto L56
            r2 = r4
            goto L57
        L56:
            r2 = -1
        L57:
            if (r2 == 0) goto L90
            if (r2 == r5) goto L77
            if (r2 == r4) goto L5e
            goto L15
        L5e:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> Laa
            boolean r2 = r1 instanceof org.json.JSONObject     // Catch: java.lang.Exception -> Laa
            if (r2 == 0) goto L15
            r45.x80 r2 = new r45.x80     // Catch: java.lang.Exception -> Laa
            r2.<init>()     // Catch: java.lang.Exception -> Laa
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch: java.lang.Exception -> Laa
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> Laa
            r2.fromJson(r1)     // Catch: java.lang.Exception -> Laa
            r6.f370178f = r2     // Catch: java.lang.Exception -> Laa
            goto L15
        L77:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> Laa
            boolean r2 = r1 instanceof org.json.JSONObject     // Catch: java.lang.Exception -> Laa
            if (r2 == 0) goto L15
            r45.x80 r2 = new r45.x80     // Catch: java.lang.Exception -> Laa
            r2.<init>()     // Catch: java.lang.Exception -> Laa
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch: java.lang.Exception -> Laa
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> Laa
            r2.fromJson(r1)     // Catch: java.lang.Exception -> Laa
            r6.f370177e = r2     // Catch: java.lang.Exception -> Laa
            goto L15
        L90:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> Laa
            boolean r2 = r1 instanceof org.json.JSONObject     // Catch: java.lang.Exception -> Laa
            if (r2 == 0) goto L15
            r45.x80 r2 = new r45.x80     // Catch: java.lang.Exception -> Laa
            r2.<init>()     // Catch: java.lang.Exception -> Laa
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch: java.lang.Exception -> Laa
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> Laa
            r2.fromJson(r1)     // Catch: java.lang.Exception -> Laa
            r6.f370176d = r2     // Catch: java.lang.Exception -> Laa
            goto L15
        Laa:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: r45.ap5.fromJson(java.lang.String):com.tencent.mm.protobuf.f");
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.x80 x80Var = this.f370176d;
            if (x80Var != null) {
                fVar.i(1, x80Var.computeSize());
                this.f370176d.writeFields(fVar);
            }
            r45.x80 x80Var2 = this.f370177e;
            if (x80Var2 != null) {
                fVar.i(2, x80Var2.computeSize());
                this.f370177e.writeFields(fVar);
            }
            r45.x80 x80Var3 = this.f370178f;
            if (x80Var3 != null) {
                fVar.i(3, x80Var3.computeSize());
                this.f370178f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.x80 x80Var4 = this.f370176d;
            int i18 = x80Var4 != null ? 0 + b36.f.i(1, x80Var4.computeSize()) : 0;
            r45.x80 x80Var5 = this.f370177e;
            if (x80Var5 != null) {
                i18 += b36.f.i(2, x80Var5.computeSize());
            }
            r45.x80 x80Var6 = this.f370178f;
            return x80Var6 != null ? i18 + b36.f.i(3, x80Var6.computeSize()) : i18;
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
        r45.ap5 ap5Var = (r45.ap5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.x80 x80Var7 = new r45.x80();
                if (bArr != null && bArr.length > 0) {
                    x80Var7.parseFrom(bArr);
                }
                ap5Var.f370176d = x80Var7;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.x80 x80Var8 = new r45.x80();
                if (bArr2 != null && bArr2.length > 0) {
                    x80Var8.parseFrom(bArr2);
                }
                ap5Var.f370177e = x80Var8;
            }
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            r45.x80 x80Var9 = new r45.x80();
            if (bArr3 != null && bArr3.length > 0) {
                x80Var9.parseFrom(bArr3);
            }
            ap5Var.f370178f = x80Var9;
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.x80 x80Var = this.f370176d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "original", x80Var, true);
            eVar.d(jSONObject, com.tencent.tav.core.AssetExtension.SCENE_THUMBNAIL, this.f370177e, true);
            eVar.d(jSONObject, "detail", this.f370178f, true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
