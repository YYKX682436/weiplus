package r45;

/* loaded from: classes4.dex */
public class s6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f385526d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f385527e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f385528f;

    /* renamed from: g, reason: collision with root package name */
    public long f385529g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.s6)) {
            return false;
        }
        r45.s6 s6Var = (r45.s6) fVar;
        return n51.f.a(this.f385526d, s6Var.f385526d) && n51.f.a(this.f385527e, s6Var.f385527e) && n51.f.a(this.f385528f, s6Var.f385528f) && n51.f.a(java.lang.Long.valueOf(this.f385529g), java.lang.Long.valueOf(s6Var.f385529g));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[SYNTHETIC] */
    @Override // com.tencent.mm.protobuf.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.protobuf.f fromJson(java.lang.String r8) {
        /*
            r7 = this;
            if (r8 == 0) goto L93
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto Lc
            goto L93
        Lc:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L93
            r0.<init>(r8)     // Catch: java.lang.Exception -> L93
            java.util.Iterator r8 = r0.keys()     // Catch: java.lang.Exception -> L93
        L15:
            boolean r1 = r8.hasNext()     // Catch: java.lang.Exception -> L93
            if (r1 == 0) goto L93
            java.lang.Object r1 = r8.next()     // Catch: java.lang.Exception -> L93
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L93
            int r2 = r1.hashCode()     // Catch: java.lang.Exception -> L93
            r3 = 3355(0xd1b, float:4.701E-42)
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == r3) goto L5d
            r3 = 116079(0x1c56f, float:1.62661E-40)
            if (r2 == r3) goto L52
            r3 = 3373707(0x337a8b, float:4.72757E-39)
            if (r2 == r3) goto L47
            r3 = 351608024(0x14f51cd8, float:2.4750055E-26)
            if (r2 == r3) goto L3c
            goto L67
        L3c:
            java.lang.String r2 = "version"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L93
            if (r2 == 0) goto L67
            r2 = r4
            goto L68
        L47:
            java.lang.String r2 = "name"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L93
            if (r2 == 0) goto L67
            r2 = r6
            goto L68
        L52:
            java.lang.String r2 = "url"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L93
            if (r2 == 0) goto L67
            r2 = r5
            goto L68
        L5d:
            java.lang.String r2 = "id"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L93
            if (r2 == 0) goto L67
            r2 = 0
            goto L68
        L67:
            r2 = -1
        L68:
            if (r2 == 0) goto L8a
            if (r2 == r6) goto L81
            if (r2 == r5) goto L78
            if (r2 == r4) goto L71
            goto L15
        L71:
            long r1 = r0.optLong(r1)     // Catch: java.lang.Exception -> L93
            r7.f385529g = r1     // Catch: java.lang.Exception -> L93
            goto L15
        L78:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L93
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L93
            r7.f385528f = r1     // Catch: java.lang.Exception -> L93
            goto L15
        L81:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L93
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L93
            r7.f385527e = r1     // Catch: java.lang.Exception -> L93
            goto L15
        L8a:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L93
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L93
            r7.f385526d = r1     // Catch: java.lang.Exception -> L93
            goto L15
        L93:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: r45.s6.fromJson(java.lang.String):com.tencent.mm.protobuf.f");
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f385526d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f385527e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f385528f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.h(4, this.f385529g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f385526d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f385527e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f385528f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            return j17 + b36.f.h(4, this.f385529g);
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
        r45.s6 s6Var = (r45.s6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            s6Var.f385526d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            s6Var.f385527e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            s6Var.f385528f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        s6Var.f385529g = aVar2.i(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f385526d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, dm.i4.COL_ID, str, true);
            eVar.d(jSONObject, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, this.f385527e, true);
            eVar.d(jSONObject, "url", this.f385528f, true);
            eVar.d(jSONObject, "version", java.lang.Long.valueOf(this.f385529g), true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
