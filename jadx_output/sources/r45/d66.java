package r45;

/* loaded from: classes4.dex */
public class d66 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f372182d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f372183e;

    /* renamed from: f, reason: collision with root package name */
    public int f372184f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.d66)) {
            return false;
        }
        r45.d66 d66Var = (r45.d66) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f372182d), java.lang.Integer.valueOf(d66Var.f372182d)) && n51.f.a(this.f372183e, d66Var.f372183e) && n51.f.a(java.lang.Integer.valueOf(this.f372184f), java.lang.Integer.valueOf(d66Var.f372184f));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a A[SYNTHETIC] */
    @Override // com.tencent.mm.protobuf.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.protobuf.f fromJson(java.lang.String r8) {
        /*
            r7 = this;
            if (r8 == 0) goto L8e
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto Lc
            goto L8e
        Lc:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L8e
            r0.<init>(r8)     // Catch: java.lang.Exception -> L8e
            java.util.Iterator r8 = r0.keys()     // Catch: java.lang.Exception -> L8e
        L15:
            boolean r1 = r8.hasNext()     // Catch: java.lang.Exception -> L8e
            if (r1 == 0) goto L8e
            java.lang.Object r1 = r8.next()     // Catch: java.lang.Exception -> L8e
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L8e
            int r2 = r1.hashCode()     // Catch: java.lang.Exception -> L8e
            r3 = -1729103808(0xffffffff98eff840, float:-6.203072E-24)
            r4 = 0
            r5 = 2
            r6 = 1
            if (r2 == r3) goto L4c
            r3 = -1294637060(0xffffffffb2d567fc, float:-2.484375E-8)
            if (r2 == r3) goto L42
            r3 = 414537277(0x18b5563d, float:4.687448E-24)
            if (r2 == r3) goto L38
            goto L57
        L38:
            java.lang.String r2 = "forbid_retry"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L8e
            if (r2 == 0) goto L57
            r2 = r5
            goto L58
        L42:
            java.lang.String r2 = "errmsg"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L8e
            if (r2 == 0) goto L57
            r2 = r6
            goto L58
        L4c:
            java.lang.String r2 = "logic_ret"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L8e
            if (r2 == 0) goto L57
            r2 = r4
            goto L58
        L57:
            r2 = -1
        L58:
            if (r2 == 0) goto L81
            if (r2 == r6) goto L6c
            if (r2 == r5) goto L5f
            goto L15
        L5f:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L8e
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Exception -> L8e
            int r1 = r1.intValue()     // Catch: java.lang.Exception -> L8e
            r7.f372184f = r1     // Catch: java.lang.Exception -> L8e
            goto L15
        L6c:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L8e
            boolean r2 = r1 instanceof java.lang.String     // Catch: java.lang.Exception -> L8e
            if (r2 == 0) goto L15
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L8e
            byte[] r1 = android.util.Base64.decode(r1, r4)     // Catch: java.lang.Exception -> L8e
            com.tencent.mm.protobuf.g r1 = com.tencent.mm.protobuf.g.b(r1)     // Catch: java.lang.Exception -> L8e
            r7.f372183e = r1     // Catch: java.lang.Exception -> L8e
            goto L15
        L81:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L8e
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Exception -> L8e
            int r1 = r1.intValue()     // Catch: java.lang.Exception -> L8e
            r7.f372182d = r1     // Catch: java.lang.Exception -> L8e
            goto L15
        L8e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: r45.d66.fromJson(java.lang.String):com.tencent.mm.protobuf.f");
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f372182d);
            com.tencent.mm.protobuf.g gVar = this.f372183e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            fVar.e(3, this.f372184f);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f372182d) + 0;
            com.tencent.mm.protobuf.g gVar2 = this.f372183e;
            if (gVar2 != null) {
                e17 += b36.f.b(2, gVar2);
            }
            return e17 + b36.f.e(3, this.f372184f);
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
        r45.d66 d66Var = (r45.d66) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            d66Var.f372182d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            d66Var.f372183e = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        d66Var.f372184f = aVar2.g(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f372182d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "logic_ret", valueOf, false);
            eVar.d(jSONObject, "errmsg", this.f372183e, false);
            eVar.d(jSONObject, "forbid_retry", java.lang.Integer.valueOf(this.f372184f), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
