package r45;

/* loaded from: classes4.dex */
public class ot6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f382512d;

    /* renamed from: e, reason: collision with root package name */
    public int f382513e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f382514f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ot6)) {
            return false;
        }
        r45.ot6 ot6Var = (r45.ot6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f382512d), java.lang.Integer.valueOf(ot6Var.f382512d)) && n51.f.a(java.lang.Integer.valueOf(this.f382513e), java.lang.Integer.valueOf(ot6Var.f382513e)) && n51.f.a(this.f382514f, ot6Var.f382514f);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059 A[SYNTHETIC] */
    @Override // com.tencent.mm.protobuf.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.protobuf.f fromJson(java.lang.String r7) {
        /*
            r6 = this;
            if (r7 == 0) goto L81
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto Lc
            goto L81
        Lc:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L81
            r0.<init>(r7)     // Catch: java.lang.Exception -> L81
            java.util.Iterator r7 = r0.keys()     // Catch: java.lang.Exception -> L81
        L15:
            boolean r1 = r7.hasNext()     // Catch: java.lang.Exception -> L81
            if (r1 == 0) goto L81
            java.lang.Object r1 = r7.next()     // Catch: java.lang.Exception -> L81
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L81
            int r2 = r1.hashCode()     // Catch: java.lang.Exception -> L81
            r3 = -894149819(0xffffffffcab45b45, float:-5909922.5)
            r4 = 2
            r5 = 1
            if (r2 == r3) goto L4b
            r3 = -416059939(0xffffffffe7336ddd, float:-8.473302E23)
            if (r2 == r3) goto L41
            r3 = 738950403(0x2c0b7d03, float:1.9822483E-12)
            if (r2 == r3) goto L37
            goto L56
        L37:
            java.lang.String r2 = "channel"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L81
            if (r2 == 0) goto L56
            r2 = 0
            goto L57
        L41:
            java.lang.String r2 = "channel_carrier_type"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L81
            if (r2 == 0) goto L56
            r2 = r5
            goto L57
        L4b:
            java.lang.String r2 = "uplink_url"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L81
            if (r2 == 0) goto L56
            r2 = r4
            goto L57
        L56:
            r2 = -1
        L57:
            if (r2 == 0) goto L74
            if (r2 == r5) goto L67
            if (r2 == r4) goto L5e
            goto L15
        L5e:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L81
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L81
            r6.f382514f = r1     // Catch: java.lang.Exception -> L81
            goto L15
        L67:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L81
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Exception -> L81
            int r1 = r1.intValue()     // Catch: java.lang.Exception -> L81
            r6.f382513e = r1     // Catch: java.lang.Exception -> L81
            goto L15
        L74:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L81
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Exception -> L81
            int r1 = r1.intValue()     // Catch: java.lang.Exception -> L81
            r6.f382512d = r1     // Catch: java.lang.Exception -> L81
            goto L15
        L81:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: r45.ot6.fromJson(java.lang.String):com.tencent.mm.protobuf.f");
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f382512d);
            fVar.e(2, this.f382513e);
            java.lang.String str = this.f382514f;
            if (str != null) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f382512d) + 0 + b36.f.e(2, this.f382513e);
            java.lang.String str2 = this.f382514f;
            return str2 != null ? e17 + b36.f.j(3, str2) : e17;
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
        r45.ot6 ot6Var = (r45.ot6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ot6Var.f382512d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            ot6Var.f382513e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        ot6Var.f382514f = aVar2.k(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f382512d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "channel", valueOf, false);
            eVar.d(jSONObject, "channel_carrier_type", java.lang.Integer.valueOf(this.f382513e), false);
            eVar.d(jSONObject, "uplink_url", this.f382514f, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
