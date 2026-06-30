package r45;

/* loaded from: classes4.dex */
public class e80 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f373092d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f373093e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f373094f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.e80)) {
            return false;
        }
        r45.e80 e80Var = (r45.e80) fVar;
        return n51.f.a(this.f373092d, e80Var.f373092d) && n51.f.a(this.f373093e, e80Var.f373093e) && n51.f.a(this.f373094f, e80Var.f373094f);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0070 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059 A[SYNTHETIC] */
    @Override // com.tencent.mm.protobuf.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.protobuf.f fromJson(java.lang.String r7) {
        /*
            r6 = this;
            if (r7 == 0) goto L79
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto Lc
            goto L79
        Lc:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L79
            r0.<init>(r7)     // Catch: java.lang.Exception -> L79
            java.util.Iterator r7 = r0.keys()     // Catch: java.lang.Exception -> L79
        L15:
            boolean r1 = r7.hasNext()     // Catch: java.lang.Exception -> L79
            if (r1 == 0) goto L79
            java.lang.Object r1 = r7.next()     // Catch: java.lang.Exception -> L79
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L79
            int r2 = r1.hashCode()     // Catch: java.lang.Exception -> L79
            r3 = -562267606(0xffffffffde7c7a2a, float:-4.548225E18)
            r4 = 2
            r5 = 1
            if (r2 == r3) goto L4c
            r3 = 3079825(0x2efe91, float:4.315754E-39)
            if (r2 == r3) goto L42
            r3 = 110371416(0x6942258, float:5.5721876E-35)
            if (r2 == r3) goto L37
            goto L56
        L37:
            java.lang.String r2 = "title"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L79
            if (r2 == 0) goto L56
            r2 = 0
            goto L57
        L42:
            java.lang.String r2 = "desc"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L79
            if (r2 == 0) goto L56
            r2 = r5
            goto L57
        L4c:
            java.lang.String r2 = "confirm_button_title"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L79
            if (r2 == 0) goto L56
            r2 = r4
            goto L57
        L56:
            r2 = -1
        L57:
            if (r2 == 0) goto L70
            if (r2 == r5) goto L67
            if (r2 == r4) goto L5e
            goto L15
        L5e:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L79
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L79
            r6.f373094f = r1     // Catch: java.lang.Exception -> L79
            goto L15
        L67:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L79
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L79
            r6.f373093e = r1     // Catch: java.lang.Exception -> L79
            goto L15
        L70:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L79
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L79
            r6.f373092d = r1     // Catch: java.lang.Exception -> L79
            goto L15
        L79:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: r45.e80.fromJson(java.lang.String):com.tencent.mm.protobuf.f");
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f373092d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f373093e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f373094f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f373092d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f373093e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f373094f;
            return str6 != null ? j17 + b36.f.j(3, str6) : j17;
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
        r45.e80 e80Var = (r45.e80) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            e80Var.f373092d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            e80Var.f373093e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        e80Var.f373094f = aVar2.k(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f373092d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, str, false);
            eVar.d(jSONObject, "desc", this.f373093e, false);
            eVar.d(jSONObject, "confirm_button_title", this.f373094f, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
